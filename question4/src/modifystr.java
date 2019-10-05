public class modifystr {
    public char[] ch={'*','^','!'};
    public void modify(String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char st=str.charAt(i);
            if (st == 'a' || st == 'e' || st == 'o' || st == 'i' || st == 'u') {
                System.out.print(ch[count%3]);
                count++;
            }
            else{
                System.out.print(st);
            }
        }
    }
}
