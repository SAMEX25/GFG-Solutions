class Solution {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        double sum = 0;
        int count = 0;
        
        for(int num : list){
            if(num >=0){
                sum +=num;
                count++;
        }
    }
    return count  ==0?0.0 : sum/count;
}
}