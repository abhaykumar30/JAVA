class Solution {
    public int binarysearch(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        int result = -1;
        
        while(s <= e){
            int mid =  s + (e - s) / 2;
            
            if(k == arr[mid]){
                result = mid;
                e = mid - 1;
            }
            else if(k > arr[mid]){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        
        return result;
    }
}
