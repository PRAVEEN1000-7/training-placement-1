import java.util.*;
public class test {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Deque<Integer> deque = new ArrayDeque<>();
       int n = in.nextInt();
       int m = in.nextInt();
       
       HashMap<Integer, Integer> map = new HashMap<>();
       int max = 0;

       for (int i = 0; i < n; i++) {
           int num = in.nextInt();
           
           deque.addLast(num);
           if (map.containsKey(num)) {
               map.put(num, map.get(num) + 1);
           } else {
               map.put(num, 1);
           }
           
           if (deque.size() == m) {
               max = Math.max(max, map.size());
               
               int first = deque.removeFirst();
               map.put(first, map.get(first) - 1);
               if (map.get(first) == 0) {
                   map.remove(first);
               }
           }
       }
       
       System.out.println(max);
   }
}
