package com.graphs;

/**
 * 
 * @author Santosh Goteti
 *
 */
public class KthLargest {

	public int findKthLargest(int[] nums, int k) {


		//Code for Quick Select Algorithm

		int high = nums.length-1;
		int n= nums.length-k;
		int low=0;

		while(low < high){
			int mid = partition(nums, low, high);

			if(n > mid){
				low = mid + 1;
			}
			else if (n < mid){
				high = mid - 1;
			}
			else 
				return nums[mid];
		}

		return nums[high];
	}

	int partition(int[] arr, int low, int high){

		int pivot=arr[high];
		int i=low;

		for(int j=low; j<arr.length; j++){
			if(arr[j] < pivot){

				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}


		int temp = arr[i];
		arr[i]=arr[high];
		arr[high]=temp;

		return i;

	}

}
