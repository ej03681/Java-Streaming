
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class Ex30_19SumAvgMaxFromFIle {

    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("C:\\\\Users\\\\EddyJ\\\\Scores.txt");
        Scanner input = new Scanner(file);

        List<Double> list = new ArrayList<Double>();

        while (input.hasNext()) 
            list.add(input.nextDouble());
        double[] array = list.stream().mapToDouble(i->i).toArray();
        
        input.close();
        
        DoubleSummaryStatistics stats = DoubleStream.of(array).summaryStatistics();
        
        System.out.println("Minimum value is " + stats.getMin());
        System.out.println("Max value is " + stats.getMax());
        System.out.println("There are " + array.length + " numbers");
        System.out.println("The total is " + stats.getSum());
        System.out.println("The average is " + stats.getAverage());

    }
}
