//With parameters and with Return Type

package September_2024.Sept_30092024;

public class WithParaWithReturnTypeEx {
    public static void main(String[] args) {
        double a= function_type3("Rajesh", 35, 150000);
        System.out.println(a);
    }

    public static double function_type3(String name, int age, double salary)
    {
            System.out.println("With Parameters and with Return type");
            System.out.println("Employee Details: ");
            //System.out.println("Name: "+name+ "\nAge: "+age+ "\nSalary: "+salary);
            //return name;
            //return age;
            return salary;
    }
}

/*

There are a few issues with the code. First, a function can only return a single value,
but in your case, you're trying to return multiple values (name, age, salary)
which isn't possible with the return keyword.
You can use a return type that fits the actual value you want to return.

If you want to return just one value, you can pick one of them.
But if you need to return all values, you may either use a custom class,
a Map, or other structures like an array or a list to return multiple values.
 */