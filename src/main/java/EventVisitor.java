
import java.lang.reflect.Type;
import java.util.*;

public class EventVisitor extends RBOLBaseListener {
	private final Map<String, TYPE> globalVariables = new HashMap<>();
	private Map<String, TYPE> localVariables = new HashMap<>();
	private Map<String, TYPE> tmpLocalVariables = new HashMap<>();
	private final Map<String, TYPE> functions = new HashMap<>();
	private final Map<String, List<TYPE>> structs = new HashMap<>();
	private final Map<String, Struct> defs = new HashMap<>();

	private final List<String> functionVariables = new ArrayList<>();

	private final Stack<String> stack = new Stack<>();
	private final Stack<TYPE> types = new Stack<>();

	String function;

	boolean global;

	@Override
	public void exitAssignment(RBOLParser.AssignmentContext ctx) {
		TYPE type = types.pop();
		if (ctx.ID() != null) {
			String id = ctx.ID().getText();
			Variable variable = this.getVariable(id);
			if (variable == null) {
				putVariable(id, type, false);
				LlvmGenerator.declare(id, type, global);
				variable = new Variable(id, type, global, false);
			}
			if (type != variable.type) {
				error(ctx.getStart().getLine(), "Types mismatch");
			}
			LlvmGenerator.assign(id, stack.pop(), variable.type, variable.global);
		}
	}

	@Override
	public void exitLocalassigment(RBOLParser.LocalassigmentContext ctx) {
		TYPE type = types.pop();
		if (ctx.ID() != null) {
			String id = ctx.ID().getText();
			Variable variable = this.getVariable(id);
			if (variable == null || variable.global) {
				boolean isGlobal = global;
				global = false;
				putVariable(id, type, false);
				LlvmGenerator.declare(id, type, false);
				variable = new Variable(id, type, false, false);
				global = isGlobal;
			}
			LlvmGenerator.assign(id, stack.pop(), variable.type, variable.global);
		}
	}

	@Override
	public void exitVariable(RBOLParser.VariableContext ctx) {
		if (ctx.ID() != null) {
			String id = ctx.ID().getText();
			Variable variable = getVariable(id);
			if (variable != null) {
				LlvmGenerator.load(id, variable.type, variable.global, variable.function);
				stack.push("%" + (LlvmGenerator.reg - 1));
				types.push(variable.type);
			} else {
				error(ctx.getStart().getLine(), "unknown variable " + id);
			}
		} else if (ctx.INT() != null) {
			stack.push(ctx.INT().getText());
			types.push(TYPE.INT);
		} else if (ctx.DOUBLE() != null) {
			stack.push(ctx.DOUBLE().getText());
			types.push(TYPE.FLOAT64);
		} else if (ctx.LONG() != null) {
			stack.push(ctx.LONG().getText().replace("l", ""));
			types.push(TYPE.LONG);
		} else if (ctx.FLOAT() != null) {
			LlvmGenerator.doubleToFloatN(ctx.FLOAT().getText().replace("f", ""));
			stack.push("%" + (LlvmGenerator.reg - 1));
			types.push(TYPE.FLOAT32);
		}
	}

	@Override
	public void exitAdd(RBOLParser.AddContext ctx) {
		TYPE type1 = types.pop();
		TYPE type2 = types.pop();
		if (type1 != type2) {
			error(ctx.getStart().getLine(), "types mismatch");
		}
		LlvmGenerator.add(stack.pop(), stack.pop(), type1);
		stack.push("%" + (LlvmGenerator.reg - 1));
		types.push(type1);
	}

	@Override
	public void exitSubstract(RBOLParser.SubstractContext ctx) {
		TYPE type1 = types.pop();
		TYPE type2 = types.pop();
		if (type1 != type2) {
			error(ctx.getStart().getLine(), "types mismatch");
		}
		LlvmGenerator.substract(stack.pop(), stack.pop(), type1);
		stack.push("%" + (LlvmGenerator.reg - 1));
		types.push(type1);
	}

	@Override
	public void exitMul(RBOLParser.MulContext ctx) {
		TYPE type1 = types.pop();
		TYPE type2 = types.pop();
		if (type1 != type2) {
			error(ctx.getStart().getLine(), "types mismatch");
		}
		LlvmGenerator.mul(stack.pop(), stack.pop(), type1);
		stack.push("%" + (LlvmGenerator.reg - 1));
		types.push(type1);
	}

