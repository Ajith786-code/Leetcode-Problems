class MyHashSet {

    //Use a boolean[] of size 1_000_001 (to handle key = 10⁶).
    //All values are initially false, representing an empty set.
    private boolean[] storage;
    public MyHashSet() {
         storage= new boolean[1_000_001];
    }
    
    public void add(int key) {
        storage[key]=true; //Mark key as present
    }
    
    public void remove(int key) {
        storage[key]=false; //Mark key as absent
    }   
    
    public boolean contains(int key) {
        return storage[key]; //Check if key is present
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */