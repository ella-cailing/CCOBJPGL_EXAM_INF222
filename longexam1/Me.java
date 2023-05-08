public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit (Boracay boracay){
        if (budget - boracay.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Boracay!");
            budget -= boracay.getAirFare();
        }
        checkBudget();
    }

    public void visit (Davao davao) {
        if (budget - davao.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Davao!");
            budget -= davao.getAirFare();
        }
        checkBudget();
    }

    public void visit (Japan japan) {
        if (budget - japan.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Japan!");
            budget -= japan.getAirFare();
        }
        checkBudget();
    }

    public void visit (Laguna laguna) {
        if (budget - laguna.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Laguna!");
            budget -= laguna.getAirFare();
        }
        checkBudget();
    }

    public void visit (Switzerland switzerland) {
        if (budget - switzerland.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Switzerland!");
            budget -= switzerland.getAirFare();
        }
        checkBudget();
    }

    public void visit (Tagaytay tagaytay) {
        if (budget - tagaytay.getAirFare() < 0){
            System.out.println("Out of funds.");
        } 
        else {
            System.out.println("I am enjoying Tagaytay!");
            budget -= tagaytay.getAirFare();
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
