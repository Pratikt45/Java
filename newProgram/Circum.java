class Circum{
	 double pi=3.14,r=10, areaCircum;
	 void areaCalculate(){
        areaCircum = 2*pi*r;
        System.out.println("\n\n Area of Circumferance is :"+areaCircum);
	 }
    public static void main(String args[])
    {
       Circum c1 = new Circum ();
	   c1.areaCalculate();
    }
}