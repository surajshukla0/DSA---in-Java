class Solution {
    public Node copyRandomList(Node head) {

        // if (head == null) {
        //     return null;
        // }

        // HashMap<Node, Node> map = new HashMap<>();

        // // First pass: create copy nodes
        // Node temp1 = head;

        // while (temp1 != null) {
        //     map.put(temp1, new Node(temp1.val));
        //     temp1 = temp1.next;
        // }

        // // Second pass: connect next and random
        // temp1 = head;

        // while (temp1 != null) {
        //     Node copy = map.get(temp1);

        //     copy.next = map.get(temp1.next);
        //     copy.random = map.get(temp1.random);

        //     temp1 = temp1.next;
        // }

        // return map.get(head);


        // Optimal approch

        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp != null){
            Node cloneNode = new Node(temp.val);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = cloneNode.next;
        }
        temp = head;
        while(temp != null){
            Node oldNode = temp;
            Node newNode = temp.next;
            if(oldNode.random != null){
                newNode.random = oldNode.random.next;
            }
            temp = newNode.next;
        }
        temp = head;
        Node ansHead = head.next;
        while(temp != null){
            Node oldNode = temp;
            Node cloneNode = temp.next;
            oldNode.next = cloneNode.next;
            if(cloneNode.next != null){
                cloneNode.next = cloneNode.next.next;
            }
            temp = temp.next;
        }
        return ansHead;
    }
}