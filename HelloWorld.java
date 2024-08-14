/*
 * Java Introduction
 *
 * What is Java?
 * 
 * Java is a popular programming language, created in 1995.
 *
 * It is owned by Oracle, and more than 3 billion devices run Java.
 * 
 * It is used for:
 *	- Mobile applications (specially Android apps)
 * 	- Desktop applications
 *	- Web applications
 * 	- Games
 * 	- Database connection
 * 	- And much, much more!
 * 
 * Why Use Java?
 * 
 * - Java works on different platforms (Windows, Mac, Linux, Raspberry
 *   Pi, etc.)
 * - It is one of the most popular programming languages in the world
 * - It has a large demand in the current job market
 * - It is easy to learn and simple to use
 * - It is open-source and free
 * - It is secure, fast and powerful
 * - It has huge community support (tens of millions of developers)
 * - Java is an object oriented language which gives a clear structure to
 *   programs and allows code to be reused, lowering development costs
 * - As Java is close to C++ and C#, it makes it easy for programmers to 
 *   switch to Java or vice versa
*/

/* 
 * Java Syntax
 * This program will print "Hello World" to the screen.
 * Note: Just remove the comment signs before running the program.
*/

/*
public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}
}
*/

/*
 * Example explained
 *
 * Every line of code that runs in Java must be inside a class.
 * A class should always start with an uppercase first letter.
 * Note: Java is case-sensitive: "MyClass" and "myclass" has different
 * meaning.
 *
 * The name of the Java file must match the class name. When saving the
 * file, save it using the class name and add ".java" to the end of the
 * filename.
 *
 * The main Method
 *
 * The main() method is required and you will see it in every Java program:
 * 
 * public static void main(String[] args)
 *
 * Any code inside the main() method will be executed.
 * 
 * System.out.println()
 * 
 * Inside the main() method, we can use the println() method to print a
 * line of text to the screen:
 *
 * public static void main(String[] args)
 * {
 * 	System.out.println("Hello World");
 * }
 *
 * Note: The curly braces {} marks the beginning and the end of a block of
 * code.
 * 
 * System is a built-in Java class that contains useful members, such as out,
 * which is short for "output". The println method, short for "print line",
 * is used to print a value to the screen (or a file).
 * 
 * You should also note that each code statement must end with a semicolon
 * (;).
*/

/*
 *
*/

class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("I am learning Java.");
		System.out.println("It is awesome");
	}
}