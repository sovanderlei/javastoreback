package com.api.javastoreback.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.api.javastoreback.dto.DtoPersonStream;

public class StreamTest {

	public static void main(String[] args) {

		//streamBaseTest();
		streamPerson();

	}

	public static void streamBaseTest() {

		List<String> myList = Arrays.asList("vanderlei", "jussara", "davi", "kayo", "vanderlei 2");

		myList.stream().filter(s -> s.startsWith("v")).map(String::toUpperCase).sorted().forEach(System.out::println);

		// outro exemplo
		Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println); // a1

		// outro exemplo
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));

		// outro exemplo
		Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		}).forEach(s -> System.out.println("forEach: " + s));

	}

	public static void streamPerson() {

		List<DtoPersonStream> persons = Arrays.asList(new DtoPersonStream("Max", 18), new DtoPersonStream("Peter", 23),
				new DtoPersonStream("Pamela", 23), new DtoPersonStream("David", 12));

		// ===============================================================
		List<DtoPersonStream> filtered = persons.stream().filter(p -> p.getName().startsWith("P"))
				.collect(Collectors.toList());

		System.out.println(filtered); // [Peter, Pamela]

		// ===============================================================
		Map<Object, List<DtoPersonStream>> personsByAge = persons.stream()
				.collect(Collectors.groupingBy(p -> p.getAge()));

		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

		// ===============================================================
		Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.getAge()));

		System.out.println(averageAge); // 19.0

		// ===============================================================

		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.getAge()));

		System.out.println(ageSummary);
		// IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}

		// ===============================================================

		Map<Object, Object> map = persons.stream()
				.collect(Collectors.toMap(p -> p.getAge(), p -> p.getName(), (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
		// {18=Max, 23=Peter;Pamela, 12=David}

		// ===============================================================

		Collector<DtoPersonStream, StringJoiner, String> personNameCollector = Collector.of(
				() -> new StringJoiner(" | "), // supplier
				(j, p) -> j.add(p.getName().toUpperCase()), // accumulator
				(j1, j2) -> j1.merge(j2), // combiner
				StringJoiner::toString); // finisher

		String names = persons.stream().collect(personNameCollector);

		System.out.println(names); // MAX | PETER | PAMELA | DAVID

	}

}
