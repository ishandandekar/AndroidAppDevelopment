import java.util.Scanner;

public class assignment1_neon {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int input_neon=in.nextInt();
        int square=input_neon*input_neon;
        String input_neon_square_string=Integer.toString(square);
        int length=input_neon_square_string.length();
        int sum=0;
        for(int i=0;i<length;i++)
        {
            sum=sum+Integer.parseInt(String.valueOf(input_neon_square_string.charAt(i)));
        }
        if (sum==input_neon)
        {
            System.out.println(input_neon+" is a Neon number");
        }
        else
        {
            System.out.println(input_neon+" is not a Neon number");
        }
        in.close();
    }
}
