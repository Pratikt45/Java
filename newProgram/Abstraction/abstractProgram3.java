abstract class Marks{
    abstract void getPercentage();
}
class A extends Marks{
   double eng, math,sci;
    A(double eng, double math, double sci){
        this.eng = eng;
        this.math = math;
        this.sci = sci;
        
        System.out.println("Marks in eng"+eng+"Marks in Math"+math+"Marks in Sci"+sci);
    }
    void getPercentage(){
        double Per = (eng+math+sci)/3;
        System.out.println("The Percentage of Student A is "+ Per);
    }
}
class B extends Marks{
    double eng, math,sci,mar;
    B(double eng, double math, double sci, double mar){
        this.eng = eng;
        this.math = math;
        this.sci = sci;
        this.mar = mar;
        System.out.println("Marks in eng"+eng+"Marks in Math"+math+"Marks in Sci"+sci+"Marks in Marathi"+mar);
    }
    void getPercentage(){
        double Per = (eng+math+sci+mar)/4;
        System.out.println("The Percentage of Student B is "+ Per);
    }
}
class Check{
    public static void main(String args []){
        A a = new A(85,90,78);
        a.getPercentage();
        B b = new B(75,88,92,81);
        b.getPercentage();
    }
}