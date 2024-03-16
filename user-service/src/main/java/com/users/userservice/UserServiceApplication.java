package com.users.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		
		
//		MyThread thread = new MyThread();
//		thread.start();
//		thread.start();

		// reverse array
//		
//		int[] arr = {1,2,3,4,5,6,7,8};
//		int temp;
//		
//		for(int i=0; i<arr.length-i-1; i++) {
//			temp = arr[i];
//			arr[i] = arr[arr.length-i-1];
//			arr[arr.length-i-1] = temp;
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//		
//		

		// bubbal sort

//		int[] arr = { 3, 2, 4, 9, 5, 4, 3, 1, 4, 6, 6, 0 };
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = afrr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
		
		
		// small char to capital
		
//		String str = "afdADSDFfdshg";
//		char[] chr = str.toCharArray();
//		char temp;
//		for(int i=0; i<chr.length; i++) {
//			
//			int assci = (int)chr[i];
//			if(assci>97) {
//				chr[i] = (char) (assci-32);
//			}else {
//				chr[i] = (char) (assci+32);
//			}
//		
//		}
//		
//		for(int i=0; i<chr.length; i++) {
//			System.out.println(chr[i]);
//		}	
		
		
		
		
		//remove duplicate element in the array
		
		int[] arr = {0,0,2,1,1,2,3,4,5,4,5,6,7};
		int count = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			boolean isDublicate = true;
//			for(int j= i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					isDublicate = false;
//					break;
//				}
//			}
//			if(isDublicate) {
//				count++;
//			}
//		}
		
//		int[] newArra = new int[arr.length];
//		int index=0;
//		for(int i=0; i<arr.length; i++) {
//			boolean isDublicate = false;
//			for(int j= 0; j<index; j++) {
//				if(arr[i]==newArra[j]) {
//					isDublicate = true;
//					break;
//				}
//			}
//			if(!isDublicate) {
//				newArra[index++] = arr[i];
////				index++;
//			}
//		}
//		
//		
//		for(int i=0; i<index; i++) {
//			System.out.print(newArra[i]);
//		}
//		System.out.println(count);
		
		
	}

}

