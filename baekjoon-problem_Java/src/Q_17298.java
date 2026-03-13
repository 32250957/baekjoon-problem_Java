import java.io.*;
import java.util.StringTokenizer;

public class Q_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstData = Integer.parseInt(st.nextToken());
        for(int i=0;i<N-1;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=0;i<N;i++) {
            if(firstData < arr[i]) {
                for(int j=0;i<count;j++) {
                    wr.write(arr[i]+" ");
                }
                firstData = arr[i];
            }
            //else
        }
    }
}
