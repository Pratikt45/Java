class Add1 
{
	double num1, num2 ,ans;
	void getdata(){
		num1 = 42;
		num2 = 8;
	}
	void calculate(){
		ans = num1+num2;
	}
	void display(){
		        System.out.println("\n\n Addition of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Add1 a1 = new Add1();
		a1.getdata();
		a1.calculate();
		a1.display();
	}
}
