public class interfaces {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("moves anywhere");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
