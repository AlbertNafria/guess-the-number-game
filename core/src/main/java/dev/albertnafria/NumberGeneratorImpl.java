package dev.albertnafria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {
    // Fields
    private final Random random = new Random();
    private final int maxNumber;
    private final int minNumber;

    // Constructors (Use constructor injection autowiring)
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // Public methods
    @Override
    public int next() {
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
