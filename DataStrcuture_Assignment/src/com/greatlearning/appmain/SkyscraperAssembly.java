package com.greatlearning.appmain;
import java.util.*;
public class SkyscraperAssembly{
	static class FloorComparator implements Comparator<Integer>{
		public int compare(Integer obj1, Integer obj2) {
			return obj1 < obj2 ? 1 : -1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building ");
		int n = sc.nextInt();
		int max = n;
		int arr[] = new int[n];	
		Queue<Integer> q = new PriorityQueue<Integer>(new FloorComparator());
		for(int i = 0; i<n; i++) {
			int day = i;
			day++;
			System.out.println("enter the floor size given on day : " + day);
			arr[i] = sc.nextInt();
		}
		System.out.println("The order of construction is as follows");
		for(int j = 0; j<arr.length; j++) {
			int day = j;
			day++;
			q.add(arr[j]);
			System.out.println("Day " + day);
			while(!q.isEmpty() && q.peek()==max) {
			System.out.print(q.poll() + " ");
			max--;
		    }
			System.out.println();
		}
		sc.close();
	}
	
}

