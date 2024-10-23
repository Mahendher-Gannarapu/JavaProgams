/*
byte b = 10; long l = 10l; → How much Byte will be used.
 */
package Assigned_Tasks.Sept_2024.Task_16092024;

public class Task2 {
    public static void main(String[] args) {
        //The Byte data type in Java uses 1 Byte (8 bits) of memory
        Byte b=10;

        //The long data type in Java uses 8 Byte (64 bits) of memory
        long l= 10L;

        //Here memory used by declarations total 9 Bytes.
        System.out.println(b);
        System.out.println(l);
    }
}
