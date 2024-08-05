package design_patterns.strategy;

public class Main {
    public static void main(String[] args){

        RecommendationStrategy strategy1 = new WishlistRecommendation();

        RetailSystem system = new RetailSystem(strategy1);

        String id = "123";

        System.out.println(system.getRecommendations(id));

        system.setRecommendationStrategy(new UserPurchaseHistoryRecommendation());

        System.out.println(system.getRecommendations(id));

    }
}
