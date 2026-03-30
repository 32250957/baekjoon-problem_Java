import java.io.*;

public class Q_3765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while((input = br.readLine()) != null) {
            wr.write(input);
        }

        wr.flush();
    }
}
