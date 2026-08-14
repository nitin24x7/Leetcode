import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0,j=0;
        for (int i = 0; i < g.length && j < s.length; i++) {
            while (j < s.length) {
                if (g[i] <= s[j]) {
                    count++;
                    j++;       // To tell cookie is now used
                    break;
                }
                j++;         // To tell cookie is too small
            }
        }
        return count;
    }
}