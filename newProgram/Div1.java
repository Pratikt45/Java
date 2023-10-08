class Div1 
{
	double num1, num2 ,ans;
	void getdata(){
		num1 = 10;
		num2 = 2;
	}
	void calculate(){
		ans = num1/num2;
	}
	void display(){
		        System.out.println("\n\n Division of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Div1 d1 = new Div1();
		d1.getdata();
		d1.calculate();
		d1.display();
	}
}
