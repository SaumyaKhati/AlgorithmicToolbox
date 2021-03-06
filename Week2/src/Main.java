import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for problem 1
        //int N = Integer.parseInt(br.readLine()); //use for problems 1,2, 6
//
//        if(N <=1){
//            System.out.println(N);
//        }
//        else{
//            problemOne(N);
//        }


        //for probem 2
//        if(N <=1){
//            System.out.println(N);
//        }
//        else{
//            problemTwo(N);
//        }


        //for problem 3
        //String [] info = br.readLine().split(" "); //use for problems 3,4,5
        //System.out.println(problemThree(Long.parseLong(info[0]), Long.parseLong(info[1])));


        //for problem 4
        //problemFour(Long.parseLong(info[0]), Long.parseLong(info[1]));


        //for problem 5
        //problemFive(Long.parseLong(info[0]), Long.parseLong(info[1]));


        //for problem 6
//        long num = Long.parseLong(br.readLine());
//        System.out.println(problemSix(num));


        //for problem 7
//        String[]info = br.readLine().split(" ");
//        long start = Long.parseLong(info[0]), end = Long.parseLong(info[1]);
//        System.out.println(problemSeven(start,end));

        //for problem 8
//        long num = Long.parseLong(br.readLine());
//        System.out.println(problemEight(num));

    }

//    private static long problemOne(int N){
//        long[] nums = new long[N+1];
//        nums[0]=0;
//        nums[1]=1;
//
//        for(int i = 2; i < N+1; i++){
//            nums[i] = nums[i-1]+nums[i-2];
//        }
//
//        return nums[N];
//    }
//
//    private static void problemTwo(int N){
//        long[] nums = new long[N+1];
//        nums[0]=0;
//        nums[1]=1;
//
//        for(int i = 2; i < N+1; i++){
//            nums[i] = (nums[i-1]+nums[i-2])%10;
//        }
//        System.out.println(nums[N]);
//    }


//    private static long problemThree(long a, long b){
//        if(b==0){
//            return a;
//        }
//        else {
//            return problemThree(b, a%b);
//        }
//    }

//    private static void problemFour(long a, long b){
//        for(long i = 1; i <= b; i++){
//            if((a*i)%b == 0){
//                System.out.println(a*i);
//                break;
//            }
//        }
//    }

//    private static void problemFive(long n, long m){
//
//        long prev = 0, curr = 1, next = prev + curr, period = 0;
//
//        for(int i = 0; i < m*m; i++){
//            next=(prev+curr)%m;
//            prev=curr;
//            curr=next;
//
//            if(prev==0 && curr == 1){
//                period = i+1;
//                break;
//            }
//        }
//
//        long num = n%period;
//
//
//        if(num<=1){
//            System.out.println(num);
//        }
//        else {
//            prev = 0;
//            curr = 1;
//
//            for(int i = 0; i < num; i++){
//                next=(prev+curr)%m;
//                prev=curr;
//                curr=next;
//            }
//            System.out.println(prev);
//        }
//    }

//    private static long problemSix(long n){
//        long remainder = (n+2)%60;
//        System.out.println("remainder = " + remainder);
//
//        if(remainder <=1){
//            if(remainder == 0){
//                remainder=9;
//            }
//            else{
//                remainder=0;
//            }
//        }
//        else{
//            long p = 0, c =1, next = p+c;
//
//            for(int i =0; i < remainder; i++){
//                next=(p+c)%10;
//                p=c;
//                c=next;
//            }
//
//            remainder=p%10-1;
//
//            if(remainder <0){
//                remainder=9;
//            }
//        }
//        return remainder;
//    }

//    private static long problemSeven(long start, long end){
//        int rOne, rTwo;
//
//        long remainder = start%60;
//        int a = 0, b = 1, c;
//
//        for(int i = 0; i < remainder; i++){
//            c= (a+b)%10;
//            a=b;
//            b=c;
//        }
//
//        rOne = a;
//        rTwo = b;
//
//         if(end-start == 0){
//             return rOne;
//         }
//
//        long sum = rOne;
//        long diff = (end-start)%60;
//
//        for(long i =0; i < diff; i++){
//            remainder=(rOne+rTwo)%10;
//            sum+=rTwo;
//            rOne=rTwo;
//            rTwo=(int)remainder;
//            sum%=10;
//        }
//
//        return sum;
//    }

//    private static long problemEight(long N){
//        long remainder=N%60;
//
//        long a =0, b = 1, c;
//
//        for(int i =0; i < remainder; i++){
//            c=(a+b)%10;
//            a=b;
//            b=c;
//        }
//
//        return (a*b)%10;
//    }
}
