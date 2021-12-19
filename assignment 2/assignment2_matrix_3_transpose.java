package assignment_2;
import java.util.Scanner;

public class assignment2_matrix_3_transpose {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows you want the matrix of :");
        int rows=in.nextInt();
        System.out.println("Enter the number of rows you want the matrix of :");
        int cols=in.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter the values now:\n");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter the value you want on row "+(i+1)+" and column number "+(j+1));
                arr[i][j]=in.nextInt();
            }
        }
        int[][] transpose=new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("The matrix after transposing");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
