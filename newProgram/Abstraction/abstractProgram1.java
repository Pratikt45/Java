abstract class Parent{
   void message(){};
}
class child1 extends Parent{
    void message(){
        System.out.println("This is first sub class");
    }
}
class child2 extends Parent{
    void message(){
        System.out.println("This is second sub class");
    }
}
class Check{
    public static void main(String args []){
        child1 c1 = new child1();
        c1.message();
        child2 c2 = new child2();
        c2.message();
    }
}