public class MaxFinder {
    public long findMax(long[] arr) {
        long max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public double findMax(double[] arr) {
        double max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public int findMax(int... args) {
        int max=0;
        for(int i:args) {
            if(i>max)
                max=i;
        }
        return max;
    }
}
