package trees;

public class tree_dll {

    void inorder(Tnode root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }
    void preorder(Tnode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public Tnode insertIntoBST(Tnode root, int val) {
        if(root == null){
            return new Tnode(val);
        }
        if(val > root.val)
            root.right = insertIntoBST(root.right,val);
        else
            root.left =  insertIntoBST(root.left,val);
        return root;

    }

    public Tnode searchBST(Tnode root, int val) {
        if(root == null || val == root.val){
            return root;
        }
        if(val < root.val){
            return searchBST(root.left,val);
        }
        return searchBST(root.right,val);
    }


}
class Tnode{
    int val;
    Tnode left;
    Tnode right;
    Tnode(int data){
        this.val = val;
        left = right = null;
    }
}