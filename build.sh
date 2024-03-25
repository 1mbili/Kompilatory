#!/bin/bash
mvn clean install -U
java -jar ./target/cockroach-lang.jar -i ./tst/example1.txt -o ./tst/example1.ll
llc ./tst/example1.ll
gcc -s ./tst/example1.s -o ./tst/example1.out
./tst/example1.out