package CollectionsJava;

public class ReversString {
    public static void main(String[] args) {
        String s = "hello shiva patel";
        String rs1 = " ";
        for (int i = s.length()-1;i>=0;i--)
        {
            rs1 = rs1+s.charAt(i);

        }
        System.out.println("the revers of String is : "+rs1);
    }
}
