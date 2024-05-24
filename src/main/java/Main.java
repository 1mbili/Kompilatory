import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

	static String inputFilePath = null;
	static String outputFilePath = "./out.ll";

	public static void f(String[] args) {

		for (int i = 0; i < args.length; i += 2) {
			if ("-i".equals(args[i])) {
				inputFilePath = args[i + 1];
			} else if ("-o".equals(args[i])) {
				outputFilePath = args[i + 1];
			} else if ("-h".equals(args[i])) {
				System.out.println("Użycie: java -jar RBOL-lang.jar -i ścieżka_do_pliku -o ścieżka_do_pliku");

			}
		}
	}

	public static void main(String[] args) throws IOException {
		f(args);
		InputStream inputStream;
		if (inputFilePath != null) {
			inputStream = Files.newInputStream(Paths.get(inputFilePath));
		} else {
			inputStream = Main.class.getResourceAsStream("/example1.txt");
		}

		assert inputStream != null;
		Lexer lexer = new RBOLLexer(CharStreams.fromStream(inputStream));
		TokenStream tokenStream = new CommonTokenStream(lexer);
		RBOLParser parser = new RBOLParser(tokenStream);
		EventVisitor eval = new EventVisitor();

		ParseTreeWalker walker = new ParseTreeWalker();

		walker.walk(new EventVisitor(), parser.startRule());

		FileOutputStream fos = new FileOutputStream(outputFilePath);
		fos.write(LlvmGenerator.generate().getBytes());
		fos.close();
	}
}
