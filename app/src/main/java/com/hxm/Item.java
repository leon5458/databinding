package com.hxm;

/**
 * ********文件描述：********
 * ********作者：huleiyang********
 * ********创建时间：2019/12/6********
 * ********更改时间：2019/12/6********
 * ********版本号：1********
 */
public class Item {
    private String title;
    private String label;
    private String content;
    private String image;
    private int photo;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Item(String title, String label , String content, String image,int photo) {
        this.title = title;
        this.label = label;
        this.content = content;
        this.image = image;
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
