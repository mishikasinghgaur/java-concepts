package design_patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@AllArgsConstructor
public class RetailSystem {

    private RecommendationStrategy recommendationStrategy;

    public List<String> getRecommendations(String userID) {
        if (recommendationStrategy == null) {
            return List.of();
        } else {
            return recommendationStrategy.getRecommendations(userID);
        }
    }
}
