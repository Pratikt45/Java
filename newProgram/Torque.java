class Torque{
	  double m1 = 10, m2 = 5, torque;
	  void torqueCal(){
        torque= m1+m2/m1*m2;
        System.out.println("\n\n Torque is :"+torque);
	  }
    public static void main (String args[])
	{
		Torque t = new Torque();
		t.torqueCal();
    }
}