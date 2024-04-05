package com.learning.core.day1session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class D01P044 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number: ");
String number = scanner.nextLine();
System.out.print("Enter the value of k: ");
int k = scanner.nextInt();
List<String> result = findCombinations(number, k);
System.out.println("Distinct combinations of numbers according to k = " + k + " are:");
for (String combination : result) {
System.out.print(combination);
if (result.indexOf(combination) != result.size() - 1) {
System.out.print(",");
}
}
scanner.close();
}
public static List<String> findCombinations(String number, int k) {
List<String> result = new ArrayList<>();
backtrack(result, new StringBuilder(), number, k, 0);
return result;
}
private static void backtrack(List<String> result, StringBuilder temp, String number, int k, int start) {
if (temp.length() == k) {
result.add(temp.toString());
return;
}
for (int i = start; i <= number.length() - k + temp.length(); i++) {
temp.append(number.charAt(i));
backtrack(result, new StringBuilder(temp), number, k, i + 1); // pass new StringBuilder instance to avoid side effects
temp.deleteCharAt(temp.length() - 1);
}
}
}