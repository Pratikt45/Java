class Div2 
{
	double num1, num2 ,ans;
	void getdata(double int1, double int2){
		num1 = int1;
		num2 = int2;
	}
	void calculate(){
		ans = num1/num2;
	}
	void display(){
		        System.out.println("\n\n Division of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Div2 d2 = new Div2();
		d2.getdata(200, 100);
		d2.calculate();
		d2.display();
	}
}
