package br.com.mystudies.scala.collections;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class Main {
	
		
	public static List<Integer> removeZeros(List<Integer> list){
		return list.stream()
				.filter(x  -> x != 0)
				.collect(toList());				
	}
	
	
	
	public static void main(String[] args) {		
		System.out.println(removeZeros(asList(1, 2, 3, 4)));		
	}
	
	
}
