class Multi1 
{
	double num1, num2 ,ans;
	void getdata(){
		num1 = 10;
		num2 = 8;
	}
	void calculate(){
		ans = num1*num2;
	}
	void display(){
		        System.out.println("\n\n Multiplication of Two Number is  : "+ ans);
	}
	public static void main(String[] args) 
	{
		Multi1 m1 = new Multi1();
		m1.getdata();
		m1.calculate();
		m1.display();
	}
}
