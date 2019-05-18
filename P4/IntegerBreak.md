Integer Break

Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

Note: You may assume that n is not less than 2 and not larger than 58.

This method requires for the input values to be constantly broken down until it meets one of 2 base cases:
    1. If the value is 2
    2. If the values is 3
This is because they are the smallest integers that give a higher product when multiplied since multiplying by 1 doesn't increase the product. If they are not broken 2 or 3, then they enter one of 3 cases, each one adding another instance of multiplication by 2. The values are tracked through each iteration, each one either multiplying the base case by 4, by 2, or by 3 depending if it reached a base case or not.