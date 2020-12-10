# DEV-TEST-TAKS-2

Input have to be a list of integers. 

Application finds all the pairs (in this integer list) that sum up to 13.
 
 Each pair in the output applies this conditions:
  1) First number not greater than the second 
  2) Lines should be sorted in an ascending order.

To optimize the speed of algorithm: 
First step: input is sorted by quickSort algorithm.
Second step: algorithm takes min number (x) and start searching from left to right.

if sum of numbers is greater then 13 it stops searching for "min number x".

Third step: algorithm choose next min number and go back to second step but left border of searching is set to index of min number y.
