import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{

        //I prefer to use buffered reader because it is faster than scanner.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for problem 1
//        String [] line = br.readLine().split("\\s");
//        int W = Integer.parseInt(line[0]), n = Integer.parseInt(line[1]);
//        int [] bars = new int[n];
//        String [] barAsString = br.readLine().split("\\s");
//
//        for(int i =0; i< n; i++){
//            bars[i]= Integer.parseInt(barAsString[i]);
//        }
//
//        System.out.println(problemOne(W, bars));


        //for problem 2
//        int n = Integer.parseInt(br.readLine());
//        int [] numbers = new int[n];
//        String[]line = br.readLine().split("\\s");
//
//        for(int i = 0; i < n; i++){
//            numbers[i]=Integer.parseInt(line[i]);
//        }
//
//        int sum = Arrays.stream(numbers).sum();
//
//        boolean result = problemTwo(numbers);
//        if(!result){
//            System.out.println(0);
//        }
//        else {
//            System.out.println(1);
//        }


        //for problem 3
//        String [] line = br.readLine().split("");
//        int [] numbers = new int[line.length/2+1];
//        String[] operations = new String[line.length/2];
//
//        int counter = 0;
//        for(int i = 0; i < line.length; i+=2){
//            numbers[counter] = Integer.parseInt(line[i]);
//            counter++;
//        }
//
//        counter = 0;
//        for(int i = 1; i < line.length; i+=2){
//            operations[counter]= line[i];
//            counter++;
//        }
//
//        System.out.println(problemThree(numbers, operations));
    }


    /**
     * This problem requires a straightforward implementation of the discrete backpack (w/out repetitions) pseudocode
     * that was taught in the lessons.
     * @param W max possible weight of the backpack
     * @param bars all of the gold bars available
     * @return total weight of bars we can carry
     */
//    private static int problemOne(int W, int [] bars){
//        int [][] value = new int[bars.length+1][W+1]; //declaring matrix
//
//        //iterating through matrix
//        for(int i = 1; i < bars.length+1; i++){
//            for(int j = 1; j < W+1; j++){
//
//                value[i][j]= value[i-1][j]; //consider the first case where we may not include current gold bar.
//
//                int val = 0;
//
//                //if curr bar can fit in bag, then total val is val(W-wi)(i-1) + Wi (as discussed in pseudocode).
//                if(bars[i-1] <= j){
//                    val= value[i-1][j-bars[i-1]]+bars[i-1];
//                }
//
//                //if val is greater than stored, then value(i)(j) <-- val.
//                if(val > value[i][j]){
//                    value[i][j]=val;
//                }
//            }
//        }
//        return value[bars.length][W]; //returns max gold bar weight possible.
//    }//end problem 1


    /**
     *  For this problem, I could not come up with the solution entirely by myself. The problem is loosely related to
     *  the knapsack problem. The idea is that you are essentially looking at all possible partitions of the sequence
     *  such that each subset must equal sum/3. I understood the logic/algorithm needed, but I was not able to
     *  code the recursive relation properly. I didn't know how to implement a recursive solution.
     *  Therefore, I resorted to somebody else's elegant solution for which the link is given below.
     *  Code Source:https://www.techiedelight.com/3-partition-problem/
     * @param numbers array containing the sequence of integers
     * @return boolean statement confirming whether the sequence can be divided into 3 sums such that they are equal.
     */
//    private static boolean problemTwo(int[]numbers){
//
//        //if length of sequence is less than 3,then it is not possible since third set would be empty.
//        if(numbers.length <= 3){
//            if(numbers.length<3){
//                return false;
//            }
//
//            //if there are only 3 numbers but they are not equal, then an equivalent partition is not possible.
//            else return numbers[0] == numbers[1] && numbers[1] == numbers[2];
//        }
//
//        int sum = Arrays.stream(numbers).sum(); //calculating sum of entire sequence.
//
//        //returns true if sum of sequence is divisible by 3 and all three subsets have equal sums.
//        return (sum%3 == 0) && subsetSum(numbers, numbers.length-1, sum/3, sum/3, sum/3);
//    }


    /**
     * Helper method for problem 2. This method will determine whether there exists three subsets with sums equal to
     * sum/3 (which is the only possible val for a solution). Three sums start at the val of sum/3 and get reduced until
     * they reach 0. if all 3 are zero, that indicates there exists a possible partition.
     * @param numbers sequence of integers
     * @param n index of item being considered for the subsets
     * @param sumA sum of subset A
     * @param sumB sum of subset B
     * @param sumC sum of subset C
     * @return true if solution exists or false otherwise
     */
