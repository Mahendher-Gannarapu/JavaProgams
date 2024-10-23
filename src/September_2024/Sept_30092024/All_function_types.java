package September_2024.Sept_30092024;

public class All_function_types {
    public static void main(String[] args) {

        //  1.Without Parameters and Without Return Type
        function_type1();
        // 2.Without Parameters but With Return Type
        int age = function_type2();
        System.out.println(age);

        // 3.With Parameters and Without Return Type
        function_type3("pramod",35,200000);

        // 4. With Parameters and With Return Type
        double result = function_type4(90,20);
        System.out.println(result);
    }

    //  1.Without Parameters and Without Return Type
    public static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }

    // 2.Without Parameters but With Return Type
    public static int function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return 35;
    }

    // 3.With Parameters and Without Return Type
    public static void function_type3(String name,int age,double salary){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("Name: "+name+ "\nAge: "+age+ "\nSalary: "+salary);
    }

    // 4. With Parameters and With Return Type
    static double function_type4(int a,double b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }

}
