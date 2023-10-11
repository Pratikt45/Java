// Using For loop
// class Fibonacci{
//     public static void main(String args[]){
//         int a= 0, b= 1;
//         for(int i=1;i<=10;i++){
//             System.out.println(a);
//             int c = a+b;
//             a=b;
//             b=c;
//         }
//     }
// }


//Using While Loop
class Fibonacci{
    public static void main(String args[]){
        int a= 0, b= 1;
        while(a<=50){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}