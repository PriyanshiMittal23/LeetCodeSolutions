// Last updated: 6/8/2025, 11:08:19 pm
class Solution {
    public int[] maximizeXor(int[] arr, int[][] queries) {
        Arrays.sort(arr);
		Pair[]p = new Pair[queries.length];
		for(int i=0;i<p.length;i++) {
			p[i]=new Pair(queries[i][0],queries[i][1],i);
		}
		Arrays.sort(p,new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {
				return p1.mi-p2.mi;
			}
		});
		int[]ans = new int[p.length];
		int j=0;
		Node root = new Node();
		for(Pair a:p) {
			while(j<arr.length && arr[j]<=a.mi) {
				add(root,arr[j]);
				j++;
			}
			if(j==0) {
				ans[a.idx]=-1;
			}
			else {
				ans[a.idx]=getXOR(root,a.si);
			}
		}
        return ans;
    }

    static class Node{
		Node zero;
		Node one;
	}

	
	static class Pair{
		int si,mi,idx;
		public Pair(int si, int mi,int idx) {
			this.si=si;
			this.mi=mi;
			this.idx=idx;
			
		}
	}
	
	public int getXOR(Node root, int val) {
		Node curr=root;
		int xor=0;
		for(int i=31;i>=0;i--) {
			int bit=(val&(1<<i));
			if(bit==0) {
				if(curr.one!=null) {
					xor+=(1<<i);
					curr=curr.one;
				}
				else {
					curr=curr.zero;
				}
			}
			else {
				if(curr.zero!=null) {
					xor+=(1<<i);
					curr=curr.zero;
				}
				else {
					curr=curr.one;
				}
			}
			
		}
		return xor;
	}

	
	public static void add(Node root, int val) {
		Node curr = root;
		for(int i=31;i>=0;i--) {
			int bit = (val & (1<<i));
			if(bit==0) {
				if(curr.zero!=null) {
					curr=curr.zero;
				}
				else {
					Node nn = new Node();
					curr.zero = nn;
					curr = nn;
				}
			}
			else {
				if(curr.one!=null) {
					curr=curr.one;
				}
				else {
					Node nn = new Node();
					curr.one = nn;
					curr = nn;
				}
			}
		}
	}
}