package com.HT;



public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        int[] data = {5,1,4,77,13,56,22,5};
        for (int  i : data){
            bt.add(i);
        }
       bt.printLeftToRight();
    }
}
