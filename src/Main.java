import java.util.Scanner;

class Out {
    public void msg (String m) {
        System.out.println(m);
    }
}

class Board {
    public Board () {
        o = new Out();
    }

    public void placeShip(int row, int startColumn) {
        if (row ==0) shipRow = "a";
        else if (row==1) shipRow = "b";
        else if (row==2) shipRow = "d";
        else if (row==3) shipRow = "e";
        else if (row==4) shipRow = "f";
        else if (row==5) shipRow = "g";
        else if (row==6) shipRow = "h";
        else if (row==7) shipRow = "i";
        else if (row==8) shipRow = "j";
        else if (row==9) shipRow = "k";

        columnOne = startColumn;
        columnTwo = startColumn + 1;
        columnThree = startColumn + 2;
        columnFour = startColumn + 3;
        columnFive = startColumn + 4;
    }

    public int checkWinStatus() {
        int hits = 0;
        if (shipRow == "a") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "b") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "c") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "d") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "e") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "f") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "g") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "h") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "i") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "j") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        String msg = "So far the number of hits you have is: " + hits;
        System.out.println(msg);
        return hits;
    }

    public void handleUserGuess() {
        boolean hit = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which Row? (a,b,c,d,e,f,g,h,i,j)");
        String row = userInput.nextLine();
        System.out.println("Which Column? (0,1,2,3,4,5,6,7,8,9)");
        int column = userInput.nextInt();

        o.msg("\n\n You entered " + row + column + "\n");
        if (row.equals(shipRow)){
            if (
                    (column == columnOne) ||
                            (column == columnTwo) ||
                            (column == columnThree) ||
                            (column == columnFour) ||
                            (column == columnFive) ||
            ){
                if (row.equals("a")){
                    a[column] = 5;
                    hit = true;
                }
                else if (row.equals("b")){
                    b[column] = 5;
                    hit = true;
                }
                else if (row.equals("c")){
                    c[column] = 5;
                    hit = true;
                }
                else if (row.equals("d")){
                    d[column] = 5;
                    hit = true;
                }
                else if (row.equals("e")){
                    e[column] = 5;
                    hit = true;
                }
                else if (row.equals("f")){
                    f[column] = 5;
                    hit = true;
                }
                else if (row.equals("g")){
                    g[column] = 5;
                    hit = true;
                }
                else if (row.equals("h")){
                    h[column] = 5;
                    hit = true;
                }
                else if (row.equals("i")){
                    i[column] = 5;
                    hit = true;
                }
                else if (row.equals("j")){
                    j[column] = 5;
                    hit = true;
                }
                else o.msg("You did not provide a valid column number");
            }
        }
        else if ((row.equals("a")) && column <= 9) { a[column] = 1; }
        else if ((row.equals("b")) && column <= 9) { b[column] = 1; }
        else if ((row.equals("c")) && column <= 9) { c[column] = 1; }
        else if ((row.equals("d")) && column <= 9) { d[column] = 1; }
        else if ((row.equals("e")) && column <= 9) { e[column] = 1; }
        else if ((row.equals("f")) && column <= 9) { f[column] = 1; }
        else if ((row.equals("g")) && column <= 9) { g[column] = 1; }
        else if ((row.equals("h")) && column <= 9) { h[column] = 1; }
        else if ((row.equals("i")) && column <= 9) { i[column] = 1; }
        else if ((row.equals("j")) && column <= 9) { j[column] = 1; }
        else {
            System.out.println("You entered an invalid row and/or column, come on now, let's keep it on the board please!");
        }
        if (hit == false) o.msg("That was a MISS!");
        else o.msg("That was a HIT!!!! ... uh oh!!");
    }

    public void showBoard () {
        System.out.println("\n\n*****GME BOARD*****");
        System.out.println(" 0 1 2 3 4 6 7 8 9");

        System.out.print("a");
        for (int indx = 0; idx <= 9; ++idx) {
            System.out.print(a[idx]);
            System.out.print(" ");
        }
        System.out.print("\nb ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(b[idx]);
            System.out.print(" ");
        }
        System.out.print("\nc ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(c[idx]);
            System.out.print(" ");
        }
        System.out.print("\nd ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(d[idx]);
            System.out.print(" ");
        }
        System.out.print("\ne ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(e[idx]);
            System.out.print(" ");
        }
        System.out.print("\nf ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(f[idx]);
            System.out.print(" ");
        }
        System.out.print("\ng ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(g[idx]);
            System.out.print(" ");
        }
        System.out.print("\nh ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(h[idx]);
            System.out.print(" ");
        }
        System.out.print("\ni ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(i[idx]);
            System.out.print(" ");
        }
        System.out.print("\nj ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(j[idx]);
            System.out.print(" ");
        }
        System.out.println("\n\n");
    }

    Out o;
    public int[] a = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] b = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] c = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] d = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] e = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] f = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] g = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] h = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] i = {0,0,0,0,0,0,0,0,0,0} ;
    public int[] j = {0,0,0,0,0,0,0,0,0,0} ;
    public String shipRow;
    public int columnOne;
    public int columnTwo;
    public int columnThree;
    public int columnFour;
    public int columnFive;
}

public class Main {
    public static void main (String[] args) {
        Out o = new Out();
        o.msg("Welcome to Access Point Find-a-ship!");
        o.msg("I bet you can't find my ship!!!");
        o.msg("... well, at least not in less than 40 guesses which is when I become invisible to you!");
        int hits = 0;
        int guesses = 0;

        Board b = new Board();
        int rowRandom = (int)(Math.random() * 9); //0 to 9
        int columnStartRandom = (int)(Math.random() * 4); //0 to 4
        b.placeShip(rowRandom, columnStartRandom);

        while (hits < 5) {
            b.showBoard();
            b.handleUserGuess();
            hits = b.checkWinStatus();
            ++guesses;
            o.msg("You're up to " + guesses + " guesses now...");
            if (guesses == 40) break;
        }
        if (guesses == 40) {
            o.msg("\n\n\nOH YEEEAAAH!!!!");
            o.msg("I told you that you couldn't find me in less than 40 guesses!!");
            o.msg("Maybe, just maybe, you'll try again!");
        }
        else {
            o.msg("\n\n\nYou sunk my ship!!!!");
            o.msg("But that's ok, Ill figure out how to move next time.");
            o.msg("Thanks for playing Acess-Point-A-Ship!!!");
        }
    }
}