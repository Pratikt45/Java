class Add3 
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
}
	class Main_Add
	{
	public static void main(String[] args) 
	{
		Add3 a3 = new Add3();
		a3.getdata(120, 100);
		a3.calculate();
		a3.display();
	}
}
