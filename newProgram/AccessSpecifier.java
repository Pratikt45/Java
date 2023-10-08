class Amruta
{
    AccessSpecifier1 am;
    void display()
    {
        am = new AccessSpecifier1();
        System.out.println("Amruta Class ---> x =" + am.x);
    }
}
class Shreya
{
    AccessSpecifier1 sh;
    void print()
    {
        sh = new AccessSpecifier1();
        System.out.println("Shreya Class ---> x =" + sh.x);
    }
}
class Sameer
{
    AccessSpecifier1 sm;
    void show()
    {
        sm = new AccessSpecifier1();
        System.out.println("Sameer Class ---> x =" + sm.x);
    }
}
class Check
{
    public static void main(String args[])
    {
        Amruta a = new Amruta();
        a.display();
        Shreya s = new Shreya();
        s.print();
        Sameer ss = new Sameer();
        ss.show();
    }
}