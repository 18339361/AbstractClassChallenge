package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //using tree

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

//      String stringData = "5 7 3 9 8 2 1 0 4 6";

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s: data){
            //create new item with the value set to the string s
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        //*****************************************************//

        //using linkedlist

//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String stringData = "5 7 3 9 8 2 1 0 4 6";
//
//        String[] data = stringData.split(" ");
//        for(String s: data){
//            //create new item with the value set to the string s
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
    }
}
