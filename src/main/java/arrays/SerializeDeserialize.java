package arrays;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class SerializeDeserialize {

    // Serialize the tree into a string using BFS
    public String serialize(TreeNode root) {
        if (root == null) return "null";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr == null) {
                sb.append("null,");
                continue;
            }

            sb.append(curr.val).append(",");
            queue.offer(curr.left);
            queue.offer(curr.right);
        }

        return sb.toString();
    }

    // Deserialize the string back into a binary tree using BFS
    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;

        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (!values[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // Optional helper to print the tree in level order
    public void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                System.out.print(curr.val + " ");
                queue.offer(curr.left);
                queue.offer(curr.right);
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        SerializeDeserialize codec = new SerializeDeserialize();

        // Build sample tree: [1,2,3,null,null,4,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialized = codec.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        TreeNode deserialized = codec.deserialize(serialized);
        System.out.print("Deserialized Tree (Level Order): ");
        codec.printTree(deserialized);
    }
}
