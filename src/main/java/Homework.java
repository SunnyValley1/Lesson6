public class Homework {
/*   Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result  */

   public static void main(String[] args) {

        int[]array = {2,3,5,6,7,8};

       System.out.println(arraySum(array));
    }
    public static  int arraySum( int []arr){

       int total =0;
      for (int i =0;i<arr.length;i++){
          total +=arr[i];
      }

         return total;
    }




}
