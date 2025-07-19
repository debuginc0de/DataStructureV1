package com.java.dsa.BST;

public class OperationsBST {

    //Search BST

    public Node RSearch(Node node, int key){
        if (node==null){
            return null;
        }
        if (key==node.data){
            return node;
        } else if (key< node.data) {
            return RSearch(node.left,key);
        }
        else {
            return RSearch(node.right,key);
        }
    }

    //Insert BST

    public Node InsertIntoBST(Node node,int val){
        if (node==null)return new Node(val);
        Node cur=node;
        while (true){
            if (cur.data<=val){
                if (cur.right!=null)cur=cur.right;
                else {
                    cur.right=new Node(val);
                    break;
                }
            }else {
                if (cur.left!=null)cur=cur.left;
                else {
                    cur.left=new Node(val);
                    break;
                }
            }
        }
        return node;
    }
}
