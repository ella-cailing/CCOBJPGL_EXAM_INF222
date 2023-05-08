public class Switzerland implements Locations {

    int airFare = 98;

    public int getAirFare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
