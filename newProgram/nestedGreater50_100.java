import java.util.Scanner;
class GreaterLesser{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int a = sc.nextInt();
    void check(){
        if(a<100){
            if(a>50){
                System.out.println(" the entered number is greater than 50 and lesser than 100");
            }
            else{
                System.out.println(" the entered number is not greater than 50 and lesser than 100");
            }
        }
        else{
                System.out.println("the entered number is greater than 100");
            }
    }
    public static void main(String args[]){
        GreaterLesser g = new GreaterLesser();
        g.check();
    }
}