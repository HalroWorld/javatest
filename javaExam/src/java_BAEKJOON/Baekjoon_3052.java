package java_BAEKJOON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_3052 {
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr = new boolean[42];
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine())] = true;	
		}
		
		int count =0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}
}
