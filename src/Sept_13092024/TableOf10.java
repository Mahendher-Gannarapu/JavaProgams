/*Write a program to print the table of number which user will give( int num 10)
output will be like this (by using the printf()
10 × 1 = 10
10 × 2 = 20
10 × 3 = 30….
10 × 10 = 100. */

package Sept_13092024;
public class TableOf10 {
    public static void main(String[] args) {
        int n=10;
        //System.out.println("%d * %d =%d"+n+1+(n*1));
        //System.out.println(+n+ "*" +1+ '=' +(n*1));
        System.out.printf("%d * 1 = %d\n",n,(n*1));
        System.out.printf("%d * 2 = %d\n",n,(n*2));
        System.out.printf("%d * 3 = %d\n",n,(n*3));
        System.out.printf("%d * 4 = %d\n",n,(n*4));
        System.out.printf("%d * 5 = %d\n",n,(n*5));
        System.out.printf("%d * 6 = %d\n",n,(n*6));
        System.out.printf("%d * 7 = %d\n",n,(n*7));
        System.out.printf("%d * 8 = %d\n",n,(n*8));
        System.out.printf("%d * 9 = %d\n",n,(n*9));
        System.out.printf("%d * 10 = %d\n",n,(n*10));
            }
}
