public class WithoutSingleton {
    public void withoutSingleton(){
        System.out.println("New Database Connection created");
    }
    public void connect(){
        System.out.println("connected to database");
    }
}
class AppInitializer{
    public static void main(String[] args){
        WithoutSingleton w1= new WithoutSingleton();
        w1.connect();
        WithoutSingleton w2= new WithoutSingleton();
        w2.connect();
        System.out.println(w1==w2);
    }
}