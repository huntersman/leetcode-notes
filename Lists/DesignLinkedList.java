public class DesignLinkedList {

    private static class MyList {
        int val;
        MyList next;

        public MyList() {
        }

        public MyList(int val) {
            this.val = val;
        }
    }

    MyList head;
    int size;

    public DesignLinkedList() {
        head = new MyList(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        MyList tmp = head;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index < 0) {
            index = 0;
        }
        size++;
        MyList pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        MyList toAdd = new MyList(val);
        toAdd.next = pre.next;
        pre.next = toAdd;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        MyList pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}
