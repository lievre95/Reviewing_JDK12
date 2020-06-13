import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.SortedSet;

class Test25_SortedSet {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();
        states.add("Germany");
        states.add("USA");
        states.add("France");
        states.add("Ukraine");
        states.add("Russia");
        System.out.println("The TreeSet has " + states.size() + " elements");
        System.out.println(states.first());//first, the smallest element
        System.out.println(states.last());//the last the biggest element
        // getting subSet from one element to another
        SortedSet<String> set = states.subSet("Germany", "Russia");
        System.out.println(set);

        String higher = states.higher("Germany");
        String lower = states.lower("Germany");
        //Return the set in the reverse order
        NavigableSet<String> navSet = states.descendingSet();

        // Return all elements which are smaller than current
        SortedSet<String> setLower = states.headSet("USA");
        // Return all elements which are bigger than current
        SortedSet<String> setGreater = states.tailSet("France");
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }
// TreeSet() has constructors TreeSet()
// TreeSet(Collection<? extends E> col  //creates a tree, in which is added all elements from collection col)
// TreeSet(Sorted <E> set)// creates a tree, in which added all sorted elements of set set
// TreeSet(Comparator<? super E> comparator) creates an empty tree, where all elements will be sorted by Comparator
}



