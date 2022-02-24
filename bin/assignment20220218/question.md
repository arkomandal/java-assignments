Answer the below question :
------------------------------------------------------------------------
1. Can you create a sub class to the following class?
class A
{
    private A()
    {
        //First Constructor
    }
     
    private A(int i)
    {
        //Second Constructor
    }
}

Answer: 
No. It gives error: "constructor is not visible". 
Constructor must be public but here it is defined as private and not visible from outside. hence the answer is no.

------------------------------------------------------------------------

2. Does field ‘i’ of Class A be inherited to Class B in the below code?
class A
{
    protected int i;
}
class B extends A
{    
}

Answer: 
Yes. 
Protected variables are inherited in extended/sub/child class.

------------------------------------------------------------------------

3. Is the below code written correctly?
class A
{
    private class B
    {
        //inner class
    }
}
public class MainClass extends A
{
    public static void main(String[] args)
    {
        B b = new B();
    }
}

Answer: No. 
However, if the inner class wasn't made private we could use it like this
A a = new A();
A.B b= a.new B();

------------------------------------------------------------------------

4. Is the below code written correctly?

package pack1;
class A
{
}
 
package pack2;
class B extends A
{
}

Answer:
No.
The package pack1 needs to be imported in B file. i.e:
import pack1.*; 

------------------------------------------------------------------------

5. Can we declare a class as protected?
Answer:
Outer classes cannot be made protected. However, Inner classes can be.

------------------------------------------------------------------------


6. Do you think the below program is written correctly? If yes, what will be the output?

package pack1;
class X
{
    protected int i = 1221;
     
    void methodOfX()
    {
        System.out.println(i);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();
         
        System.out.println(x.i);
         
        x.methodOfX();
    }
}
Answer:
1221
1221

------------------------------------------------------------------------

7. Is the below programme works ? If not what will be the reason ?

package pack1;
class A
{
    public A()
    {
        //public constructor
    }
}
 
package pack2;
import pack1.*;
class B
{
    A a = new A();       //Compile Time Error
}
Answer:
the class A is not extended into B. So, it is giving the compile time error.

------------------------------------------------------------------------

8. Can a protected field of a class be inherited to subclass outside the package?
Answer: Only if the class is extended.

------------------------------------------------------------------------

9.Why Line 17 in the below code is throwing compile time error?

package pack1;
public class A
{
    protected A()
    {
        //protected constructor
    }
}
package pack2;
import pack1.A;
class B
{
    A a = new A();
}
Answer:
the class A is not extended into B. So, it is giving the compile time error.

------------------------------------------------------------------------

10. Can we declare static methods as private?
Answer: Yes

------------------------------------------------------------------------

11. What will be the outcome of the below program?

package pack1;
public class A
{
    private int methodOne(int i)
    {
        return ++i;
    }
     
    public int methodTwo(int i)
    {
        return methodOne(++i);
    }
}
 
package pack2;
import pack1.A;
class B extends A
{
    int methodOne(int i)
    {
        return methodTwo(++i);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(new B().methodOne(101));
    }
}

Answer:
104

------------------------------------------------------------------------

12. Can you find out the error in the following code snippet?

class A
{
    public void methodOfA()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    @Override
    void methodOfA()
    {
        System.out.println("Class B");
    }
}

Answer:
The method methodOfA is public in Super class but default in Sub class which is making the visibility lower. It will cause compile time error.

------------------------------------------------------------------------

13. private method can be overridden as public method. True or False?
Answer: No. Private methods can not be overriden.

------------------------------------------------------------------------

14. A method of super class with default access modifier can be overridden as protected or public but not as private. True or false?
Answer: 
False.
Default methods are allowed only in interfaces.

------------------------------------------------------------------------

15. Write the code on below scenario :

Create an Employee Object which has the below members :

1. name : public member.
2. address : public member.
3. salary : private member
4. id : public member

you need to create three employee such as : CEO,Project Manager and Team Lead who will inherit all those properties.
You need to create one more super user HR who has access over the system and can see all the details of all employees. This class will contain one method calculatesalary which will give 
the salary of the employee as : employee's salary * hike (consider hike =10%).

Data Sample :

CEO : name : "Rajesh Kumar ", address : "SaltLake,Kolkata", salary : 70000, id :1, calculatedsalary : 70000*10%