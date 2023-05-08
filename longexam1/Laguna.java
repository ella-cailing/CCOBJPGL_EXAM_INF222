public class Laguna implements Locations {

    int airFare = 198;

    public int getAirFare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
