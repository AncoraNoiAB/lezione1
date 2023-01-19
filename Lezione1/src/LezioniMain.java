import Animals.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LezioniMain {
    public static void main(String[] args) {

        List<Eagle> eagleList = Arrays.asList(new Eagle("Giovanni", "topi", 6, LocalDate.of(2005, 03, 28), 45, 165.5, 12.45),
                new Eagle("Simone", "gatti", 4, LocalDate.of(2009, 07, 8), 39, 127.8, 18.12),
                new Eagle("Nicola", "criceti", 5, LocalDate.of(2007, 05, 18), 19,187.4, 31.22)
        );

        List<Tiger> tigerList = Arrays.asList(new Tiger("Ernesto", "cerbiatto", 4, LocalDate.of(2009, 07, 8), 39, 127.8,18.12),
                new Tiger("Biagio", "scimmia", 6, LocalDate.of(2005, 01, 28), 59, 172.1, 21.12),
                new Tiger("Roberto", "coniglio", 5, LocalDate.of(2007, 05, 18), 49, 256.3,31.28)
        );

        List<Lion> lionList = Arrays.asList(new Lion("Ernesto", "gazzella", 4, LocalDate.of(2009, 07, 8), 39, 127.8, 18.12),
                new Lion("Biagio", "scimmia", 6, LocalDate.of(2005, 01, 28), 59, 172.1, 21.12),
                new Lion("Roberto", "coniglio", 5, LocalDate.of(2007, 05, 18), 49, 256.3, 31.28)
        );

        AnimalsWithWings eagleTaller = Eagle.getTaller(eagleList.stream().map(e -> (AnimalsWithWings) e).collect(Collectors.toList()));
        System.out.println("Eagle with maximum height "+eagleTaller.getNickname());


        AnimalsWithWings eagleLower = Eagle.getLower(eagleList.stream().map(e -> (AnimalsWithWings) e).collect(Collectors.toList()));
        System.out.println("Eagle with minimum height "+eagleLower.getNickname());

        AnimalsWithWings eagleHeavier = Eagle.getHeavier(eagleList.stream().map(e -> (AnimalsWithWings) e).collect(Collectors.toList()));
        System.out.println("Eagle with maximum weight "+eagleHeavier.getNickname());

        AnimalsWithWings eagleLighter = Eagle.getLightier(eagleList.stream().map(e -> (AnimalsWithWings) e).collect(Collectors.toList()));
        System.out.println("Eagle with minimum weight "+eagleLighter.getNickname());

        AnimalsWithWings eagleLargestWingSpan = Eagle.getLargestWingSpan(eagleList.stream().map(e -> (AnimalsWithWings) e).collect(Collectors.toList()));
        System.out.println("Eagle with maximum Wingspan "+eagleLargestWingSpan.getNickname());

        AnimalsWithTails tigerTaller = Tiger.getTaller(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Tiger with maximum height "+tigerTaller.getNickname());

        AnimalsWithTails tigerLower = Tiger.getLower(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Tiger with minimum height "+eagleLower.getNickname());

        AnimalsWithTails tigerHeavier = Tiger.getHeavier(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Tiger with maximum weight "+tigerHeavier.getNickname());

        AnimalsWithTails tigerLighter = Tiger.getLightier(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Tiger with minimum weight "+tigerLighter.getNickname());

        Tiger tigerWithBiggestTail = tigerList.stream().max(Comparator.comparingDouble(Tiger::getTailLength)).get();
        System.out.println("Tiger with maximum long tail "+tigerWithBiggestTail.getNickname());

        AnimalsWithTails lionTaller = Lion.getTaller(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Lion with maximum height "+lionTaller.getNickname());

        AnimalsWithTails lionLower = Lion.getLower(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Lion with minimum height "+lionLower.getNickname());

        AnimalsWithTails lionHeavier = Lion.getHeavier(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Lion with maximum weight "+lionHeavier.getNickname());

        AnimalsWithTails lionLighter = Lion.getLightier(tigerList.stream().map(e -> (AnimalsWithTails) e).collect(Collectors.toList()));
        System.out.println("Lion with minimum weight "+lionLighter.getNickname());

        List<AnimalsWithTails> animalsWithTailsList = Stream.of(lionList,tigerList).flatMap(x -> x.stream()).map(e -> (AnimalsWithTails) e).collect(Collectors.toList());
        AnimalsWithTails animalWithLongestTail = AnimalsWithTails.getLongestTail(animalsWithTailsList);
        System.out.println("Animal with maximum long tail "+animalWithLongestTail.getNickname());
    }
}
