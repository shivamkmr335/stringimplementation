import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] st=new String[str.length()];
        System.out.print("index:\t");
        for(int i = 0; i <str.length() ; i++){
            st[i] = String.valueOf(str.charAt(i));
            System.out.print(i+"\t");
        }
        System.out.print("\nchars:\t");
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(st[i]+"\t");
        }

    }
}
