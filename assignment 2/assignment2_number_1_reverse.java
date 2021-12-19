package assignment_2;
import java.util.Scanner;

public class assignment2_number_1_reverse {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want reversed");
        int input=in.nextInt();
        int temp=0;
        do
        {
            temp=temp*10+input%10;
            input=input/10;
        }while(input>0);
        System.out.println(temp);
    }
}
