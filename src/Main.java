import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        int factn=1;
        int factr=1;
        int factdif=1;
        double total;
        if (n>=r){
            for (int i=1;i<=n;i++){
                factn=factn*i;
            }
            for (int i=1;i<=r;i++){
                factr=factr*i;
            }
            if (n==r){
                factdif=1;
            }else {
                for (int i=1;i<=(n-r);i++){
                    factdif=factdif*i;
                }
            }

            total=factn/(factr*factdif);
            System.out.println("kombinasyon : "+total);
        }else {
            System.out.println("hatalı giriş yaptınız");
        }
    }
}
