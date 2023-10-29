class Perimeter2
{
    double width ; 
    double height ;
    double area, perimeter;
    void getdata(double a, double b)
    {
        width = a ;
        height = b ;
    }
    void calculate ()
    {
        area = width*height;
        perimeter = 2*(width + height);
    }
    void display()
    {
        System.out.println("Area of Rectangle is : "+area);
        System.out.println("Area of Perimeter is : "+perimeter);
    }
    public static void main(String[] args)
    {
        Perimeter2 p = new Perimeter2();
        p.getdata(5.5,8.8);
        p.calculate();
        p.display();
    }
}