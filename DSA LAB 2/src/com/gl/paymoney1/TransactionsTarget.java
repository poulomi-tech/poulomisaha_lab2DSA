package com.gl.paymoney1;

import java.util.Scanner;

public class TransactionsTarget {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array i.e the days of transaction :  ");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for (int i =0; i< size ; i++)
		{
			System.out.println("Enter daily transactions in crore of day : " + (i+1));
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the target amount : ");
		int target = sc.nextInt();
		payMoney pm = new payMoney();
		int numberOfDays = pm.numberOfDays(transactions, target);
		if (numberOfDays == -1)
		    System.out.println(" The target " + target + " is not achieved");
		else {
			System.out.println(" The target " + target + " corors is achieved in " + numberOfDays);
		}
			//	diaplayTransactions(transactions);
		sc.close();
	}
	public static void diaplayTransactions(int[] transactions) {
		for (int transaction : transactions ) {
			System.out.println(transaction + " ");
		}
		System.out.println();
	}

}
