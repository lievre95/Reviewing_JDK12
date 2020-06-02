class Animal2 {
    public void animalSound() {
        System.out.println("The animal takes sound");
    }
}

class Pig2 extends Animal2 {
    public void animalSound() {
        System.out.println("uyyy");
    }
}

class Cat2 extends Animal2 {
    public void animalSound() {
        System.out.println("maaau");
    }
}

class Bird2 extends Animal2 {
    public void animalSound() {
        System.out.println("pik-pik");
    }
}

class myMainClass3 {
    public static void main(String[] args) {
        Animal2 jora = new Bird2();
        Animal2 katea = new Cat2();
        Animal2 vlad = new Pig2();
        jora.animalSound();
        katea.animalSound();
        vlad.animalSound();
    }
}


