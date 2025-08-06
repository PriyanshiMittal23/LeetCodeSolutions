// Last updated: 6/8/2025, 11:11:58 pm
class MedianFinder {
    List<Integer> l;
    PriorityQueue<Double> p;
    PriorityQueue<Double> q;
    public MedianFinder() {
        l=new ArrayList<>();
        p = new PriorityQueue<>();
        q = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        l.add(num);
        p.add(-1.0*num);
        q.add(-1.0*p.poll());
        if(q.size()>p.size()){
            p.add(-1.0*q.poll());
        }
    }
    
    public double findMedian() {
        if(p.size()==q.size()){
            return (q.peek()-p.peek())/2;
        }else{
            return -1.0*p.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */