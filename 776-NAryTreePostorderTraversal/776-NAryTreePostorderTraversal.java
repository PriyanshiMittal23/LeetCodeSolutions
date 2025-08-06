// Last updated: 6/8/2025, 11:10:21 pm
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ans=new ArrayList<>();
        post(root);
        return ans;
    }
    List<Integer>ans;
    public void post(Node root){
        if(root==null){
            return;
        }
        for(Node nn:root.children){
            post(nn);
        }
        ans.add(root.val);
    }
}