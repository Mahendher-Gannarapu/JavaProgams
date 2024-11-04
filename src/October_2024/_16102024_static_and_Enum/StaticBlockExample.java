package October_2024._16102024_static_and_Enum;

public class StaticBlockExample {
    public static void main(String[] args) {
        A a =new A(); //SIB and IIB created
        A a1 =new A(); //IIB only created becoz class only once loaded
        new A(); //IIB created
        A a2; //Object not created so not call SIB and IIB
    }
}

class A
{
    {
        System.out.println("IIB");
    }

    static{
        System.out.println("SIB");
    }
}

/*
OUTPUT
SIB
IIB
IIB
IIB

 */