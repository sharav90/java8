package java8.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Saravanan M
 * @created on Apr 14, 2018 1:32:55 PM
 * @description Java8 - ArrayList Demo
 */
public class ArrayListDemo {

	private static List<String> strList = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Array List Demo");

		strList.add("C ");
		strList.add("A ");
		strList.add("B ");

		System.out.println("Default List: ");
		strList.forEach(System.out::print);

		listAscOrder();

		listDescOrder();

	}

	public static void listAscOrder() {

		// Method 1
		final List<String> ascList = strList.stream().sorted().collect(Collectors.toList());

		// Method 2
		Collections.sort(strList, (s1, s2) -> s1.compareTo(s2));

		System.out.println("\n\nAsc Order:");

		ascList.forEach(System.out::print);

	}

	public static void listDescOrder() {

		// Method 1
		final List<String> descList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		// Method 2
		Collections.sort(strList, (s1, s2) -> s2.compareTo(s1));

		System.out.println("\n\nDesc Order");

		descList.forEach(System.out::print);
	}
}
