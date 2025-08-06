// Last updated: 6/8/2025, 11:07:09 pm
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Pair[] arr = new Pair[names.length];
        for(int i=0;i<arr.length;i++){
            Pair p = new Pair(names[i],heights[i]);
            arr[i]=p;
        }
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.h-a.h;
            }
        });
        String[]ans=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i].name;
        }
        return ans;
    }

    class Pair{
        String name;
        int h;

        public Pair(String name,int h){
            this.name = name;
            this.h=h;
        }
    }
}