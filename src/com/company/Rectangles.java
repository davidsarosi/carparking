package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangles {

    ArrayList <Rectangle> rectangles=new ArrayList<>();

    void add(Rectangle r){
        rectangles.add(r);
    }

    void sort(){
        Collections.reverse(rectangles);
    }


    }

