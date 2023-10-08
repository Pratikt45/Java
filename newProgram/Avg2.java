class Average
{
    double num1 , num2 , num3 , avg;
        void getdata(double a,double b,double c)
        {
             num1 = a;
             num2 = b;
             num3 = c;
        }
        void calculate()
        {
            avg = (num1+num2+num3)/3;
        }
        void display()
        {
            System.out.println("Average of three number is : "+ avg);
        }
    public static void main (String args [])
    {
        Average a = new Average();
        a.getdata(10,20,10);
        a.calculate();
        a.display();
    }
}