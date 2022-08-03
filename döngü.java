import java.util.Scanner;

public class döngü {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x;

        System.out.print("Sayi giriniz : ");
        x = inp.nextInt();

        for(int i=1;i<=x;i++)
        {
            if(i%4==0&&i%5==0)
            {
                System.out.print(i+"\n");
            }
        }
    }
}
