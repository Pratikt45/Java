class Convertor2
{
    double inch, meter;
    void getdata(double a)
    {
        inch = a;
    }
    void calculate(){
        meter = inch*0.0254;
    }
    void display()
    {
        System.out.println(inch+" inch is "+meter+" meters");
    }
    public static void main (String [] args)
    {
        Convertor2 c = new Convertor2();
        c.getdata(1000);
        c.calculate();
        c.display();
    }
}