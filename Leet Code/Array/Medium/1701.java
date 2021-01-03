//1701. Average Waiting Time



class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int finish=customers[0][0];
        double wt = 0;
        for(int i = 0;i<customers.length;i++){
    
            if(customers[i][0]>finish)
                finish = customers[i][0];
            
            finish+= customers[i][1];
                wt+= finish - customers[i][0];
            
            
    }
        
        return wt/customers.length;
    
        
    }
}