
// One of the important question of DSA 
// It's a medium level difficulty question inDSA sheet


public class trapRainWater {

    public static int trapped(int hieght[]){
        int n=hieght.length;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0]=hieght[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],hieght[i]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = hieght[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], hieght[i]);
        }

        // loop
        // waterlevel = min(leftMax, rightMax)
        // trapped level = waterlevel - hieght
        int waterlevel = 0;
        int totalWater=0;
        for(int i=0;i<n;i++){
            int trapped=0;
            waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapped = waterlevel-hieght[i];
            totalWater+=trapped;
        }

        return totalWater;

    }


    public static void main(String argv[]){
        int hieght[]={4,2,0,6,3,2,5,3,5,6,2,7,4,2,1,66,32,13,54,42,34,453,34,55,665,23,452,3534,342,45,352,23,267,878,57874,54};
        System.out.println(trapped(hieght)+" cubic cm");

    }
}
