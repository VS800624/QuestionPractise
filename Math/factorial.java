import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("faactorial of number= "+f);
    
    }
}
