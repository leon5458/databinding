package com.hxm;

/**
 * ********文件描述：********
 * ********作者：huleiyang********
 * ********创建时间：2019/12/10********
 * ********更改时间：2019/12/10********
 * ********版本号：1********
 */
public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
