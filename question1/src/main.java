import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] st=new String[str.length()];
        for(int i = 0; i <str.length() ; i++){
            st[i] = String.valueOf(str.charAt(i));
        }

    }
}
