class Sub1 
{
	double num1, num2 ,ans;
	void getdata(){
		num1 = 12;
		num2 = 10;
	}
	void calculate(){
		ans = num1-num2;
	}
	void display(){
		        System.out.println("\n\n Substraction of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Sub1 s1 = new Sub1();
		s1.getdata();
		s1.calculate();
		s1.display();
	}
}
