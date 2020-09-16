package graph;

class Vertex{
  int color;
  int x;
  int y;
  int vertexNumber;

  static int nextVertexNumber = 1;


  public Vertex(int color,int x,int y){
    if(nextVertexNumber <= 10){
      this.color = color;
      this.x = x;
      this.y = y;
      this.vertexNumber = nextVertexNumber;
      nextVertexNumber++;
    }
    else{
      throw new InvavlidNodeException("Vertex Count Exceeded 10");
    }
  }

}
