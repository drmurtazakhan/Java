public class Over9000Rocks {
    public int countPossibilities( int[] lowerBound, int[] upperBound) {
        int n = lowerBound.length ;
        int maxRes = 0;
        for (int i = 0; i < n; ++i){
            maxRes += upperBound[i];
        }
        int [] bound = new int[maxRes + 2];
        for (int m = 1; m < (1 << n); ++m) {
            int low = 0, up = 0;
            for (int i = 0; i < n; ++i) {
                if ((m & (1 << i)) > 0) {
                    low += lowerBound[i];
                    up += upperBound[i];
                }
            }
            low = Math. max(low, 9001);
            if (up < low) {
                continue ;
            }
            bound[low]++;
            bound[up + 1]--;
        }
        int res = 0;
        int v = 0;
        for (int x = 9001; x <= maxRes; ++x){
            if ((v += bound[x]) > 0){
                res++;
            }
        }
        return res;
    }
}