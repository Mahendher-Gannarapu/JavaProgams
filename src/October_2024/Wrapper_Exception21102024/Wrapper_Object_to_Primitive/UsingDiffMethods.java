package October_2024.Wrapper_Exception21102024.Wrapper_Object_to_Primitive;

public class UsingDiffMethods {
    public static void main(String[] args) {

        Integer numobj = Integer.valueOf(100);
        int num = numobj.intValue();
        //int num = numobj;
        System.out.println(num);

        Double obj1 = Double.valueOf(1000);
        double d = obj1.doubleValue();
        //double d = obj1;
        System.out.println(d);

        Boolean boolObj = Boolean.valueOf(true);
        boolean b = boolObj.booleanValue();
        System.out.println(b);  // Output: true


    }
}
