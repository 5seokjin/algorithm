class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int a=0;
        char ch='a';
        for(int i=0;i<s.length();i++){

            a=s.charAt(i);
            if(a>=65 && a<=90){
                a+=n;
                if(a>90)
                    a-=26;

            }else if(a>=97 && a<=122){
                a+=n;
                if(a>122)
                    a-=26;
            }
            ch=(char)a;
            answer += ch;
        }

        return answer;
    }
}