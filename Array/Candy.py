#135. Candy
#Solved
#Hard
#There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

#You are giving candies to these children subjected to the following requirements:

#Each child must have at least one candy.
#Children with a higher rating get more candies than their neighbors.
#Return the minimum number of candies you need to have to distribute the candies to the children.
class Solution(object):
    def candy(self, ratings):
        arr = [1] * len(ratings)

        for i in range(1, len(ratings)):
            if ratings[i-1]<ratings[i]:
                arr[i] = arr[i-1] +1

        for i in range(len(ratings)-2,-1,-1):
            if ratings[i] > ratings[i+1]:
                arr[i] = max(arr[i],arr[i+1]+1)      
        return sum(arr)
