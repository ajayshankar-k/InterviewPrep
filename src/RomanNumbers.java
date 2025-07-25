import java.util.Arrays;



class RomanNumbers {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = 0;
        int nextIndex = 0;

        boolean doubleRoman = false;

        for(int i=0; i<s.length(); i++) {
            nextIndex++;
            if(doubleRoman){
                doubleRoman = false;
                continue;
            }
            if(s.charAt(i)=='C') {
                if(nextIndex<s.length()){
                    if(s.charAt(i+1)=='M') {
                        num+=900;
                        doubleRoman=true;
                    } else if(s.charAt(i+1)=='D'){
                        num+=400;
                        doubleRoman=true;
                    }else{
                        num+=100;
                    }
                }else{
                    num+=100;
                }
            }else if(s.charAt(i)=='X') {
                if(nextIndex<s.length()){
                    if(s.charAt(i+1)=='C') {
                        num+=90;
                        doubleRoman=true;
                    } else if(s.charAt(i+1)=='L'){
                        num+=40;
                        doubleRoman=true;
                    }else{
                        num+=10;
                    }
                }else{
                    num+=10;
                }
            }else if(s.charAt(i)=='I') {
                if(nextIndex<s.length()){
                    if(s.charAt(i+1)=='X') {
                        num+=9;
                        doubleRoman=true;
                    } else if(s.charAt(i+1)=='V'){
                        num+=4;
                        doubleRoman=true;
                    }else{
                        num+=1;
                    }
                }else{
                    num+=1;
                }
            }else if(s.charAt(i)=='M'){
                num+=1000;
            }else if(s.charAt(i)=='V'){
                num+=5;
            }else if(s.charAt(i)=='L'){
                num+=50;
            }else if(s.charAt(i)=='D'){
                num+=500;
            }
        }

        System.out.println(num);
    }
}

// Symbol       Value
// I            1
// V             5
// X            10
// L             50
// C            100
// D             500
// M             1000
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.