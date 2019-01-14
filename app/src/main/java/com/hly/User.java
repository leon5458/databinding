package com.hly;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/1/14~~~~~~
 * ~~~~~~更改时间:2019/1/14~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class User {
    private String name;
    private String age;
    private int sex;

    public User(String name, String age ,int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //还记得上面要取出user对象的name属性吗 其实就是调用了getter方法
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
