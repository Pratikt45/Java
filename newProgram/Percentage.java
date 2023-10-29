class Percentage 
{
		double EC=72, MDD=85, AE=56, IMC=74, MECH=64, per,tm=500, om;
		void perCalculator()
	{
		System.out.println(" ");
		System.out.println("-------- Percentage of Pratik Thorat --------");
		System.out.println(" ");
		System.out.println("---------------- Final Year ----------------");
		System.out.println(" ");
		System.out.println("Energy Conservation-II             --->  "+EC);
		System.out.println(" ");
		System.out.println("Machine Design And Drawing         --->  "+MDD);
		System.out.println(" ");
		System.out.println("Automation Engineering             --->  "+AE);
		System.out.println(" ");
		System.out.println("Industrial Management And Costing  --->  "+IMC);
		System.out.println(" ");
		System.out.println("Mechatronics                       --->  "+MECH);
		System.out.println("_____________________________________________________");
		om = EC+MDD+AE+IMC+MECH;
		System.out.println("Total Marks is                     --->  "+om);
		System.out.println(" ");
		per = (om/tm)*100;
		System.out.println("Percentage is                      --->  "+per);
	}
	public static void main(String[] args) 
	{
		Percentage p = new Percentage();
		p.perCalculator();
	}
}
