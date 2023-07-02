import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/** 
 * https://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0001&lang=ja
 * の問題の回答
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>(); 
            for (var i = 0; i < 10; i++) {
                list.add(scan.nextInt());
            }

            list.stream().sorted(Comparator.reverseOrder()).limit(3).forEachOrdered((e) -> System.out.println(e));
        }
    }
}
