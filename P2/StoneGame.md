Stone Game

Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.
Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  
This continues until there are no more piles left, at which point the person with the most stones wins.
Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.

Note:
    1.  2 <= piles.length <= 500
    2. piles.length is even.
    3. 1 <= piles[i] <= 500
    4. sum(piles) is odd


The only way Lee wins is if the lenght of the piles is uneven and if the sum of all the rocks is odd. Otherwise Alex will always win. The 2D array is defined in terms of itself depending on who's turn it is. The reason why it is stored in a 2D array is because it makes going back to the remaining piles easier. The next diogonal set of values shows the amount of points that Alex has in the lead shoud Lee pick the value. 
E.g. 
    Should Alex pick the leftmost pile of tocks and Lee picks the leftmost pile after that, Alex will be left with 2 points in the lead.
The reason why it's not done in a 1D array is because I would have to make 2 1D arrays, one for Alex and one for Lee to see where they stand. Instead I just use one 2D array to avoid that.