
class Torque1 
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
	public static void main(String[] args) 
	{
		Torque1 t1 = new Torque1();
		t1.getdata();
		t1.calculate();
		t1.display();
	}
}
