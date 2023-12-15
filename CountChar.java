package CollectionsJava;

public class CountChar {
    public static void main(String[] args) {
        String s = "hello shiva";
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(" char count in the Stinrg is "+ count);
    }
}
