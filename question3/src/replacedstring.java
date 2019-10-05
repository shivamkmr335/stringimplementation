public class replacedstring {
    public  String s="";
    public void replace(String str) {
        int len=str.length();
        for (int i = 0; i <len ; i++) {
            char st = str.charAt(i);
            if (st == 'a' || st == 'e' || st == 'o' || st == 'i' || st == 'u') {
                System.out.print("*");;
            } else {
                System.out.print(st);
            }
        }
    }
}
