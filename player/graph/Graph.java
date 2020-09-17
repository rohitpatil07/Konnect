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
       return VertexList.size();
    }

    public ArrayList<Vertex> vertices(){
      ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
      for(Vertex v : VertexList){
        vertexList.add(v);
      }
      return vertexList;
    }

    public int numEdges(){
       return EdgeList.size();
    }

    public ArrayList<Edge> edges(){
      ArrayList<Edge> edgeList = new ArrayList<Edge>();
      for(Edge e : edgeList){
        edgeList.add(e);
      }
       return edgeList;
    }

    public Edge getEdge(Vertex u, Vertex v){
       HashMap<Vertex, Edge> umap = u.getMap();
       return umap.getOrDefault(v,null);
    }

    public ArrayList<Vertex> endVertices(Edge e){
      ArrayList<Vertex> endVertex = new ArrayList<Vertex>();
      endVertex.add(e.a);
      endVertex.add(e.b);

      return endVertex;
    }

    public Vertex opposite(Vertex v,Edge e){
      if(e.a != v && e.b != v){
        return null;
      }else if(e.a==v){
        return e.b;
      }else{
        return e.a;
      }
    }

    public ArrayList<Edge> outGoingEdges(Vertex v){
      ArrayList<Edge> outgoingedges = new ArrayList<Edge>();
      HashMap<Vertex, Edge> vmap = v.getMap();
      for(Vertex vertex : vmap.keySet()){
        outgoingedges.add(vmap.get(vertex));
      }
      return outgoingedges;
    }

    public int outDegree(Vertex v){
      return outGoingEdges(v).size();
    }

}
