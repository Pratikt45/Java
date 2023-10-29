class Temp
{
    double far, celsius;
    void getdata()
    {
        far = 212;
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
        Temp t= new Temp();
        t.getdata();
        t.calculate();
        t.display();
    }
}