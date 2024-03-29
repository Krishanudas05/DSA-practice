class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,3,9,2,0,8,4};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
    void bubbleSort(int arr[]) {
            int n = arr.length;
            for(int i=0; i<n-1;i++) {
                for(int j=0; j<n-i-1;j++) {
                    if(arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
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