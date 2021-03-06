import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for problem 1
//        String[]line1 = br.readLine().split(" ");
//        String[]line2 = br.readLine(). split(" ");
//
//        int lengthA = Integer.parseInt(line1[0]), lengthB = Integer.parseInt(line2[0]);
//
//        int[]set = new int[lengthA], keys = new int[lengthB];
//
//        for(int i =0; i < lengthA; i++){
//            set[i] = Integer.parseInt(line1[i+1]);
//        }
//
//        for(int i =0; i<lengthB; i++){
//            keys[i] = Integer.parseInt(line2[i+1]);
//        }
//
//        System.out.println(problemOne(set, keys));


        //for problem 2
//        int n = Integer.parseInt(br.readLine());
//        HashMap<Integer,Integer> count = new HashMap <>();
//        String[]line = br.readLine().split(" ");
//
//        //Here, we add every new element, and increase count of previously seen elements by one.
//        for(int i = 0; i < n; i++){
//            int key = Integer.parseInt(line[i]);
//            if(count.containsKey(key)){
//                count.put(key, count.get(key)+1);
//            }
//            else {
//                count.put(key, 1);
//            }
//        }
//        System.out.println(problemTwo(count, n));


        //for problem 3
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> set = new ArrayList <>();
//        String[]line = br.readLine().split(" ");
//
//        //adding numbers to list.
//        for(int i =0; i < n; i++){
//            set.add(Integer.parseInt(line[i]));
//        }
//
//        set=randomizedQuickSortProblem3(set, 0, set.size());
//
//        for (Integer a : set) {
//            System.out.print(a + " ");
//        }


        //for problem 4
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> set = new ArrayList <>();
//        String[]line = br.readLine().split(" ");
//
//        //adding numbers to list.
//        for(int i =0; i < n; i++){
//            set.add(Integer.parseInt(line[i]));
//        }
//
//        Info start = new Info(set, 0);
//        Info end = mergeSortProblemFour(start);
//        System.out.println(end.getInversions());


        //for problem 5
//        String [] info = br.readLine().split(" ");
//        int s = Integer.parseInt(info[0]), p = Integer.parseInt(info[1]);
//
//        ArrayList<Pair> data = new ArrayList <>(); //storing entire collection of points.
//
//        //iterate through segments entered and store into data by splitting into "l" and "r".
//        for(int i =0; i < s; i++){
//            String [] line = br.readLine().split(" ");
//
//            int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]);
//
//            //storing start and end of segment as "l" and "r" respectively.
//            data.add(new Pair(a, "l"));
//            data.add(new Pair(b, "r"));
//        }
//
//        String [] line = br.readLine().split(" ");
//
//        ArrayList<Integer> originalOrder = new ArrayList <>();
//
//        //iterate through points given
//        for(String a: line){
//            data.add(new Pair(Integer.parseInt(a), "p")); //store as "p" to denote point.
//            originalOrder.add(Integer.parseInt(a)); //maintain original order of points.
//        }
//
//        //sort based on integer val (but if its equal then sort lexicographically)
//        data.sort(new Comparator <Pair>() {
//            @Override
//            public int compare(Pair o1, Pair o2) {
//
//                if(o1.getNumber() == o2.getNumber()){
//                    return o1.getDataType().compareTo(o2.getDataType());
//                }
//                else {
//                    return Integer.compare(o1.getNumber(), o2.getNumber());
//                }
//            }
//        });
//
//        System.out.println(problemFive(data, originalOrder)); //print answer.


        //for problem 6
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Point> set = new ArrayList <>();
//        ArrayList<Point> setSortedY = new ArrayList <>();
//
//        for(int i = 0; i < n; i++){
//            String [] line = br.readLine().split(" ");
//            set.add(new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
//            setSortedY.add(new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
//        }
//
//        set.sort(Comparator.comparingInt(o -> o.x));
//        setSortedY.sort(Comparator.comparingInt(o->o.y));
//
//        System.out.println(problemSix(set, setSortedY));
    }




    /**
      Fairly straightforward implementation of the binary search code taught in the video lessons. You use a for loop
      to go through all keys and output the results (in this case I will use a StringBuilder and append the result.
      In this case, I will not reimplement the binary search code since we have learned it already. Instead I will use
      the standard Arrays library which comes with a binary search method.
      @param set - numbers to search through
     * @param keys- keys to use for set and outputting resutls
     * @return  String containing search results for all keys
     */
