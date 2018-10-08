package com.thinking.sort;

import java.util.Arrays;

/**
 * @Author:caoj
 * @Date:2018/08/22
 * @version:v1.0
 * @Description: 排序练习
 */
public class SortTest {

	public static void main(String[] args) {
		// 直接插入排序
		int[] arr = new int[] { 1, 56, 34, 67, 58, 84, 5 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	/**
	 * 插入排序
	 *
	 * 1. 从第一个元素开始，该元素可以认为已经被排序. 
	 * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描. 
	 * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置. 
	 * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置. 
	 * 5. 将新元素插入到该位置后.
	 * 6. 重复步骤2~5.
	 * 
	 * @param arr 待排序数组
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
//			System.out.println("i=" + i);
			for (int j = i + 1; j > 0; j--) {
//				System.out.println("j=" + j);
				if (arr[j - 1] <= arr[j]) {
					break;
				}
				int temp = arr[j]; 
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				
//				arr[j] = arr[j] ^ arr[j -1];
//				arr[j - 1] = arr[j] ^ arr[j - 1];
//				arr[j] = arr[j] ^ arr[j -1];
//				System.out.println("Sorting:  " + Arrays.toString(arr));
			}
		}
	}

}
