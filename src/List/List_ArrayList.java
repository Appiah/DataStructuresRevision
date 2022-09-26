package List;

import java.util.*;

public class List_ArrayList {

    private final static String DATA_STRUCTURE_NAME = "ArrayList";

    public static void main(String [] args){

        System.out.print("Data Structures Experimentation with : ");
        System.out.print(DATA_STRUCTURE_NAME);

        System.out.println("");

        ArrayList<String> arrList = new ArrayList<>();

        //adding of new items : O(1)
        arrList.add("Item 00");
        arrList.add("Item 01");
        arrList.add("Item 01");
        arrList.add("Item 02");

        //adding of a new item at a particular index
        arrList.add(2, "Item 03");
        //arrList.add(7, "Item 09");//this would yield this error :
        /*
        * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
        * */

        System.out.println("arrList elements : "+arrList.toString());

        //get function : O(1)
        String item_at_position_4_str = arrList.get(4);



    }

}
