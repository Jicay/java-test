# Setup

Install the JDK of Java 17 https://jdk.java.net/17/

Create dedicated folder to create your files for this exercise.

If you want to test your code, you need to compile your code : 

```shell
javac *.java -d build 
```

Then run the following command : 

```shell
java -cp build ExerciseRunner 
```

to get the output of your function in your console.

To edit your code, you can use any IDE or text editor, though IDEA IntelliJ or JetBrains are specially dedicated and recommended.

# Instructions

Create a file `HelloWorld.java`.

Write a function `helloworld` that return the string 'Hello World !'.

# Expected Functions
```java
public class HelloWorld {
    public static String helloWorld() {
        // your code here
    }
}
```

# Usage

Here is a possible ExerciseRunner.java to test your function : 
```java
public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(HelloWorld.helloWorld());
    }
}
```

and its output :
```shell
$ javac *.java -d build
$ java -cp build ExerciseRunner 
Hello World ! 
$ 
```