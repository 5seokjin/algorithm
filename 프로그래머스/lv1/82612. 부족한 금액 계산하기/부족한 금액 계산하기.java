class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long hap=0;
        
        for(int i=1;i<=count;i++)
        hap+=price*i;
            
        if(money-hap>=0){
            return 0;
        }else{
            return hap-money;
        }

    }
}