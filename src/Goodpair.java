import java.util.Scanner;

public class Goodpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(goodPair(size,B,array));//A = [1,2,3,4] B = 7 op-1

    }
    public static int goodPair(int size,int B,int[] array)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]+array[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j
// and (A[i] + A[j] == B). Check if any good pair exist or not.
