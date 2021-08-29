

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Run {

  public static void main(String[] args) {
    int count = 0;
    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();

    for (int i = 0; i < 20; i++) {
      ArrayList<String> temp = new ArrayList<String>();
      for (int j = 0; j < 5; j++) {

        int val = (int)(Math.random() * 10);
        temp.add(Integer.toString(val));
      }
      arr.add(temp);
    }

    for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i).get(0) + " ");           
        System.out.print(arr.get(i).get(1) + " "); 
        System.out.print(arr.get(i).get(2) + " "); 
        System.out.print(arr.get(i).get(3) + " "); 
        System.out.print(arr.get(i).get(4) + "\n"); 
    } 
  } 
} 
