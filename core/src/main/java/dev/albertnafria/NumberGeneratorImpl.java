package dev.albertnafria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {
    //Fields section
    private final Random random = new Random();
    @Autowired
    @MaxNumber
    private int maxNumber;

    // Public Methods
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
