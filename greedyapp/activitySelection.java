package greedyapp;

import java.util.ArrayList;
import java.util.Arrays;

public class activitySelection {
    static void activitySelection(int start[],int end[]){
        ArrayList<activity> list = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            list.add(new activity(start[i],end[i]));
        }
        list.sort((a,b) -> a.endTime - b.endTime);
        System.out.println(list.get(0).startTime+" "+list.get(0).endTime);
        int cnt=1;
        int lastend = list.get(0).endTime;
        for(int i=1;i< list.size();i++){
            if(list.get(i).startTime >= lastend){
                System.out.println(list.get(i).startTime+" "+list.get(i).endTime);
                cnt++;
                lastend=list.get(i).endTime;
            }
        }
        System.out.println(cnt);

    }
    public static void main(String[] args) {
        int[] start = {0,3,1,5,5,8};
        int[] end={6,4,2,9,7,9};
        activitySelection(start,end);

    }
}
class activity{
    int startTime;
    int endTime;
    activity(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
