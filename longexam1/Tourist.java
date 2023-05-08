interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Davao davao);
    void visit(Japan japan);
    void visit(Laguna laguna);
    void visit(Switzerland switzerland);
    void visit(Tagaytay tagaytay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
