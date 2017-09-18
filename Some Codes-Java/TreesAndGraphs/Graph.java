package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

import java.util.Iterator;

public class Graph {
	int V;
	LinkedList<Integer> adj[];
	
	public Graph(int V){
		this.V= V;
		adj = new  LinkedList[V];
		for(int i = 0; i < V; i++){
			adj[i] = new LinkedList<Integer>();
		}
		}
	public void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void BFS(int s){
		boolean visited[] = new boolean[V];
		Queue<Integer> q = new LinkedList<Integer>();
		visited [s] = true;
		q.add(s);
		while(!q.isEmpty()){
			int n = q.poll();
			System.out.println(n + " ");
			Iterator<Integer>  i = adj[n].iterator();
			while(i.hasNext()){
				int j = i.next();
			if(!visited[j]){
				visited[j] = true;
				q.add(j);
			}
			
		}
		}
	}
	
	public void DFSUnit(int v, boolean visited[]){
		visited[v] = true;
		System.out.println(v + " ");
		Iterator<Integer> i = adj[v].iterator();
		while(i.hasNext()){
			int j = i.next();
			if(!visited[j]){
				visited[j] = true;
				DFSUnit(j, visited);
			}
		}
	}
	
	public void DFS(int s){
		boolean visited[] = new boolean[V];
		DFSUnit(s,visited);
	}

}
