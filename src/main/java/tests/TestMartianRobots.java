package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import MartianRobots.Board;
public class TestMartianRobots {

    @Test
    public void testCases(){
        Board board = new Board(5,3);
        board.createRobot(1, 1, "E");
        assertEquals("1 1 E", board.executePath("RFRFRFRF"));
        board.createRobot(3, 2, "N");
        assertEquals("3 3 N LOST", board.executePath("FRRFLLFFRRFLL"));
        board.createRobot(0, 3, "W");
        assertEquals("2 3 S", board.executePath("LLFFFLFLFL"));
    }
}
