



//Smallest Multiple With 0 and 1




public class Solution {
   public String multiple(int A) {

        if(A==1)
            return "1";
        
        boolean[] visitedMod = new boolean[A];
        Arrays.fill(visitedMod, false);
        Queue<Node> q = new LinkedList<>();
        
        Node one = new Node("1", 1);
        
        q.add(one);
        visitedMod[1] = true;
        
        while(!q.isEmpty()){
            
            Node currNode = q.poll();
            int currRemain = currNode.remainder;
            
                
            
            String currNum = currNode.number;
            
            //System.out.println("currNum = "+currNum + " , remainder = "+ currRemain);
            
            
            if(currRemain == 0)
                return currNum;
            
            
            if( !visitedMod[(currRemain*10)%A] ){
                Node nextNode = new Node(currNum+"0", (currRemain*10)%A );
                q.add(nextNode);
                visitedMod[(currRemain*10)%A] = true;
            }
            else{
                //System.out.println("was visited");
            }
                
            if( !visitedMod[( currRemain*10 + 1) % A] ){
                Node nextNode = new Node(currNum+"1", (currRemain*10 + 1)%A );
                q.add(nextNode);
                visitedMod[(currRemain*10 + 1)%A] = true;
            }
            else{
                //System.out.println("was visited");
            }
            
        }
        
        return "Not Found";
    }
}
class Node{
    String number;
    int remainder;
    Node(String s, int remain){
        number = s;
        remainder = remain;
    }
}
