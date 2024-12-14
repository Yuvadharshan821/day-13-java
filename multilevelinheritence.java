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
class c extends b
{
    public void s()
    {
        System.out.println("Mahamood");
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
        c z=new c();
        z.s();
    }
}