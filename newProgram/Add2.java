class Add2 
{
	double num1, num2 ,ans;
	void getdata(double int1, double int2){
		num1 = int1;
		num2 = int2;
	}
	void calculate(){
		ans = num1+num2;
	}
	void display(){
		        System.out.println("\n\n Addition of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Add2 a2 = new Add2();
		a2.getdata(120, 100);
		a2.calculate();
		a2.display();
	}
}
