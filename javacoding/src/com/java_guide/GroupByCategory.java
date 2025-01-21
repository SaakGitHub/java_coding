package com.java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByCategory {

	public static void main(String[] args) {
		
		List<Product> product = Arrays.asList(
			new Product("Laptop", "Electronic"),
			new Product("Shirt", "Clothing"),
			new Product("Mobile", "Electronic"),
			new Product("Jeans", "Clothing")
		);
		
		Stream<Product> stream = product.stream();
		/* Map(String,List<Product>) map; */
		Map<String, List<Product>> collect = stream.collect(Collectors.groupingBy(Product::getCategory));
		System.out.println(collect);
	}

}
