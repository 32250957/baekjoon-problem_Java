import java.io.*;
import java.util.StringTokenizer;

public class Q_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];

        for(int i=0;i<N;i++) {
            String input = br.readLine();

            for(int j=0;j<M;j++) {
                chess[i][j] = input.charAt(j);
            }
        }

        char[][] test1 = new char[8][8];
        char[][] test2 = new char[8][8];

        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    test1[i][j] = 'B';
                    test2[i][j] = 'W';
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    test1[i][j] = 'W';
                    test2[i][j] = 'B';
                }
                else if (i % 2 == 0) {
                    test1[i][j] = 'W';
                    test2[i][j] = 'B';
                }
                else {
                    test1[i][j] = 'B';
                    test2[i][j] = 'W';
                }
             }
        }

        int cnt1 = 128;
        int cnt2 = 128;

        for(int i=0;i<=N-8;i++) {
            for(int j=0;j<=M-8;j++) {
                int save1 = 0, save2 = 0;
                for(int r=0;r<8;r++) {
                    for(int c=0;c<8;c++) {
                        if(test1[r][c] != chess[i+r][j+c]) {
                            save1++;
                        }
                        if(test2[r][c] != chess[i+r][j+c]) {
                            save2++;
                        }
                    }
                }

                if(cnt1 > save1) {
                    cnt1 = save1;
                }
                if(cnt2 > save2) {
                    cnt2 = save2;
                }
            }
        }

        if(cnt2 > cnt1) {
            wr.write(cnt1+"");
        }
        else {
            wr.write(cnt2+"");
        }
        wr.flush();
    }
}