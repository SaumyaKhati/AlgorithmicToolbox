import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for problem 1
//        int money = Integer.parseInt(br.readLine());
//        System.out.println(problemOne(money));


        //for problem 2
//        int number = Integer.parseInt(br.readLine());
//        problemTwo(number);


        //for problem 3
//        String a = br.readLine(), b= br.readLine();
//        System.out.println(problemThree(a,b));


        //for problem 4
//        br.readLine();
//        String [] a = br.readLine().split(" ");
//        br.readLine();
//        String [] b = br.readLine().split(" ");
//        System.out.println(problemFour(a,b));


        //for problem 5
//        br.readLine();
//        String [] a = br.readLine().split("\\s");
//        br.readLine();
//        String [] b = br.readLine().split("\\s");
//        br.readLine();
//        String [] c = br.readLine().split("\\s");
//
//        System.out.println(problemFive(a, b,c));
    }

    /**
     * Straightforward implementation of the example given in the lesson
     * @param money amt. required to be turned into change
     * @return change amount for money
     */
//    private static int problemOne(int money){
//
//        int numCoins; //keep track of coin numbers per coin denomination.
//
//        int[] minNumCoins = new int[money+1]; //store min. change needed for each num up to total money
//        minNumCoins[0]=0; //0 change needed for 0 money
//
//        int [] coinTypes = {1, 3, 4}; //store coin denominations
//
//        //go through entire MNC array and store min for each value as well as use prev. stored val. to calculate current one
//        for(int j = 1; j < minNumCoins.length; j++){
//
//            //change at the start must be "infinite" so that any calc. number after this is always smaller.
//            minNumCoins[j] =  999999999;
//
//            //go through all coin denominations to find the one that results in min. combo
//            for(int i = 0; i < 3; i++){
//
//                //if j, ie. current money value is greater than coin denomination then calc. change
//                if(j >= coinTypes[i]){
//
//                    numCoins = minNumCoins[j-coinTypes[i]]+1; //number is equal to 1 plus money-coin denomination as taught.
//                    if(numCoins < minNumCoins[j]){
//                        minNumCoins[j]=numCoins; //if numCoins is smaller then stored val, then substitute.
//                    }
//                }
//            }
//        }
//        return minNumCoins[money]; //return change value for money amount.
//    }//end problem 1


    /**
     * For this problem, we use the same method we used in 1 to calculate the min. moves for number. Once we have that,
     * we can use a while loop to "actually" calc. and store the intermediary values. We go backwards, starting from
     * number itself, then check which option (number/3, number/2 or number-1) has the min. # of moves and so forth
     * until we reach 1. At that point, we print all the values stored backwards starting from 1.
     * @param number val we need to reach from 1 using fewest combo of given moves (*2, *3 or +1).
     */
