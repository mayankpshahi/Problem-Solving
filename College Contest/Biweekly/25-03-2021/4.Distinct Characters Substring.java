

//Distinct Characters Substring

/*
You are given a string A of lowercase English alphabets. Let Xi be the number of substrings of A consisting of at least 'i' distinct characters.


TASK: Determine the value of Xi mod 1e9 + 7 for all i ,where i can take the values in the range [1,26] (both inclusive).
Input Format

First integer is T denoting number of Testcases.
Now next T lines contains two lines :
1st line contains N denoting length of string.
2nd line contains character array of N length denoting string.

Constraints

1 <= T <= 10
1 <= |A| <= 5*1e5

Output Format

Print the array of 26 integers in which the ith integer representing the value of X i mod 1e9 + 7 in the same order.

Sample Input 0

2
4 
a a b c
3
a b c
Sample Output 0

10 5 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
6 3 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
Explanation 0

Explanation for TC-1:

 
The value of Xi can be calculated as follows:
For i=1 , every substring of S have at least 1 distinct characters hence Xi= 4*5/2= 10
For i=2 substring [aab,aabc,bc,abc,ab]
for i=3 substrings are [aabc,abc]
for i<=4 no substrings can have more than 3 distinct characters, hence Xi=0. 
Explanation for TC-2:

 
The value of Xi can be calculated as follows:
For i=1 , every substring of S have at least 1 distinct characters hence Xi= 6
For i=2 substring [ab,abc,bc], Xi=3
for i=3 substrings are [abc], Xi=1
for i <= 4 no substrings can have more than 3 distinct characters, hence Xi=0. 

*/

//This Solution gave Tle

import java.io.*;
import java.util.*;

public class Solution {
     static int countDistinct(char[] arr, int k)
    {
        
       int output = 0;
  
       int n = arr.length;
       int count[] = new int[26];

        for (int i = 0; i < n; i++)
        {
            int distinct = 0;
            
            Arrays.fill(count, 0);
            for (int j=i; j<n; j++)
            {
                if (count[arr[j] - 'a'] == 0)
                    distinct++;
  
                count[arr[j] - 'a']++;
  
                
                if (distinct >= k)
                    output++;
            }
        }
  
        return output%1000000007;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            
           char arr[] = new char[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.next().charAt(0);
            }
            
            //char arr []= s.toCharArray(); 
            
            for(int i=1;i<27;i++){
                if(i!=26){
                System.out.print(countDistinct(arr,i));
                System.out.print(" ");
                }
                else{
                    System.out.print(countDistinct(arr,i));
                }
                
            }
           System.out.println();
        }
    }
}




//Editorial Solution cpp


#include<bits/stdc++.h>
#define endl '\n'
#define mod 1000000007
using namespace std;
#define MAX 100005
typedef long long int ll;

vector<ll> solve(int n, string s) 
{
    s="*"+s;
    vector<ll> v;
    for(int i=26;i>=1;i--){
        map<char,ll> mp;
        int start=1;
        int end=0;
        ll cnt=0;
        while(start<=n) {
            while(end+1<=n) {
                if(mp.size()>=i) break;
                mp[s[end+1]]++;
                end++;
            }
            if(mp.size()<i) break;
            cnt+=ll(n-end+1);
            char ch=s[start];
            if(mp[ch]==1) mp.erase(ch);
            else mp[ch]--;
            start++;
        }
        v.push_back(cnt);
    }
    reverse(v.begin(),v.end());
    return v;
}
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    #ifndef ONLINE_JUDGE
        freopen("input3.txt", "r", stdin);
        freopen("output3.txt", "w", stdout);
    #endif
    int t; cin>>t;
    while(t--)
    {
        int n; cin>>n;
        string s;
        for(int i=0;i<n;i++){
             char ch; cin>>ch;
             s.push_back(ch);
        }
         vector<ll> ans=solve(n,s);
        for(auto i: ans) cout<<i<<" ";
        cout<<endl;
    }
   
}


/*
Firslty Check How we can calculate number of substrings with distinct characters i .
To calculate this fix any index and try to calculate number of substrings starting with this jth letter.
1st Approach to find right index can be binary search as we can apply binary search to find minimum right index such that distinct characters between j to that right index is 'i'.
To find that distinct characters in l to r we can use segment tree or dynammic progrmming , but those solutions will be overkill for this problem.
So most efficient solution for this problem is to use two pointer technique and using STL map to maintain the frequency of each character.
we can maintain two pointer such that in between those two pointer always 'i' distinct characters are there and thus from this we can calculate all substring for any particular 'i''.
*/