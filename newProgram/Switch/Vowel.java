import java.util.Scanner;
class vowel{
    char ch='b';
    void display(){
            switch (ch){
            case 'a':
                System.out.println("a is Vowel");
                break;
            case 'e':
                System.out.println("e is Vowel");
                break;
            case 'i':
                System.out.println("i is Vowel");
                break;
            case 'o':
                System.out.println("o is Vowel");
                break;
            case 'u':
                System.out.println("u is Vowel");
                break;
            default:
                System.out.println(ch+" is Consonant");
                break;
        }
    }
        public static void main(String args []){
        vowel v = new vowel();
        v.display();
    }
}