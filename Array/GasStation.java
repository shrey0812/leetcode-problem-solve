/*134. Gas Station
Solved
Medium

There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
*/
import java.util.Arrays;
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum()<Arrays.stream(cost).sum())
        return -1;

        int total = 0;
        int result = 0;

        for(int i = 0; i<gas.length;i++){
            total += (gas[i]-cost[i]);

            if(total<0){
                total = 0;
                result = i + 1;
            }
        }
        return result;
    }
}
