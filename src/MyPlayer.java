import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public ArrayList<Board> winningBoards = new ArrayList<>();
    public ArrayList<Board> losingBoards = new ArrayList<>();

    public MyPlayer() {
        columns = new int[10];

        losingBoards.add(new Board(1,0,0));

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */

        // print ALL baords (possible and not possible) starting with 1 0 0
        // and them from there try to narrow it down to just possible boards

        for(int x=1; x<4; x++){
            for(int y=0; y<=x;y++){
                for(int z=0; z<=y; z++){
                    System.out.println("regular boards " +x+" " + y+" "+z);
                    oneMoveAway(x, y, z);

                    }
                }
            }
        }


    public void oneMoveAway(int i, int j, int k){
        // for each ijk board, print all boards that result
        // after a single move
        boolean foundIJKWinner = false;

        for(int x=k-1; x>=0; x--){
            System.out.println(i + " " + j + " " + x + ": (" + x + ", 2)");
        }
        for(int x=j-1; x>=0; x--){
            if(x>=k){
                System.out.println(i + " " + x + " "+ k+ ": (" + x + ", 1)");
            if(i == losingBoards.get(0).cols[0] && x == losingBoards.get(0).cols[1] && k == losingBoards.get(0).cols[2]){
                foundIJKWinner = true;
                System.out.println("Winner winner chicken dinner");
            }
            } else{
                System.out.println(i + " " + x + " " + x+ ": (" + x + ", 1)");
            }
        }
        for(int x=i-1; x>0; x--){
            if(j<x && k<x) {
                System.out.println(x + " " + j + " " + k + ": (" + x + ", 0)");
                if(j == losingBoards.get(0).cols[0] && x == losingBoards.get(0).cols[1] && k == losingBoards.get(0).cols[2]){
                    foundIJKWinner = true;
                    System.out.println("Winner winner chicken dinner");
            }else if(k<x) {
                System.out.println(x + " " + x + " " + k + ": (" + x + ", 0)");
            }else {
                System.out.println(x + " " + x + " " + x + ": (" + x + ", 0)");
            }
        }
        //make decision about winning/losing board for i,j,k board
        //save i,j,k to one array list (winning or losing)
        //if ijk is winning board we add it to our winning boards array list
        //else we add ijk to our losing boards array list

        if(foundIJKWinner == true){
            winningBoards.add(new Board(i,j,k));
        } else{
            losingBoards.add(new Board(i,j,k));
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
