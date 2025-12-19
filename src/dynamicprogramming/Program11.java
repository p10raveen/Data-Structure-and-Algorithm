package dynamicprogramming;

public class Program11 {
    public static void main(String[] args) {
        String s1 = "ACADB";
        String s2 = "CBDA";

        int m = s1.length();
        int n = s2.length();

        LCS(s1,s2,m,n);
    }

    private static void LCS(String s1, String s2, int m, int n) {
        int[][] table = new int[m+1][n+1];

        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    table[i][j] = 0;
                else if(s1.charAt(i-1)== s2.charAt(j-1))
                    table[i][j] = table[i-1][j-1] + 1;
                else
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
            }
        }
        int index = table[m][n];
        int temp = index;

        int i=m, j=n;

        char[] lcs = new char[index+1];

        while (i>0 && j>0)
        {
            if(s1.charAt(i-1) == s2.charAt(j-1))
            {
                lcs[index-1] = s1.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if(table[i-1][j]>table[i][j-1])
            {
                i--;
            }
            else
            {
                j--;
            }
        }

        for(int k=0;k< lcs.length;k++)
        {
            System.out.print(lcs[k]);
        }
    }
}










