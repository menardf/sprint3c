/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 4/5/18
 * Time: 10:59 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */



class Node {
    Node left;
    Node right;
    int data;

    public Node( int data){
        this(data,null,null);
    }
    public Node(int data,Node left,Node right){
        this.data=data;
        this.left= left;
        this.right= right;
    }
}

public class binarysearch {
    Node root;
    public void Insert(int value ){
        if(root==null) root= new Node(value);
        else
            Insert(value,root);


        }

    private void Insert(int value , Node latestroot){
        if (latestroot.data>value){
            if(latestroot.left==null)
                latestroot.left=new Node(value);
            else
                Insert(value,latestroot.left);
        }
        else {
            if (latestroot.data < value) {
                if (latestroot.right == null) latestroot.right = new Node(value);
                else Insert(value, latestroot.right);
            }
        }


    }
    public void preOrder() {
        System.out.print("preOrder:");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if (root != null) {

            System.out.print(root.data + " ");
            preOrder(root.left());
            preOrder(root.right());

        }
    }

    public void inOrder() {
        System.out.print("inOrder:");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if (root != null) {


            inOrder(root.left());
            System.out.print(root.data + " ");
            inOrder(root.right());
        }
    }
    public void postOrder() {
        System.out.print("postOrder:");
        preOrder(root);
        System.out.println();
    }

    private void postOrder(Node root) {
        if (root != null) {


            postOrder(root.left());
            postOrder(root.right());
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args){
        binarysearch t=new binarysearch();
        t.Insert(47);
        t.Insert(32);
        t.Insert(59);
        t.Insert(62);
        t.Insert(21);
        t.preOrder();
        t.inOrder();
        t.postOrder();
    }
}
