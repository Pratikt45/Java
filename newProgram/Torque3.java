
class Torque3 
{
	double m1, m2 ,Torque;
	void getdata(double val1,double val2){
		m1 = val1;
		m2 = val2;
	}
	void calculate(){
		Torque = m1+m2/m1*m2;
	}
	void display(){
		        System.out.println("\n\n Torque is  : "+ Torque);
	}
}
class Main_Torque3
{
	public static void main(String[] args) 
	{
		Torque3 t3 = new Torque3();
		t3.getdata(10, 5);
		t3.calculate();
		t3.display();
	}
}
