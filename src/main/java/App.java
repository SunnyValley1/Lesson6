public class App {

        public static void main(String[] args) {
            int[] array1 = {1,56,1,23,23,177,-8,95};
            int[]array2 = {5,5,5,5,5};
            int[]array3 = {2,7};
            int[]array4 = {76};

            System.out.println(arrayMax(array1));
            System.out.println(arrayMax(array2));
            System.out.println(arrayMax(array3));
            System.out.println(arrayMax(array4));
        }
        public static int arrayMax(int[]arr){ // arrayMax(int[])
            int max = arr[0];
            for (int v : arr){
                if(max<v){
                    max=v;
                }
            }
            return max;
        }
    }



