class Solution {
public String solution(int n) {
        String answer = "";
        char[] ch=new char[n];
        
        for(int i=0;i<n;i=i+2){
            ch[i]='수';
        }
        for(int i=1;i<n;i=i+2){
            ch[i]='박';
        }
        
        for(int i=0;i<ch.length;i++){
            answer+=ch[i];
        }
        
        return answer;
    }
}