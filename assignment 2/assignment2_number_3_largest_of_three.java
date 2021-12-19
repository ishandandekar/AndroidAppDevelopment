package assignment_2;
import java.util.Scanner;

public class assignment2_number_3_largest_of_three {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int one=in.nextInt();
        System.out.println("Enter the second number");
        int second=in.nextInt();
        System.out.println("Enter the third number");
        int third=in.nextInt();
        if (one>second && one>third)
        {
            System.out.println(one+" is the largest among the three numbers");
        }
        else if(second>one && second>third)
        {
            System.out.println(second+" is i the largest among the three numbers");
        }
        else if(third>one && third>second)
        {
            System.out.println(third+" is the largest among the three numbers");
        }
        if (one==second && one>third)
        {
            System.out.println("Both "+one+" and "+second+" are greater than "+third);
        }
        if (one==third && one>second)
        {
            System.out.println("Both "+one+" and "+third+" are greater than "+second);
        }
        if (third==second && third>one)
        {
            System.out.println("Both "+third+" and "+second+" are greater than "+one);
        }
        else
        {
            System.out.println("All the three numbers are equal, hence you can't compute which one is largest");
        }
    }
}
