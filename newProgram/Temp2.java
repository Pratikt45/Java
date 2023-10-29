class Temp2
{
    double far, celsius;
    void getdata(double a)
    {
        far = a;
    }
    void calculate()
    {
        celsius = (far-32)*5/9;
    }
    void display()
    {
        System.out.println(far + " degree Fahrenheit is equal to "+ celsius+" in Celsius");
    }
    public static void main (String [] args)
    {
        Temp2 t= new Temp2();
        t.getdata(212);
        t.calculate();
        t.display();
    }
}