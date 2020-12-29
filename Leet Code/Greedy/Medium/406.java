//406. Queue Reconstruction by Height


class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        List<int[]> res  =  new ArrayList();
        
        Arrays.sort(people, (a,b)->{return (a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);});
        
        for(int[]ele:people)res.add(ele[1],ele);
        
        
        return res.toArray(new int[people.length][2]);
    }
}