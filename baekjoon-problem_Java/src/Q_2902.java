import java.io.*;

public class Q_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String Line = br.readLine();
        String result = Line.charAt(0) + "";

        for(int i=0;i<Line.length();i++) {
            if(Line.charAt(i) == '-') {
                result = result + Line.charAt(i+1);
            }
        }

        wr.write(result);
        wr.flush();
    }
}
