package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 1 ; i <= N ; i++) q.offer(i);

        while(q.size() > 1){
            for(int i = 1 ; i < K;i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");

        System.out.println(sb);
    }
}
