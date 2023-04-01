package dev.albertnafria.config;

import dev.albertnafria.GuessCount;
import dev.albertnafria.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    // Fields
    private int maxNumber = 50;
    private int guessCount = 8;

    // Bean Methods
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }
    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
