import java.util.Scanner;

public class assignment1_ISBN{
    public static void main(String args[])
    {
        System.out.println("Hello world");
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();
        int t=input;
        in.close();
        int i=0,lastdig,sum=0;
        while(t>0)
        {
            lastdig=t%10;
            sum+=lastdig*i;
            t=t/10;
            i++;
        }
        if (sum%11==0)
        {
            System.out.println(input+" is a ISBN number");
        }
        else
        {
            System.out.println(input+" is not a ISBN number");
        }
    }
}