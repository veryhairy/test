package com.lanou3g.study;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // psvm main方法的快捷键
        // sout 输出语句的快捷键
        /*
            集合
            什么是集合?
            在使用数组时,我们发现,数组的长度是不可变的
            这时候,我们来学习集合,集合也可以装载一些元素
            并且,集合的大小,是可以改变的
         */
        // 创建了一个集合对象
        // 这里体现了多态性
        // 通过观察发现,List是一个接口,那么,ArrayList一定是List的实现类
        // java中,类最多只能继承一个类
        // java只支持单继承
        // 但是java中支持多实现
        // 也就是一个类可以实现多个接口,多个接口用逗号分隔开
        List list = new ArrayList();
        System.out.println(list.size());
        // length   数组的长度,是一个属性
        // length() 字符串的长度,是一个方法
        // size()   集合的方法,获取集合的长度

        // 给集合添加一个元素
        // add方法可以接受任意类型的对象
        list.add("张三");
        list.add( new Student());   // 李四
        list.add(1);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            // i = 2    list.get(i) = 1
            System.out.println(object);
        }

        /*
         基本数据类型是值,不是对象
         基本数据类型包装类
         八大基本数据类型,每个类型都有一个包装类
         包装类,其实就是一个class,就是一个类型
         可以创建该类型对象
         对应关系
         int    Integer
         char   Character
         byte   Byte
         short  Short
         long   Long
         float  Float
         double Double
         boolean    Boolean
         除了int 和 char 其他都是基本数据类型的大驼峰结构

         自动拆箱和自动装箱
         把值装进箱子的的过程
         自动装箱
         Integer a = 1;// 自动装箱
                // a = new Integer(1);
         int b = a; // 自动拆箱

          */
        Integer a = 1;
        int b = a;

        Object j = 1;
        System.out.println(j.getClass().getName());
        // 为什么java中会有八种基本数据类型
        // 为了方便划分内存
        list.set(2,"Nice_try");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println(list);
    }
}