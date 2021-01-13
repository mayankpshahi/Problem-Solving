//1702. Maximum Binary String After Change

class Solution {
    public String maximumBinaryString(String binary) {
        int zeros = 0, ind=0;
        boolean flag  = false;
        StringBuilder res  =  new StringBuilder();
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                if(flag == false){
                    ind = i;
                    flag = true;
                }
                zeros++;
            }
        }
        for(int i = 0; i < binary.length(); i++){           
            if(i >= ind && zeros > 0){                  
                if(zeros > 1)
                    res.append('1');
                else
                    res.append('0');
                zeros--;
            }
            else
                res.append('1');
            
        }
        return res.toString();
    }
}