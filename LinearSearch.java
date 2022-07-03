
public class LinearSearch {
    public static void main(String[] args) {
          int array[] = {1,4,3,9,0,32,18};
          LinearSearch searching = new LinearSearch();
          searching.Linearsearch(array, 4);
    }
    public static int Linearsearch(int arr[], int value) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == value) {
                System.out.println("The index of the number is: "+i);
                return i;
            }
        }
        System.out.println("The index doesn't exist.");
        return -1;
    }
}
    