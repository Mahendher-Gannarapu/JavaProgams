package October_2024._14102024_Interface;

public class InterfaceEx2 {
}
interface I5{

    float PIE = 3.14f;

}
interface I6{}
class A{} //Concrete class
class B{}   //Concrete class
class Test1 extends A{} // Single
//class Test2 extends A,B{ } // Multiple Never Possible using class
class Test3 implements I6{ }
class Test4 implements I5,I6{ } // Multiple Inheritance Interfaces
class Test5 extends A implements I5,I6{ }
//class Test6 implements I1 extends A{ }
