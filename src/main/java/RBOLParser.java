// Generated from RBOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RBOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_TYPE=6, DOUBLE_TYPE=7, FLOAT_TYPE=8, 
		LONG_TYPE=9, EQUALS=10, MORES=11, LESSS=12, STRUCT=13, REPEAT=14, FUNTION_INT=15, 
		FUNTION_DOUBLE=16, LOCAL=17, IF=18, END=19, SCAN=20, SCAND=21, PRINT=22, 
		LONG=23, FLOAT=24, DOUBLE=25, ADD=26, SUBSTRACT=27, MUL=28, DIVIDE=29, 
		ID=30, INT=31, STRING=32, KROPKI=33, WS=34;
	public static final int
		RULE_startRule = 0, RULE_programbody = 1, RULE_structura = 2, RULE_strukturasetter = 3, 
		RULE_strukturagetterproperty = 4, RULE_structbody = 5, RULE_function = 6, 
		RULE_function_type = 7, RULE_fblock = 8, RULE_ifstatement = 9, RULE_ifbody = 10, 
		RULE_repeatstatement = 11, RULE_repeatbody = 12, RULE_statement = 13, 
		RULE_expression = 14, RULE_assignment = 15, RULE_localassigment = 16, 
		RULE_value = 17, RULE_add = 18, RULE_substract = 19, RULE_mul = 20, RULE_divide = 21, 
		RULE_compare = 22, RULE_operator = 23, RULE_print = 24, RULE_scan = 25, 
		RULE_scand = 26, RULE_variable = 27, RULE_strukturagetter = 28, RULE_repeatheader = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "programbody", "structura", "strukturasetter", "strukturagetterproperty", 
			"structbody", "function", "function_type", "fblock", "ifstatement", "ifbody", 
			"repeatstatement", "repeatbody", "statement", "expression", "assignment", 
			"localassigment", "value", "add", "substract", "mul", "divide", "compare", 
			"operator", "print", "scan", "scand", "variable", "strukturagetter", 
			"repeatheader"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'.'", "'int'", "'double'", "'float'", 
			"'long'", "'=='", "'>'", "'<'", "'struct'", "'repeat'", "'func_i'", "'func_d'", 
			"'local'", "'if'", "'end'", "'scan'", "'scand'", "'print'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", 
			"LONG_TYPE", "EQUALS", "MORES", "LESSS", "STRUCT", "REPEAT", "FUNTION_INT", 
			"FUNTION_DOUBLE", "LOCAL", "IF", "END", "SCAN", "SCAND", "PRINT", "LONG", 
			"FLOAT", "DOUBLE", "ADD", "SUBSTRACT", "MUL", "DIVIDE", "ID", "INT", 
			"STRING", "KROPKI", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RBOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RBOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RBOLParser.EOF, 0); }
		public List<ProgrambodyContext> programbody() {
			return getRuleContexts(ProgrambodyContext.class);
		}
		public ProgrambodyContext programbody(int i) {
			return getRuleContext(ProgrambodyContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StructuraContext> structura() {
			return getRuleContexts(StructuraContext.class);
		}
		public StructuraContext structura(int i) {
			return getRuleContext(StructuraContext.class,i);
		}
		public List<StrukturagetterpropertyContext> strukturagetterproperty() {
			return getRuleContexts(StrukturagetterpropertyContext.class);
		}
		public StrukturagetterpropertyContext strukturagetterproperty(int i) {
			return getRuleContext(StrukturagetterpropertyContext.class,i);
		}
		public List<StrukturasetterContext> strukturasetter() {
			return getRuleContexts(StrukturasetterContext.class);
		}
		public StrukturasetterContext strukturasetter(int i) {
			return getRuleContext(StrukturasetterContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081597952L) != 0)) {
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					programbody();
					}
					break;
				case 2:
					{
					setState(61);
					function();
					}
					break;
				case 3:
					{
					setState(62);
					structura();
					}
					break;
				case 4:
					{
					setState(63);
					strukturagetterproperty();
					}
					break;
				case 5:
					{
					setState(64);
					strukturasetter();
					}
					break;
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrambodyContext extends ParserRuleContext {
		public RepeatstatementContext repeatstatement() {
			return getRuleContext(RepeatstatementContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgrambodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterProgrambody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitProgrambody(this);
		}
	}

	public final ProgrambodyContext programbody() throws RecognitionException {
		ProgrambodyContext _localctx = new ProgrambodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programbody);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				repeatstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				ifstatement();
				}
				break;
			case LOCAL:
			case SCAN:
			case SCAND:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructuraContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(RBOLParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public TerminalNode KROPKI() { return getToken(RBOLParser.KROPKI, 0); }
		public TerminalNode END() { return getToken(RBOLParser.END, 0); }
		public List<StructbodyContext> structbody() {
			return getRuleContexts(StructbodyContext.class);
		}
		public StructbodyContext structbody(int i) {
			return getRuleContext(StructbodyContext.class,i);
		}
		public StructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStructura(this);
		}
	}

	public final StructuraContext structura() throws RecognitionException {
		StructuraContext _localctx = new StructuraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(STRUCT);
			setState(78);
			match(ID);
			setState(79);
			match(KROPKI);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				structbody();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) );
			setState(85);
			match(END);
			setState(86);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrukturasetterContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RBOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RBOLParser.ID, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StrukturasetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strukturasetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStrukturasetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStrukturasetter(this);
		}
	}

	public final StrukturasetterContext strukturasetter() throws RecognitionException {
		StrukturasetterContext _localctx = new StrukturasetterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_strukturasetter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(T__1);
			setState(90);
			match(ID);
			setState(91);
			match(T__2);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				variable();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3279945728L) != 0) );
			setState(97);
			match(T__3);
			setState(98);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrukturagetterpropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public StrukturagetterContext strukturagetter() {
			return getRuleContext(StrukturagetterContext.class,0);
		}
		public StrukturagetterpropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strukturagetterproperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStrukturagetterproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStrukturagetterproperty(this);
		}
	}

	public final StrukturagetterpropertyContext strukturagetterproperty() throws RecognitionException {
		StrukturagetterpropertyContext _localctx = new StrukturagetterpropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_strukturagetterproperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(T__1);
			setState(102);
			strukturagetter();
			setState(103);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructbodyContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(RBOLParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(RBOLParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(RBOLParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(RBOLParser.DOUBLE_TYPE, 0); }
		public StructbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStructbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStructbody(this);
		}
	}

	public final StructbodyContext structbody() throws RecognitionException {
		StructbodyContext _localctx = new StructbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public TerminalNode KROPKI() { return getToken(RBOLParser.KROPKI, 0); }
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode END() { return getToken(RBOLParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			function_type();
			setState(108);
			match(ID);
			setState(109);
			match(KROPKI);
			setState(110);
			fblock();
			setState(111);
			match(END);
			setState(112);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode FUNTION_INT() { return getToken(RBOLParser.FUNTION_INT, 0); }
		public TerminalNode FUNTION_DOUBLE() { return getToken(RBOLParser.FUNTION_DOUBLE, 0); }
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitFunction_type(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==FUNTION_INT || _la==FUNTION_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FblockContext extends ParserRuleContext {
		public List<ProgrambodyContext> programbody() {
			return getRuleContexts(ProgrambodyContext.class);
		}
		public ProgrambodyContext programbody(int i) {
			return getRuleContext(ProgrambodyContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitFblock(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081491456L) != 0)) {
				{
				{
				setState(116);
				programbody();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RBOLParser.IF, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode KROPKI() { return getToken(RBOLParser.KROPKI, 0); }
		public IfbodyContext ifbody() {
			return getRuleContext(IfbodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RBOLParser.END, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			compare();
			setState(124);
			match(KROPKI);
			setState(125);
			ifbody();
			setState(126);
			match(END);
			setState(127);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfbodyContext extends ParserRuleContext {
		public List<ProgrambodyContext> programbody() {
			return getRuleContexts(ProgrambodyContext.class);
		}
		public ProgrambodyContext programbody(int i) {
			return getRuleContext(ProgrambodyContext.class,i);
		}
		public IfbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterIfbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitIfbody(this);
		}
	}

	public final IfbodyContext ifbody() throws RecognitionException {
		IfbodyContext _localctx = new IfbodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081491456L) != 0)) {
				{
				{
				setState(129);
				programbody();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatstatementContext extends ParserRuleContext {
		public RepeatheaderContext repeatheader() {
			return getRuleContext(RepeatheaderContext.class,0);
		}
		public RepeatbodyContext repeatbody() {
			return getRuleContext(RepeatbodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RBOLParser.END, 0); }
		public RepeatstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterRepeatstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitRepeatstatement(this);
		}
	}

	public final RepeatstatementContext repeatstatement() throws RecognitionException {
		RepeatstatementContext _localctx = new RepeatstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeatstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			repeatheader();
			setState(136);
			repeatbody();
			setState(137);
			match(END);
			setState(138);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatbodyContext extends ParserRuleContext {
		public List<ProgrambodyContext> programbody() {
			return getRuleContexts(ProgrambodyContext.class);
		}
		public ProgrambodyContext programbody(int i) {
			return getRuleContext(ProgrambodyContext.class,i);
		}
		public RepeatbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterRepeatbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitRepeatbody(this);
		}
	}

	public final RepeatbodyContext repeatbody() throws RecognitionException {
		RepeatbodyContext _localctx = new RepeatbodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeatbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081491456L) != 0)) {
				{
				{
				setState(140);
				programbody();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expression();
			setState(147);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LocalassigmentContext localassigment() {
			return getRuleContext(LocalassigmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public ScandContext scand() {
			return getRuleContext(ScandContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				assignment();
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				localassigment();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				print();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				scan();
				}
				break;
			case SCAND:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				scand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__1);
			setState(158);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalassigmentContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(RBOLParser.LOCAL, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LocalassigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localassigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterLocalassigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitLocalassigment(this);
		}
	}

	public final LocalassigmentContext localassigment() throws RecognitionException {
		LocalassigmentContext _localctx = new LocalassigmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_localassigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LOCAL);
			setState(161);
			match(ID);
			setState(162);
			match(T__1);
			setState(163);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubstractContext substract() {
			return getRuleContext(SubstractContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				add();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				substract();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				mul();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				divide();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ADD() { return getToken(RBOLParser.ADD, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			variable();
			setState(173);
			match(ADD);
			setState(174);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstractContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode SUBSTRACT() { return getToken(RBOLParser.SUBSTRACT, 0); }
		public SubstractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterSubstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitSubstract(this);
		}
	}

	public final SubstractContext substract() throws RecognitionException {
		SubstractContext _localctx = new SubstractContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			variable();
			setState(177);
			match(SUBSTRACT);
			setState(178);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RBOLParser.MUL, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			variable();
			setState(181);
			match(MUL);
			setState(182);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(RBOLParser.DIVIDE, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			variable();
			setState(185);
			match(DIVIDE);
			setState(186);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RBOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RBOLParser.ID, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			operator();
			setState(190);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RBOLParser.EQUALS, 0); }
		public TerminalNode MORES() { return getToken(RBOLParser.MORES, 0); }
		public TerminalNode LESSS() { return getToken(RBOLParser.LESSS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RBOLParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PRINT);
			setState(195);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(RBOLParser.SCAN, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(SCAN);
			setState(198);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScandContext extends ParserRuleContext {
		public TerminalNode SCAND() { return getToken(RBOLParser.SCAND, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public ScandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterScand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitScand(this);
		}
	}

	public final ScandContext scand() throws RecognitionException {
		ScandContext _localctx = new ScandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_scand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SCAND);
			setState(201);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public TerminalNode INT() { return getToken(RBOLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RBOLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(RBOLParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(RBOLParser.LONG, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3279945728L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrukturagetterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public TerminalNode INT() { return getToken(RBOLParser.INT, 0); }
		public StrukturagetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strukturagetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterStrukturagetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitStrukturagetter(this);
		}
	}

	public final StrukturagetterContext strukturagetter() throws RecognitionException {
		StrukturagetterContext _localctx = new StrukturagetterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_strukturagetter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(T__4);
			setState(207);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatheaderContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(RBOLParser.REPEAT, 0); }
		public TerminalNode ID() { return getToken(RBOLParser.ID, 0); }
		public TerminalNode KROPKI() { return getToken(RBOLParser.KROPKI, 0); }
		public RepeatheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).enterRepeatheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RBOLListener ) ((RBOLListener)listener).exitRepeatheader(this);
		}
	}

	public final RepeatheaderContext repeatheader() throws RecognitionException {
		RepeatheaderContext _localctx = new RepeatheaderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_repeatheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(REPEAT);
			setState(210);
			match(ID);
			setState(211);
			match(KROPKI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002R\b\u0002\u000b\u0002\f\u0002S\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003^\b\u0003\u000b\u0003\f\u0003_\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0005\bv\b\b"+
		"\n\b\f\by\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0005\n\u0083\b\n\n\n\f\n\u0086\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u008e\b\f\n\f\f\f\u0091"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u009b\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00ab\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000"+
		"\u0004\u0001\u0000\u0006\t\u0001\u0000\u000f\u0010\u0001\u0000\n\f\u0002"+
		"\u0000\u0017\u0019\u001e\u001f\u00cb\u0000C\u0001\u0000\u0000\u0000\u0002"+
		"K\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006X\u0001"+
		"\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000"+
		"\fk\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010w\u0001"+
		"\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000"+
		"\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000"+
		"\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u009a\u0001\u0000"+
		"\u0000\u0000\u001e\u009c\u0001\u0000\u0000\u0000 \u00a0\u0001\u0000\u0000"+
		"\u0000\"\u00aa\u0001\u0000\u0000\u0000$\u00ac\u0001\u0000\u0000\u0000"+
		"&\u00b0\u0001\u0000\u0000\u0000(\u00b4\u0001\u0000\u0000\u0000*\u00b8"+
		"\u0001\u0000\u0000\u0000,\u00bc\u0001\u0000\u0000\u0000.\u00c0\u0001\u0000"+
		"\u0000\u00000\u00c2\u0001\u0000\u0000\u00002\u00c5\u0001\u0000\u0000\u0000"+
		"4\u00c8\u0001\u0000\u0000\u00006\u00cb\u0001\u0000\u0000\u00008\u00cd"+
		"\u0001\u0000\u0000\u0000:\u00d1\u0001\u0000\u0000\u0000<B\u0003\u0002"+
		"\u0001\u0000=B\u0003\f\u0006\u0000>B\u0003\u0004\u0002\u0000?B\u0003\b"+
		"\u0004\u0000@B\u0003\u0006\u0003\u0000A<\u0001\u0000\u0000\u0000A=\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000FG\u0005\u0000\u0000\u0001G\u0001\u0001\u0000\u0000\u0000"+
		"HL\u0003\u0016\u000b\u0000IL\u0003\u0012\t\u0000JL\u0003\u001a\r\u0000"+
		"KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0005\r\u0000\u0000NO\u0005\u001e"+
		"\u0000\u0000OQ\u0005!\u0000\u0000PR\u0003\n\u0005\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0013\u0000\u0000"+
		"VW\u0005\u0001\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u001e"+
		"\u0000\u0000YZ\u0005\u0002\u0000\u0000Z[\u0005\u001e\u0000\u0000[]\u0005"+
		"\u0003\u0000\u0000\\^\u00036\u001b\u0000]\\\u0001\u0000\u0000\u0000^_"+
		"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0005\u0001"+
		"\u0000\u0000c\u0007\u0001\u0000\u0000\u0000de\u0005\u001e\u0000\u0000"+
		"ef\u0005\u0002\u0000\u0000fg\u00038\u001c\u0000gh\u0005\u0001\u0000\u0000"+
		"h\t\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000\u0000j\u000b\u0001\u0000"+
		"\u0000\u0000kl\u0003\u000e\u0007\u0000lm\u0005\u001e\u0000\u0000mn\u0005"+
		"!\u0000\u0000no\u0003\u0010\b\u0000op\u0005\u0013\u0000\u0000pq\u0005"+
		"\u0001\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000"+
		"s\u000f\u0001\u0000\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u0011\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0005\u0012\u0000\u0000{|\u0003,\u0016\u0000|}\u0005!\u0000\u0000"+
		"}~\u0003\u0014\n\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005"+
		"\u0001\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\u0002\u0001\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003:\u001d\u0000\u0088\u0089\u0003\u0018"+
		"\f\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0005\u0001\u0000"+
		"\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0002\u0001"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0019\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0003\u001c\u000e\u0000\u0093\u0094\u0005\u0001\u0000"+
		"\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u0095\u009b\u0003\u001e\u000f"+
		"\u0000\u0096\u009b\u0003 \u0010\u0000\u0097\u009b\u00030\u0018\u0000\u0098"+
		"\u009b\u00032\u0019\u0000\u0099\u009b\u00034\u001a\u0000\u009a\u0095\u0001"+
		"\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u001d\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u001e\u0000\u0000\u009d\u009e\u0005\u0002\u0000\u0000\u009e\u009f\u0003"+
		"\"\u0011\u0000\u009f\u001f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0011"+
		"\u0000\u0000\u00a1\u00a2\u0005\u001e\u0000\u0000\u00a2\u00a3\u0005\u0002"+
		"\u0000\u0000\u00a3\u00a4\u0003\"\u0011\u0000\u00a4!\u0001\u0000\u0000"+
		"\u0000\u00a5\u00ab\u0003$\u0012\u0000\u00a6\u00ab\u0003&\u0013\u0000\u00a7"+
		"\u00ab\u0003(\u0014\u0000\u00a8\u00ab\u0003*\u0015\u0000\u00a9\u00ab\u0003"+
		"6\u001b\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab#\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u00036\u001b\u0000\u00ad\u00ae\u0005\u001a\u0000\u0000"+
		"\u00ae\u00af\u00036\u001b\u0000\u00af%\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u00036\u001b\u0000\u00b1\u00b2\u0005\u001b\u0000\u0000\u00b2\u00b3\u0003"+
		"6\u001b\u0000\u00b3\'\u0001\u0000\u0000\u0000\u00b4\u00b5\u00036\u001b"+
		"\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b7\u00036\u001b\u0000"+
		"\u00b7)\u0001\u0000\u0000\u0000\u00b8\u00b9\u00036\u001b\u0000\u00b9\u00ba"+
		"\u0005\u001d\u0000\u0000\u00ba\u00bb\u00036\u001b\u0000\u00bb+\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u001e\u0000\u0000\u00bd\u00be\u0003.\u0017"+
		"\u0000\u00be\u00bf\u0005\u001e\u0000\u0000\u00bf-\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0002\u0000\u0000\u00c1/\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0016\u0000\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4"+
		"1\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0014\u0000\u0000\u00c6\u00c7"+
		"\u0005\u001e\u0000\u0000\u00c73\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0015\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca5\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000\u00cc7\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00cf\u0005\u0005\u0000"+
		"\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000\u00d09\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u000e\u0000\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000"+
		"\u00d3\u00d4\u0005!\u0000\u0000\u00d4;\u0001\u0000\u0000\u0000\nACKS_"+
		"w\u0084\u008f\u009a\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}