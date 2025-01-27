import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().mapToInt(num -> num).min().getAsInt();
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().mapToInt(num -> num).max().getAsInt();
    }

    @Override
    public boolean isEqual(Object o, Object o1) {

        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {

        return o.equals(o1);
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        return null;
        List<Integer> consume = new ArrayList<>();
        for (Integer consum : consume) {
            iterator.next();
        }
        return consume;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        int sum = 0;
        for (int num = 0; num <= i; num++) {
            sum += num;
        }
        return sum;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;
        for (int num = 0; num < i; num++){
            if (numberFilter.accept(num)){
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> total = new ArrayList<>();
        for (int num = 1; num < i; num++) {
            total.add(num);
        }
        return total;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> total = new HashMap<>();
        int counter = 0;
        for (int matchingValue : list) {
            counter++;
            total.put(matchingValue, counter / 2);
        }
        return total;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return null;
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return null;
    }
}
