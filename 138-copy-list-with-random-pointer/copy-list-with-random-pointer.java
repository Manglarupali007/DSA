class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // 1. Har node ki copy banao
        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // 2. Next aur random connect karo
        curr = head;

        while (curr != null) {
            Node copy = map.get(curr);

            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }
}