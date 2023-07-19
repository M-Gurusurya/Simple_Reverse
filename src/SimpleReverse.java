import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word=scanner.next();

        System.out.println(findReverse(word));
    }
    public static String findReverse(String word)
    {
        String rev_word="";
        for (int i=word.length()-1;i>=0;i--)
        {
            rev_word+=word.charAt(i);
        }
        return rev_word;
    }
}
