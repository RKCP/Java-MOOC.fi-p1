import java.util.ArrayList;

public class NumberOfItems {

    public static int countItems(ArrayList<String> userList) {
        //returns the number of items in the list. Don't print anything just return the number.
        int arrayListSize = userList.size();
        return arrayListSize;
        
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        System.out.println(countItems(list)); 
    }

}