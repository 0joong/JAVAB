package assignment0830;

public class assignment {

    int getSum(int[] arr) {

        int sum = 0;
        for (int i : arr)
            sum += i;

        return sum;
    }

    int getMax(int[] arr){

        int max = 0;
        for (int i : arr){
            if (i > max)
                max = i;
        }

        return max;
    }

    int getCount(int[] arr, int num) {

        int count = 0;
        for (int i : arr){
            if (i > num)
                count++;
        }

        return count;
    }

    void swapArray(int[] arr){

        int temp = 0;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i];
            arr[arr.length-i] = temp;
        }
    }
}






