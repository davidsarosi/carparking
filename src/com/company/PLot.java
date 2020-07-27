package com.company;

public class PLot {
    int[][] matrix;
    int maxx = 0;
    int maxy = 0;

    PLot(int x, int y) {
        maxx = x;
        maxy = y;
        matrix = new int[x][y];
        for (int i = 0; i < x; i++)
            for (int k = 0; k < y; k++)
                matrix[i][k] = 0;
    }

    void add(Rectangle r) {
        boolean placed=false;


            for (int i = 0; i < maxx && !placed; i++)
                for (int k = 0; k < maxy&& !placed; k++)
                    if (matrix[i][k] == 0 && fit(i, k, r)) {
                        fill(i, k, r);
                        placed=true;
                        break;
                    }
            if (!placed){
                        r.swap();
                        for (int e = 0; e < maxx&& !placed; e++)
                            for (int f = 0; f < maxy&& !placed; f++)
                                if (matrix[e][f] == 0 && fit(e, f, r)) {
                                    fill(e, f, r);
                                    placed=true;
                                    break;
                                }
                    }



    }

    void fill(int sx, int sy, Rectangle r) {
        for (int i = 0; r.x > i; i++) {
            for (int k = 0; r.y > k; k++)
                matrix[sx + i][sy + k] = r.number;
        }

    }

    boolean fit(int x, int y, Rectangle r) {
        if ((x + r.x > maxx || y + r.y > maxy))
            return false;
        for (int i = 0; r.x > i; i++) {
            for (int k = 0; r.y > k; k++)
                if (matrix[x + i][y + k] != 0)
                    return false;
        }
        return true;
    }
}
