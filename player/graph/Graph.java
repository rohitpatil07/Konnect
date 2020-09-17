package player.graph;


import java.util.ArrayList;
import java.util.HashMap;


class Graph{

    private ArrayList<Vertex> VertexList;
    private ArrayList<Edge> EdgeList;

    public Graph(){
        this.VertexList = new ArrayList<Vertex>();
        this.EdgeList = new ArrayList<Edge>();
    }

    public int numVertices(){
       return VertexList.length();
    }

    public ArrayList<Vertex> vertices(){
      ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
      for(Vertex v : VertexList){
        vertexList.add(v);
      }
      return vertexList;
    }

    public int numEdges(){
       return EdgeList.length();
    }

    public ArrayList<Edge> edges(){
      ArrayList<Edge> edgeList = new ArrayList<Edge>();
      for(Edge e : edgeList){
        edgeList.add(e);
      }
       return edgeList;
    }
}
