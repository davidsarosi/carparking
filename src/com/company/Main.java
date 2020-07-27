package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> input = new ArrayList<>();

            String line = null;
            try {
                line = br.readLine();
                input.add(line);
                line = br.readLine();
                input.add(line);
                for(int i=0;Integer.parseInt(input.get(1))>i;i++){
                    line = br.readLine();
                    input.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] a;
        a = input.get(0).split("\t");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        PLot plot = new PLot(x, y);

        input.remove(0);
        input.remove(0);

        int number=1;
        Rectangles rectangles=new Rectangles();
        for(String t:input){
            a=t.split("\t");
            Rectangle r=new Rectangle(Integer.parseInt(a[0]),Integer.parseInt(a[1]),number);
            number++;
            rectangles.add(r);
        }
        Collections.sort(rectangles.rectangles,new rectanglecomporator());
        for (int something = 0; rectangles.rectangles.size() > something; something++) {
            Rectangle r = rectangles.rectangles.get(something);
            plot.add(r);
        }
        for (int k = 0; k < plot.maxx; k++)
            for (int i = 0; i < plot.maxy; i++) {
                System.out.print(plot.matrix[i][k]);
                if ((i + 1) % plot.maxx == 0 && i != 0)
                    System.out.print("\n");
                else
                    System.out.print("\t");
            }
    }
}
