class Test13_static_state_of_obj {

    public static void main(String[] args) {
        System.out.println(Operation.sum(1,9));
        System.out.println(Operation.substract(14,14));
        System.out.println(Operation.multiply(14,7));


    }
}

//when no changes in the state of the class it my might be static
//methods use just params, great=)

class Operation {
   static int sum(int x, int y){
       return x+y;
   }
   static int substract(int x, int y){
       return x-y;
   }
   static int multiply(int x, int y){
       return x*y;
   }
}