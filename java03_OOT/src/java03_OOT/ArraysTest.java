package java03_OOT;

import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays : �迭���� ó�� Ŭ����
		int[] data = {15,90,45,75,26,30,10,20,30,10,20,40};
		Arrays.sort(data);
		//Arrays.sort(data, 2, 5); // 2 3 4 
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		new ArraysTest();

	}

}
