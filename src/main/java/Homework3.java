public class Homework3 {
    public static void main(String[] args) {
        int[] array1 = {1,56,1,23,23,177,-8,95};
        int[]array2 = {5,5,5,5,5};
        int[]array3 = {2,7};
        int[]array4 = {76};

        System.out.println(arrayMin(array1));
        System.out.println(arrayMin(array2));
        System.out.println(arrayMin(array3));
        System.out.println(arrayMin(array4));
    }
    public static int arrayMin(int[]arr){ // arrayMax(int[])
        int min = arr[0];
        for (int v : arr){
            if(min>v){
                min=v;
            }
        }
        return min;
    }
}



