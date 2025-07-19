package com.java.dsa.BT;

public class TraversalBST {
    Node root;
    public void PreOrder(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ,");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void PostOrder(Node node){
        if (node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ,");
    }
    public void InOrder(Node node){
        if (node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+" ,");
        InOrder(node.right);
    }

    public static void main(String[] args) {
        TraversalBST bst=new TraversalBST();
        bst.root = new Node(100);
        bst.root.left = new Node(20);
        bst.root.right = new Node(200);
        bst.root.left.left = new Node(10);
        bst.root.left.right = new Node(30);
        bst.root.right.left = new Node(150);
        bst.root.right.right = new Node(300);

        System.out.print("Preorder Traversal: ");
        bst.PreOrder(bst.root);
        System.out.println();
        System.out.print("PostOrder Traversal: ");
        bst.PostOrder(bst.root);
        System.out.println();
        System.out.print("InOrder Traversal: ");
        bst.InOrder(bst.root);

    }
}
