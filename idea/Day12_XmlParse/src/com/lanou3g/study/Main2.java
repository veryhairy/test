package com.lanou3g.study;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    static SAXReader reader =new SAXReader();
    static Document document= null;

    public static void main(String[] args) throws DocumentException {




         document = reader.read(new File("src/data.xml"));
        List<Student> students = ListElements();
        System.out.println(
                Arrays.toString(students.toArray())
        );
        //  allEles(document.getRootElement());

    }
    public  static  void  allEles(Element e){

        List<Attribute> attributes = e.attributes();
        for (int i = 0; i < attributes.size(); i++) {
            Attribute attr = attributes.get(i);

            System.out.println("属性名为："+attr.getName()+"\t属性值为"+attr.getValue());

        }

        String text = e.getText();
        System.out.println("当前元素的文本为："+text);
        List<Element> elements = e.elements();


        //如果没有子标签，则结束这个方法
        if (elements.size() == 0){
            return;
        }

        for (int i = 0; i < elements.size(); i++) {
            //获得第i个子标签

            Element ele = elements.get(i);

            //扔到allEles这个方法中
            allEles(ele);
        }

    }

    private static List<Student> ListElements() throws DocumentException {


        Element rootElement = document.getRootElement();
        List<Element> student = rootElement.elements("student");

        List<Student> studentsData = new ArrayList<>();

        for (int i = 0; i < student.size(); i++) {
            Element ele = student.get(i);
            Student stu = new Student();

            Attribute name = ele.attribute("name");
            //获得name属性的值
            String nameValue = name.getValue();
            //设置到stu这个对象中
            stu.setName(nameValue);

            Element score = ele.element("score");

            //拿到score标签中的文本
             String text = score.getText();

             //"1001"--->1001
             stu.setScore(Integer.parseInt(text));

             //把数据健全的学生对象，装进集合中
            studentsData.add(stu);

            System.out.println("学生的名为："+ nameValue +
            "学生的分数为："+ text);
        }
        return studentsData;
    }



}
