package MartianRobots;

import java.util.Scanner;
public class MartianRobots {

    public static void main(String args[]){
        Board board;

        Scanner in = new Scanner(System.in);
        int boardX, boardY, robotX, robotY;
        String route, robotD;
        boardX = in.nextInt();
        boardY = in.nextInt();
        board = new Board(boardX, boardY);
        while(true){
            robotX = in.nextInt();
            robotY = in.nextInt();
            robotD = in.next();
            route = in.next();
            board.createRobot(robotX, robotY, robotD);
            System.out.println(board.executePath(route));
        }
    }
}
