import java.util.Scanner;
class EvenOdd{
    int num =2;
    void display(){
        switch(num){
            case 1:
                System.out.println("Given number is even");
                break;
            case 2:
                System.out.println("Given number is odd");
                break;
            default :
                System.out.println("Given number is Invalid");
        }
    }
     public static void main(String args []){
        EvenOdd e = new EvenOdd();
        e.display();
    }
}