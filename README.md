```
$ mvn package
$ java -cp ./target/example-1.0.0-SNAPSHOT.jar com.example.Example
Hello from src/main/resources/data.txt
$ java -cp ./conf-1/:./target/example-1.0.0-SNAPSHOT.jar com.example.Example
Hello from conf-1/data.txt
$ java -cp ./conf-2/:./target/example-1.0.0-SNAPSHOT.jar com.example.Example
Hello from conf-2/data.txt
```# java-classpath-example
