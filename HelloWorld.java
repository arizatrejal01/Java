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

/*
class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("I am learning Java.");
		System.out.println("It is awesome");
	}
}
*/

/**
 * Java Variables
 *
 * Variables are containers for storing data values.
 *
 * There are different types of variables, for example:
 * 	- String  : stores text, such as "Hello". String values are surrounded
 *		    by double quotes
 *	- int	  : stores integers (whole numbers), without decimals, such as
 *		    123 or -123
 *	- float	  : stores floating point numbers, with decimals, such as 19.99
 *		    or -19.99
 *	- char	  : stores single characters, such as 'a' or 'B'. Char values are
 *		    surrounded by single quotes
 *	- boolean : stores values with two states: true or false
 */
 
/**
 * Declaring (Creating) Variables
 *
 * To create a variable, you must specify the type and assign it a value:
 *
 * Syntax:
 * 
 * 	type variableName = value;
 *
 * Where type is one of Java's types (such as int or String), and
 * variableName is the name of the variable (such as x or name). The equal
 * sign is used to assign values to the variable.
 *
 * Example:
 *
 * Create a variable called name of type String and assign it the value
 * "John":
 * 
 * 	String name = "John";
 *	System.out.println(name);
 *
 * To create a variable that should store a number, look at the following
 * example:
 *
 * Example:
 *
 * Create a variable called myNum of type int and assign it the value 15:
 *
 * 	int myNum = 15;
 *	System.out.println(myNum);
 *
 * You can also declare a variable without assigning the value, and assign the
 * value later:
 *
 * Example:
 * 	int myNum;
 * 	myNum = 15;
 *	System.out.println(myNum);
 *
 * Note that if you assign a new value to an existing variable, it will overwrite
 * the previous value:
 * 
 * Example:
 *
 * Change the value of myNum from 15 to 20:
 *
 *	int myNum = 15;
 *	myNum = 20; // myNum is now 20
 *	System.out.println(myNum);
 *
 * Final Variables
 *
 * If you don't want others (or yourself) to overwrite existing values, use the
 * final keyword (this will declare the variables as "final" or "constant",
 * which means unchangeable and read-only):
 *
 * Example:
 * 
 * final int myNum = 15;
 * myNum = 20; // will generate an error: cannot assign a value
 * 
 * Other types
 *
 * A demonstration of how to declare variables of other types:
 *
 * Example:
 * 
 * 	int myNum = 5;
 * 	float myFloatNum = 5.99f;
 * 	char myLetter = 'D';
 *	boolean myBool = true;
 * 	String myText = "Hello";
 */

/*
class HelloWorld
{
	public static void main(String[] args)
	{
		// Declare variables and assign a value for each
		String fullName = "Norarizat bin Rejal";
		int age = 23;
		float height = 165; // cm
		float weight = 60; // kg
		double bmi = ( weight / height / height ) * 10000; // Metric formula for calculating BMI
		
		// Display all
		System.out.println("\nName\t: " + fullName);
		System.out.println("Age\t: " + age);
		System.out.println("Height\t: " + height + "cm");
		System.out.println("Weight\t: " + weight + "kg");
		System.out.format("Your Body Mass Index (BMI) is %.2f\n", bmi);
	}
}*/
