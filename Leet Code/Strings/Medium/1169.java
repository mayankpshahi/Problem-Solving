//1169. Invalid Transactions

class Node {
    String name,city;
    int time,amount,index;
    public Node(String n, int t, int a, String c, int i) {
        name = n;time = t;amount = a;city = c;index = i; }}

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<Node> l = new ArrayList<>();
        Map<String, List<Node>> map = new HashMap<>();
        int index = 0;
        
        for (String trans : transactions) {
       String[] t = trans.split(",");
    Node node = new Node(t[0], Integer.valueOf(t[1]), Integer.valueOf(t[2]), t[3], index);
            
            l.add(node);
            map.putIfAbsent(t[0], new ArrayList<>());
            map.get(t[0]).add(node);
            index++;
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < l.size(); ++i) {
            Node cur = l.get(i);
            if (cur.amount > 1000) {
                res.add(transactions[i]);
                continue;
            }
            boolean found = false;
            for (Node node : map.get(cur.name)) {
                if (node.index != i && !node.city.equals(cur.city) && Math.abs(node.time - cur.time) <= 60) {
                    found = true;
                    break;
                }
            }
            if (found) {
                res.add(transactions[i]);
            }
        }
        return res;
        