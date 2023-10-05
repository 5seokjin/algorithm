import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt=0;

        for(int i=0;i<answer.length;i++){
            int[] ary= new int[commands[i][1]-commands[i][0]+1];
            cnt=0;
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++){
                ary[cnt]=array[j];
                cnt++;
            }
            Arrays.sort(ary);

            answer[i]=ary[commands[i][2]-1];
        }

        return answer;
    }
}