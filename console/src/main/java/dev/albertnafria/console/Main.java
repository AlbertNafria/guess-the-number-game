package dev.albertnafria.console;

import dev.albertnafria.config.AppConfig;
import dev.albertnafria.MessageGenerator;
import dev.albertnafria.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Guess the number game");

        // Create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the number generator bean from the container
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // Call method next() to get a random number
        int number =  numberGenerator.next();
        // Log generated number
        log.info("number = {}", number);

        // Get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

        // Close context (container)
        context.close();
    }
}