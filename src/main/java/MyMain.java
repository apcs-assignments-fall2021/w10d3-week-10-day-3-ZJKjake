import java.util.ArrayList;
import java.util.stream.Collectors;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count=0;
        for (String s : list) {
            if ((s.charAt(0)) == 65 || (s.charAt(0)) == 97) {
                count += 1;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i=0;i<list.size();i++){
            list.set(i,list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer value : list1) {
            for (Integer integer : list2) {
                if (value == integer) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int counter = 0;
        for (int i : list) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            result.add(i);
        }
        return result;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i=0;i<list2.size();i++){
            list1.add(list2.get(i));
        }
        for (int i=0;i<list1.size();i++){
            for (int j=i+1;j<list1.size();j++){
                if (list1.get(j)<list1.get(i)){
                    int x=list1.get(i);
                    list1.set(i,list1.get(j));
                    list1.set(j,x);
                }
            }
        }
        return list1;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
