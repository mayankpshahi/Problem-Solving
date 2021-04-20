
class Solution {
    public static void main(String args[]){
       int total_sum = 0
     for(int i=0;i<1000;i++){
        if (i%3 == 0 || i%5 == 0)
        total_sum = total_sum+i;
     }
     
System.out.println(total_sum);

    }
}

/* total_sum = 0
for i in range(1000):
    if (i%3 == 0 or i%5 == 0):
        total_sum = total_sum+i
print total_sum */