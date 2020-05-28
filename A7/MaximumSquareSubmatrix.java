/**
 * MaximumSquareSubmatrix
 */
public class MaximumSquareSubmatrix {
    public static int size(int[][] a) {
        int R = a.length;
        int C = a[0].length;
        int i,j;
        int[][] S = new int[R][C];
        for (i = 0; i < R; i++) 
            S[i][0] = a[i][0]; 
        for (j = 0; j < C; j++) 
            S[0][j] = a[0][j]; 
        for (i = 1; i < R; i++) 
        { 
            for (j = 1; j < C; j++) 
            { 
                if (a[i][j] == 1)  
                    S[i][j] = Math.min(S[i][j - 1], Math.min(S[i - 1][j], S[i - 1][j - 1])) + 1; 
                else
                    S[i][j] = 0; 
            }  
        }
        int max = S[0][0]; 
        for(i = 0; i < R; i++) 
        { 
            for(j = 0; j < C; j++) 
            { 
                if(max < S[i][j]) 
                { 
                    max = S[i][j]; 
                }      
            }                  
        }
        return max;
    }
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                arr[i][j] = StdIn.readInt();
            }
        }
        System.out.println(size(arr));
    }
}