class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] p = new int[n], size = new int[n];

        for(int i = 0; i < n; i++){
            p[i] = i;
            size[i] = 1;
        }


        int components = n;
        for(int [] e : edges){
            int ra = find(p,e[0]);
            int rb = find(p,e[1]);
            if(ra == rb) return false;
            unionRoots(p,size,ra,rb);
            components--;
        }

        return (components == 1);

    }

    private void unionRoots(int[] p, int[] size, int ra, int rb){
        if(size[ra] < size[rb]){
            int t = ra;
            ra = rb;
            rb = t;
        }
        size[ra] += size[rb];
        p[rb] = p[ra];
    }

    private int find(int[] p, int x){
        while(p[x] != x){
            p[x] = p[p[x]];
            x = p[x];
        }

        return x;
    }
}
