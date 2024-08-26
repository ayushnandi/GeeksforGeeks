//{ Driver Code Starts
//Initial Template for javascript

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/* Function to print an array */
function printArray(arr, size) {
  let i;
  let s = "";
  for (i = 0; i < size; i++) {
    s += arr[i] + " ";
  }
  console.log(s);
}

function main() {
  let t = parseInt(readLine());
  let i = 0;
  for (; i < t; i++) {
    let pattern = readLine();
    let str = readLine();
    let obj = new Solution();
    let res = obj.wildCard(pattern,str);
    console.log(res);
  }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} pattern
 * @param {string} str
 * @return {number}
 */

class Solution {
    wildCard(pattern,str){
        //code here
        let compressedPattern = pattern.replace(/\*+/g, '*');
        let regexPattern = compressedPattern.replace(/\?/g, '.').replace(/\*/g, '.*');
        let regex = new RegExp('^' + regexPattern + '$');
        return regex.test(str) ? 1 : 0;
    }
}