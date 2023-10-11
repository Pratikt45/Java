class Multi3 
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
}
	class Main_Multi
	{
	public static void main(String[] args) 
	{
		Multi3 m3 = new Multi3();
		m3.getdata(120, 100);
		m3.calculate();
		m3.display();
	}
}
