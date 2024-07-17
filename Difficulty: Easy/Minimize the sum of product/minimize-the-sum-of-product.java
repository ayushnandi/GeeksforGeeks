//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
        Collections.sort(arr1);
        Collections.sort(arr2,Collections.reverseOrder());
        while(arr1.get(0)==0){
            arr1.remove(0);
        }
        while(arr2.get(0)==0){
            arr2.remove(0);
        }
        // for(int i : arr1){
        //     System.out.print(i+" ");
        // }
        // System.out.printl();
        // for(int i : arr2){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        long product = 0 ;
        for(int i = 0 ; i < arr1.size() && i < arr2.size() ; i++ ){
            // System.out.print(arr1.get(i)*arr2.get(i)+" ");
            product += arr1.get(i)*arr2.get(i);
        }
        // System.out.println();
        return product;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr1 = new ArrayList<>();
            List<Integer> arr2 = new ArrayList<>();

            String input1 = sc.nextLine();
            StringTokenizer st1 = new StringTokenizer(input1);
            while (st1.hasMoreTokens()) {
                arr1.add(Integer.parseInt(st1.nextToken()));
            }

            String input2 = sc.nextLine();
            StringTokenizer st2 = new StringTokenizer(input2);
            while (st2.hasMoreTokens()) {
                arr2.add(Integer.parseInt(st2.nextToken()));
            }

            Solution ob = new Solution();
            long ans = ob.minValue(arr1, arr2);
            System.out.println(ans);
        }
        sc.close();
    }
}

// } Driver Code Ends