	@Override
	public void exitDivide(RBOLParser.DivideContext ctx) {
		TYPE type1 = types.pop();
		TYPE type2 = types.pop();
		if (type1 != type2) {
			error(ctx.getStart().getLine(), "types mismatch");
		}
		LlvmGenerator.divide(stack.pop(), stack.pop(), type1);
		stack.push("%" + (LlvmGenerator.reg - 1));
		types.push(type1);
	}


	@Override
	public void exitPrint(RBOLParser.PrintContext ctx) {
		String id = ctx.ID().getText();
		Variable variable = getVariable(id);
		if (variable != null) {
			LlvmGenerator.load(id, variable.type, variable.global, variable.function);
			LlvmGenerator.printf(variable.type);
		} else {
			error(ctx.getStart().getLine(), "unknown variable " + id);
		}
	}

	@Override
	public void exitScan(RBOLParser.ScanContext ctx) {
		String id = ctx.ID().getText();
		Variable variable = getVariable(id);
		if (variable == null) {
			putVariable(id, TYPE.INT, false);
			LlvmGenerator.declare(id, globalVariables.get(id), global);
		} else if (variable.type != TYPE.INT) {
			error(ctx.getStart().getLine(), "Could not change type of " + id + " dynamically");
		}
		LlvmGenerator.scan(id);
	}

	@Override
	public void enterScand(RBOLParser.ScandContext ctx) {
		String id = ctx.ID().getText();
		Variable variable = getVariable(id);
		if (variable == null) {
			putVariable(id, TYPE.FLOAT64, false);
			LlvmGenerator.declare(id, globalVariables.get(id), global);
		} else if (variable.type != TYPE.FLOAT64) {
			error(ctx.getStart().getLine(), "Could not change type of " + id + " dynamically");
		}
		LlvmGenerator.scanDouble(id);
	}

	void error(int line, String msg) {
		System.err.println("Error, line " + line + ", " + msg);
		System.exit(1);
	}

	@Override
	public void exitRepeatheader(RBOLParser.RepeatheaderContext ctx) {
		String id = ctx.ID().getText();
		Variable variable = getVariable(id);
		if (variable != null && variable.type == TYPE.INT) {
			LlvmGenerator.repeatStart(ctx.ID().getText(), variable.global);
		} else {
			error(ctx.getStart().getLine(), "Wrong value of repeat should be declared INT");
		}
	}

	@Override
	public void exitRepeatbody(RBOLParser.RepeatbodyContext ctx) {
		if (ctx.getParent() instanceof RBOLParser.RepeatstatementContext) {
			LlvmGenerator.repeatEnd();
		}
	}

	@Override
	public void enterFunction(RBOLParser.FunctionContext ctx) {
		TYPE type = null;
		if (ctx.function_type().FUNTION_INT() != null) {
			type = TYPE.INT;
		} else if (ctx.function_type().FUNTION_DOUBLE() != null) {
			type = TYPE.FLOAT64;
		} else {
			error(ctx.getStart().getLine(), "Wrong type");
		}
		String id = ctx.ID().getText();
		Variable variable = getVariable(id);
		if (variable != null) {
			error(ctx.getStart().getLine(), "Variable is already init");
		}
		function = id;
		LlvmGenerator.functionStart(id, Objects.requireNonNull(type));
		global = false;
		LlvmGenerator.declare(id, type, global);
		tmpLocalVariables = localVariables;
		localVariables = new HashMap<>();
		putVariable(id, type, false);
	}

	@Override
	public void exitFunction(RBOLParser.FunctionContext ctx) {
		TYPE type = null;
		if (ctx.function_type().FUNTION_INT() != null) {
			type = TYPE.INT;
		} else if (ctx.function_type().FUNTION_DOUBLE() != null) {
			type = TYPE.FLOAT64;
		} else {
			error(ctx.getStart().getLine(), "Wrong type");
		}

		LlvmGenerator.load(function, type, false, false);
		LlvmGenerator.functionEnd(Objects.requireNonNull(type));

		putVariable(function, type, true);

		localVariables = tmpLocalVariables;
		global = true;
	}

	@Override
	public void enterIfbody(RBOLParser.IfbodyContext ctx) {
		LlvmGenerator.ifStart();
	}

