import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long [] numbers=  new long[N];
        String [] line = br.readLine().split(" ");

        for(int i = 0; i< N; i++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(numbers);
        System.out.println(numbers[N-1]*numbers[N-2]);
    }
}