//    private static void problemTwo(int number){
//        int [] moves = new int[number+1]; //storing min. moves for all val. up till number
//        moves[1]=0; //for 1, its 0.
//
//        //iterating through all # uptill number val. and using prev. calc. values to calc. curr val.
//        for(int i = 2; i < number+1; i++){
//
//            moves[i]=999999999; //moves at beginning is large so any # afterwards will be stored.
//
//            int moveNum; //keep track of move number
//
//            //variables to help keep track of # of moves after using each operation
//            int a= 999999, b = 999999, c = 999999;
//
//            //iterate through all operations (*3, *2, +1)
//            for(int j = 0; j < 3; j++){
//
//                //go through the "*2" option. We divide by 2 in order to backtrack to prev. value (if divisible)
//                if(j == 1 && i%2 == 0){
//
//                    //if i is already 2, then min. # of moves will simply be 1.
//                    if(i ==2){
//                        a=1;
//                    }
//                    else {
//                        moveNum = moves[i/2]+1;
//                        a= moveNum;
//                    }
//
//                }
//                //go through "*3" option. If i is only 3, then we know # of operations is only 1.
//                else if(j ==2 && i%3 == 0){
//                    if(i ==3){
//                        b=1;
//                    }
//                    else {
//                        moveNum = moves[i/3]+1;
//                        b=moveNum;
//                    }
//                }
//
//                //otherwise, if i is not divisible by 2 or 3 (or is smaller) then, the only valid operation is "+1" which
//                //means we do -1 since we want to "backtrack"
//                else {
//                    moveNum = moves[i-1]+1;
//                    c=moveNum;
//                }
//
//            }
//
//            //Whichever operation results in fewest # of moves will be the minimum for i.
//            moves[i] = Math.min(a, Math.min(b,c));
//        }
//
//        //print out min # of operations for number given.
//        System.out.println(moves[number]);
//
//        ArrayList<Integer> path = new ArrayList <>(); //list to store the intermediary values.
//        path.add(number); //add original number since we start from there.
//
//        /*
//        Since we now have min. # of moves for each val up till number, we can go backwards to find the intermediate values.
//        We do this by using the operations and choosing the one resulting in next least # of moves. We store that value, and
//        keep repeating and going backwards till number is 1 at which point we have all of the values.
//         */
//        while(number > 1){
//
//            //variables to store the min. val for each number that we get after doing the repsective operation.
//            int div3Num = 999999 , div2Num = 999999;
//            int minus1Num = moves[number-1]+1;
//
//            //get the min # of moves for number/2.
//            if(number %2 == 0){
//                div2Num = moves[number/2]+1;
//            }
//
//            //get the min # of moves for number/2.
//            if(number %3 == 0){
//                div3Num=moves[number%3]+1;
//            }
//
//            //Out of the three move # we calculated from the following operations: (number/3), (number/2) and (number-1),
//            // choose the minimum.
//            int min = Math.min(div3Num, Math.min(div2Num, minus1Num));
//
//            //Find out which operation resulted in "min". # of moves, and do the operation on number.
//            if (min == div3Num) {
//                number/=3;
//            }
//            else if(min == div2Num){
//                number/=2;
//            }
//            else {
//                number-=1;
//            }
//
//            path.add(number); //store the "new", reduced number and keep going backwards.
//        }
//
//        //print out all intermediary values as well as 1 and number itself.
//        for(int i = path.size()-1; i >= 0; i--){
//            System.out.print(path.get(i) + " ");
//        }
//    }//end problem 2


    /**
     * For this problem, we simply implement the pseudo-code provided during the lesssons for this problem. The core
     * principle behind this method is similar to the ones used to solve problem 1 and 2. We use the idea of
     * backtracking (ie. using previously calculated val to solve curr. val) and choosing min. # of previous
     * possible alignment +1 and then min. operations for the alignment before that . . . and so forth.
     * @param a the first string
     * @param b the second string we compare with the first
     * @return the min. edit distance of the two strings
     */
//    private static int problemThree(String a, String b){
//
//        //creating the a by b matrix to calculate the edit distance val.
//        int[][]distance  = new int[a.length()+1][b.length()+1];
//
//        //declaring ints to be sizes of string a and b.
//        int aSize = a.length(), bSize = b.length();
//
//        //filling the first vertical column of D(i,0) to be i (as discussed in the lessons)
//        for(int i = 0; i < aSize+1; i++){
//            distance[i][0] = i;
//        }
//
//        //filling the first horizontal column of D(0, j) to be j.
//        for(int i = 0; i < bSize+1; i++){
//            distance[0][i]=i;
//        }
//
//        //iterating through entire matrix (as explained in lessons).
//        for(int j = 1; j < bSize+1; j++){
//            for(int i = 1; i < aSize+1; i++){
//
//                //determining all possible e.d. val after using each operation.
//                int insertion = distance[i][j-1]+1;
//                int deletion = distance[i-1][j]+1;
//                int match = distance[i-1][j-1];
//                int mismatch = distance[i-1][j-1]+1;
//
//                //if its a match, then compare with match val otherwise use mismatch val.
//                if(a.charAt(i-1) == b.charAt(j-1)){
//                    distance[i][j]= Math.min(insertion, Math.min(deletion, match));
//                }
//                else {
//                    distance[i][j] = Math.min(insertion, Math.min(deletion, mismatch));
//                }
//            }
//        }
//
//        //return e.d. value for strings a and b.
//        return distance[a.length()][b.length()];
//    }//end problem 3


    /**
     * For this problem, we note that longest common sequence is equivalent to finding the maximal alignment
     * score. Therefore, we can reuse the same algorithm from the prob. 3 with slight modifications. Namely, there will
     * be no consequences for indel or substitutions but you will get +1 for each match. Instead of finding min val,
     * we look for max value (ie. alignment score).
     * @param a first number seq formatted as string (without whitespace)
     * @param b second number seq formatted as string
     * @return longest common subsequence
     */
