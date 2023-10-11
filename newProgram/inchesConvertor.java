class Convertor
{
    double inch, meter;
    void getdata()
    {
        inch = 1000;
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
        Convertor c = new Convertor();
        c.getdata();
        c.calculate();
        c.display();
    }
}