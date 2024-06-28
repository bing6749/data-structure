package top.bing6749.Hash;
/*
 * @author  MaRui
 * @date  2024/2/1 15:32
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class HashTable {
    //节点类
    static class Entry {
        int hash;   //哈希码
        Object key; //健
        Object value;   //值
        Entry next;

        public Entry(int hash, Object key, Object value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }
    }

    Entry[] table = new Entry[16];
    int size = 0;//元素个数

    // 根据hash码获得value
    public Object get(int hash, Object key) {
        int idx = hash & (table.length - 1);
        Entry e = table[idx];
        while (e != null) {
            if (e.hash == hash && e.key.equals(key)) {
                return e.value;
            }
            e = e.next;
        }
        return null;
    }

    //向hash表存入新key value，如果key已经存在，则更新value
    public void put(int hash, Object key, Object value) {
        int idx = hash & (table.length - 1);
        if (table[idx] == null) {
            table[idx] = new Entry(hash, key, value);
        } else {
            Entry e = table[idx];
            while (true) {
                if (e.key.equals(key) && e.hash == hash) {
                    e.value = value;
                    return;
                }
                if (e.next == null) {
                    break;
                }
                e = e.next;
            }
            e.next = new Entry(hash, key, value); //新增
        }
        size++;
    }

    // 删除key
    public Object remove(int hash, Object key) {
        int idx = hash & (table.length - 1);
        if (table[idx] == null) {
            return  null;
        }
        Entry p = table[idx];
        Entry prev = null;
        while (p != null) {
            if(p.key.equals(key)){
                //找到了删除
                if (prev == null){
                    table[idx] = p.next;
                }else {
                    prev.next = p.next;
                }
                size--;
                return p.value;
            }
            p = p.next;
            prev = p;
        }
        return  null;
    }
}
