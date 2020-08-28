import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.Arrays;public class Main {    public static void main(String[] args) throws Exception{        //I prefer to use buffered reader because it is faster than scanner.        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        //for problem 1//        String [] line = br.readLine().split("\\s");//        int W = Integer.parseInt(line[0]), n = Integer.parseInt(line[1]);//        int [] bars = new int[n];//        String [] barAsString = br.readLine().split("\\s");////        for(int i =0; i< n; i++){//            bars[i]= Integer.parseInt(barAsString[i]);//        }////        System.out.println(problemOne(W, bars));        //for problem 3        String [] line = br.readLine().split("");        int [] numbers = new int[line.length/2+1];        String[] operations = new String[line.length/2];        int counter = 0;        for(int i = 0; i < line.length; i+=2){            numbers[counter] = Integer.parseInt(line[i]);            counter++;        }        counter = 0;        for(int i = 1; i < line.length; i+=2){            operations[counter]= line[i];            counter++;        }        System.out.println(problemThree(numbers, operations));    }    /**     * This problem requires a straightforward implementation of the discrete backpack (w/out repetitions) pseudocode     * that was taught in the lessons.     * @param W max possible weight of the backpack     * @param bars all of the gold bars available     * @return total weight of bars we can carry     *///    private static int problemOne(int W, int [] bars){//        int [][] value = new int[bars.length+1][W+1]; //declaring matrix////        //iterating through matrix//        for(int i = 1; i < bars.length+1; i++){//            for(int j = 1; j < W+1; j++){////                value[i][j]= value[i-1][j]; //consider the first case where we may not include current gold bar.////                int val = 0;////                //if curr bar can fit in bag, then total val is val(W-wi)(i-1) + Wi (as discussed in pseudocode).//                if(bars[i-1] <= j){//                    val= value[i-1][j-bars[i-1]]+bars[i-1];//                }////                //if val is greater than stored, then value(i)(j) <-- val.//                if(val > value[i][j]){//                    value[i][j]=val;//                }//            }//        }//        return value[bars.length][W]; //returns max gold bar weight possible.//    }//end problem 1    /**     *     * @param numbers     * @param operations     * @return     */    private static long problemThree(int [] numbers, String [] operations){        int n = numbers.length;        long [][] min = new long[n][n], max = new long[n][n];        for(int i = 0; i < n; i++){            min[i][i]=numbers[i];            max[i][i]=numbers[i];        }        for(int s = 1; s < n; s++){            for(int i = 0; i < n-s; i++){                int j = i+s;                long[] minAndMax = MinAndMax(i, j, min, max, operations);                min[i][j]=minAndMax[0];                max[i][j]=minAndMax[1];            }        }        return max[0][n-1];    }    private static long[] MinAndMax(int i, int j, long[][]min, long[][]max, String [] operations) {        long minimum = 9999999, maximum = -999999;                for(int k = i; k < j; k++){            long a, b, c, d;            switch(operations[k]){                case "*":                    a = max[i][k]* max[k+1][j];                    b = max[i][k]* min[k+1][j];                    c = min[i][k]* max[k+1][j];                    d = min[i][k]* min[k+1][j];                    break;                case "+":                    a = max[i][k]+ max[k+1][j];                    b = max[i][k]+ min[k+1][j];                    c = min[i][k]+ max[k+1][j];                    d = min[i][k]+ min[k+1][j];                    break;                default:                    a = max[i][k]- max[k+1][j];                    b = max[i][k]- min[k+1][j];                    c = min[i][k]- max[k+1][j];                    d = min[i][k]- min[k+1][j];                    break;            }            minimum = Math.min(minimum, Math.min(a, Math.min(b, Math.min(c, d))));            maximum = Math.max(maximum, Math.max(a, Math.max(b, Math.max(c, d))));        }        long[] val = new long[2];        val[0] = minimum;        val[1]=maximum;        return val;    }}