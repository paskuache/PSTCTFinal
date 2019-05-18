Perfect Square

Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...)which sum to n.
Example:
    Input: n = 12
    Output: 3
    Explanation: 12 = 4 + 4 + 4

You won't really see any pattern until you start using values bigger than 4 because when the input is 3 or below it hits our base cases. The array dp uses previous values inside of it to define itself, more specifically in the first 4 values of the array 0 through 3.