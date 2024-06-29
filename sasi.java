class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        int a=0,b=0;
        Arrays.sort(arr);
        int low=0,high=n-1,mid=0;
        while(low<=high)
        {
            mid = low + (high - low) / 2;
            if(arr[mid]==x)
            {
                a=mid;
                b=mid+1;
            }
            else if (arr[mid] < x) 
            {
                a=mid;
                b=mid+1;  
                low = mid + 1;  
            }
            else
            {
                high=mid-1;
            }
        }
        return new Pair(a,b);
    }
}
