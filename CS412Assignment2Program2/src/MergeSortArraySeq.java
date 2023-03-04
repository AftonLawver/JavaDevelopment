// Afton Lawver
// 851463587

import java.util.Random;

public class MergeSortArraySeq {
    private int[] myArray;
    private int numberOfElements;

    MergeSortArraySeq(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public void initializeArray() {
        Random rand = new Random();
        for (int i = 0; i < this.numberOfElements; i++) {
            int int_random = rand.nextInt(1000);
            this.myArray[i] = int_random;
        }
    }

    public void printArray() {
        for(int i = 0; i < myArray.length-1; i++) {
            System.out.println(myArray[i]);
        }
    }
    public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<left_size && r<right_size){

            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(int [] arr, int len){
        if (len < 2){return;}

        int mid = len / 2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[len-mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for(int i = 0;i<len;++i){
            if(i<mid){
                left_arr[i] = arr[i];
            }
            else{
                right_arr[k] = arr[i];
                k = k+1;
            }
        }
        // Divide the subarrays
        mergeSort(left_arr,mid);
        mergeSort(right_arr,len-mid);
        merge(left_arr,right_arr,arr,mid,len-mid);
    }

    public static void main( String args[] ) {
        MergeSortArraySeq myObj = new MergeSortArraySeq(10);
        myObj.initializeArray();
        myObj.printArray();
//        mergeSort(array,array.length);
//        for(int i =0; i< array.length;++i){
//            System.out.print(array[i]+ " ");
        }
    }
