class Multi2 
{
	double num1, num2 ,ans;
	void getdata(double int1, double int2){
		num1 = int1;
		num2 = int2;
	}
	void calculate(){
		ans = num1*num2;
	}
	void display(){
		        System.out.println("\n\n Multiplication of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Multi2 m2 = new Multi2();
		m2.getdata(2, 100);
		m2.calculate();
		m2.display();
	}
}
