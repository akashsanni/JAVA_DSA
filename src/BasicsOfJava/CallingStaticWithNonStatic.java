package BasicsOfJava;
/*


class A {

    // A non-static variable
    int N;

    // Static method
    public static void increment()
    {
        // this throws a compile - time error.
        N++;
    }
}

public class CallingStaticWithNonStatic {

    // Main method
    public static void main(String args[])
    {
        // Creating multiple objects
        // for class A
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();

        // Assigning the different values
        // for the non static variable N
        obj1.N = 3;
        obj2.N = 4;
        obj3.N = 5;

        // Calling the method
        A.increment();

        System.out.println(obj1.N);
        System.out.println(obj2.N);
        System.out.println(obj3.N);
    }
}

 */
// Java program to demonstrate
// why a non-static variable cannot
// be accessed from a static context

// Creating a class A

/*
error: non-static variable N cannot be referenced from a static context

As we can see that the above program gives the error. Though in the above code, all the objects names
have the same variable name N, if we try to increment N, it's giving an error. This error is very common
during object-oriented programming.

Why does this error occur?
For the non-static variable, there is a need for an object instance to call the variables. We can also
create multiple objects by assigning different values for that non-static variable. So, different objects
may have different values for the same variable. In the above program we have created three objects obj1,
obj2, obj3 for the class A and assigned the three different values 3, 4, 5 for the objects obj1, obj2, obj3
 respectively. When we try to call the function increment, as every object of N have its own value there will
  be ambiguity for the compiler to understand for what value of N should the method increment the value.

How to solve this error?
In order to avoid ambiguity, the java compiler throws a compile time error. Therefore, this issue can be solved
 by addressing the variables with the object names. In short, we always need to create an object in order to
 refer to a non-static variable from a static context. Whenever a new instance is created, a new copy of all
 the non-static variables and methods are created. By using the reference of the new instance, these variables
 can be accessed. For example:

 */

// Java program to access a
// non static variable from
// a static block
public class CallingStaticWithNonStatic {

    int count = 0;

    // Driver code
    public static void main(String args[])
    {

        // Accessing static variable
        // by creating an instance
        // of the class
        CallingStaticWithNonStatic test = new CallingStaticWithNonStatic();

        test.count++;
        System.out.println(test.count);
    }
}