/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreaming;

/**
 *
 * @author EddyJ
 */

import java.util.*;
import java.util.stream.*;

public class FinalExamStreaming  {
    private static int count = 0;
  public static void main(String[] args) {
    String[] list = {"abc2R", "John2", "43Pet343er", "Jone3978",
      "George", "#23", "Abcd", "es342w"};
    
    /* 1. Combine all strings in list into a StringBuilder using streams. */
    // WRITE YOUR CODE HERE
    StringBuilder slist = Stream.of(list).collect(() -> new StringBuilder(),
            (c, e) -> c.append(e), (c1, c2) -> c1.append(c2));
    
    System.out.println(slist);
    /* 2. Obtain an array of characters from the StringBuilder */
    // WRITE YOUR CODE HERE
    char[] clist = new char[slist.length()];
    slist.getChars(0, slist.length(), clist, 0);
    
    /* 3. Use streams to filter out non-digit characters, collect the count for 
     each characters, and display the counts, as shown in the sample     run. */
    // WRITE YOUR CODE HERE
    count = 0;
    System.out.println("The occurrences of each number are: ");
    Stream.of(toCharacterArray(clist))
    .filter(ch -> Character.isDigit(ch))
    .map(ch -> ch)
    .collect(Collectors.groupingBy(e -> e,
    TreeMap::new, Collectors.counting()))
    .forEach((k, v) -> { System.out.print(k + " occurs " + v
     + (v > 1 ? " times " : " time") + "\n");
    });

  }
  
  // Convert char[] to Character[]
  public static Character[] toCharacterArray(char[] list) {
    Character[] result = new Character[list.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = list[i];
    }
    return result;
  }
}
