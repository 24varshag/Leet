/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {

    // preorder
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) 
            return;

        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    // inorder
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorderHelper(root, list);
        return list;
        

    }
    
    private void inorderHelper(TreeNode node, List<Integer> arrayList){
        if (node == null) 
            return;
        if(node.left != null){
            inorderHelper(node.left,arrayList);
        }
        arrayList.add(node.val);
        System.out.println(node.val);

        if(node.right != null){
            inorderHelper(node.right, arrayList);
        }
    }

    // postorder
     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postorderHelper(root, list);
        return list;
    }
    
    private void postorderHelper(TreeNode node, List<Integer> arrayList){
         if (node == null) 
            return;
        if(node.left != null){
            postorderHelper(node.left, arrayList);
        }
        if(node.right != null){
            postorderHelper(node.right, arrayList);
        }
        arrayList.add(node.val);
        
    }

}
