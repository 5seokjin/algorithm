class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int a=0;
        if(s.length()!=4 && s.length()!=6){
            return false;
        }

        for(int i=0;i<s.length();i++){
            a=s.charAt(i);
            System.out.println(a);
            if(a>57){
                return false;
            }
        }
        return answer;
    }
}