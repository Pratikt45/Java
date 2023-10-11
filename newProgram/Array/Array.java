import java.util.*;
class Array{
    public static void main (String args[]){
        int x [] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the 3 elements");
        for (int i=0; i<3 ; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("The 3 elements are as follows");
        for(int i = 0; i<3;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}