//    private static boolean subsetSum(int[]numbers, int n, int sumA, int sumB, int sumC){
//
//        //if all three subset sums are 0, then we have a solution.
//        if(sumA == 0 && sumB == 0 && sumC == 0){
//            return true;
//        }
//
//        //if we have run out of numbers in sub-sequence (since we go from n-1 --> 0) then, return false;
//        if(n < 0){
//            return false;
//        }
//
//        //First case: last item added to subset a as long as sumA remains greater than 0 (which actually means <= sum/3)
//        boolean A = false;
//
//        //if last item can be added, recur with the remaining sequence of numbers (ie. n-1) and remove item val from sumA.
//        if(sumA - numbers[n] >= 0){
//            A= subsetSum(numbers,n-1, sumA-numbers[n], sumB, sumC);
//        }
//
//        //Second case: last item may be added to subset b (only if adding to A did not result in a solution)
//        boolean B =false;
//        if(!A && sumB - numbers[n] >= 0){
//            B = subsetSum(numbers, n-1, sumA, sumB -numbers[n], sumC);
//        }
//
//        //Third case:  last item is added to subset c (only if adding to subsets A and B do not result in a solution)
//        boolean C = false;
//        if((!A && !B) && sumC-numbers[n] >= 0){
//            C=subsetSum(numbers,n-1, sumA, sumB, sumC-numbers[n]);
//        }
//
//        return A || B || C; //return true if solution exists, by checking all three cases.
//    }


    /**
     * For this problem, we simply implement the pseudocode provided in the lessons.
     * @param numbers array containing the numbers
     * @param operations String array containing the operations
     * @return max possible value obtainable from the arithmetic expression
     */
//    private static long problemThree(int [] numbers, String [] operations){
//        int n = numbers.length; //storing total # of numbers.
//
//        //arrays to store min and max for all (i,j).
//        long [][] min = new long[n][n], max = new long[n][n];
//
//        //storing digit value at all (i,i) locations since that represents a digit in the matrix.
//        for(int i = 0; i < n; i++){
//            min[i][i]=numbers[i];
//            max[i][i]=numbers[i];
//        }
//
//        //iterating through all subsequences in order of increasing (j-i) which is equal to s.
//        for(int s = 1; s < n; s++){
//            for(int i = 0; i < n-s; i++){
//                int j = i+s;
//
//                //finding the minimum and max for sub-sequence and storing it.
//                long[] minAndMax = MinAndMax(i, j, min, max, operations);
//                min[i][j]=minAndMax[0];
//                max[i][j]=minAndMax[1];
//            }
//        }
//
//        return max[0][n-1]; //returning max possible val for sub-sequence (1, n) which is the entire sequence.
//    }//end problem 3

    /**
     * Min and max method that finds the min and max for a particular sub-sequence (i, j). We divide the sequence into
     * (i, k) and (k+1, j) and perform operation k with those two sub-sequences.
     * @param i beginning index of sub-sequence
     * @param j ending index of sub-sequence
     * @param min 2D array containing the min val for all sub-sequences
     * @param max 2D containing the max val for all sub-sequences
     * @param operations contains all of the operations.
     * @return array containing min and max value for sub-sequence (i,j).
     */
//    private static long[] MinAndMax(int i, int j, long[][]min, long[][]max, String [] operations) {
//        long minimum = 9999999, maximum = -999999; //storing min and max of subsequence.
//
//        //iterating through all possible pairs (i,k) and (k+1,j) that the sub-sequence can be split into.
//        for(int k = i; k < j; k++){
//            long a, b, c, d;
//
//            //depending on the type of operation k, the corresponding operation will be done: (i,k) opk (k+1, j)
//            switch(operations[k]){
//                case "*":
//                    a = max[i][k] * max[k+1][j];
//                    b = max[i][k] * min[k+1][j];
//                    c = min[i][k] * max[k+1][j];
//                    d = min[i][k] * min[k+1][j];
//                    break;
//                case "+":
//                    a = max[i][k] + max[k+1][j];
//                    b = max[i][k] + min[k+1][j];
//                    c = min[i][k] + max[k+1][j];
//                    d = min[i][k] + min[k+1][j];
//                    break;
//
//                default:
//                    a = max[i][k] - max[k+1][j];
//                    b = max[i][k] - min[k+1][j];
//                    c = min[i][k] - max[k+1][j];
//                    d = min[i][k] - min[k+1][j];
//                    break;
//            }
//
//            //find out the minimum and maximum that we can get from (i,j).
//            minimum = Math.min(minimum, Math.min(a, Math.min(b, Math.min(c, d))));
//            maximum = Math.max(maximum, Math.max(a, Math.max(b, Math.max(c, d))));
//        }
//
//        long[] val = new long[2];
//        val[0] = minimum;
//        val[1]=maximum;
//        return val; //return values as array.
//    }//end minAndMax method.
}
