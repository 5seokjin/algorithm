class Solution {
   public int solution(int[][] sizes) {
        int answer = 0;
        int a=0;
       

        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                a=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=a;
            }

        }

        int maxx=sizes[0][0];
        int maxy=sizes[0][1];

        for(int i=0;i< sizes.length-1;i++){
            if(maxx<sizes[i+1][0]){
                maxx=sizes[i+1][0];
            }
            
        }

        for(int i=0;i< sizes.length-1;i++){
            if(maxy<sizes[i+1][1]){
                maxy=sizes[i+1][1];
            }
        }

        answer=maxx*maxy;

        return answer;
    }


}