//    private static String problemOne(int[]set, int[]keys){
//        StringBuilder answer = new StringBuilder();
//
//        for (int key : keys) {
//
//            int result = Arrays.binarySearch(set, key);
//
//            //ensuring that if key is not present in set, it will output -1 not -6 or any other negative number.
//            if(result <0) {
//                answer.append("-1 ");
//            }
//            else {
//                answer.append(result).append(" "); //space is needed between indices as depicted in the test case.
//            }
//        }
//
//        return answer.toString(); //returns full string
//    }

    /**
     * For this problem, you do not need a divide and conquer. It can be solved in O(n) time using HashMaps and simply
     * updating count for each "key" ie. unique number you find and add to the map. Once you have counts for all unique
     * numbers, we iterate to find the key w. max "count" then return 1 or 0 depending on if its a majority.
     *
     * @param count is the hashmap containing keys which are all the unique numbers and pair value which is # of times
     *              key appeared
     * @return index of max value if its majority or 0
     */
//    private static Integer problemTwo(HashMap<Integer, Integer> count, int n){
//
//        //setting maxCount as the #of appearances of first key.
//        int maxCount = (int)count.keySet().toArray()[0];
//
//        //getting max value.
//        for(Integer a: count.keySet()){
//            if(count.get(a) > count.get(maxCount)){
//                maxCount=a;
//            }
//        }
//
//        //if max value is the majority(ie. greater than n/2) then return 1, otherwise return 0.
//        if(count.get(maxCount) > n/2){
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }

    /**
     * For this problem, we simply implement the Quicksort method taught in the videos with the partition3 method
     * where it returns m1 and m2 pivot elements where all elements between m1 and m2 are equal to the pivot.
     * @param set list containing the integers
     */
//    private static ArrayList<Integer> randomizedQuickSortProblem3(ArrayList<Integer> set, int l, int r){
//        if(l >= r){
//            return set;
//        }
//
//        //selecting random pivot between the constraints (l and r).
//        int k = (int)(Math.random()*(r-l))+l;
//
//        //swapping l and k such that the pivot is the first element.
//        Collections.swap(set, l, k);
//
//        int[]pivots = partition3(set, l, r);
//
//        //quicksorting the two other sides respective to the pivot range. Since this can be independant,
//        //we can use result of one for the other.
//        return randomizedQuickSortProblem3(randomizedQuickSortProblem3(set, l, pivots[0]),pivots[1]+1,r);
//    }

    /**
     * This is the partition3 method that I have developed. The logic is based upon the original partition method
     * with a few modifications.
     * @param set contains the integers
     * @param l leftmost index (inclusive)
     * @param r rightmost index (not inclusive!)
     * @return int array containing the two pivots
     */
//    private static int[] partition3(ArrayList<Integer> set, int l, int r) {
//        int m1 = l, m2 = m1, pivot = set.get(l);
//
//        //since pivot is l, we start the loop from l+1
//        for(int i = l+1; i <r; i++){
//
//            //if the next number is less than pivot, it should be before m1 therefore swap after incrementing.
//            if(set.get(i) < pivot){
//                m1++;
//
//                /*
//                We need to be aware of one special case which is if m1++ results in the "territory" of elements that are
//                equal to the pivot. If that is the case, swapping m1 and i directly will result in an incorrect sort.
//                Therefore, we must first increment m2 and then swap i with m2 so that when we swap m1 and m2, the element
//                equal to the pivot is between the range of m1 and m2 which is what we want.
//                Since all elements from m1-m2(inclusive) is equal to the pivot.
//                 */
//                if(set.get(m1) == pivot){
//                    m2++;
//                    Collections.swap(set, m2, i);
//
//                    Collections.swap(set, m1,m2);
//                }
//                else {
//                    Collections.swap(set, m1, i);
//                }
//            }
//            //if element is equal to pivot, swap with m2 after increment.
//            else if(set.get(i) == pivot){
//                m2++;
//                Collections.swap(set, m2, i);
//
//            }
//
//            /*
//            if element is greater than pivot, then it needs to be ahead of m2, therefore, swap it with m2+1 but do
//            not increment m2.
//             */
//            else {
//                Collections.swap(set, m2+1, i);
//            }
//
//            //m2 needs to be at least equal to m1. Therefore, if there are no elements equal to pivot (ie. m2 has not
//            //been incremented), then let m2=m1.
//            if(m2 < m1){
//                m2=m1;
//            }
//        }
//
//        //Finally, we need to swap l and m1 so that m1-m2 (inclusive) only contains elements equal to pivot.
//        Collections.swap(set, l, m1);
//
//        return new int[]{m1, m2}; //returns the two pivots as an int array.
//    }



    /**
     * For this problem, we need to implement the MergeSort algorithm from the lessons with an added parameter
     * to keep track of the inversions made during Merge. Due to the fact that Java does not allow for the return of two
     * values, I created an Info class that stores both the set (ie. ArrayList) of Integers and the inversion
     * count. Hence, instead of returning values, I will return an instance of Info class that holds these values.
     *
     * @param information an instance of Class Info that contains the arrayList of numbers to sort and the inversion count
     * @return instance of Info which holds relevant information
     */
//     private static Info mergeSortProblemFour(Info information){
//
//         //if array size is one, then return the array (ie. instance of the class).
//         if(information.getNumberSet().size() == 1){
//             return information;
//         }
//
//         int m = information.getNumberSet().size()/2; //splitting array into half.
//         int end = information.getNumberSet().size(); //getting right max index of subarray.
//
//         //splitting original set into sub arrays of left and right side elements respectively.
//         ArrayList<Integer> leftSet = new ArrayList <>(information.getNumberSet().subList(0, m));
//         ArrayList<Integer> rightSet = new ArrayList <>(information.getNumberSet().subList(m, end));
//
//         //calling mergesort on those respective sides and storing it into two new instances l and r. Note that
//         //the number of inversions needs to remain the same as original array therefore, we use getInversions() method.
//         Info l = mergeSortProblemFour(new Info(leftSet, information.getInversions()));
//         Info r = mergeSortProblemFour(new Info(rightSet, information.getInversions()));
//
//         return merge(l,r); //return the resulting "array" + number of inversions as another instance.
//     }

    /**
     * Method merges the two integer sets from Info instances l and r, and then updates total number of inversions.
     * @param l instance of Info class that contains the left-side elements of original array
     * @param r instance of Info class containing the right-side elements of original array
     * @return instance of Info that contains both the merged array and the updated # of inversions.
     */
//    private static Info merge(Info l, Info r) {
//
//        //get the two stored arrayLists using getter methods.
//        ArrayList<Integer> left = l.getNumberSet();
//        ArrayList<Integer> right = r.getNumberSet();
//
//
//        ArrayList<Integer> merged = new ArrayList <>(); //instantiating the merged ArrayList
//
//        //Getting current number of inversions (before merging), which is the sum of the total inversions for left and
//        //right sub-arrays respectively.
//        int currInversions = l.getInversions()+r.getInversions();
//
//
//        //implementing a modified version of the pseudo-code taught in the lessons.
//        while(left.size() > 0 && right.size() > 0){
//
//            //getting first elements of both arrays.
//            int a = left.get(0);
//            int b = right.get(0);
//
//            //if a is smaller or equal, no inversions are needed. Thus, add a to merged and remove from left set.
//            if(a <= b){
//                merged.add(a);
//                left.remove(0);
//            }
//            else {
//                //continue iterating through right set until a is smaller or equal to b.
//                while(a > b){
//
//                    //remove b from right set and add to merged.
//                    merged.add(b);
//                    right.remove(0);
//
//                    /*
//                    Note: if a is larger than b, then entire left set is larger since l(0) <= l(1) <= l(2) ... <= l(m-1).
//                    Therefore, the number of pairs (a,b) such that a > b will be equal to the entire left set for that
//                    particular b value. This in turn means that currInversions must be increased by the left set size
//                    since that is the total number of "inversions" or pairs containing that b value.
//                     */
//                    currInversions+= left.size();
//
//                    //if right set is now empty, due to the prior removal of b, then we break. Otherwise, b is again the
//                    //first value.
//                    if(right.size() > 0) b = right.get(0);
//                    else break;
//                }
//            }
//        }
//
//        //Add remaining elements of left and right set.
//
//        if(left.size() > 0){
//            merged.addAll(left);
//            left.clear();
//        }
//
//        if(right.size() > 0){
//            merged.addAll(right);
//            right.clear();
//        }
//
//        //return new instance of Info with the merged array and updated currInversions value.
//        return new Info(merged, currInversions);
//    }


    /**
     * For this problem, we need to split the segments and store all points as pairs of (Integer, String) such
     * that the Integer section represents the value and string will store the type of point. For ex, [5,8]
     * will be split into (5,"l") and (8,"r"), denoting the start and end of the segment and the point 3 will be (3,"p").
     *
     * Then, we sort the entire collection of pairs by integer value in non decreasing order, and iterate through the
     * entire collection of pairs. Every time, we encounter the beginning of a segment "l", we increase segment counter
     * by 1, if we get "r" we lower counter by 1. If we encounter "p", we simply store the segmentCount variable for
     * that point.
     *
     * NOTE: In order for the algorithm to work properly, we must ensure that for equal integer values
     * we sort them lexicographically such that points equal to a segment's start or endpoint always ends up in the
     * "middle". For ex, the following data set:
     *
     * 2 1
     * 3 5
     * 5 8
     * 5
     *
     * If we store it as:
     * (3,"l") segmentCount+1 = 1
     * (5,"l") segmentCount+1 = 2
     * (5,"r") segmentCount-1 = 1
     * (5,"p") storing segmentCount --> 1 as the answer
     * (8,"r")
     * This will result in a value of 1 for the point 5, even though it should be 2. Therefore, sorting in alphabetical
     * order for equal values will result in correct answer.
     *
     * NOTE 2: Since we can't return two different things in methods, I created a Pair class that will store both the
     * integer value and data type (ex. l,r, or p). Then, we simply use Pair objects to store/get info.
     *
     * @param data ArrayList of Pair class that stores all points as pair objects containing val and type of point.
     * @param originalOrder stores original order of points (before sorting) so that we can print ans in correct order
     * @return String that contains the entire sequence of answers for all points.
     */
//    private static String problemFive(ArrayList<Pair> data, ArrayList<Integer>originalOrder){
//
//        int segmentCount = 0; //will be used to store "open" segments ie. how many segments are covering a point.
//
//        //HashMap to store answers for each point and ensuring no duplication for same points.
//        HashMap<Integer, Integer> points = new HashMap <>();
//
//        //iterate through entire collection of points
//        for (Pair a : data) {
//
//            //take appropriate action depending on type of point
//            switch (a.getDataType()) {
//                case "l":
//                    segmentCount++; //indicates new segment, increase counter.
//                    break;
//                case "r":
//                    segmentCount--; //indicates end of a segment, decrease counter.
//                    break;
//                default:
//                    //We can be sure 'a' must be a point if it's not the start or end of a segment.
//                    int number = a.getNumber();
//
//                    //Ensure that the point is not a duplicate (ie. already has an answer), then store segmentCount
//                    if (!points.containsKey(number)) {
//                        points.put(number, segmentCount);
//                    }
//                    break;
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        //Iterate through original order of points
//        for (Integer num : originalOrder) {
//
//            //get answers for each point from HashMap and append it.
//            sb.append(points.get(num)).append(" ");
//        }
//
//        return sb.toString(); //return entire sequence of values
//    }//end of problem 5


    /**
     * For this problem, multiple "helper" methods are being used (all listed below). To solve this problem,
     * we need to implement the solution listed in the PDF.
     * @param points ArrayList containing points sorted by x-val (in ascending order)
     * @param pointSortedY ArrayList containing the points sorted by y-val (in ascending order)
     * @return closest distance between a pair of points
     */
