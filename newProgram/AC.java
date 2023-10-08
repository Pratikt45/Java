class AccessSpecifier1
{
    public
    int x = 1;
    public void display()
    {
        System.out.println("x = "+ x);

    }
    public static void main (String args[])
    {
        AccessSpecifier1 as = new AccessSpecifier1();
        as.display();
        System.out.println("x = "+as.x);
    }
}