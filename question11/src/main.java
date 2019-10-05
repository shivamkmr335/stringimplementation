import java.util.Scanner;

public class main {
    public static void main(String[]  args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = s.nextLine();
        System.out.println("enter charater");
        char ch = s.nextLine().charAt(0);
        int len=str.length();
        int index=0;
        while(len>0){
            char i=str.charAt(index);
            if(ch==i){
                System.out.println(index);
            }
            index++;
            len--;
        }
    }
}
