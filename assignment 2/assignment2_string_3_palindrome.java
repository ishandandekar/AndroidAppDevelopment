package assignment_2;
import java.util.Scanner;

public class assignment2_string_3_palindrome {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word you want to check if its a palindrome");
        String s=in.next();
        boolean count=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                count=false;
                break;
            }
            else
            {
                count=true;
            }
        }
        if (count)
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
            System.out.println(s+" is not a palindrome");
        }
    }
}
