package com.HT;

public class Node {
    private Integer data;
    private Node left;
    private Node right;


    public Integer getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }


    public void add(Integer i) {

        if (data == null) {
            this.data = i;
        } else if (data > i) {
            if (left == null) {
                left = new Node();
            }
            getLeft().add(i);

        } else {
            if (right == null) {
                right = new Node();
            }
            getRight().add(i);
        }
    }


    public void printLeftToRight() {
        if (left != null) {
            getLeft().printLeftToRight();
        }
        System.out.print(getData() + " ");

        if (right != null) {
            getRight().printLeftToRight();
        }

    }

}
