public class Constructor {
    Constructor(){
        this(10);
    }
    Constructor(int x){
        this(2,10);
        System.out.println(x);
    }
    Constructor(int x,int y){
        System.out.println(x*y);
    }
    public static void main(String args[]){
        new Constructor();
    }
}
