Given a square array of integers A, we want the minimum sum of a falling path through A.

A falling path starts at any element in the first row and chooses one element from each 
row.
The next row's choice must be in a column that is different form the previous row's 
column by at most one.
Note:
	1. 1 <= A.length == A[0].length <= 100
	2. -100 <= A[i][j] <= 100


	The problem requires for the algorithm to take various paths and choose the one with the 
lowest cost. You can only move AT MOST one column that is different from the current choice and 
one row down. 
E.g. 
If you're at position (0,0), the only options available would be (1,0) or (1,1). If you're at position
(1,1), your options would be (2,0), (2,1), or (2,2). You have to compare all the possible moves and 
pick the one that gives you the least amount in cost. The path has to be done in falling order, which
means that it does have to start at the first row and go down from there. The algorithm requires for 
a variable to alterate the array that is used as input by using the second to last row of the array first, 
e.g. the value at A[A.length-1][0], select the next variable(B) that meets the conditions mentioned in 
the example above and add that value to B. The algorithm works best if you start with the middle row instead, 
otherwise, you would have to be create a hash set to keep all possible combinations stored. Once the second to 
last row is altered, you go with the next row up, this way it doesn't branch out. In the end, no data structure
is created to store the solution, instead you're just reusing the same array that was given and refilling
it with the various minimum solutions that the array has depending based on which column the algorithm starts.
Once the array has gone through all it's possible iterations, the top row will contain all the possible solutions,
which means that a for loop will be needed to get the minimum path sum.
