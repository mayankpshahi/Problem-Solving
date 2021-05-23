
//1870. Minimum Speed to Arrive on Time

class Solution {
public:
    bool canReach(vector<int>&dist,long long int mid, double hr){
        double t=0;
        for(int i=0;i<dist.size();i++){
            double y = dist[i]/(double)mid;
            
            if(i!=dist.size() -1 && y - (int)y>0){
                t+=(int)y + 1;
            }
            else t+=y;
            
        }
        
        return t<=hr;
    }
    int minSpeedOnTime(vector<int>& dist, double hour) {
        long long int mins = INT_MAX,total =INT_MAX,s=1;
        
        
       while(s<=total){
          long long int mid = s + (total-s)/2;
           if(canReach(dist,mid,hour)){
               mins = min(mins,mid);
               total = mid -1;
           }
           else s =  mid+1;
       }
        
       if(mins == INT_MAX) mins = -1;
        
        return mins;
        
    }
};