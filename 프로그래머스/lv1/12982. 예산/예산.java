import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        Arrays.sort(d);

        while(sum<=budget && answer<d.length){
            sum+=d[answer];
            answer++;
        }
        if(sum>budget){
            answer-=1;
        }

        return answer;
    }
}