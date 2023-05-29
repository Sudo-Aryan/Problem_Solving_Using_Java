package org.problem_solving;

import java.util.Scanner;
public class LineDDA {

    void DDA(int x1, int y1, int x2, int y2){

        int dx,dy,steps;
        float xinc,yinc,x,y;
        dx = x2 - x1;
        dy = y2 - y1;
        if(dx > dy){
            steps = dx;
        } else {
            steps = dy;
        }
        xinc = dx / (float) steps;
        yinc = dy / (float) steps;
        x = x1;
        y = y1;
        for(int i = 0; i < steps; i++){
            {
                x = (x + xinc);
                y = (y + yinc);
                System.out.println("(" + Math.round(x) + "," + Math.round(y) + ")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting coordinates: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the ending coordinates: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        LineDDA obj = new LineDDA();
        obj.DDA(x1, y1, x2, y2);
    }
}
