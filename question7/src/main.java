import java.util.Scanner;

public class main {
    public static void main(String[]  args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        byte b[]=str.getBytes();
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            sum=sum+b[i];
        }
        System.out.print("TotalWeight = "+sum);
    }
}
