public class LECTURE {
    int id;
    String instructor;
    public static void main(String [] args){
        
        today l1=new today(50);
        System.out.print(l1.id);
    }
}

class today extends LECTURE{
  
    public today(int ID)
    {
        this.id=ID;
    }
}