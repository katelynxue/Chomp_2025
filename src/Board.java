public class Board {
    int[]cols = new int[3];

    public Board(int x, int y, int z){
        cols[0] = x;
        cols[1] = y;
        cols[2] = z;
    }

    public void printInfo(){
        System.out.println(cols[0] + " " + cols[1] + " " + cols[2]);
    }

}
