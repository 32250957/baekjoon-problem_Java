import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        boolean check = true;
        int maxValue = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if(input  == 0) {
                break;
            }

            if(maxValue < input) {
                maxValue = input;
            }

            list.add(input);
        }

        if(list.size() == 1 && list.get(0) == 0) {
            check = false;
        }

        if(check) {
            int N = maxValue * 2;


            int[] num = new int[N+1];
            for (int i = 0; i < N + 1; i++) {
                num[i] = i;
            }

            for (int i = 2; i <= (int) Math.sqrt(N); i++) {
                for (int j = i * i; j < N + 1; j += i) {
                    if (num[j] != 0) {
                        num[j] = 0;
                    }
                }
            }

            for(int i : list) {
                int count = 0;
                for(int j = i+1;j<=2*i;j++) {
                    if(num[j] != 0) {
                        count++;
                    }
                }
                wr.write(count+"\n");
            }

            wr.flush();
        }

    }
}
