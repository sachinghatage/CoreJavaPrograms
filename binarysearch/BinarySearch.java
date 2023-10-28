package com.binarysearch;

public class BinarySearch {

	 static int low,high,key=3;
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		int binarySearch = binarySearch(a,low,high,key);
		System.out.println(binarySearch);
	}
	
	public static int binarySearch(int[] a,int low,int high,int key) {
		
		int mid=(low+high)/2;
		while(low<=high) {
			if(a[mid]<key) {
				low=mid+1;
			}else if(a[mid]==key) {
				return key;
			}else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		
		if(low>high) { return -1;}
		
		return 1;
	}

}