	@Override
	public void exitIfbody(RBOLParser.IfbodyContext ctx) {
		LlvmGenerator.ifEnd();
	}

	@Override
	public void exitCompare(RBOLParser.CompareContext ctx) {
		String id1 = ctx.ID().get(0).toString();
		String id2 = ctx.ID().get(1).toString();
		TYPE type1 = null;
		TYPE type2 = null;

		Variable variable1 = getVariable(id1);
		if (variable1 != null) {
			type1 = variable1.type;
			LlvmGenerator.load(id1, type1, variable1.global, variable1.function);
		} else {
			error(ctx.getStart().getLine(), "unknown variable " + id1);
		}
		Variable variable2 = getVariable(id2);
		if (variable2 != null) {
			type2 = variable2.type;
			LlvmGenerator.load(id2, type2, variable2.global, variable2.function);
		} else {
			error(ctx.getStart().getLine(), "unknown variable " + id2);
		}

		if (type1 != type2) {
			error(ctx.getStart().getLine(), "types mismatch during convert");
		}
		if (ctx.operator().EQUALS() != null) {
			LlvmGenerator.compare(Integer.toString(LlvmGenerator.reg - 2),
					Integer.toString(LlvmGenerator.reg - 1),
					type1,
					EqualsType.EQUAL);
		} else if (ctx.operator().MORES() != null) {
			LlvmGenerator.compare(Integer.toString(LlvmGenerator.reg - 2),
					Integer.toString(LlvmGenerator.reg - 1),
					type1,
					EqualsType.MORE);
		} else if (ctx.operator().LESSS() != null) {
			LlvmGenerator.compare(Integer.toString(LlvmGenerator.reg - 2),
					Integer.toString(LlvmGenerator.reg - 1),
					type1,
					EqualsType.LESS);
		}
	}

	@Override
	public void enterStartRule(RBOLParser.StartRuleContext ctx) {
		global = true;
	}

	@Override
	public void exitStartRule(RBOLParser.StartRuleContext ctx) {
		LlvmGenerator.closeMain();
	}


	@Override
	public void exitStructura(RBOLParser.StructuraContext ctx) {
		String id = ctx.ID().getText() + "_struct";
		if (getVariable(id) != null && structs.containsKey(id)) {
			error(ctx.getStart().getLine(), "Could not use this symbol to define struct");
		}
		List<TYPE> types = new ArrayList<>();
		for (RBOLParser.StructbodyContext bodyctx : ctx.structbody()) {
			if (bodyctx.INT_TYPE() != null) {
				types.add(TYPE.INT);
			} else if (bodyctx.LONG_TYPE() != null) {
				types.add(TYPE.LONG);
			} else if (bodyctx.DOUBLE_TYPE() != null) {
				types.add(TYPE.FLOAT64);
			} else if (bodyctx.FLOAT_TYPE() != null) {
				types.add(TYPE.FLOAT32);
			}
		}
		LlvmGenerator.declareStruct(id, types);
		structs.put(id, types);
	}

	@Override
	public void exitStrukturasetter(RBOLParser.StrukturasetterContext ctx) {
		String id = ctx.ID().get(0).getText() + "_def";
		String structId = ctx.ID().get(1).getText() + "_struct";
		List<TYPE> typesList = structs.get(structId);
		if (!structs.containsKey(structId)) {
			error(ctx.getStart().getLine(), "Struct not exists");
		}
		if (defs.containsKey(id)) {
			error(ctx.getStart().getLine(), "Struct already define");
		}
		if (typesList.size() != ctx.variable().size()) {
			error(ctx.getStart().getLine(), "Mismatch exception wrong number of args");
		}
		Map<String, TYPE> news = new LinkedHashMap<>();
		int i = 0;
		for (RBOLParser.VariableContext variableContext : ctx.variable()) {
			if (variableContext.ID() != null) {
				String id2 = variableContext.ID().getText();
				Variable variable = getVariable(id2);
				if (variable != null) {
					if (variable.type != typesList.get(i)) {
						error(ctx.getStart().getLine(), "Type mismatch");

					}
					LlvmGenerator.load(variable.id, variable.type, variable.global, variable.function);
					String l = String.valueOf(LlvmGenerator.reg - 1);
					news.put("%" + l, variable.type);
				} else {
					error(ctx.getStart().getLine(), "Nie ma zmiennej takiej");
				}

			} else if (variableContext.INT() != null) {
				if (TYPE.INT != typesList.get(i)) {
					error(ctx.getStart().getLine(), "Type mismatch");
				}
				news.put(variableContext.INT().getText(), TYPE.INT);

			} else if (variableContext.LONG() != null) {
				if (TYPE.LONG != typesList.get(i)) {
					error(ctx.getStart().getLine(), "Type mismatch");
				}
				news.put(variableContext.LONG().getText().replace("l", ""), TYPE.LONG);
			} else if (variableContext.FLOAT() != null) {
				if (TYPE.FLOAT32 != typesList.get(i)) {
					error(ctx.getStart().getLine(), "Type mismatch");
				}
				news.put(variableContext.FLOAT().getText().replace("f", ""), TYPE.FLOAT32);
			} else if (variableContext.DOUBLE() != null) {
				if (TYPE.FLOAT64 != typesList.get(i)) {
					error(ctx.getStart().getLine(), "Type mismatch");
				}
				news.put(variableContext.DOUBLE().getText(), TYPE.FLOAT64);
			}
			i++;
		}
		LlvmGenerator.defineStruct(id, structId, news);
		defs.put(id, new Struct(structId, structs.get(structId)));
	}

