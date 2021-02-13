import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for problem 1
//        int N = Integer.parseInt(br.readLine());
//        System.out.println(problemOne(N));


        /*For problem 2:
          We need to sort the input pairs in terms of greatest val per unit. Therefore, the map will have the val
          per unit weight as the key and the weight as the "pair" value for the map.
         */

//        String[]info = br.readLine().split(" ");
//        int n = Integer.parseInt(info[0]), W = Integer.parseInt(info[1]);
//        TreeMap<Double, Integer> set = new TreeMap<>(Collections.reverseOrder());
//
//        for(int i = 0; i < n; i++){
//            String []line = br.readLine().split(" ");
//
//              //Here, the max. val per unit is calc. and being put with the amt as pair. Since the TreeMap uses .reverseOrder
//              //method, the final map will be sorted in reverse as required.
//
//            set.put((double)Integer.parseInt(line[0])/Integer.parseInt(line[1]),Integer.parseInt(line[1]));
//        }
//
//        System.out.printf("%.4f" , problemTwo(n, W, set)); //printing with 4 decmial places to avoid error


        //for problem 3
//        int d = Integer.parseInt(br.readLine()), maxPerRefill = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
//        int[] stations = new int[n+2]; //adding 0 and d as two stations as well. Therefore, n+2.
//        stations[0] = 0;
//        stations[stations.length-1]=d;
//
//        String [] stationString = br.readLine().split(" ");
//
//        for(int i =1; i < stations.length-1; i++){
//            stations[i]= Integer.parseInt(stationString[i-1]);
//        }
//
//        System.out.println(problemThree(d, maxPerRefill, stations));


        //for problem 4
//        int n = Integer.parseInt(br.readLine());
//        long[] pairA = new long[n];
//        long[]pairB = new long[n];
//
//        String[]pairsA= br.readLine().split(" ");
//        String[]pairsB =br.readLine().split(" ");
//
//        for(int i =0; i< n; i++){
//            pairA[i] = Long.parseLong(pairsA[i]);
//        }
//
//        for(int i =0; i< n; i++){
//            pairB[i] = Long.parseLong(pairsB[i]);
//        }
//
//        //Arrays need to be sorted so that each time we are accessing the largest pairs of the two sequences.
//        Arrays.sort(pairA);
//        Arrays.sort(pairB);
//
//        System.out.println(problemFour(n,pairA,pairB));


        //for problem 5
//        int n = Integer.parseInt(br.readLine());
//        int[][]set = new int[n][2];
//
//        for(int i = 0; i< n; i++){
//            String[]line = br.readLine().split(" ");
//            int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]);
//            set[i][0]=a;
//            set[i][1]=b;
//        }
//
//         /*
//         The following block of code is using Comparator interface with Arrays.sort to sort the 2d array in non-descending
//         order with respect to the endpoints of each pair (ie. second column of the 2d array).
//          */
//
//        int col = 1;
//        Arrays.sort(set, new Comparator <int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[col] > o2[col]){
//                    return 1;
//                }
//                else{
//                    return -1;
//                }
//            }
//        });
//
//        problemFive(n, set);


        //for problem 6
//        int n = Integer.parseInt(br.readLine());
//        problemSix(n);


        //for problem 7
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList <>();
        String [] numbers = br.readLine().split(" ");

        /*
        Converting numbers to string and then sorting in reverse lexicographically. This allows you to sort the numbers
        by first digit in descending order.
         */
        int[]sorted = Stream.of(numbers).sorted(Comparator.reverseOrder()).mapToInt(Integer::parseInt).toArray();

        for (int aSorted : sorted) {
            nums.add(aSorted);
        }

        System.out.println(problemSeven(nums));

    }




