Minimum ASCII Delete Sum for Two Strings

Given two string s1, s2, find the lowest ASCII sum of deleted character to make two strings equal.

Note:
 1. 0 < s1.length, s2.length <= 1000
 2. All elements of each string will have an ASCII value in [97, 122].

The elements of both strings will be stored in a 2D array, this makes it easier to compare two words since the value of each individual character can be compared to the one that is mirroing it. 
E.g.
    if s1.charAt(i) == s2.charAt(j)
                    dp[i][j] = dp[i+1][j+1];
    otherwise
        dp[i][j] = Math.min(dp[i+1][j] + s1.codePointAt(i), dp[i][j+1] + s2.codePointAt(j));
If the characters are not the same then they are stored into the array as the sum of each other. Otherwise they are stored as the value that they're worth. Those values are stored in a new position in the array so that they can be used in the next iteration of the algorithm. The best way to get a patter is by using a string of at least 2 characters, that way the table is big enough for the coder to understand how the values are being stored.