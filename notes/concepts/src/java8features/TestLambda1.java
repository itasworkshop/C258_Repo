package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda1 {

    public static void main(String[] args) {
        List<Integer> mynum = Arrays.asList();

        System.out.println(mynum);

        //() -> {}
        //map,filter,reduce
        //Stream<Integer> output = mynum.stream().map(i -> i*i);

        //System.out.println(output.collect(Collectors.toList()));

        System.out.println(mynum.stream().reduce((i,j) -> i+j).orElse(0));

    }
}