//    private static int problemOne(int N){
//        int totalCoins = 0;
//
//        while(N > 0){
//
//            /*
//            In this case, the safe move is to take the max amount of highest possible valued coins
//            until only single digit ones left.
//             */
//
//            if(N/10 > 0){
//                totalCoins+= N/10;
//                N%=10;
//            }
//            else if(N/5 > 0){
//                totalCoins+=N/5;
//                N%=5;
//            }
//            else{
//                totalCoins+=N;
//                N=0;
//            }
//        }
//        return totalCoins;
//    }


//    private static double problemTwo(int n, long W, TreeMap<Double, Integer> set){
//        double maxVal = 0;
//
//        for(Double val: set.keySet()){
//            if(W==0)return maxVal; //"bag" has been maxed therefore return val.
//
//              /*
//               As  stated in the tutorial, the safe move here is to take as much as possible of the highest valued unit.
//               If the amount is greater than the bag capacity, then take the capacity as max amt.
//              */
//            double amt = Math.min(set.get(val),W);
//            maxVal += amt*val; //get corresponding val.
//            W -= amt; //reduce weight, ie. space left in the bag.
//            int weight = (int)(set.get(val)-amt); //reduce amount left of that valued unit.
//            set.put(val, weight);
//        }
//
//        return maxVal; //return total accumulated points.
//    }


//    private static int problemThree(int miles, int maxPerRefill, int[] stations){
//        int numRefill = 0, currentStation = 0;
//
//
//          //Safe move here, as stated in the tutorial, is to go to the farthest station possible with one refuel.
//
//        while(currentStation < stations.length-1){
//            int lastStation = currentStation;
//
//            //go to next station while it is within range of maxPerRefill.
//            while(currentStation < stations.length-1 && (stations[currentStation+1] - stations[lastStation]) <= maxPerRefill){
//                currentStation++;
//            }
//
//
//              /*
//              If this condition is true, it indicates that the previous while loop did not run,
//              hence we cannot even reach the next station with our current fuel. Therefore, the trip is impossible.
//               */
//
//
//            if(currentStation == lastStation){
//                return -1;
//            }
//
//            /*
//            As long as current station is within the possible number of stations,
//            including the destination, then increase # of refills
//             */
//            if(currentStation < stations.length-1){
//                numRefill++;
//            }
//        }
//        return numRefill; //return total number of refills
//    }


//    private static long problemFour(int N, long[]pairA, long[]pairB){
//        long sum = 0;
//
//        /*
//        Safe move here is to sort the two sequences such that you multiply the largest two pairs every time.
//        I sorted the arrays in non-ascending order before passing it in the method, therefore all that is needed is to
//        multiply the pairs in reverse order starting from Array[N-1] to Array[0].
//         */
//
//        for(int i = N-1; i >=0; i--){
//            sum+=pairA[i]*pairB[i];
//        }
//
//        return sum;
//    }


//    private static void problemFive(int N, int[][]set){
//        int currPos = 0;
//
//        /*
//        Here, the safe move is to sort all the pairs by their endpoints in non-descending order. Each time,
//        we check how many segments can be covered by the smallest endpoint and then move to the next smallest endpoint,
//        if it can no longer be covered. The 2d array has been sorted before being sent in by column 2, ie. their endpoints.
//         */
//
//        ArrayList<Integer> list = new ArrayList <>(); //list to keep track of all the points chosen
//
//        for(; currPos < N;){
//
//            /*
//            If the current pos. is the last one and this endpoint has not been added, then this segment is
//            unique because its startpoint is higher than prev. position's endpoint. Therefore, this segment's endpoint
//            must be added.
//             */
//            if(currPos == set.length-1 && !list.contains(set[currPos][1])){
//                list.add(set[currPos][1]);
//                break;
//            }
//            int nextPos = currPos+1;
//
//            //If next pos. is not covered by the current segment, add endpoint of current pos. and then move to the next.
//            if(set[nextPos][0] > set[currPos][1]){
//                list.add(set[currPos][1]);
//                currPos++;
//            }
//            else {
//
//                //While the next segment's starting point is covered by current segment's end point,
//                //keep checking subsequent points.
//                while(nextPos < set.length && set[nextPos][0] <= set[currPos][1]){
//                    nextPos++;
//                }
//                list.add(set[currPos][1]); //add current position's end point
//                currPos=nextPos; //set current pos variable to the next position which was not covered by current segment.
//            }
//        }
//
//        System.out.println(list.size()); //print total number of points
//
//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i) + " "); //print all points in one line.
//        }
//    }

    /*
      For this problem, we can take advantage of the fact that the requirement of each position needs at least
      one more candy than the pos. below it. Therefore, it can take the form 1, 2, 3, ... n (where n = 1st place).
      This pattern is an arithmetic series which was brought up in the lessons. To find the sum, you use the
      formula: (n(n+1))/2 . We can reverse this formula to solve for n using the quadratic formula. The positive root
      (rounded down) is the max. possible position for which we can distribute the candies in the required pattern.
      @param N total number of candies
     */
