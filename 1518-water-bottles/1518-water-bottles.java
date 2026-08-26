class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maximum=numBottles;
        while(numBottles>=numExchange)
            {
         int  total=numBottles/numExchange;
         int remainder = numBottles % numExchange;
         maximum=maximum+total;
         numBottles = total+ remainder;
   }
       
          return maximum;

        
    }
}