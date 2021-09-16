import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int V;
  LinkedList<Integer> adj[];
    Queue<Integer> queue;


    public Graph(int vertices)
    {
        V=vertices;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
        adj[i]=new LinkedList<Integer>();
        }
        queue=new LinkedList<Integer>();

    }

    public void addEdge(int i,int j)
    {
        adj[i].add(j);
        adj[j].add(i);
    }

    public void BFS(int start)
    {
        int temp=0;
        boolean haveTraversedNode[] =new boolean[V];
        queue.add(start);
        haveTraversedNode[start]=true;
        while (queue.size()>0) {
            start=queue.poll();
            System.out.println(start+" , ");
            for (int i = 0; i < adj[start].size(); i++) {
                temp=adj[start].get(i);
            if(!haveTraversedNode[temp])
            {
                queue.add(temp);
                haveTraversedNode[temp]=true;
            }
            }
        }
    }
}
