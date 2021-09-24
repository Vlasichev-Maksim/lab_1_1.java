import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int array[] = new int[10];
        int a=0;
        for(int i=0; i<10; i++)
        {
            a = cs.nextInt();
            array[i]=a;
            a=0;
        }
        for(int i=0;i<10;i++)
        {
            a+=array[i];
        }
        System.out.println(a);
    }
}
