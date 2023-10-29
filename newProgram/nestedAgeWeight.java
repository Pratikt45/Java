import java.util.Scanner;
class AgeWeight{
    int age, weight;
    void AgeWeight() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of a person");
        age = sc.nextInt();

        System.out.println("Enter the weight of a person");
        weight = sc.nextInt();
    }
    void check(){
        if(age>18){
            if(weight>50){
                System.out.println("the person is eligible to donate blood");
            }
            else{
                System.out.println("the person is not eligible to donate blood");
            }
        }
        else{
                System.out.println("the age must be greater than 18");
        }
    }
    public static void main(String args []){
        AgeWeight a = new AgeWeight();
        a.AgeWeight();
        a.check();
    }

}