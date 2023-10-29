import java.util.Scanner;
class gender{
    String gender;
    void display(){
       
            switch (gender){
            case "male":
                System.out.println("Given gender is male");
                break;
            case "female":
                System.out.println("Given gender is female");
                break;
            default:
                System.out.println("Please provide valid input");
                break;
        }
    }
        public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide gender");

        String gender = sc.nextLine();
        gender v = new gender();
        v.gender = gender;
        v.display();
    }
}