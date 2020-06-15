import java.util.*;

class Test26_Iterator {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("Malta");
        states.add("Czech");
        states.add("Moldova");


        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {
            listIter.next();
        }
        // now the current element is Moldova, let's change on something another ex. "Belgium"
        listIter.set("Belgium");
        //enumeration of elements in descending order
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous()+" desc");
        }

    }
}
