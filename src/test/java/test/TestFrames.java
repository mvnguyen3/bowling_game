package test;

import main.BowlingGame;
import main.BowlingGameImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFrames {
    @Test
    public void test() {
        BowlingGame frame1 = new BowlingGameImpl();
        frame1.roll(7);
        frame1.roll(0);

        Assertions.assertEquals(7, frame1.getFrameScore());
        Assertions.assertEquals(7, frame1.getGameScore());





    }
}
