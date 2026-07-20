package slidingWindow;

public class tar {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;
        int l = 0;
        int winsum=0;
        int e =0;
        for(int i=0;i<arr.length;i++){
            winsum += arr[i];
            while(winsum > target){
                winsum -= arr[l];
                l += 1;

            }
            if(winsum == target){
                e = i;
            }
        }
        System.out.println(l);
        System.out.println(e);
    }
}
