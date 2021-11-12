package com.HT;

public class BinaryTree {
    Node root;

    public void add(Integer i){
        if (root==null){
            root = new Node();
        }
        root.add(i);
    }
    public void printLeftToRight(){
        root.printLeftToRight();
    }
}

