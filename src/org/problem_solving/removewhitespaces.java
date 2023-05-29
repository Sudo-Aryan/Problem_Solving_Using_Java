package org.problem_solving;

public class removewhitespaces {

    static void removewhitespace(String test){
        String[] str = test.split("[ ]");
        for (String s : str) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        String test = "j a v a co der"; //print javacoder
        removewhitespace(test);
    }
}