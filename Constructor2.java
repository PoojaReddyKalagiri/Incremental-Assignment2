class Cons{
    String name;

    public Cons(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Cons[] c = new Cons[]{new Cons("Hyd"),new Cons("Delhi"),new Cons("Chennai")};
        for (Cons obj : c) {
            System.out.println(obj);
        }
    }
}