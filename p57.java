import java.util.HashSet;
import java.util.PriorityQueue;

public class p57 {
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 7, 7, 5};
        int k=2;
        findKthLargest(arr,k);
    }
    public static void findKthLargest(int []arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        HashSet<Integer> set=new HashSet<>();
        for(int v:arr){
            if(!set.contains(v)) {
                set.add(v);
                pq.add(v);
            }
            if(pq.size()>k)
                pq.poll();
        }
        System.out.println(pq.peek());
    }
}
