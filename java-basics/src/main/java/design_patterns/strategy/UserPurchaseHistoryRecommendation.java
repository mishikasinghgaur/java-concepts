package design_patterns.strategy;

import java.util.List;

public class UserPurchaseHistoryRecommendation implements RecommendationStrategy {
    @Override
    public List<String> getRecommendations(String userId) {
        System.out.println("UserPurchase");
        return List.of();
    }
}
