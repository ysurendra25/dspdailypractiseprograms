package DSApackage;
import java.util.*;

class LeetCode323 {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{3,4}};


        Map<Integer,List<Integer>> h1= new HashMap<>();
        for(int e1[]:edges) {
            int u = e1[0];
            int v = e1[1];
            h1.putIfAbsent(u,new ArrayList());
            h1.putIfAbsent(v,new ArrayList());
            h1.get(u).add(v);
            h1.get(v).add(u);
        }
        int component = 0;
        Set<Integer> visited = new HashSet<>();

        for(int key:h1.keySet()) {
            if(!visited.contains(key)) {
                dfs(key,h1,visited);
                component++;
            }
        }

        System.out.println(component);

    }
    public static void dfs(int key,Map<Integer,List<Integer>> h1,Set<Integer> visited) {
        visited.add(key);
        for(int  neighbour:h1.getOrDefault(key,new ArrayList<Integer>())) {
            if(!visited.contains(neighbour)) {
                dfs(neighbour,h1,visited);
            }
        }
    }
}