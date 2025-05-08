package arrays;

import java.util.*;

public class MedianDataStream {
        // Max-heap for lower half
        private PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        // Min-heap for upper half
        private PriorityQueue<Integer> right = new PriorityQueue<>();
    
        public MedianDataStream() {
            // Constructor initializes empty heaps
        }
    
        public void addNum(int num) {
            // Add to max-heap first
            left.offer(num);
    
            // Balance: move the largest from left to right
            right.offer(left.poll());
    
            // Rebalance if needed: left can have at most 1 more element than right
            if (right.size() > left.size()) {
                left.offer(right.poll());
            }
        }
    
        public double findMedian() {
            if (left.size() > right.size()) {
                return left.peek();  // Odd number of elements
            } else {
                return (left.peek() + right.peek()) / 2.0;  // Even number of elements
            }
        }
    
        public static void main(String[] args) {
            MedianDataStream mf = new MedianDataStream();
            mf.addNum(1);
            mf.addNum(2);
            System.out.println("Median: " + mf.findMedian());  // 1.5
            mf.addNum(3);
            System.out.println("Median: " + mf.findMedian());  // 2
            mf.addNum(4);
            System.out.println("Median: " + mf.findMedian());  // 2.5
        }
    }
    