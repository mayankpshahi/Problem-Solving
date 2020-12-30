//860. Lemonade Change


class Solution {
    public boolean lemonadeChange(int[] bills) {
        int []billcount  = new int[2];
        boolean f = true;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)billcount[0]++;
            else if(bills[i]==10){
                billcount[1]++;
                if(billcount[0]>0)billcount[0]--;
                else{f=false;break;}
            }
            else if(bills[i]==20){
                if(billcount[1]>0 && billcount[0]>0){
                    billcount[1]--;
                    billcount[0]--;
                    
                }
                else if(billcount[0]>=3){
                    billcount[0]-=3;
                }
                else{
                    f=false;
                    break;
                }
            }
        }
        
        return f;
        
        
        
    }
}