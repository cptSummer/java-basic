package com.HT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<CityName> cl = readData("HR1m.csv");
        List<SortCity> ct = new ArrayList<>();
        Map<String, Long> count = cl.stream().collect(Collectors.groupingBy(CityName::getCityName, Collectors.counting()));
        count.forEach((k, v) -> ct.add(new SortCity(k, v)));
        ct.sort((SortCity p1, SortCity p2) -> Long.compare(p2.getCount(), p1.getCount()));
        ct.stream().limit(10).forEach(System.out::println);
    }

    private static List<CityName> readData(String filename) throws IOException {
        List<CityName> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        int cnt = 0;

        while ((line = br.readLine()) != null) {
            if (cnt++ == 0) {
                continue;
            }
            String[] split = line.split("\\,");
            String city = split[31];
            data.add(new CityName(city));
        }
        br.close();
        return data;
    }
}
