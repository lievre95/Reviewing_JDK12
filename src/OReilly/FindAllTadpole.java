package OReilly;

import java.util.*;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

abstract class Tadpole extends Amphibian {
}

public class FindAllTadpole {
    public static void main(String[] args) {
        var tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphidian : tadpoles) {
            CanSwim tadpole = amphidian; // The for-each loop implicitly casts each Tadpole object to an Amphibian reference, bcz Tadpole is superclass of Amphibian
//            Boolean tadpole2 = amphidian; // Boolean is not supertype of Amphibian
            Amphibian tadpole3 = amphidian; // Ok, bcz the reference is  being cast to the same type
//            Tadpole tadpole 4 = amphidian; // even though the underlying object is a Radpole instance, it requires an explicit cast
            Object tadpole5 = amphidian; // all classes extends from Object
        }
    }
}