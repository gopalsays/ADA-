package PrimsAlgo;

/**
 * 
 * @author Gopal
 *
 */
class Bellman
{
    static void BellmanFord(int graph[][], int V, int E,
                            int src) {
        boolean flag = true;
        int dis[] = new int[V];
        int infinity = 1000000;
        for (int i = 0; i < V; i++)
            dis[i] = infinity;
        dis[src] = 0;

        for (int i = 0; i < V - 1; i++)  {
            for (int j = 0; j < E; j++) {
                if (dis[graph[j][0]] != infinity && dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]]) {
                    dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
                }
            }
        }

        for (int i = 0; i < E; i++) {
            int x = graph[i][0];
            int y = graph[i][1];
            int weight = graph[i][2];
            if (dis[x] != infinity && dis[x] + weight < dis[y]) {
                System.out.println("It contains negative weight cycle");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < V; i++)
                System.out.println(i + "\t\t" + dis[i]);
        }
        else {
            System.out.println(flag);
        }
    }

    public static void main(String[] args)
    {
        int V = 5;
        int E = 8;
        int graph[][] = { { 0, 1, 1 }, { 0, 2, 4 },
                { 1, 2, 3 }, { 1, 3, 2 },
                { 1, 4, 2 }, { 3, 2, 5 },
                { 3, 1, 1 }, { 4, 3, 3 } };
        BellmanFord(graph, V, E, 0);
        int graph1[][] = { { 0, 1, -1 }, { 0, 2, -4 },
                { 1, 2, 3 }, { 1, 3, 2 },
                { 1, 4, 2 }, { 3, 2, 5 },
                { 3, 1, -1 }, { 4, 3, -3 } };
        System.out.println("\n\n");
        BellmanFord(graph1, V, E, 0);
    }
}

/**
 
public class Bellman {

	static void BellmanFord(int a[][], int v, int e, int src) {

		int[] dist = new int[v];

		for (int i = 0; i < v; i++)
			dist[i] = 999999999;

		dist[src] = 0;

		for (int i = 0; i < v - 1; i++) {

			for (int j = 0; j < e; j++) {
				if (dist[a[j][0]] != 999999999 && dist[a[j][0]] + a[j][2] < dist[a[j][1]])
					dist[a[j][1]] = dist[a[j][0]] + a[j][2];
			}
		}

		for (int i = 0; i < e; i++) {
			int x = a[i][0];
			int y = a[i][1];
			int weight = a[i][2];
			if (dist[x] + weight < dist[y])
				System.out.println("Graph contains negative" + " weight cycle");
		}

		System.out.println("Vertex" + "\t\t" + "Distance from Source");
		for (int i = 0; i < v; i++)
			System.out.println(i + "\t\t" + dist[i]);
	}

	public static void main(String[] args) {
		int v = 5;
		int e = 7;
		
		int a[][] = { { 1, 3, -4 }, { 1, 4, -6 }, { 2, 1, 7 }, { 3, 2, 2 }, { 4, 0, -3 }, { 4, 3, 9 }, { 0, 1, 5 } };

		BellmanFord(a, v, e, 0);
	}
}
  
 * */
