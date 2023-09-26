import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        int remo = arr.length;
        int dd = 0;
        int c = Arrays.stream(arr).min().getAsInt();
        int cnt=0;

        if (remo < 2) {
            int[] answer = {-1};
            return answer;
        }  
        
            int[] answer = new int[remo-1];

            for (int i = 0; i < remo; i++) {

                if (arr[i] != c) {
                   answer[cnt] += arr[i];
                    cnt++;
                }
            }
         

        return answer;
    }
}