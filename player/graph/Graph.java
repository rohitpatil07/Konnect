package player.graph;


import java.util.ArrayList;
import java.util.HashMap;


class Graph{

    private ArrayList<Vertex> VertexList; 
    private ArrayList<Edge> EdgeList; 
    private HashMap<Vertex,Edge> map; 

    public Graph(){
        this.VertexList = new ArrayList<Vertex>();
        this.EdgeList = new ArrayList<Edge>();
        this.map = new HashMap<Vertex,Edge>();
    }
}

