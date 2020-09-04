package my.priya;

//Ref : - https://www.tutorialspoint.com/Java-program-to-print-Pascal-s-triangle

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PascalsTriangle {
    private int[][] mat;

    public PascalsTriangle(int size){
        this.mat = new int[size][size];
        createTriangle();
    }

    private void createTriangle() {
        for (int colCount = 0; colCount < this.mat[0].length; colCount++) {
            for (int rowCount = 0; rowCount < mat.length; rowCount++) {
                mat[colCount][rowCount] = 0;
            }
        }

        IntStream stream = Arrays.stream(mat).flatMapToInt(Arrays::stream);
        stream.forEach(e->System.out.println(e));


    }

    public static void main(String[] args){
        PascalsTriangle pt = new PascalsTriangle(5);
        pt.createTriangle();
    }
}