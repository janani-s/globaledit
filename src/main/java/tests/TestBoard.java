package tests;

import MartianRobots.Board;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBoard {
    @Test
    public void testIsValidPosition(){
        Board board = new Board(5,5);
        assertTrue(board.isValidPosition(5,5));
        assertTrue(board.isValidPosition(5,0));
        assertTrue(board.isValidPosition(0,5));
        assertTrue(board.isValidPosition(0,0));
        assertFalse(board.isValidPosition(0,-1));
        assertFalse(board.isValidPosition(-1,0));
        assertFalse(board.isValidPosition(5,6));
        assertFalse(board.isValidPosition(6,6));
    }
}
