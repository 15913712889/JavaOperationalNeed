package cn.caixiaobai.study.StudyMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 10:00
 * describe(描述): 了解各个map的特性，并熟练使用
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMap {

     
    /**
     * HashMap
     * 线程不安全
     *  使用位桶和链表实现（最近的jdk1.8改用红黑树存储而非链表），它是线程不安全的Map，方法上都没有synchronize关键字修饰
     *  特点：
     * 1、允许key/value为null，但是key只能有一个null
     *
     * 2、非线程安全，多个线程同时操作同一个HashMap实例所做的修改在线程间不同步
     *
     * 3、遍历时不保证任何顺序，跟元素插入顺序或者访问顺序无关
     *
     * 4、进行遍历时如果执行HashMap的remove(Object key)或者put(Object value)方法时会快速失败，
     * 抛出异常ConcurrentModificationException。遍历时删除元素只能通过Iterator本身的remove()方法实现。参考如下代码：
     */
    @Test
    public void demo01(){
        HashMap<String, Object> objectObjectHashMap = new HashMap();//可以省略中括号
        objectObjectHashMap.put("a","对象1");
        objectObjectHashMap.put("a","对象2");
        objectObjectHashMap.put("b","对象2");
        objectObjectHashMap.put("c","对象3");
        System.out.println(objectObjectHashMap.toString());
        Integer a = 100;
        Integer b = 20;
        System.out.println(a%b);

    }

    /**
     *  HashTable
     *     hashTable是线程安全的一个map实现类，它实现线程安全的方法是在各个方法上添加了synchronize关键字。
     * 但是现在已经不再推荐使用HashTable了，因为现在有了ConcurrentHashMap这个专门用于多线程场景下的map实现类，
     * 其大大优化了多线程下的性能。
     */


    /**
     * ConcurrentHashMap
     *  这个map实现类是在jdk1.5中加入的
     *  jdk1.6/1.7中的主要实现原理是segment段锁，它不再使用和HashTable一样的synchronize一样的关键字
     *  对整个方法进行枷锁，而是转而利用segment段落锁来对其进行加锁，以保证Map的多线程安全。
     *  ========================================jdk1.8前后对比=========================================
     *  在JAVA的jdk1.8中则对ConcurrentHashMap又再次进行了大的修改，取消了segment段锁字段，
     *  采用了CAS+Synchronize技术来保障线程安全。
     *  底层采用数组+链表+红黑树的存储结构，也就是和HashMap一样。
     *  这里注意Node其实就是保存一个键值对的最基本的对象。其中Value和next都是使用的volatile关键字进行了修饰，
     *  以确保线程安全
     */
    @Test
    public void demo02(){
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1","对象1");
        concurrentHashMap.put("1","对象1");
        concurrentHashMap.put("2","对象1");
        concurrentHashMap.put("3","对象1");
        System.out.println(concurrentHashMap.toString());
    }

    /**
     * treeMap
     *  就是会对插入的元素进行排序
     *      如果想要按照其他方式来排序，需要重写它的compartor接口。
     */
    @Test
    public void demo03(){

        TreeMap<String, String> stringStringTreeMap = new TreeMap<>();
        stringStringTreeMap.put("c","对象c");
        stringStringTreeMap.put("d","对象d");
        stringStringTreeMap.put("a","对象a");
        stringStringTreeMap.put("b","对象b");

        System.out.println(stringStringTreeMap.toString());
    }

    /**
     * LinkedHashMap主要依靠双向链表和hash表来实现的。
     *  LinkedHashMap是有序的，这里的有序是指插入的顺序，并非排列的顺序
     *  增加了时间和空间上的开销
     *  线程不安全
     */
    @Test
    public void demo04(){
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("c","对象c");
        linkedHashMap.put("d","对象d");
        linkedHashMap.put("a","对象a");
        linkedHashMap.put("b","对象b");
        System.out.println(linkedHashMap.toString());
    }

    /**
     * weakHashMap
     * weakHashMap它是一个“弱键”，它的Key值和Value都可以是null
     * 而且其Map中如果这个Key值指向的对象没被使用，此时触发了GC，该对象就会被回收掉的。
     */
    @Test
    public void demo05(){
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("c","对象c");
        linkedHashMap.put("d","对象d");
        linkedHashMap.put("a","对象a");
        linkedHashMap.put("b","对象b");
        System.out.println(linkedHashMap.toString());
    }
}
