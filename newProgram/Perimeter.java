class Perimeter
{
    double width ; 
    double height ;
    double area, perimeter;
    void getdata()
    {
        width = 5.5;
        height = 8.8;
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
        Perimeter p = new Perimeter();
        p.getdata();
        p.calculate();
        p.display();
    }
}