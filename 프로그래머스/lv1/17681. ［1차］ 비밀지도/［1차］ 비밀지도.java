class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr11 = new String[n];
        String[] arr22 = new String[n];
        
        for(int i=0;i<answer.length;i++){
            answer[i]="";
        }


        for(int i=0;i<n;i++){
        arr11[i]= Integer.toBinaryString(arr1[i]);
            while(arr11[i].length()!=n){
            arr11[i]=0+arr11[i];
            }

        }

        for(int i=0;i<n;i++){
            arr22[i]= Integer.toBinaryString(arr2[i]);
            while(arr22[i].length()!=n){
                arr22[i]=0+arr22[i];
            }

        }

        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                if(arr11[i].charAt(j)=='1' || arr22[i].charAt(j)=='1'){
                    answer[i]+='#';
                }
                else{
                    answer[i]+=' ';
                }
            }
        }

        return answer;
    }
}