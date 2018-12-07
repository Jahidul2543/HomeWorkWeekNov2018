package test;


//import database.ConnectDB;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoDatabase4 {

    public static void main(String[] args) throws Exception {

        /*  * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         **/


        ArrayList<Integer> arrList = new ArrayList<>();
        //add element to Arraylist
        arrList.add(150);
        arrList.add(200);
        arrList.add(300);
        arrList.add(25);
        arrList.add(90);
        arrList.add(10);
        arrList.add(36);
        arrList.add(30);
        //Print Array List
       System.out.println("Retrieving elements from ArrayList: " + arrList);

        //Using get method to peek the first element
        System.out.println("Peek first element: " + arrList.get(0));

        //remove element from ArrayList
        System.out.println("Remove element at index 1: " + arrList.remove(1));

        //Retrieving elements from ArrayList
        System.out.println("Re-retrieving elements from ArrayList: " + arrList);

        //Using 'forEach' loop
        System.out.println("Use of for-each loop: ");
        for (Integer in : arrList) {
            System.out.println(in);
        }

        //using iterator
        System.out.println("Use of iterator using while loop: ");
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.println(i);
        }

        //Sorting ArrayList
        Collections.sort(arrList);
        System.out.println(arrList);
        List list = new ArrayList();
        list = arrList;


        //Connect to MySql Database
     ConnectDB connectDB = new ConnectDB();

        //Create table in the database
        connectDB.createTableFromStringToMySql("Learning", "grades");

        //Insert data in the database
        connectDB.InsertDataFromArrayListToMySql(list, "Learning", "grades");
        //Read data from database
        //List<String> numbers = connectDB.readDataBase("array_list", "listElement");
        List<String> numbers = connectDB.readDataBase("Learning", "grades");
        for (String st : numbers) {
            System.out.println(st);
        }
    }
}





