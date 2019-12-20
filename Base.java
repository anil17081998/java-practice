class Base {
    public void show() {
    System.out.println("Base class show() called");
    }
}
class Derived extends Base {
    public void show() {
        System.out.println("Derived class show() called");
    }
}
class Main { 
    public static void main(String[] args) { 
        Base base = new Derived(); 
        base.show(); 
    }
}