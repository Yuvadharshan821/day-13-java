import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("hi");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("hlo");
    }
}
class Main
{
    public static void main(String args[])
    {
        a h=new a();
        h.p1();
        b y=new b();
        y.r();
    }
}