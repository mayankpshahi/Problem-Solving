



//Search in Bitonic Array!

public class Solution {
public int solve(ArrayList<Integer> A, int B) {
    int max = findMax(A);
    int i = binarySearch(A.subList(0, max), B, true);
    if (i == -1) {
        List<Integer> a = A.subList(max + 1, A.size());

        int j = binarySearch(a, B, false);
        if(j==-1) return -1; 
        return max + 1 + j;
    }
    return i;
}

private int binarySearch(List<Integer> A, int B, boolean isSearchFirst) {
    int l = 0;
    int h = A.size() - 1;
    int result = -1;
    boolean descendingSearch = false;
    while (l <= h) {
        int mid = l + (h - l) / 2;

        if (A.get(h) < A.get(l)) descendingSearch = true;

        if (A.get(mid) == B) {
            result = mid;
            if (isSearchFirst) h = mid - 1;
            else l = mid + 1;
        } else if (B < A.get(mid)) {
            if (descendingSearch) l = mid + 1;
            else h = mid - 1;
        } else {
            if (descendingSearch) h = mid - 1;
            else l = mid + 1;
        }
    }
    return result;
} 
public int findMax(final List<Integer> a) {
    int l = 0, h = a.size() - 1;
    while (l <= h) {
        int m = l + (h - l) / 2;
        int n = (m + 1) % a.size();
        int p = (m + a.size() - 1) % a.size();
        int mid = a.get(m), next = a.get(n), prev = a.get(p);
        if (mid >= next && mid >= prev) return m;
        else if (mid < prev) h = m - 1;
        else l = m + 1;
    }
    return -1;


}
}
