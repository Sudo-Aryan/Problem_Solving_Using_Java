package org.problem_solving;

public class Brasenham_Line {

    void BLDA(int x1, int y1, int x2, int y2){
        int dx,dy;
        dx = x2 - x1;
        dy = y2 - y1;
        float slope = (float) (dy / dx);
        if(slope < 1){
            int Pk = (2 * dy) - dx;

        }
        else{
            System.out.println("Error: The slope is negative!!!");
        }
    }

    public static void main(String[] args){

    }
}
