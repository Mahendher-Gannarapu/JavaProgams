/* What is the Output for below code
int a = 10;
System.out.println(  --a + a++ + a--);
System.out.println(a);
 */
package Assigned_Tasks.Task_18092024;

public class Task3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("--a + a++ + a-- = " + (--a + a++ + a--));
        System.out.println("a= " +a);


//        OutPut: 28
//        9
    }
}
