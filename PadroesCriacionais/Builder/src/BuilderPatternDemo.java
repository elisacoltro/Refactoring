public class BuilderPatternDemo {
    public static void main(String args[]) {
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanilla(2).flour(1.5).bakingpowder(0.75)
                .milk(0.5).build();
        System.out.println(whiteCake);
    }
}
