package assignment_2;

public class assignment2_array_1_copy {
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5};
        int[] copy=new int[a.length];
        for (int i=0;i<a.length;i++)
        {
            copy[i] = a[i];
            System.out.println(copy[i]);
        }
    }
}
