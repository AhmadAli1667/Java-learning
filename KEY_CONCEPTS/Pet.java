package KEY_CONCEPTS;
import java.util.*;
public abstract class Pet {
    private String accountNumber;
    private String accountHolder;
    private String accountType;
    private double balance;
    public static void main(String[] args)
    {
        Pet p1=new dog();
        p1=new cat();

        int arr[]=new int[]{4,2,2,2,1};

        p1.methos(arr);
        System.out.println(Arrays.toString(arr));
    }
    public abstract void methos(int []arr2);
}


class dog extends Pet{
    int dog_id;
    public void methos(int []arr)
    {
        System.out.println(Math.random());
    }
}
class cat extends Pet{
    public void methos(int []arr)
    {
    {
        arr[3]=4;
        arr[4]=43;
        arr=new int[]{444,344,344};
        System.out.println(Arrays.toString(arr));
    }
}
