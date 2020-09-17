package player.graph;

class Vertex{

    int color;
    int x;
    int y;
    int vertexNumber;


    private static int nextBlackVertexNumber = 1;
    private static int nextWhiteVertexNumber = 1;

    public static int WHITE = 1;
    public static int BLACK = 2;


    public Vertex(int color, int x, int y) throws InvalidNodeException{
        this.x = x;
        this.y = y;
        if((color != WHITE) && (color != BLACK)){
            throw new InvalidNodeException("Invalid color provided to vertex.");
        }
        if(color == WHITE){
            if(nextWhiteVertexNumber > 10){
                throw new InvalidNodeException("Vertex Count for White color Exceeded 10.");
            }else{
                this.color = WHITE;
                this.vertexNumber = nextWhiteVertexNumber;
                nextWhiteVertexNumber++;
            }
        }else if(color == BLACK){
            if(nextBlackVertexNumber > 10){
                throw new InvalidNodeException("Vertex Count for Black color Exceeded 10.");
            }else{
                this.color = BLACK;
                this.vertexNumber = nextBlackVertexNumber;
                nextBlackVertexNumber++;
            }
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getColor(){
        return this.color;
    }

    public int getVertexNumber(){
        return this.vertexNumber;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

}
