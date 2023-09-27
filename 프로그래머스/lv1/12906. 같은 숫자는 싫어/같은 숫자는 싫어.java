import java.util.*;

public class Solution {
 public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int a=-1;

        for(int i=0;i<arr.length;i++){
            if(a!=arr[i]){
                list.add(arr[i]);
                a=arr[i];
            }
        }

        int[] answer =new int[list.size()];
        

        for(int j=0;j<list.size();j++){
            answer[j]=list.get(j);
        }

        return answer;
    }
}