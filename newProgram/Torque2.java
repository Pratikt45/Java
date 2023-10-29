
class Torque2 
{
	double m1, m2 ,Torque;
	void getdata(){
		m1 = 10;
		m2 = 5;
	}
	void calculate(){
		Torque = m1+m2/m1*m2;
	}
	void display(){
		        System.out.println("\n\n Torque is  : "+ Torque);
	}
}
class Main_Torque
{
	public static void main(String[] args) 
	{
		Torque2 t2 = new Torque2();
		t2.getdata();
		t2.calculate();
		t2.display();
	}
}
