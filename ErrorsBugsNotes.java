/*
Syntax errors: Errors found by the compiler.
Run-time errors: Errors found by checks in a running program.
Logic errors: Errors found by the programmer looking for the causes of erroneous results.



Syntax Errors
When we are writing Java programs, the compiler is our first line of defense against errors. It can catch syntax errors.

Syntax errors represent grammar errors in the use of the programming language. They are the easiest to find and correct. 
The compiler will tell you where it got into trouble, and its best guess as to what you did wrong.

Some common syntax errors are:

Misspelled variable and method names
Omitting semicolons ;
Omitting closing parenthesis ), square bracket ], or curly brace }



Syntax Errors

Errors which happen during program execution (run-time) after successful compilation are called run-time errors. 
Run-time errors occur when a program with no compile-time errors asks the computer to do something that the computer is unable to reliably do.

Some common run-time errors:

Division by zero also known as division error
Trying to open a file that doesn’t exist
There is no way for the compiler to know about these kinds of errors when the program is compiled.



Exceptions

Java uses exceptions to handle errors and other exceptional events. Exceptions are the conditions that occur at runtime and may cause the termination of the program.

common exceptions that you will see in the wild:

ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
FileNotFoundException: Java didn’t find the file it was looking for.



Logic Errors
Logic errors occur when there is a design flaw in your program.
Logic errors don’t have error messages. Sometimes, programmers use a process called test-driven development (TDD), a way to give logic errors error messages

Program logic is flawed
Some “silly” mistake in an if statement or a for/while loop
*/