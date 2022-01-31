public class App1 {


        public static void main(String[] args) {
            int[]numbers = {1,1,44,3,23,43,54,2,24,56,77,79,74,22,12,11};
            int[]result = getEvens(numbers);
            for (int v: result){
                System.out.println(v);
            }
        }
        public static int[] getEvens(int[]arr){  // getEvens(int[])
            int evenCount = 0;
            for (int v: arr){
                if (v%2==0){
                    evenCount++;
                }
            }
            int[]evens = new int[evenCount];
            int index = 0;
            for (int v: arr){
                if (v%2==0){
                    evens[index++]=v;
                }
            }
            return evens;
        }
    }

