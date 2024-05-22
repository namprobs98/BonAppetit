/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonappetit;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class BonAppetit {
    //Phuong thuc tinh tien
    public static String bonAppetit(int[] bill, int k, int b) {
        // Write your code here
        bill[k] = 0;
        int sum = 0;
        for (int i : bill) {
            sum += i;
        }
        if (b - sum / 2 == 0) {
            return "Bon Appetit";
        } else {
            return "" + (b - sum / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for (int i = 0; i < n; i++) {
            bill[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        System.out.print(bonAppetit(bill, k, b));
    }

}
