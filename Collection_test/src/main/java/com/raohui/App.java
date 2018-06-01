package com.raohui;

import java.util.*;

/**
 * Hello world!
 *
 */
class ListTest{

    public void listTest(){
        System.out.println("list_test------------------");
        List<String>  l;
        //1.ArrayList 实现了 List 接口，即 ArrayList 实现了可变大小的数组。它允许所有元素，包括 null。
        //2.ArrayList 是为可变数组实现的，当更多的元素添加到 ArrayList 的时候，它的大小会动态增大。
        //它的元素可以通过 get/set 方法直接访问，因为 ArrayList 本质上是一个数组。
        //3.每个 ArrayList 实例都有一个容量（Capacity），即用于存储元素的数组的大小。
        //这个容量可随着不断添加新元素而自动增加，但是增长算法并没有定义。
        //当需要插入大量元素时，在插入前可以调用 ensureCapacity 方法来增加 ArrayList 的容量以提高插入效率。
        //4.注意 ArrayList 没有同步方法。如果多个线程同时访问一个 List，
        //则必须自己实现访问同步。一种解决方法是在创建 List 时构造一个同步的 List：
        //List list = Collections.synchronizedList(new ArrayList(...)); 
        l = new ArrayList<String>();

        //1.List 接口的链接列表实现。实现所有可选的列表操作，并且允许所有元素（包括 null）。
        //LinkedList 是为双向链表实现的，添加、删除元素的性能比 ArrayList 好，但是 get/set 元素的性能较差。
        //2.除了实现 List 接口外，LinkedList 类还为在列表的开头及结尾 get、remove 和 insert 元素提供了统一的命名方法。
        //这些操作允许将链接列表用作堆栈、队列或双端队列。
        //此类实现 Deque 接口，为 add、poll 提供先进先出队列操作，以及其他堆栈和双端队列操作。
        //3.所有操作都是按照双重链接列表的需要执行的。在列表中编索引的操作将从开头或结尾遍历列表（从靠近指定索引的一端）。
        //4.注意 LinkedList 没有同步方法。如果多个线程同时访问一个 List，
        //则必须自己实现访问同步。 一种解决方法是在创建 List 时构造一个同步的 List：
        //List list = Collections.synchronizedList(new LinkedList(...));
        //l = new LinkedList<String>();


        //1.Vector 和 ArrayList 几乎是一样的，区别在于 Vector 是线程安全的，因为这个原因，它的性能较 ArrayList 差。
        //通常情况下，大部分程序员都使用 ArrayList，而不是 Vector，因为他们可以自己做出明确的同步操作。
        //2.Vector 类可以实现可增长的对象数组。与数组一样，它包含可以使用整数索引进行访问的组件。
        //但是，Vector 的大小可以根据需要增大或缩小，以适应创建 Vector 后进行添加或移除项的操作。
        //3.每个向量会试图通过维护 capacity 和 capacityIncrement 来优化存储管理。capacity 始终至少应与向量的大小相等；
        //这个值通常比后者大些，因为随着将组件添加到向量中，其存储将按 capacityIncrement 的大小增加存储块。
        //应用程序可以在插入大量组件前增加向量的容量；这样就减少了增加的重分配的量。
        //4.Vector 是线程安全的     
        //l = new Vector<String>();

        l.add("raohui");
        l.add("leihui");
        l.add("haha");
        for (String str : l) {
            System.out.println(str);
        }
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        Iterator<String> iter = l.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

}
class SetTest{
    public void setTest(){
        System.out.println("set_test------------------");


        //Set元素是不允许重复的,Set的底层实现都是基于相应的Map,只不过对应Map的value都是同一个object
        Set<Integer> set; 


        //HashSet 是哈希表实现的, HashSet中的数据是无序的
        //HashSet特点:
        //1.不能保证元素的排列顺序,顺序有可能发生变化
        //2.不是同步的
        //3.集合元素可以是 null, 但只能放入一个 null
        //4.非线程安全
        //HashSet 会调用存储对象的 hashCode() 方法来得到该对象的 hashCode 值，
        //然后根据 hashCode 值来决定该对象在 HashSet 中存储位置。 
        //简单的说，HashSet 集合判断两个元素相等的标准是两个对象通过 equals 方法比较相等，
        //并且两个对象的 hashCode() 方法返回值相等 
        //注意，如果要把一个对象放入 HashSet 中，重写该对象对应类的 equals 方法，也应该重写其 hashCode() 方法。
        //其规则是如果两个对 象通过 equals 方法比较返回 true 时，其 hashCode 也应该相同。
        set = new HashSet<Integer>();

        //TreeSet 是二差树(红黑树算法)实现的 
        //TreeSet特点:
        //1.Treeset 中的数据是自动排好序的
        //2.不允许放入null 值。
        //改变排序方式:Java 提供了一个 Comparable 接口，该接口里定义了一个 compareTo(Object obj) 方法，
        //该方法返回一个整数值，实现了该接口的对象就可以比较大小。
        //set = new TreeSet<Integer>();

        //LinkedHashSet 介于 HashSet 和 TreeSet 之间。
        //它也是一个 hash 表，但是同时维护了一个双链表来记录插入的顺序。基本方法的复杂度为 O(1)。
        //LinkedHashSet 集合同样是根据元素的 hashCode 值来决定元素的存储位置，
        //但是它同时使用链表维护元素的次序。这样使得元素看起来像是以插入顺序保存的，
        //也就是说，当遍历该集合时候，LinkedHashSet 将会以元素的添加顺序访问集合的元素。 
        //set = new LinkedHashSet<Integer>();

        set.add(100);
        set.add(2);
        set.add(100);
        set.add(3);

        for (Integer i : set) {
            System.out.println(i);
        }

    }

}





class MapTest{
    public void mapTest(){
        System.out.println("map_test------------------");
        //Map 用于存储键值对，根据键得到值，因此不允许键重复，值可以重复。
        //HashMap,Hashtable,LinkedHashMap的底层实现都是数组 + 链表结构实现的
        //TreeMap是基于红黑树算法实现的
        Map<String, Integer> map;
 
        //HashMap 是一个最常用的 Map，它根据键的 hashCode 值存储数据，根据键可以直接获取它的值，具有很快的访问速度。
        //HashMap 最多只允许一条记录的键为 null，不允许多条记录的值为 null。
        //HashMap 不支持线程的同步。如果需要同步，
        //可以用 Map map = Collections.synchronizedMap(new HashMap())方法使HashMap 具有同步的能力。
        map = new HashMap<String, Integer>();

        //Hashtable 与 HashMap 类似，
        //不同的是：它不允许记录的键或者值为空；
        //它支持线程的同步，即任一时刻只有一个线程能写 Hashtable，然而，这也导致了 Hashtable 在写入时会比较慢。
        //map = new Hashtable<String,Integer>();
        
        //LinkedHashMap有HashMap的全部特性,同时使用链表维护元素的次序。这样使得元素看起来像是以插入顺序保存的，
        //在用Iteraor 遍历 LinkedHashMap 时，先得到的记录肯定是先插入的。
        //在遍历的时候会比 HashMap 慢。
        //map = new LinkedHashMap<String, Integer>();

        //TreeMap能够把它保存的记录根据键排序，默认是按升序排序，也可以指定排序的比较器。
        //当用 Iteraor 遍历 TreeMap 时，得到的记录是排过序的。
        //TreeMap 的键和值都不能为空
        //map = new TreeMap<String,Integer>();


        map.put("raohui",100);
        map.put("leihui",99);
        map.put("旗海",88);
        for (String key : map.keySet()) {
            System.out.println("key:"+key+",value:"+map.get(key));
        }
        Iterator<Map.Entry<String,Integer>> siter = map.entrySet().iterator();
        while(siter.hasNext()){
            Map.Entry<String,Integer> entry = siter.next();
            System.out.println("key:"+entry.getKey()+",value"+entry.getValue());
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("key:"+entry.getKey()+",value"+entry.getValue());

        }
    }

}

class CollectionsTestForList{
    public void printList(List<Integer> list){
        for (Integer i : list) {
            System.out.println(i);
        }
    }
    public void collectionTest(){
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("最初排序");
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println(list);
        
        System.out.println("--------使用reverse--------");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("--------使用sort--------");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("--------使用swap--------");
        Collections.swap(list,1,3);
        System.out.println(list);

        System.out.println("--------使用shuffle--------");
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("--------使用sort带比较器--------");
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer i1,Integer i2){
                return i1 < i2 ? 1 :(i1 == i2 ? 0:-1);
            }
        });
        System.out.println(list);

        System.out.println("--------使用rotate--------");
        Collections.rotate(list,1);
        System.out.println(list);

    }

}

class CollectionsTestForCollection{
    public void collectionTest(){
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("最初排序");
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(1);


        Collections.sort(list);
        System.out.println("list:"+list);
        int index = Collections.binarySearch(list,3);
        System.out.println("3的位置:"+index);
        int count = Collections.frequency(list,5);
        System.out.println("5出现的次数:"+count);
        Collections.replaceAll(list,5,6);
        System.out.println("把5替换成6:"+list);

        Set<Integer> set = new TreeSet<Integer>();
        set.add(4);
        set.add(3);
        set.add(45);
        set.add(41);
        set.add(1);
        System.out.println("set:"+set);
        int max = Collections.max(set);
        System.out.println("max:"+max);
        int min = Collections.min(set);
        System.out.println("min:"+min);

        boolean ishava = Collections.disjoint(list,set);
        System.out.println("list和set两个集合中是否没有相同元素:"+ishava);
        
    }

}

public class App 
{
    public static void main( String[] args )
    {
        //new ListTest().listTest();
        //new SetTest().setTest();
        //new MapTest().mapTest();
        //new CollectionsTestForList().collectionTest();
        new CollectionsTestForCollection().collectionTest();

    }
}
