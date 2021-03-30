import java.util.*;

/**
 * @author bitye
 * @data 2020/2/18
 * @time 18:17
 */
public class Main {
    static class Node {
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        boolean isTail;
        int[] numbers = new int[2];
        String[] str;
        List<Node> points = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            isTail = true;
            str = scan.nextLine().split(" ");
            numbers[0] = Integer.parseInt(str[0]);
            numbers[1] = Integer.parseInt(str[1]);
            if (points.isEmpty()) {
                points.add(new Node(numbers[0], numbers[1]));
            } else {
                for (int j = 0; j < points.size(); j++) {
                    if (numbers[0] > points.get(j).x) {
                        points.add(j, new Node(numbers[0], numbers[1]));
                        isTail = false;
                        break;
                    }
                }
                if (isTail) {
                    points.add(new Node(numbers[0], numbers[1]));
                }
            }

        }

        Node[] nodes = new Node[N];
        int len = 0;
        for (Node node : points) {
            nodes[len] = node;
            len++;
        }
        int maxy = nodes[0].y;
        len = 1;

        for (int i = 1; i < N; i++) {
            if (nodes[i].y > maxy) {
                maxy = nodes[i].y;
                nodes[len] = nodes[i];
                len++;
            }
        }

        for (int i = len - 1; i >= 0; i--) {
            System.out.printf("%d %d\n", nodes[i].x, nodes[i].y);
        }
    }
}
