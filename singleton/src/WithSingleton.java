public class WithSingleton {
    private static WithSingleton instance;
    private static void WithSingleton(){
        System.out.println("new database Connection created");
    }

    public static WithSingleton getInstance(){

        if (instance == null){
            instance = new WithSingleton();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Connected to the database");
    }
}
