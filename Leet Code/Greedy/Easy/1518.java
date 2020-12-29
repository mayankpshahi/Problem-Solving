//1518. Water Bottles


class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numDrink = numBottles;
        while(numBottles>=numExchange){
            numDrink+=numBottles/numExchange;
            numBottles = numBottles/numExchange + numBottles%numExchange; }
        
        
    return numDrink;
}
    }
    