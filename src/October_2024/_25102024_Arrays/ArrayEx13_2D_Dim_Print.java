package October_2024._25102024_Arrays;

public class ArrayEx13_2D_Dim_Print {
    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
