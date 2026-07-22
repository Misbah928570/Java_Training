package greedyapp;

import java.util.Arrays;

public class greedyApp {
    public static void main(String[] args) {
        int[] arrival = {900,940,950,1100,1500,1800};
        int[] departure={910,1200,1120,1130,1900,2000};
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i =0 ,j=0;
        int platform=0, max_platform = 0;
        while(i<arrival.length && j<departure.length){
            if(arrival[i]<departure[j]){
                platform++;
                i++;
                max_platform = Math.max(max_platform,platform);

            }else{
                j++;
                platform--;
            }
        }
        System.out.println(max_platform);
    }
}
