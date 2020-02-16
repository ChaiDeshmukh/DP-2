// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


Problem 1: Paint House

take min of other two houses an update the array

Time Complexity : O(n) where n -> no of houses
Space Complexity : O(1)  
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : no

=================================================================

Problem 2: Coin Change II

BruteForce:

either we choose a coin or not choose a coin
        int case1 = helper(coins, amount - coins[i], i); //if chosen
        
        int case2 = helper(coins, amount, i+1); // if not chosen
return no of ways in the end i.e. case1 + case2

Time Complexity : o(m2^n) 
Space Complexity : O(n)  
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : no



Dp Solution:


