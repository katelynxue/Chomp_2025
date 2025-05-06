import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */

        // print ALL baords (possible and not possible) starting with 1 0 0
        // and them from there try to narrow it down to just possible boards

        for(int x=1; x<4; x++){
            for(int y=0; y<4;y++){
                for(int z=0; z<4; z++){
                    if(x<y || x<z || y<z){

                    }
                    else{
                        System.out.println("regular boards " +x+" " + y+" "+z);
                        oneMoveAway(x, y, z);

                    }
                }
            }
        }
    }

    public void oneMoveAway(int x, int y, int z){
        // for each ijk board, print all boards that result
        // after a single move
        for(int i=z-1; i>=0; i--){
            System.out.println(x+" "+y+" "+i);
        }
        for(int i=y-1; i>=0; i--){
            System.out.println(x+" "+i+" "+i);
            if(i>=z){
                System.out.println(i+" "+ x+" "+z);
            } else{
                System.out.println(i+" "+x+" "+x);
            }
        }

    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
