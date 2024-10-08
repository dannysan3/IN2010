import java.util.*;
class Task implements Comparable<Task>{

  int id, time, staff;
  String name;
  int earliestStart, latestStart;
  List<Task> outEdges;

  int cntPredecessors;
  int finish;

  Boolean visited = false;


  public Task(int n) {
    id = n;
    this.outEdges = new ArrayList();
  }

  public void visit() {
    visited = true;
  }

  public void unvisit() {
    visited = false;
  }



  public void addEdge(Task t) {
    outEdges.add(t);
  }

  public int getId() {
    return id;
  }

  public List<Task> getNeighbors() {
    return outEdges;
  }

  public void print() {
    System.out.println("Node id: " + id);
    System.out.println("My cntPredecessors " + cntPredecessors);
    System.out.println("My Neighbors: ");
    for (Task t:outEdges ) {
      System.out.println(t);
    }
  }

  public String toString() {
    return "Node id: " + id;
  }


  public int compareTo(Task t) {
    if (t.time>this.time) {
      return -1;
    }

    else if(t.time == this.time) {
      return 0;
    }

    return 1;
  }

















}
