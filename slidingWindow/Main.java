package slidingWindow;
//program to find maximum sum of subarray of length k
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int k = 2;
        int maxsum = 0;
        int winsum = 0;
        for (int i = 0; i < k; i++) {
            winsum = winsum + arr[i];
        }
        maxsum = winsum;
        for(int i=k;i<arr.length;i++){
            winsum = winsum + arr[i] - arr[i-k];
            if(winsum>maxsum)
                maxsum = winsum;
        }
        System.out.println(maxsum);
    }
}
