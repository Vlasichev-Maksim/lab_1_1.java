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
        int i=0;
        int b =0;
        while(i<10){
            b+=array[i];
            i++;
        }
        System.out.println(b);
        i=0;
        b=0;
        do {
            b+=array[i];
            i++;
        }while(i<10);

        System.out.println(a);
        System.out.println(b);
    }
}
