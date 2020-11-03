//1108. Defanging an IP Addres

//O(n)

class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        for(int i = 0;i<address.length();i++){
            if(address.charAt(i)=='.') s = s + "[.]" ;
            else s = s + address.charAt(i);
        }

        return s;

    }
}

//0ms

class Solution {
    public String defangIPaddr(String address) {
       return address.replace(".", "[.]");
    }
}
