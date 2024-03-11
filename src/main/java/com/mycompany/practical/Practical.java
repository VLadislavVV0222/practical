/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical;
import java.util.Scanner;
/**
 *
 * @author vladc
 */
public class Practical{
public static void main(String[] args) {
System.out.println("Вариант 5");
System.out.println("ФИО: Чугунов Владислав Владимирович");
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the name of the store: ");
String storeName = scanner.nextLine();

Store store = new Store(storeName);
Reviewer reviewer = new Reviewer();

reviewer.closeStore(store);
reviewer.rebrand(store);

System.out.println("Store name: " +storeName+ ", " + store.name);
}
}