	@Override
	public void exitStrukturagetterproperty(RBOLParser.StrukturagetterpropertyContext ctx) {
		String def = ctx.strukturagetter().ID() + "_def";
		String field = ctx.strukturagetter().INT().getText();
		if (!defs.containsKey(def)) {
			error(ctx.getStart().getLine(), "Struct not define");
		} else if (defs.get(def).types.size() < Integer.parseInt(field)) {
			error(ctx.getStart().getLine(), "FIELD NOT EXISTS");
		}
		TYPE type = defs.get(def).types.get(Integer.parseInt(field));
		if (ctx.ID() != null) {
			String id = ctx.ID().getText();
			Variable variable = this.getVariable(id);
			if (variable == null) {
				putVariable(id, type, false);
				LlvmGenerator.declare(id, type, global);
				variable = new Variable(id, type, global, false);
			} else {
				if (variable.type != type) {
					error(ctx.getStart().getLine(), "TYPE MISMATCH in struct get");
				}
			}
			LlvmGenerator.getPropertyFromStruct(id, def, field, defs.get(def).struct, type, variable.global);
		} else {
			error(ctx.getStart().getLine(), "GLUPOTa");
		}

	}

	@Override
	public void exitStrukturagetter(RBOLParser.StrukturagetterContext ctx) {
		String id = ctx.ID().getText() + "_def";
		String field = ctx.INT().getText();
		if (defs.containsKey(id)) {
			if (defs.get(id).types.size() > Integer.parseInt(field)) {
				LlvmGenerator.loadStructField(id, defs.get(id).struct, Integer.parseInt(field));
			} else {
				error(ctx.getStart().getLine(), "Structure have not field " + field + "<>" + defs.get(id).types.size());
			}
		} else {
			error(ctx.getStart().getLine(), "Structure not exists " + id);
		}
	}

	private Variable getVariable(String id) {
		if (localVariables.containsKey(id)) {
			return new Variable(id, localVariables.get(id), false, false);
		} else if (globalVariables.containsKey(id)) {
			return new Variable(id, globalVariables.get(id), true, false);
		} else if (functions.containsKey(id)) {
			return new Variable(id, functions.get(id), true, true);
		}
		return null;
	}

	private void putVariable(String id, TYPE type, boolean function) {

		if (global && functionVariables.contains(id)) {
			error(-1, "Could not declare global variable when local is declared already " + id);

		}
		if (function) {
			functions.put(id, type);
		} else if (global) {
			globalVariables.put(id, type);
		} else {
			functionVariables.add(id);
			localVariables.put(id, type);
		}
	}

	static class Variable {
		public String id;
		public TYPE type;
		public boolean global;
		public boolean function;

		public Variable(String id, TYPE type, boolean global, boolean function) {
			this.id = id;
			this.type = type;
			this.global = global;
			this.function = function;
		}
	}

	static class Struct {
		public String struct;
		public List<TYPE> types;

		public Struct(String struct, List<TYPE> types) {
			this.struct = struct;
			this.types = types;
		}
	}
}