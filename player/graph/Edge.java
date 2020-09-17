package player.graph;

class Edge{
    public static int NORTH = 1;
    public static int SOUTH = 1;
    public static int EAST = 2;
    public static int WEST = 2;
    public static int NORTHEAST = 3;
    public static int SOUTHWEST = 3;
    public static int SOUTHEAST = 4;
    public static int NORTHWEST = 4;
    
    Vertex a;
    Vertex b;
    int direction;
    
    public Edge(Vertex a, Vertex b){
        this.a = a;
        this.b = b;
        if(a.x == b.x){
            this.direction = EAST;
        }else if(a.y == b.y){
            this.direction = NORTH;
        }else if(((a.x < b.x) && (a.y < b.y)) || ((b.x < a.x) && (b.y < a.y))){
            this.direction = NORTHEAST;
        }else if(((a.x < b.x) && (a.y > b.y)) || ((b.x < a.x) && (b.y > a.y))){
            this.direction = NORTHWEST;
        }
    }
}

