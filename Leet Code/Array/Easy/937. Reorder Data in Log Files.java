


//937. Reorder Data in Log Files



class Solution {
    public String[] reorderLogFiles(String[] logs) {
         List<String> letter = new ArrayList();
        List<Integer> digit = new ArrayList();
        int ind=0;
        for(String s:logs){
            if(!Character.isDigit(s.charAt(s.length()-1))){
                letter.add(s);
            }
            else{
                digit.add(ind);
            }
            ind++;
        }
        Collections.sort(letter,(s1,s2)->{
            int l1 = s1.indexOf(' ');
            int l2 = s2.indexOf(' ');
            String i1 = s1.substring(0,l1);
            String i2 = s2.substring(0,l2);
            String c1 = s1.substring(l1+1);
            String c2 = s2.substring(l2+1);
            if(c1.equals(c2)){
                return i1.compareTo(i2);
            }
            return c1.compareTo(c2);
        });
        String[] res = new String[ind];
        ind=0;
        for(String s:letter){
            res[ind++]=s;
        }
        for(int i:digit){
            res[ind++]=logs[i];
        }
        return res;
        
    }
}