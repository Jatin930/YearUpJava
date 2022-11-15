package com.yearup.week4.homework;

import com.yearup.week4.code.linkedlist.SinglyLinkedList;

public class HomeWork {

    public static void generateTable(int n){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " X " + i +" = " + n*i);
        }
    }

    //Given a string, return the reversed char array of it


    /**
     * takes a String input and returns a char array of reversed string
     * @param input
     * @return
     */
    public static char[] reverseString(String input) {
        int c = 0;

        char[] out = new char[input.length()];
        for (int i = input.length()-1 ; i >= 0; i--) {
            out[c++] = input.charAt(i);
        }
        return out;
    }

    /**
     * returns true if element is contained in the array else false
     * @param arr
     * @param element
     * @return
     */
    public static boolean containsElement(int[] arr, int element){
        return false;
    }

    /**
     * returns the sum of primary diagonal of given 2d int array n*n
     * @param arr
     * @return
     */
    public static int diagonalSumOfArray(int[][] arr){
        return 0;
    }

    /**
     *
     * @param arr player X ,player O
     * @return X, O or D for draw
     */
    public static char ticTacToeWinner(char[][] arr){
        return 0;
    }
    /**
     * returns the array with duplicates removed
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr){
        return null;
    }

    /**
     * returns the reversed linked list
     * @param input
     * @return
     */
    public static SinglyLinkedList<Integer> reverseLinkedList(SinglyLinkedList<Integer> input){
        return null;
    }

    /**
     * implement this interface to create your own arraylist
     */
    interface MyArrayList{
        int size();
        void add(int element);
        int remove(int pos);
    }

    public static void main(String[] args) {
        //generateTable(13);
        System.out.println(HomeWork.reverseString("Emanuel"));
    }
}
