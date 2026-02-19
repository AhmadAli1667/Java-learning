class cake{
    private String cnic;
    public void setcnic(String cnic)
    {
        if(cnic.length()==13)
            this.cnic=cnic;
    }
    public void display()
    {
        System.out.println("CNIC IS: "+this.cnic);
    }
}
public class java{
    public static void main(String []args)
{
    cake c1=new cake();
    c1.setcnic("1234567891234");
    c1.display();
}
}
