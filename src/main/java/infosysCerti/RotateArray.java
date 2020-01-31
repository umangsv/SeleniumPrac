package infosysCerti;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {


		int[][] originalArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for (int i = 0; i < originalArray.length; i++) {
			
			for (int j = 0; j < originalArray[i].length; j++) {
			
				System.out.print(originalArray[i][j]);
			}
			System.out.println();
		}
		
		extractRing(originalArray, 0);
		
	}
	
	public static List<Integer> extractRing(int[][] array, int ringIndex) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int i = ringIndex;  // i = 0
		int j = ringIndex; // j = 0
		
		while (j<array[i].length) { // j<3 i.e. 0,1,2
			list.add(array[i][j]);
			j++; // j = 3
		}
		j--; // j =2
		i++; // i = 1
		
		while (i<array.length) {
			list.add(array[i][j]);
			i++;
		}
		i--;
		j--;
		
		while (j>=ringIndex) {
			list.add(array[i][j]);
			j--;
		}
		j++;
		i--;
		
		while (i>ringIndex) {
			list.add(array[i][j]);
			i--;
		}
		
		
		System.out.println(list);
		
		return null;
		
	}
	
	

}
