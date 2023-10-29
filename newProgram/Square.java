class Square
{
	double side = 12, areaSquare;
	void sqArea() {
        areaSquare = side*side;
        System.out.println("\n\n Area of Square is : "+areaSquare);
	}
    public static void main(String args[])
    {
     Square s = new Square();
	 s.sqArea();
    }
}