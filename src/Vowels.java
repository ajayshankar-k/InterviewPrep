import java.util.*;

public class Vowels {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = scan.nextLine();
        char[] arr = word.toCharArray();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for(char x:arr){
            if('a'==x){
                a++;
            }else if('e'==x) {
                e++;
            }else if('i'==x){
                i++;
            }else if('o'==x){
                o++;
            }else if('u'==x){
                u++;
            }
        }
        System.out.println("There are "+a+":a "+e+":e "+i+":i "+o+":o "+u+":u");

    }
}
