class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count=0;
        int max=0;
        for(int data : height){
            if(data > max){
                count++;
                max =data;
            }
        }
        
        return count;
    }
}