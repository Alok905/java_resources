@Deprecated
class A {
    public void greet() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    @Override
    public void greet() {
        System.out.println("Hello from class B");
    }
}
