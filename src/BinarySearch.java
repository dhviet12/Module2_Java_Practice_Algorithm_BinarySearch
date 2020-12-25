public class BinarySearch {
    static int[] list = { 2,4,6,8,10,11,12,95,97};
    static int binarySearch(int []list, int key){
        int low = 0;
        int high = list.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if(key == list[mid]){
                return mid; // return index
            } else if (key< list[mid]){
                high = mid-1;
            } else
                low = mid+1;
        }
        return -1; // high<low, not found key
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 10));
        System.out.println(binarySearch(list,100));
    }
}
