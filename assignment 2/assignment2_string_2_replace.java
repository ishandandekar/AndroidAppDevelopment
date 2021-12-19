package assignment_2;
import java.util.Scanner;

public class assignment2_string_2_replace {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input=in.nextLine();
        System.out.println("Enter the character you to want to replace all ' ' that is all the spaces character");
        char c=in.next().charAt(0);
        System.out.println("The string after replacing all the spaces with "+c+" :\n"+input.replace(' ',c));
    }
}
