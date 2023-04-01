package dev.albertnafria.config;

import dev.albertnafria.GuessCount;
import dev.albertnafria.MaxNumber;
import dev.albertnafria.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // Fields
    @Value("${game.maxNumber:50}") //50 default
    private int maxNumber;
    @Value("${game.minNumber:0}") //0 default
    private int minNumber;
    @Value("${game.guessCount:5}") //5 default
    private int guessCount;

    // Bean Methods
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }
    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
