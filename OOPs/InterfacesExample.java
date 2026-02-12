public class InterfacesExample {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        Rook r = new Rook();
        q.move();
        pawn p = new pawn();
        p.move();
    }
}
interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("move in all direction");
    }
}
class Rook implements ChessPlayer {
    public void move() {
        System.out.println("left, right, down, top");
    }
}
class pawn implements ChessPlayer {
    public void move() {
        System.out.println("left, right");
    }
}