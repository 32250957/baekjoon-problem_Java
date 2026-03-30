import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Q_12873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=N;i++) {
            queue.offer(i);
        }

        int phase = 1;
        while(true) {
            for(int i=0;i < phase * phase * phase;i++) {
                if (i == phase * phase * phase - 1) {
                    if (queue.size() == 1) {
                        wr.write(queue.poll() + "");
                        wr.flush();
                        System.exit(0);
                    } else {
                        queue.poll();
                    }
                }
                else {
                    queue.offer(queue.poll());
                }
            }
            phase++;
        }
    }
}
