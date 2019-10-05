import java.util.Scanner;

public class main {
    public static void main(String[]  args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String upper=str.toUpperCase();
        String lower=str.toLowerCase();
        byte chUpper[]=upper.getBytes();
        byte chLower[]=lower.getBytes();
        int low=0;
        int up=0;
        for (int i = 0; i <str.length() ; i++) {
            low=low+chLower[i];
            up=up+chUpper[i];
        }
        System.out.println("absolute weight = "+(low-up));
    }
}
