import java.io.*;

public class Q_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            String input = br.readLine();
            char[] arr = new char[input.length()];

            for(int j=0;j<input.length();j++) {
                char slice = input.charAt(j);
                if(slice < '0' || slice > '9') {

                }
            }
        }
    }
}