//    private static double problemSix(ArrayList<Point> points, ArrayList<Point> pointSortedY){
//
//        //If the set of points is small enough (ie. 3 or less), we use brute-force approach.
//        if(points.size() <= 3){
//            return bruteForceDist(points);
//        }
//
//        int mid = (points.size())/2; //finding midpoint of current list of points
//        int midLine = points.get(mid).x; //finding the middle "vertical line" (ie. x val of midpoint)
//
//
//        ArrayList<Point> sortedYLeft = new ArrayList <>();
//        ArrayList<Point> sortedYRight = new ArrayList <>();
//
//        //Split the list sorted by y-val into left and right based on its location relative to midline.
//        for (Point p : pointSortedY) {
//            if (p.x <= midLine) { sortedYLeft.add(p); }
//            else { sortedYRight.add(p); }
//        }
//
//        //find min distance in the left and right sub-lists.
//        double distL = problemSix(new ArrayList <>(points.subList(0, mid)), sortedYLeft);
//        double distR = problemSix(new ArrayList <>(points.subList(mid+1, points.size())), sortedYRight);
//
//        double minDist = Math.min(distL, distR); //min distance is now the smaller of the two.
//
//        //Finally, check last possible case where smallest dist is between 2 points where
//        //each point is in left and right half.
//        return splitPair(pointSortedY, minDist, midLine);
//    }//end of problem 6 primary method.


    /**
     * Brute force approach where we simply iterate through all possible pairs. Works for very small sets.
     * @param points set of points
     * @return smallest distance bet. point found
     */
//    private static double bruteForceDist(ArrayList<Point> points){
//        double min = 99999999;
//
//        //iterate through all possible pairs and record the smallest distance.
//        for(int i = 0; i < points.size(); i++){
//            for(int j = i+1; j < points.size(); j++){
//                min = Math.min(min, calcDist(points.get(i), points.get(j)));
//            }
//        }
//        return min;
//    }//end of bruteForceDist method

    /**
     * This method is to check for the "unlucky" case where the pair is split in left and right halves.
     * @param pointsSortedY set of point sorted by y-val (ascending)
     * @param minDist previous minimum distance found
     * @param midLine val used to sift through possible remaining points
     * @return minimum distance found
     */
//    private static double splitPair(ArrayList<Point> pointsSortedY, double minDist, int midLine){
//        ArrayList<Point> remainder = new ArrayList <>();
//
//        //Sift through entire list and only store points whose distance to the mid-line is less than minDist
//        for(Point p: pointsSortedY){
//            if(Math.abs(p.x-midLine) < minDist){
//                remainder.add(p);
//            }
//        }
//
//        Point a, b;
//        //For each point in the list, iterate through 5 other possible points (to find minimum distance)
//        for(int i = 0; i < remainder.size(); i++){
//            a = remainder.get(i);
//
//            //Note: This inner loop will only run for a max of 6 times for each point, therefore, it is not O(n^2).
//            for(int j = i+1; j < remainder.size() && Math.abs(a.y-remainder.get(j).y) < minDist; j++){
//                b=remainder.get(j);
//                minDist = Math.min(minDist, calcDist(a,b));
//            }
//        }
//        return minDist;
//    }//end splitPair method

    /**
     * Helper method to calc. distance between two points using the appropriate formula
     * @param a first point
     * @param b second point
     * @return distance between a and b
     */
//    private static double calcDist(Point a, Point b){
//        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
//    }//end calcDist method
}//end of class main


/**
 * Class Info needed for problem 4 in order to return two different data types (# of inversions and integer set)
 */
//class Info{
//
//    //fields represent the values needed to return by the method
//    private ArrayList<Integer> numberSet;
//    private int inversions;
//
//    //constructor used to set field values
//    Info(ArrayList<Integer> set, int i){
//        this.numberSet=set;
//        this.inversions=i;
//    }
//
//    //getter methods for integer set and inversion count
//    int getInversions(){
//        return inversions;
//    }
//    ArrayList<Integer> getNumberSet(){
//        return numberSet;
//    }
//}


/**
 * Class Pair needed for problem 5 in order to return two different data types (Integer value and String to
 * store point type (Ex: "l" to denote start of a segment, "r" to denote end of a segment, and "p" to denote point)
 */
//class Pair {
//
//    //field representing values needed to be returned by the method.
//    private int number;
//    private String dataType;
//
//    //constructor to set field values.
//    Pair(int n, String t){
//        this.number=n;
//        this.dataType=t;
//    }
//
//    //getter methods to return field val.
//    int getNumber() { return number; }
//    String getDataType() { return dataType; }
//}

/**
 * Class Point needed for problem 6 to conveniently store each point's x and y val under one object. By doing this, we
 * no longer need to use 2D-int arrays and we can access the appropriate fields easily.
 */
//class Point{
//
//    //By keeping the fields public, we can directly access it with an object instead of getter methods.
//    int x;
//    int y;
//
//    //Constructor to set field values.
//    Point(int x, int y){
//        this.x=x;
//        this.y=y;
//    }
//}
