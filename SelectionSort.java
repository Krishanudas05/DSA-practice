class SelectionSort {
    public static void main(String[] args) {
        int array[] = {10,3,9,2,0,8,4};
        SelectionSort ss = new SelectionSort();
        ss.selectionsort(array);
        ss.printArray(array);
    }
    void selectionsort(int[] arr) {
        for(int j = 0;j < arr.length; j++) {
            int minimumindex = j;
            for(int i=j+1; i<arr.length;i++) {
                if(arr[i]<arr[minimumindex]) {
                    minimumindex = i;
                }
            }
            if(minimumindex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumindex];
                arr[minimumindex] = temp;
            }
        }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i<n-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}