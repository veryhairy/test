package com.lanou3g.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class UserData {
    private static List<Person> list = new ArrayList();
    private static Map<String,Person> map = new HashMap<>();

    public UserData() {
        list.add(new Person("张三","zhangSan","111111","Worker"));
        list.add(new Person("李四", "liSI666", "222222", "Doctor"));
        list.add(new Person("王五", "wangWu888", "333333", "Cooker"));
        list.add(new Person("赵六", "zhaoLiu999", "444444", "Boss"));
        map.put("zhangSan",new Person("张三","zhangSan","111111","Worker"));
        map.put("liSi666",new Person("李四", "liSI666", "222222", "Doctor"));
        map.put("wangWu888",new Person("王五", "wangWu888", "333333", "Cooker"));
        map.put("zhaoLiu999",new Person("赵六", "zhaoLiu999", "444444", "Boss"));

    }

    public static List getList() {
        return list;
    }

    public static void setList(Person person) {
        UserData.list.add(person);
    }

    public static Map<String, Person> getMap() {
        return map;
    }

    public static void setMap(Map<String, Person> map) {
        UserData.map = map;
    }
}
