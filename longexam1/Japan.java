public class Japan implements Locations {

    int airFare = 149;

    public int getAirFare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
