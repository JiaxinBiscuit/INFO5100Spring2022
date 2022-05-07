import java.util.PriorityQueue;
import java.util.Queue;

public class Question5 {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0){
            return -1;
        }

        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i< nums.length ; i++){
            if(minHeap.size() < k){
                minHeap.offer(nums[i]);
            } else if(minHeap.peek() < nums[i]){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.poll();
    }
}
