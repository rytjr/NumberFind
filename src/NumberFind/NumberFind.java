package NumberFind;

import java.util.*;
import java.io.*;

public class NumberFind {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int Num = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[Num];
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i < Num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int Num2 = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		
		int[] arr2 = new int[Num2];
		
		for(int i = 0; i < Num2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < Num2; i++) {
			rec(arr, 0, Num -1, arr2[i]);
		}
	}
	public static void rec(int[] arr, int start, int end, int N) {
		
		int middle = (start + end) / 2;
		
		if(start > end) {
			System.out.println(0);
			return;
		}
		
		if(arr[middle] ==  N) {
			System.out.println(1);
			return;
		}
		if(arr[middle] < N) {
			rec(arr, middle + 1, end, N);
		}
		else {
			rec(arr, start, middle - 1, N);
		}
		
	}

}
