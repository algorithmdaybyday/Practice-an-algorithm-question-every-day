class LRUCache {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode post;
    }
    // always add node to the right of the head
    private void addNode(DLinkedNode node){
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }
    
    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;
        pre.post = post;
        post.pre = pre;
    }
    
    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }
    
    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }
    
    HashMap<Integer, DLinkedNode> cache = new HashMap<>();
    DLinkedNode head;
    DLinkedNode tail;
    int count;
    int capacity;
    
    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        this.head = new DLinkedNode();
        head.pre = null;
        this.tail = new DLinkedNode();
        tail.post = null;
        
        head.post = tail;
        tail.pre = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if(node == null) return -1;
        this.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if(node==null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            this.cache.put(key, newNode);
            this.addNode(newNode);
            count++;
            if(count > capacity){
                DLinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
            }
        }else{
            node.value = value;
            this.moveToHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
