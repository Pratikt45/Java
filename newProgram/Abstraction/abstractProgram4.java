abstract class A{
    A(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void b_method(){
        System.out.println("This is a normal method of abstract class");
    };
}
class SubClass extends A{
    void a_method(){
        System.out.println("This is abstract method");
    }
}
class Check{
    public static void main(String args[]){
        SubClass sc = new SubClass();
        sc.a_method();
        sc.b_method();
    }
}