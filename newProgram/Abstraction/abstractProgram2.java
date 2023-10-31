abstract class Bank {
    abstract void getBalace();
}
class BankA extends Bank{
    void getBalace(){
        System.out.println("$ 100 are diposited in BankA");
    }
}
class BankB extends Bank{
    void getBalace(){
        System.out.println("$ 150 are diposited in BankB");
    }
}
class BankC extends Bank{
    void getBalace(){
        System.out.println("$ 200 are diposited in BankC");
    }
}
class Check{
    public static void main(String args []){
        BankA b1 = new BankA();
        b1.getBalace();
        BankB b2 = new BankB();
        b2.getBalace();
        BankC b3 = new BankC();
        b3.getBalace();
    }
}