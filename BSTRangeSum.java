//938. Range Sum of BST
//Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

//Example 1:
//
//
//Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//Output: 32
//Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
//Example 2:
//
//
//Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//Output: 23
//Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 2 * 104].
//1 <= Node.val <= 105
//1 <= low <= high <= 105
//All Node.val are unique.

import java.util.Stack;

public class BSTRangeSum {
    TreeNode root;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
          }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if(root.val >= low && root.val <= high) {
                    sum += root.val;
                }
                root = root.right;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BSTRangeSum bstRangeSum = new BSTRangeSum();
        bstRangeSum.root = new TreeNode(10);
        bstRangeSum.root.left = new TreeNode(5);
        bstRangeSum.root.left.left = new TreeNode(3);
        bstRangeSum.root.left.right = new TreeNode(7);
        bstRangeSum.root.right = new TreeNode(15);
        bstRangeSum.root.right.right = new TreeNode(18);

        System.out.println(bstRangeSum.rangeSumBST(bstRangeSum.root, 7, 15));
    }
}
