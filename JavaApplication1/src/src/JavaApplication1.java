/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author phoebezhou
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        Stream myStream= myList.stream();
        
        myStream.forEach(System.out::println);
        
        System.out.println("----");
        
        //print(myList.stream().sorted().toArray());
        
	    //.forEach(System.out::println)

    }

    private static void print(Object[] objects) {
        if (objects != null && objects.length > 0) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }
    }

}
