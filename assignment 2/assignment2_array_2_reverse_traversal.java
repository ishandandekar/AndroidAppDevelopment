package assignment_2;

public class assignment2_array_2_reverse_traversal {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("The array now in reverse order");
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
