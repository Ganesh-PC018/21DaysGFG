class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int k=0;
        int l=0;
        int posArr[] = new int[arr.size()];
        int negArr[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) >=0){
                posArr[k++]=arr.get(i);
            }else{
                negArr[l++] = arr.get(i);
            }
        }
        int n=arr.size();
        int i=0;
        int x=0;
        int y=0;
        arr.clear();
        while(i < n){
            if(x < k){
                arr.add(posArr[x++]);
            }
             if(y < l){
                arr.add(negArr[y++]);
            }
            i++;
        }
        
       
    }
}