import java.io.*;
import java.util.Arrays;

import static java.lang.Math.round;

public class Q_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(N == 0) {
            wr.write("0");
            wr.flush();
            System.exit(0);
        }

        int[] difficult = new int[N];

        for(int i=0;i<N;i++) {
            difficult[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1) {
            wr.write(difficult[0]+"");
            wr.flush();
            System.exit(0);
        }

        Arrays.sort(difficult);

        long cut = round(N * (3.0/10.0) / 2.0);

        for(int i=0;i<cut;i++) {
            difficult[i] = -1;
        }

        for(int i=difficult.length - 1;i > difficult.length - 1 - cut; i--) {
            difficult[i] = -1;
        }

        long sum = 0;
        long index = 0;

        for(int i=0;i<N;i++) {
            if(difficult[i] != -1) {
                sum += difficult[i];
                index++;
            }
        }

        long result = round((double)sum / (double)index);
        wr.write(result+"");
        wr.flush();
    }
}
