
test:
	mvn clean install -U
	java -jar ./target/RBOL-compiler.jar -i example1.txt -o example1.ll > output
	llc example1.ll
	gcc -s example1.s -o example1.out -no-pie
	./example1.out

clean:
	rm -f example1.ll example1.s example1.out output
	rm -rf src/main/java/.antlr