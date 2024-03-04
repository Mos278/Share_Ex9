public  class App{
    public static void main(String[] args) {
        Manager man = new Manager();
        man.setManager(new Football());
        man.execute();
        man.setManager(new Basketball());
        man.execute();

    }
}