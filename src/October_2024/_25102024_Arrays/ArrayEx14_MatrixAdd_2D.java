package October_2024._25102024_Arrays;

public class ArrayEx14_MatrixAdd_2D {
    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int c[][] = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }

        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
