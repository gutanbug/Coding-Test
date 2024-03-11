import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();
            if (a.equals("0") && b.equals("0")) {
                break;
            }
            bw.write((Integer.parseInt(a) + (Integer.parseInt(b))) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}