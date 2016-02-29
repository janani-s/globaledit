package MartianRobots;

public class Board {
    Robot robot;
    boolean [][] board;
    int boardX, boardY;


    public Board(int x, int y){
        boardX = x+1;
        boardY = y+1;
        board = new boolean[boardX][boardY];
    }

    public boolean isValidPosition(int x, int y){
        return (x >=0 && x < boardX && y>=0 && y< boardY);
    }

    public void createRobot(int x, int y, String d){
        if(robot == null) {
            robot = new Robot();
        }
        robot.setPosition(x, y);
        robot.setDir(Robot.DIRECTIONS.valueOf(d));
    }

    public String executePath(String s){
        boolean result = true;
        for(int i = 0; i< s.length(); i++){
            switch (s.charAt(i)){
                case 'R':
                    robot.setDir(Robot.DIRECTIONS.values()[(robot.getDirection().ordinal() + 1)%4]);
                    break;
                case 'L':
                    robot.setDir(Robot.DIRECTIONS.values()[(robot.getDirection().ordinal() + 3)%4]);
                    break;
                case 'F':
                    switch (robot.getDirection()){
                        case N:
                            result = moveRobot(robot.getX(), robot.getY()+1);
                            break;
                        case E:
                            result = moveRobot(robot.getX() +1, robot.getY());
                            break;
                        case S:
                            result = moveRobot(robot.getX(), robot.getY()-1);
                            break;
                        case W:
                            result = moveRobot(robot.getX()-1, robot.getY());
                            break;
                    }
                    break;
                default:
                    break;
            }
            if(!result){
                return robot.getX() + " " + robot.getY() + " " + robot.getDirection().name() + " LOST";
            }
        }
        return Integer.toString(robot.getX()) + " " + Integer.toString(robot.getY()) + " " + robot.getDirection().name();
    }


    private boolean moveRobot(int x, int y){
        if(!isValidPosition(x, y)){
            if(board[robot.getX()][robot.getY()]){
                return true;
            } else{
                board[robot.getX()][robot.getY()] = true;
                return false;
            }
        }
        robot.setPosition(x,y);
        return true;
    }
}
