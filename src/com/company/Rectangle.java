package com.company;

public class Rectangle implements Comparable<Rectangle> {
    int x;
    int y;
    int number;

    Rectangle(int x, int y, int number) {
        this.x =x>y?y:x ;
        this.y = x>y?x:y;
        this.number=number;
    }

    @Override
    public int compareTo(Rectangle r) {
        if (this.x > r.x && this.y > r.y|| r.y==this.y && this.x>r.x)
            return 1;
        else if (this.x < r.x && this.y < r.y|| r.y==this.y && this.x<r.x)
            return -1;
        else
            return 0;
    }

    void swap(){
        int temp=x;
        x=y;
        y=temp;
    }
}
