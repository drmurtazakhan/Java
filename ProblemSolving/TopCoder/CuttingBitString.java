import java.util.Arrays;
 
public class CuttingBitString {
 
    public static int getmin(String S) {
        char[] c = S.toCharArray();
        long[] dp = new long[c.length];
        Arrays.fill(dp, -1);
        long min = go(0, dp, c);
        if (min == Integer.MAX_VALUE)
            min = -1;
        return (int) min;
    }
 
    private static long go(int i, long[] dp, char[] c) {
        if (i == c.length)
            return 0;
        else if (dp[i] != -1) {
            return dp[i];
        } else {
            long min = Integer.MAX_VALUE;
            for (int j = i; j < c.length; j++)
                if (c[i] != '0' && c[j] != '0'&&check(c, i, j)  ) {
                    if (j == c.length - 1)
                        min = Math.min(min, 1 + go(j + 1, dp, c));
                    else if (j < c.length - 1 && c[j + 1] != '0' && c[i] != '0')
                        min = Math.min(min, 1 + go(j + 1, dp, c));
                }
            return dp[i] = min;
 
        }
    }
 
    private static boolean check(char[] c, int i, int j) {
        long x = 0;
        int len = j - i;
        int ii = 0;
        for (int k = i; k <= j; k++)
            x += (Math.pow(2, len - (ii++)) * (c[k] - '0'));
        while (x != 1) {
            if (x % 5 != 0)
                return false;
            x /= 5;
        }
        return true;
    }
 
    public static void main(String[] args) {
        //System.out.println(getmin("100000001"));
        System.out.println(getmin("101101101"));
        
        
 
    }
}