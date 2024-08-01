//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        int tprow=0;
        int brrow=matrix.length-1;
        int lftc=0;
        int rgtc=matrix[0].length-1;
        int total=0;
        while( matrix.length * matrix[0].length > total)
        {
            // print top row
            for(int i=lftc;i<=rgtc &&( matrix.length * matrix[0].length > total) ;i++)
            {
                ans.add(matrix[tprow][i]);
                total++;
            }
            tprow++;
            
            // print right column

              for(int i=tprow;i<=brrow&&( matrix.length * matrix[0].length > total);i++)
              {
                  ans.add( matrix[i][rgtc]);
                  total++;
              }
              rgtc--;
              
              // print bottom row
              
              for( int i=rgtc;i>=lftc&&( matrix.length * matrix[0].length > total);i--)
              {
                  ans.add(matrix[brrow][i]);
                  total++;
              }
            brrow--;
             
             // print left column
             
             for(int i=brrow;i>=tprow&&( matrix.length * matrix[0].length > total);i--)
             {
                 ans.add(matrix[i][lftc]);
                 total++;
             }
             lftc++;
            
            
            
            
        }
        
        return ans;
    }
}
