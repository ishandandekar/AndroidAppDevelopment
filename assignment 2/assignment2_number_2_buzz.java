package assignment_2;
import java.util.Scanner;

public class assignment2_number_2_buzz {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int input=in.nextInt();
        if (input%7==0)
        {
            System.out.println(input + " is a Buzz number");
        }
        else if(input%10==7)
        {
            System.out.println(input+" is a Buzz number");
        }
        else
        {
            System.out.println(input+" is not a Buzz number");
        }
    }
}
