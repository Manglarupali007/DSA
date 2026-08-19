class LFUCache {
    class Node {
        int key, value, freq;
        Node next, prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            freq = 1;
        }
    }

    class DoublyLinkedList {
        Node head, tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void add(Node node) {
            node.next = tail;
            node.prev = tail.prev;
            tail.prev.next = node;
            tail.prev = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeFirst() {
            Node node = head.next;
            remove(node);
            return node;
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();
    HashMap<Integer, DoublyLinkedList> freqMap = new HashMap<>();
    int capacity, minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            updateFrequency(node);
            return;
        }

        if (map.size() == capacity) {
            DoublyLinkedList list = freqMap.get(minFreq);
            Node lru = list.removeFirst();
            map.remove(lru.key);
        }

        Node node = new Node(key, value);
        map.put(key, node);
        minFreq = 1;

        DoublyLinkedList list = freqMap.getOrDefault(1, new DoublyLinkedList());
        list.add(node);
        freqMap.put(1, list);
    }

    void updateFrequency(Node node) {
        int oldFreq = node.freq;
        DoublyLinkedList oldList = freqMap.get(oldFreq);
        oldList.remove(node);

        if (oldFreq == minFreq && oldList.size == 0)
            minFreq++;

        node.freq++;

        DoublyLinkedList newList = freqMap.getOrDefault(node.freq, new DoublyLinkedList());
        newList.add(node);
        freqMap.put(node.freq, newList);
    }
}