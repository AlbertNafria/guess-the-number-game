package dev.albertnafria.config;

import dev.albertnafria.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    // Fields
    private int maxNumber = 100;
    private int guessCount = 10;

    // Bean methods
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }
    @Bean
    @MaxNumber
    public int guessCount() {
        return guessCount;
    }
}
