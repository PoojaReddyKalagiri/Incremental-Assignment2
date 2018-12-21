class C{
    String name;

    public C(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        C[] c = new C[3];
        for (C obj : c) {
            System.out.println(obj);
        }
    }
}