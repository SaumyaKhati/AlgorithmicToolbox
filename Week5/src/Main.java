import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.ArrayList;public class Main {    public static void main(String[] args) throws Exception{        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        //for problem 1//        int money = Integer.parseInt(br.readLine());//        System.out.println(problemOne(money));        //for problem 2        int number = Integer.parseInt(br.readLine());        problemTwo(number);    }    /**     * Straightforward implementation of the example given in the lesson     * @param money amt. required to be turned into change     * @return change amount for money     *///    private static int problemOne(int money){////        int numCoins; //keep track of coin numbers per coin denomination.////        int[] minNumCoins = new int[money+1]; //store min. change needed for each num up to total money//        minNumCoins[0]=0; //0 change needed for 0 money////        int [] coinTypes = {1, 3, 4}; //store coin denominations////        //go through entire MNC array and store min for each value as well as use prev. stored val. to calculate current one//        for(int j = 1; j < minNumCoins.length; j++){////            //change at the start must be "infinite" so that any calc. number after this is always smaller.//            minNumCoins[j] =  999999999;////            //go through all coin denominations to find the one that results in min. combo//            for(int i = 0; i < 3; i++){////                //if j, ie. current money value is greater than coin denomination then calc. change//                if(j >= coinTypes[i]){////                    numCoins = minNumCoins[j-coinTypes[i]]+1; //number is equal to 1 plus money-coin denomination as taught.//                    if(numCoins < minNumCoins[j]){//                        minNumCoins[j]=numCoins; //if numCoins is smaller then stored val, then substitute.//                    }//                }//            }//        }//        return minNumCoins[money]; //return change value for money amount.//    }    /**     * For this problem, the method used in problem 1 can be reused with minor modifications (one is storing the     * intermediary values). In this case, instead of going from 1 to number, we go backwards.     * @param number val we need to reach from 1 using fewest combo of given moves (*2, *3 or +1)     */    private static void problemTwo(int number){        int [] moves = new int[number+1];        moves[1]=0;        for(int i = 2; i < number+1; i++){            moves[i]=999999999;            int moveNum;            int a= 999999, b = 999999, c = 999999;            for(int j = 0; j < 3; j++){                if(j == 1 && i%2 == 0){                    if(i ==2){                        a=1;                    }                    else {                        moveNum = moves[i/2]+1;                        a= moveNum;                    }                }                else if(j ==2 && i%3 == 0){                    if(i ==3){                        b=1;                    }                    else {                        moveNum = moves[i/3]+1;                        b=moveNum;                    }                }                else {                    moveNum = moves[i-1]+1;                    c=moveNum;                }            }            moves[i] = Math.min(a, Math.min(b,c));        }        System.out.println(moves[number]);        ArrayList<Integer> path = new ArrayList <>();        path.add(number);        while(number > 1){            int div3Num = 999999 , div2Num = 999999, minus1Num = 999999;            if(number %2 == 0){                div2Num = moves[number/2]+1;            }            if(number %3 == 0){                div3Num=moves[number%3]+1;            }            minus1Num = moves[number-1]+1;            int min = Math.min(div3Num, Math.min(div2Num, minus1Num));            if (min == div3Num) {                number/=3;                path.add(number);            }            else if(min == div2Num){                number/=2;                path.add(number);            }            else {                number-=1;                path.add(number);            }        }        for(int i = path.size()-1; i >= 0; i--){            System.out.print(path.get(i) + " ");        }    }}