package datastructure;

/**
 * Created by Pranav on 29/04/16.
 */
public class TreeInorder {

    /* you only have to complete the function given below.
Node is defined as*/

class Node {
    int data;
    Node left;
    Node right;
}
    void inOrder(Node root) {

        if(root == null)
            return;

        if(root.left != null)
            inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right!=null)
            inOrder(root.right);
    }
}
