class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        
        
        answer[0]=-1;
        
        for(int i=1;i< answer.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){
                    answer[i]=i-j;
                    break;
                }else{
                    answer[i]=-1;
                }
            }
        }

        return answer;
    }
}