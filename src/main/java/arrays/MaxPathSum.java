package arrays;

import java.util.PriorityQueue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class MaxPathSum {

    public static int maxPathSum(TreeNode root) {
        // Min-heap of size 1 to track the max path sum
        PriorityQueue<Integer> maxPath = new PriorityQueue<>(1);
        maxPath.add(Integer.MIN_VALUE);

        dfs(root, maxPath);
        return maxPath.peek();
    }

    private static int dfs(TreeNode node, PriorityQueue<Integer> maxPath) {
        if (node == null) return 0;

        // Recurse on left and right, but drop negative sums (they hurt max path)
        int leftGain = Math.max(dfs(node.left, maxPath), 0);
        int rightGain = Math.max(dfs(node.right, maxPath), 0);

        // Current path sum including this node as a bridge
        int currentPathSum = node.val + leftGain + rightGain;

        // Update max in heap
        if (currentPathSum > maxPath.peek()) {
            maxPath.poll();
            maxPath.offer(currentPathSum);
        }

        // Return max gain if continuing the path upwards
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {
        // Test case: Input [1,2,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("Max Path Sum: " + maxPathSum(root));  // Output: 6
    }
}
