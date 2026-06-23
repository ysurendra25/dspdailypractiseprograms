package DSApackage;

import java.util.Scanner;

public class RandomTask {
   public static int[] filterPrime(int[] arr1) {
	   
	   int arr2[] = new int[arr1.length];
	   int store_place = 0;
	   for(int i=0;i<arr1.length;i++) {
		   if(arr1[i]==0 || arr1[i]==1) {
			   continue;
		   }
		   else if(arr1[i]>=2 && arr1[i]<10000000)
		   {
			   int count = 0;
			   for(int j=2;j<arr1[i]-1;j++) {
				   if(arr1[i]%j==0) {
					   count++;
				   } else {
					   continue;
				   }
			   }
			   if(count==0) {
				   arr2[store_place]=arr1[i];
				   store_place=store_place+1;
				   
			   }
		   }
		  
	   }
	   int result[] = new int[store_place];
       for (int k = 0; k < store_place; k++) result[k] = arr2[k];
       return result;
   }
   
   public static int[] square_primes(int[] primes) {
	   int squared[] = new int[primes.length];
	   for(int i=0;i<primes.length;i++) {
		   squared[i]=primes[i]*primes[i];
	   }
	   return squared;
   }
   
   public static int[] sumof_squared_num(int[] squared) {
	   
	   int arrz[] = new int[squared.length];
	   int length = 0;
	   for(int i=0;i<squared.length;i++) {
		   int sum = 0;
		   int temp = squared[i];
		   while(temp>0) {
			   int digit = temp%10;
			   sum = sum+digit;
			   temp = temp/10;
		   }
		   arrz[i] = sum;
	   }
	   return arrz;
   }
   
   public static int[] lastcheck_prime(int[] sum_primes) {
	   int arrz[]=new int[sum_primes.length];
	   int length = 0;
	   for(int i=0;i<sum_primes.length;i++) {
		   if(sum_primes[i]<=1) {
			   continue;
		   } else if(sum_primes[i]>=2){
			   int count = 0;
			   for(int j=2;j<sum_primes[i]-1;j++) {
				   if(sum_primes[i]%j==0) {
					   count++;
				   } else {
					   continue;
				   }
		   }
		if(count==0) {
			arrz[length]=sum_primes[i];
			length++;
		}
	   }
   }
	   int result[] = new int[length];
       for (int k = 0; k < length; k++) result[k] = arrz[k];
       return result;
	   
   }
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size here:");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("enter elements here:");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("**********");
		int primes[] = filterPrime(arr1);
		for (int ss:primes) {
			System.out.println(ss);
		}
		System.out.println("**********");
		int squared[] = square_primes(primes);
		System.out.println("***********");
		int sum_primes[] = sumof_squared_num(squared);
		System.out.println("***********");
		
		int last_primes[] = lastcheck_prime(sum_primes);
		for(int ss:last_primes) {
			System.out.println(ss);
		}
		

	}

}
