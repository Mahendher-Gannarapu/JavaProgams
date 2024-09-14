package Sept_13092024;

import java.sql.SQLOutput;

public class LiteralsEx {
    public static void main(String[] args) {
        //Literals diff types

        //Boolean literals-boolean values - true or false
        Boolean your_city_hyderabad = true;
        Boolean your_city_Mumbai = false;

        //Integral type- Decimal system
        int x=80;

        //Binary type
        int binary=101010;

        //Octal type
        int octal= 1010;

        //Hexadeciamal type
        int hex= 0Xface;

        //Char literals-
        //single chars
        char a='x';
        char b='&';

        //Escape chars
        char new_line ='\n';
        char tab_line ='\t';
        char back_space ='\b';

        System.out.println("Gannarapu" + new_line + "Mahendher");
        System.out.println("Gannarapu" + '\n' + "Mahendher");
        System.out.println("Gannarapu" + tab_line + "Mahendher");

        char a1= 'A';
        System.out.println("ASCII ="+a1);
    }
}
