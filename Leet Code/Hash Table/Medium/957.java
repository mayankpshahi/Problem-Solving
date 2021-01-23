//957. Prison Cells After N Days

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> s  =  new HashSet<>();
        boolean isCycle  =  false;
        int days = 0;
        
        for(int i=0;i<N;i++){
            int [] states  = getNextStates(cells);
            String str  =  Arrays.toString(states);
            if(!s.contains(str)){
                s.add(str);
                days++;
            }else{
                isCycle =true;
                break;
            }
            cells = states;
        }
        if(isCycle){
            N%=days;
             for(int i=0;i<N;i++){
                 
                 cells = getNextStates(cells);
             }
        }
        
        return cells;
        
    }
    private int [] getNextStates(int[]cells){
        int [] states  = new int[cells.length];
        for(int i=0;i<cells.length;i++){
            if(i==0 || i==cells.length -1)
                states[i] = 0;
            else
                states[i]= cells[i-1]==cells[i+1]?1:0;
        }
        return states;
    }
}