package my.priya;

import java.util.ArrayList;

public class DynamicMatrixStud
{
    public static void main(String args[])
    {
        System.out.println("\nDynamic Matrix 80, 100, & 105 POINT VERSION\n");

        Matrix<Integer> m1 = new Matrix<Integer>();
		m1.displayMatrix("Matrix m1 Display");
		System.out.println();

		Matrix<Integer> m2 = new Matrix<Integer>(3,5);
		m2.displayMatrix("Matrix m2 Display");
		System.out.println();
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(r); c++)
			{
				m2.setValue(r,c,new Integer(count));
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 Display");
		System.out.println();

		Matrix<Integer> m3 = new Matrix<Integer>(3,5, new Integer(100));
		m3.displayMatrix("Matrix m3 Display");
		System.out.println();

		Matrix<Integer> m4 = new Matrix<Integer>(4);
		m4.displayMatrix("Matrix m4 Display");
		System.out.println();

		System.out.println("number of values in m4 is " + m4.getSize());

        System.out.println("m4 values are");
        for(int r = 0; r < m4.getRows(); r++)
		{
			for (int c = 0; c < m4.getCols(r); c++)
				System.out.print(m4.getValue(r,c) + "   ");
			System.out.println();
		}


	// 100 point version below

		m2.resize(3,2);
		m2.displayMatrix("Matrix m2 Display");
		System.out.println();

		m2.resize(5,6);
		m2.displayMatrix("Matrix m2 Display");
		System.out.println();

            // 105 point version below

		m4.resize(3);
		m4.displayMatrix("Matrix m4 Display");
		System.out.println();

		m4.resize(5);
		m4.displayMatrix("Matrix m4 Display");
		System.out.println();

    }

}

