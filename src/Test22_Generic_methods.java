class Program_methods_ge {
public <T> void print(T[]items){
    for(T item: items){
        System.out.println(item);
    }
}
}

class myMainClass7 {
    public static void main(String[] args) {
       Program_methods_ge printer_ge = new Program_methods_ge();
       String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "jora"};
       Integer[] numbers ={22,66,66,68,55,11};
       printer_ge.<String>print(people);
       printer_ge.<Integer>print(numbers);

    }
}
