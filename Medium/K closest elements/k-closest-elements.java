//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int ans[]=new int[k];
        if(x>arr[arr.length-1]){
            for(int i=0;i<k;i++){
               ans[k-i-1]=arr[n-k+i]; 
            }
            return ans;
        }
        
        
        int i=0;
        int j=n-1;
        int index=0;
        int mid=0;
        while(i<=j){
            mid=(j-i)/2+i;
            if(arr[mid]==x){
                i=mid;
                break;
            }
            else if(arr[mid]<x){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        int m=0;
        if(i>j){
           
            m =i;
        }
        else{
           
            m=i+1;
        }
        
         j=i-1;
         
       
        i=0;
        while(i<k && j>=0 && m<n){
            
            if(Math.abs(x-arr[j])<Math.abs(x-arr[m])){
                 ans[i]=arr[j];
                 j--;
             }
             else{
                
                 ans[i]=arr[m];
                 m++;
                
             }
             i++;
             
        }
        while(i<k && j<0){
            ans[i]=arr[m];
            i++;
            m++;
        }
        while(i<k && m>=n){
            ans[i]=arr[j];
            i++;
            j--;
        }
        return ans;
    }
}
