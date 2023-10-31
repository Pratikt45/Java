abstract class Animal{
    abstract void cats();
    abstract void dogs();
}
class cats extends Animal{
    void cats(){
        System.out.println("Cats Meow");
    }
}
class dogs extends Animal{
    void dogs(){
        System.out.println("Dogs Bark");
    }
}
class Check{
    public static void main(String args []){
        cats c = new cats();
        c.cats();
        dogs d = new dogs();
        d.dogs();
    }
}