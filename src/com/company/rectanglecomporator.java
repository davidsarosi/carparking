package com.company;

import java.util.Comparator;

public class rectanglecomporator implements Comparator<Rectangle> {


    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.y > o2.y || o2.y == o1.y && o1.x > o2.x)
            return -1;
        else if (o1.y < o2.y || o1.x < o2.x)
            return 1;
        else
            return 0;
    }
}
