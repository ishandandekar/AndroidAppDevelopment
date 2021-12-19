package assignment_2;
import java.util.Scanner;

public class assignment2_matrix_2_frequency {
    public static void main(String args[])
    {
        int e=0,o=0;
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
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]%2==0)
                {
                    e++;
                }
                else
                {
                    o++;
                }
            }
        }
        System.out.println("The number of odd numbers on the matrix are "+o+" and count of even numbers are "+e);
    }
}
