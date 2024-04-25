package ch3.list;

public class IntegerArrayList implements IntegerListInterFace {
    private Integer[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public IntegerArrayList() {
        item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }

    public IntegerArrayList(int n) {
        item = new Integer[n];
        numItems = 0;
    }

    @Override
    public void add(int k, Integer x) {
        if (numItems >= item.length || k < 0 || k > numItems) {
            return;
        } else {
            for (int i = numItems - 1; i >= k; i--) {
                item[i + 1] = item[i];
            }
            item[k] = x;
            numItems++;
        }
    }

    @Override
    public void append(Integer x) {
        if (numItems >= item.length) {
            return;
        } else {
            item[numItems] = x;
            numItems++;
        }
    }

    @Override
    public Integer remove(int k) {
        if (isEmpty() || k < 0 || k > numItems - 1) {
            return null;
        } else {
            Integer removeItem = item[k];

            for (int i = k; i < numItems - 1; i++) {
                item[i] = item[i + 1];
            }
            numItems--;
            return removeItem;
        }
    }

    @Override
    public boolean removeItem(Integer x) {
        int k = 0;
        while (k < numItems && item[k] != x) {
            k++;
        }
        if (k == numItems) {
            return false;
        } else {
            for (int i = k; i < numItems - 1; i++) {
                item[i] = item[i + 1];
            }

            numItems--;
            return true;
        }
    }

    @Override
    public Integer get(int i) {
        if (i >= 0 && i <= numItems - 1) {
            return item[i];
        } else {
            return null;
        }
    }

    @Override
    public void set(int i, Integer x) {
        if (i >= 0 && i <= numItems - 1) {
            item[i] = x;
        }
    }

    @Override
    public int indexOf(Integer x) {
        int i = 0;
//        while (i < numItems && item[i] != x) {
//            i++;
//        }
//        if (i == numItems) return -1;
//        else return i;
        for (i = 0; i < numItems; i++) {
            if (((Comparable) item[i]).compareTo(x) == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int len() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        numItems = 0;
    }

    public void printList() {
        System.out.print("List = { ");
        for (int i = 0; i < numItems - 1; i++) {
            System.out.print(item[i] + ", ");
        }
        System.out.println(item[numItems - 1] + " )");
    }

}
