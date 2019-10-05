public class replacedstring {
    public  String s;
    public char c='*';
    public String replace(String str) {
        int len=str.length();
        for (int i = 0; i <len ; i++) {
            char st=str.charAt(i);
            if(st=='a' || st=='e' || st=='o' || st=='i' || st=='u') {
                s.concat("*");
            }
            else{
                s.concat(String.valueOf(str.charAt(i)));
            }
        }
        return s;
    }

}
