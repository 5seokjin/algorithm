import java.util.Arrays;

class Solution {
   public String solution(String s) {
        String answer = "";
        String a="";
        String[] str = new String[s.length()];
        int b,c=0;

        for(int i=0;i<s.length();i++){
            str[i]=s.substring(i,i+1);
        }

        Arrays.sort(str);

        for(int i=0;i<s.length();i++){
            answer+=str[i];
        }

        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        return sb.toString();
    } 
// public String solution(String s) {
//         String answer = "";
//         String a="";
//         String[] str = new String[s.length()];
//         int b,c=0;

//         for(int i=0;i<s.length();i++){
//             str[i]=s.substring(i,i+1);
//         }

//         for(int i=s.length()-1;i>=0;i--){
//             for(int j=0;j<s.length()-1;j++){
//                 if(str[j].charAt(0)<str[j+1].charAt(0)){
//                     a=str[j];
//                     str[j]=str[j+1];
//                     str[j+1]=a;
//                 }
//             }
//         }

//         for(int i=0;i<s.length();i++){
//             answer+=str[i];
//         }
        
//         return answer;
//     }
}