package com.cloudtech;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "bat", "cat", "elephant", "dog", "fish", "ant");

		Map<Integer, List<String>> gpByLength = strings.stream().collect(Collectors.groupingBy(String::length));

		gpByLength.forEach((length, group) -> System.out.println("Length" + length + " : " + group));

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 5, 4, 1, 3);

		List<Integer> ml = num.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(ml);

		List<List<String>> str = Arrays.asList(Arrays.asList("Apple", "Banana", "Cehrry"),
				Arrays.asList("Pinapple", "WaterMelon", "Papaya"), Arrays.asList("Apricot", "Pulm"));

		List<String> fstr = str.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(fstr);
		List<String> filterfstr = fstr.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(filterfstr);

		// sort number
		List<Integer> naturalSorting = num.stream().sorted().collect(Collectors.toList());
		System.out.println(naturalSorting);

		List<Integer> customeSort = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(customeSort);

		List<Integer> num2 = List.of(1, 0, -3, 0, 2, 5, -6, 0, -1, 4, 0, 3);

		List<Integer> move = Stream
				.concat(num2.stream().filter(n -> n != 0).sorted(Comparator.reverseOrder()), num2.stream().filter(n -> n == 0))
				.collect(Collectors.toList());
		System.out.println(move);

	}

}
