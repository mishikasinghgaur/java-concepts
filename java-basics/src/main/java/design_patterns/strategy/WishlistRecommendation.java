package design_patterns.strategy;

import java.util.List;

public class WishlistRecommendation implements RecommendationStrategy{
    @Override
    public List<String> getRecommendations(String userId) {
        System.out.println("WishList");
        return List.of();
    }
}
