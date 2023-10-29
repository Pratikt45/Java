class Sub3 
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
}
	class Main_Sub 
	{
	public static void main(String[] args) 
	{
		Sub3 s3 = new Sub3();
		s3.getdata(120, 100);
		s3.calculate();
		s3.display();
	}
}
