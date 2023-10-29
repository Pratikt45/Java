import java.util.Scanner;

class EvenOdd{
    public static void main (String [] args){
     double num;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num :");
        num = sc.nextDouble();
       
        if(num%2==0){
            if(num%6==0){
                System.out.println("\n Given Number is Even and Divisible by 6");
            }
            else{
                
                System.out.println("\n Given Number is Even but not Divisible by 6");
            }
        }
        else{
            if(num%3==0){
                System.out.println("\n Given Number is Odd and Divisible by 3");
            }
            else{
                
                System.out.println("\n Given Number is Odd but not Divisible by 3");
            }
        }
    }  
}