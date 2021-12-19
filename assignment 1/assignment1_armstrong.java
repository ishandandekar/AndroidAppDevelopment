import java.util.Scanner;

public class assignment1_armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:\n");
        String input_string=in.next();
        int len=input_string.length();
        double sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+Math.pow(Integer.parseInt(String.valueOf(input_string.charAt(i))),len);
        }
        // System.out.println(sum);
        if (sum==Integer.parseInt(input_string))
        {
            System.out.println(input_string+" is an Armstrong number");
        }
        else
        {
            System.out.println(input_string+" is not an Armstrong number");
        }
        in.close();
    }
}
