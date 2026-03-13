import java.io.*;
import java.rmi.StubNotFoundException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=1;i<L+1;i++) {
            String stuNum = br.readLine();

            if(!hashMap.containsKey(stuNum)) {
                hashMap.put(stuNum, i);
            }
        }

        int T = 0;
        int count = 0;
        while(true) {
            if(hashMap.containsValue(T)) {
               // wr.write(hashMap.(T)+"\n");
                count++;
            }

            if(count == K) {
                break;
            }
            T++;

        }
        wr.flush();
    }
}