//    private static void problemSix(int N){
//
//        //rewriting the sum formula, we note that a and b are always one and c will equal (-2*total candies).
//        long a = 1, b = 1, c = -2*N;
//
//        //Note: long datatype is being used in order to prevent integer overflow when calculating the roots.
//
//        //we are only concerned with the positive root
//        long x1 = (long)Math.floor((-b + Math.sqrt(b*b -4*a*c))/(2*a));
//
//        System.out.println(x1); //output max number of positions we can distribute candies fairly
//
//        int candiesPerPos =1; //Starting from last pos, each higher pos will get one more candy than previous position.
//
//        for(int i = 0; i < x1; i++){
//            //if we are at last (ie. first) pos, all remaining candies belong to first pos.
//            if(i == x1-1){
//                System.out.print(N);
//                break;
//            }
//
//            System.out.print(candiesPerPos + " "); //print out # of candies given to curr pos.
//            N-=candiesPerPos; //reduce num of total candies
//            candiesPerPos++; //increase # of candies for next pos. by 1
//        }
//    }

    /**
     * This problem requires a tweak on the method already provided in the problem statement. As stated in the "What to do"
     * section, a separate method called isGreaterOrEqual() must be created in order to properly estimate whether digit
     * is "greater" than maxDigit. In this case, this does not depend on the actual value ie. 93 vs 121, but rather the
     * 2 possible permutations of the pair. Therefore, we would compare 93121 vs 12193. If the first permutation, ie. the
     * one with digit (ie. 93) being first is larger, then digit is the new maxDigit. Otherwise, maxDigit remains unchanged.
     *
     * @param nums array that stores all of the given digits
     * @return String that is the max possible number we can form given the digits
     */
    private static String problemSeven(ArrayList<Integer> nums){
        StringBuilder answer = new StringBuilder();

        while(nums.size() > 0){
            int maxDigit = 0, maxIndex = 0;

            for(int i = 0; i < nums.size(); i++){
                if(isGreaterOrEqual(nums.get(i), maxDigit)){
                    maxDigit=nums.get(i);
                    maxIndex=i;
                }
            }
            answer.append(maxDigit);
            nums.remove(maxIndex);
        }
        return answer.toString();
    }

    /**
     * This compares the possible permutations of digit and maxDigit. if digit+maxDigit combined is > than maxDigit+digit,
     * then return true, else return false. Consider the following example:
     * 2 21
     * 221 > 212, therefore return true (ie. 2 is now maxDigit).
     *
     * Another example:
     * 29 298
     * 29298 < 29829, therefore return false (ie. 298 remains as the max digit)
     * @param d digit being compared
     * @param max current max digit
     * @return whether or not digit is greater than max by comparing permutations as described above.
     */
    private static boolean isGreaterOrEqual(int d, int max){
        return Integer.valueOf(String.valueOf(d)+String.valueOf(max)) > Integer.valueOf(String.valueOf(max)+String.valueOf(d));
    }
}
