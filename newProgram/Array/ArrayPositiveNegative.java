import java.util.*;
class ArrayPositiveNegative{
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
             if(x[i]>=0){
                System.out.println("\nGiven Num "+x[i]+" is Positive");
             }
             else{
                System.out.println("\nGiven Num "+x[i]+" is Negative");
             }
        }
    }
}