package assignment_2;
import java.util.Locale;
import java.util.Scanner;

public class assignment2_string_1_count_of_vowels_and_consonents {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input=in.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<input.length();i++)
        {
            char a=input.charAt(i);
            if(a=='a'||a=='i'||a=='e'||a=='o'||a=='u')
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("The sentence has "+v+" vowels and "+c+" consonents");
    }
}
