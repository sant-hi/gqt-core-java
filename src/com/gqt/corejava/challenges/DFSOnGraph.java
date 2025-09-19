package com.gqt.corejava.challenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Graph {
private int vertices;
private List<List<Integer>> adjacencyList;
public Graph(int vertices) {
this.vertices= vertices;
this.adjacencyList = new ArrayList (vertices);
for (int i = 0; i < vertices; i++) {
this.adjacencyList.add(new ArrayList());}}
public void addEdge(int source, int destination) {
this.adjacencyList.get(source).add(destination);}
public void DFS(int startVertex) {
boolean[] visited = new boolean[vertices];
Stack<Integer> stack = new Stack();
stack.push(startVertex);
while (!stack.isEmpty()) {
int currentVertex= stack.pop();
if (!visited[currentVertex]) {
System.out.print(currentVertex + " ");
visited[currentVertex] = true;}
for (int neighbor: adjacencyList.get(currentVertex)) {
if (!visited[neighbor]) {
stack.push(neighbor);
}}}}}
public class DFSOnGraph {
public static void main(String[] args) {
int vertices = 5;
Graph graph = new Graph(vertices);
graph.addEdge(0, 1);
graph.addEdge(0, 2);
graph.addEdge(1, 3);
graph.addEdge(1, 4);
System.out.println("Depth-First Search (DFS) starting from vertex 0:");
graph.DFS(0);}}

