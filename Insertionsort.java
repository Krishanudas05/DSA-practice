public class Insertionsort {
    public static void main(String[] args) {
        Insertionsort is = new Insertionsort();
        int array[] = {12, 3, 8, 7, 0, -1};
        is.insertionsort(array);
        is.printArray(array);
    }
    void insertionsort(int arr[]) {
        for(int i=1; i< arr.length; i++) {
            int temp = arr[i], j=i;
            while(j>0 && temp>arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}