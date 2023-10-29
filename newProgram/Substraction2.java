class Sub2 
{
	double num1, num2 ,ans;
	void getdata(double int1, double int2){
		num1 = int1;
		num2 = int2;
	}
	void calculate(){
		ans = num1-num2;
	}
	void display(){
		        System.out.println("\n\n Substraction of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Sub2 s2 = new Sub2();
		s2.getdata(120, 100);
		s2.calculate();
		s2.display();
	}
}
