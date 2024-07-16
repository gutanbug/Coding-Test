import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Deque<Node> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > val) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, val));

            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            sb.append(deque.peekFirst().value).append(" ");
        }
        System.out.println(sb);
    }

    static class Node {
        private final int index;
        private final int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
