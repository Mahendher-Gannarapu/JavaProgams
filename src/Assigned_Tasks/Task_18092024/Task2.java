/* 2. What is the output for below code
   int a = 10;
   System.out.println(  --a + a--  + a--);
   System.out.println(a);
 */
package Assigned_Tasks.Task_18092024;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("--a + a--  + a-- = " + (--a + a--  + a--));
        System.out.println("a= " +a);


//        Output: 26
//        7

//        3. int a = 10;
//        System.out.println(  --a + a++ + a--); System.out.println(a);
//        OutPut: 28
//        9

//        4. int a = 10;
//        System.out.println(  a-- + a--  + a--); System.out.println(a);
//        Output: 27
//        7
//
    }
}
