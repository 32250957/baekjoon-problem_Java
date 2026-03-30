import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> score = new ArrayDeque<>();
        Deque<Integer> time = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int totalScore = 0;

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());

            if(check != 0) {
                score.push(Integer.parseInt(st.nextToken()));
                time.push(Integer.parseInt(st.nextToken())-1);

                if (time.peek() == 0) {
                    totalScore += score.poll();
                    time.poll();
                }
            }
            else {
                if (!time.isEmpty() && score.peek() != 0) {
                    int checkTime = time.poll() - 1;

                    if (checkTime == 0) {
                        totalScore += score.poll();
                    } else {
                        time.push(checkTime);
                    }
                }
            }
        }
        wr.write(totalScore+"");
        wr.flush();
    }
}
