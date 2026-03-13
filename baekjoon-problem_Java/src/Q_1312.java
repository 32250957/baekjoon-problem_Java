import java.io.*;
import java.util.StringTokenizer;
import java.math.*;

public class Q_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal A = BigDecimal.valueOf(Long.parseLong(st.nextToken()));
        BigDecimal B = BigDecimal.valueOf(Long.parseLong(st.nextToken()));

        int N = Integer.parseInt(st.nextToken());

        BigDecimal C = A.divide(B, N, RoundingMode.DOWN);
        String result = String.valueOf(C);

        wr.write(result.charAt(result.length()-1)+"");
        wr.flush();
    }
}