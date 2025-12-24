package com.jorgeacetozi.algorithms.breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

class Vertex {
  String name;
  List<Vertex> neighbors;
  boolean visited;

  Vertex(String name) {
    this.name = name;
    this.visited = false;
    this.neighbors = new ArrayList<>();
  }

  @Override
  public String toString() {
    return this.name;
  }
}
