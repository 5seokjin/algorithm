class Solution {
    public String solution(String s) {
    String answer = "";
    char[] str = new char[s.length()];
    int cnt = 0;
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') {
            cnt = -1; 
        }

        if (cnt % 2 == 0) {
            str[i] = Character.toUpperCase(s.charAt(i));
        } else {
            str[i] = Character.toLowerCase(s.charAt(i));
        }

        cnt++;
    }

    for (int i = 0; i < str.length; i++) {
        answer += str[i];
    }

    return answer;
}
}