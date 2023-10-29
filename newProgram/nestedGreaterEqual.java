import java.util.Scanner;
class GreaterEqual{
    public static void main(String [] args){
        double num,n1,n2,n3;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1 :");
        n1 = sc.nextDouble();
      
        System.out.println("Enter the value of n2 :");
        n2 = sc.nextDouble();
      
        System.out.println("Enter the value of n3 :");
        n3 = sc.nextDouble();
        if(n1>=n2){
            if(n1>=n3){
                System.out.println("n1 is Greater");
            }
            else{
                 System.out.println("n3 is Greater");
            }
        }
        else{
          if(n2>=n3){
            System.out.println("n2 is Greater");
          }
          else{
            System.out.println("n3 is Greater");
          }
        }
    }
}