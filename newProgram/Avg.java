class Average
{
    double num1 , num2 , num3 , avg;
        void getdata()
        {
             num1 = 10;
             num2 = 20;
             num3 = 10;
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
        a.getdata();
        a.calculate();
        a.display();
    }
}