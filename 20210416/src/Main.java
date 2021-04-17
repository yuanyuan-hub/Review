public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,1,1,5,1,5};
        int k = 3;
        System.out.println(foundOnceNumber(arr, k));
    }
    public static int foundOnceNumber(int[] arr, int k) {
        // write code here
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == k)
                count = 0;
            else
                return arr[i];
        }
        return 0;
    }
}
