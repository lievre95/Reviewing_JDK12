import java.util.TreeSet;

class Test25_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();
        states.add("Germany");
        states.add("USA");
        states.add("France");
        states.add("Ukraine");
        states.add("Russia");
        System.out.println("The TreeSet has " + states.size() + " elements");

        states.remove("Germany");
        for(String s: states){
            System.out.println(s);
        }

    }
// TreeSet() has constructors TreeSet()
// TreeSet(Collection<? extends E> col  //creates a tree, in which is added all elements from collection col)
// TreeSet(Sorted <E> set)// creates a tree, in which added all sorted elements of set set
// TreeSet(Comparator<? super E> comparator) creates an empty tree, where all elements will be sorted by Comparator
}



