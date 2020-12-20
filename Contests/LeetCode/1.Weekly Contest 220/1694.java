//1694. Reformat Phone Number


class Solution {
    public String reformatNumber(String number) {
        number =  number.replaceAll("-","").replaceAll(" ","");
        char []num = number.toCharArray();
       StringBuilder str = new StringBuilder();
        int n = number.length()%3;
        
        if(number.length()<=3) return number;
    
        if(n==0){
            for(int i = 0;i<number.length();i++){
                String nn =  String.valueOf(num[i]);
                if((i+1)%3==0 && i!=number.length()-1){str.append(nn);
                                                     str.append("-");
                                    
                             }
                else str.append(nn); 
                
                }
        }
        
        
        
        if(n==1){
            for(int i = 0;i<number.length() - 4;i++){
                String nn =  String.valueOf(num[i]);
                if((i+1)%3==0){str.append(nn);
                            str.append("-");
                             }
                else str.append(nn); 
                
                }
             String n4 =  String.valueOf(num[number.length()-4]);
             String n3 =  String.valueOf(num[number.length()-3]);
             String n2 =  String.valueOf(num[number.length()-2]);
             String n1 =  String.valueOf(num[number.length()-1]);
            
            str.append(n4);
            str.append(n3);
            str.append("-");
            str.append(n2);
            str.append(n1);
            
             
              
            }
         if(n==2){
            for(int i = 0;i<number.length() - 2;i++){
                String nn =  String.valueOf(num[i]);
                if((i+1)%3==0){str.append(nn);
                            str.append("-");}
                else str.append(nn); 
                
                }
            
             String n2 =  String.valueOf(num[number.length()-2]);
             String n1 =  String.valueOf(num[number.length()-1]);
            
            str.append(n2);
            str.append(n1);
             
             
              
            }
          
        
            
    
        
        return str.toString();
    }
}