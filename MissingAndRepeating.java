class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        TreeSet<Integer> set = new TreeSet<>();
        int missing=0;
        int repeat =-1;
        for(int data : arr){
            if(!set.add(data)){
                repeat = data;
                // break;
            }
        }
        // Arrays.sort(arr);
        for(int i=1;i<=set.last();i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        if(missing ==0){
            missing = set.last()+1;
        }
        return new int[]{repeat,missing};
    }
}