//    private static int problemFour(String [] a, String [] b){
//
//        int aL = a.length, bL = b.length; //storing string sizes.
//
//        //creating the matrix
//        int[][] score = new int[aL+1][bL+1];
//
//        /*
//        Note: Unlike the previous problem, the only way to get a score this time is if there is a match. Therefore,
//        the first row and column of matrix have values of 0. For loops are not necessary this time because int
//        arrays in Java store a default value of 0.
//         */
//
//        //iterate through matrix and find max score (ie. max alignment possible which gives us longest subsequence).
//        for(int j = 1; j < bL+1; j++){
//            for(int i =1; i < aL+1; i++){
//
//                //det. all possible combos.
//                int insertion = score[i][j-1];
//                int deletion = score[i-1][j];
//                int match = score[i-1][j-1]+1;
//                int mismatch = score[i-1][j-1];
//
//                //Choose the option that results in max score.
//                if(a[i - 1].equals(b[j - 1])){
//                    score[i][j] = Math.max(insertion, Math.max(deletion, match));
//                }
//                else {
//                    score[i][j] = Math.max(insertion, Math.max(deletion, mismatch));
//                }
//            }
//        }
//        return score[aL][bL]; //return max common subsequence for strings a and b.
//    }//end problem 4


    /**
     * This problem is an extension of the previous one. Since we are dealing with 3 sub-sequences, we will need to create
     * an a x b x c matrix (ie. a 3D array). There will also be more "possibilities" we need to account for. Note:
     * due to the fact that we have a 3 strings, for some optimal alignment of the strings, the last column can have a
     * total of 8 possible combinations of insertions/deletions/match/mismatch. Therefore, we need to compare
     * more combinations and once again choose the biggest one.
     * @param a first seq
     * @param b second seq
     * @param c third seq
     * @return longest common subsequence length
     */
//    private static int problemFive(String []a, String [] b, String []c){
//
//        //Note: +1 since matrix col/row/stack starts from 0 and goes up till String a,b,c length (0 ... a.length)!
//        int aL = a.length+1, bL = b.length+1, cL = c.length+1;
//
//        int[][][] matrix = new int[aL][bL][cL]; //initializing 3D matrix
//
//        /*
//        Note: Similar to last time, we do not need for loops to assign any val to first row/col/stack of matrix,
//        since they will carry a value of 0 (which is the default in Java).
//         */
//
//        //iterating through entire matrix
//        for(int i = 1; i < aL; i++){
//            for(int j = 1; j < bL; j++){
//                for(int k = 1; k < cL; k++){
//
//                    //storing all possible combinations
//                    int del = matrix[i-1][j][k];
//                    int deletion2 = matrix[i-1][j-1][k];
//                    int match = matrix[i-1][j-1][k-1]+1; //Only +1 for match, since we are looking for "common" subs.
//                    int mismatch = matrix[i-1][j-1][k-1];
//                    int insertion = matrix[i][j-1][k];
//                    int insert2 = matrix[i][j-1][k-1];
//                    int insert3 = matrix[i][j][k-1];
//                    int insert4 = matrix[i-1][j][k-1];
//
//                    //Splitting above combos, into left and right for simplicity's sake.
//
//                    //storing max value of second 4 combinations
//                    int maxR = Math.max(insert2, Math.max(insert3, Math.max(insert4, insertion)));
//
//                    int maxL; //will store max. val of first 4 combos
//
//                    //storing max of first 4 (which will use either match or mismatch depending on if last char of all strings is equal
//                    if(a[i-1].equals(b[j-1]) && a[i-1].equals(c[k-1])){
//                        maxL = Math.max(del, Math.max(deletion2, match));
//                    }
//                    else {
//                        maxL = Math.max(del, Math.max(deletion2, mismatch));
//                    }
//                    matrix[i][j][k]= Math.max(maxL, maxR); //storing max val out of all combos.
//                }
//            }
//        }
//        return matrix[aL-1][bL-1][cL-1]; //returning longest common subsequence of all three strings
//    }//end Problem 5
}