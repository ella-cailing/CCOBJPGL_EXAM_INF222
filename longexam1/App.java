public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations palawan = new Davao();
        Locations baguio = new Japan();
        Locations laUnion = new Switzerland();
        Locations sagada = new Tagaytay();
        Locations laguna = new Laguna();

        Tourist Cailing = new Me();

        boracay.accept(Cailing);
        palawan.accept(Cailing);
        baguio.accept(Cailing);
        laUnion.accept(Cailing);
        sagada.accept(Cailing);
        laguna.accept(Cailing);

    }
}
