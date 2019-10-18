public class Test {
    public static void main(String[] args) {
        LRU<Integer, String> lru = new LRU<Integer, String>(5);
        lru.put(1, "a");
        lru.put(2, "b");
        lru.put(3, "c");
        lru.put(4,"d");
        lru.put(5,"e");
        System.out.println("原始链表为："+lru.toString());

        lru.get(4);
        System.out.println("获取key为4的元素之后的链表："+lru.toString());

        lru.put(6,"f");
        System.out.println("新添加一个key为6之后的链表："+lru.toString());

        lru.remove(3);
        System.out.println("移除key=3的之后的链表"+lru.toString());
    }
}
