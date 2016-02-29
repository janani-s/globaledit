package MartianRobots;

class Robot {
    enum DIRECTIONS{N, E, S, W};
    private int x;
    private int y;
    private DIRECTIONS dir;

    public DIRECTIONS getDirection(){
            return dir;
    }

    public int getX(){ return x;}

    public int getY() {return y;}

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setDir(DIRECTIONS d){
        dir = d;
    }
}
