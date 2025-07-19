package com.java.dsa.BT;

public class DepthHeight {
    Node root;
    public int add(Node node){
        if (node==null){
            return 0;
        }
        int lh=add(node.left);
        int rh=add(node.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {


    }
}
