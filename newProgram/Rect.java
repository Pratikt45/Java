class Rect
{
	 double length = 12, breadth = 10, areaRect;
	 void rectArea() {
        areaRect = length*breadth;
        System.out.println("\n\n Area of Rectangle is : "+areaRect);
	 }
    public static void main(String args[])
    {
      Rect r = new Rect();
	  r.rectArea();
    }
}