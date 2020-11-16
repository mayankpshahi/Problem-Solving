//1268. Search Suggestions System


//O(n^2)
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            String word = searchWord.substring(0,i+1);
            
            List<String> l = new ArrayList<>();
            for (String product : products) {
                if (product.length() < word.length())
                    continue;
                if (l.size() >= 3)
                    break;
                String sub = product.substring(0,i+1);
                if (word.equals(sub))
                    l.add(product);
            }

            ans.add(l);
        }
        return ans;
        
    }
}