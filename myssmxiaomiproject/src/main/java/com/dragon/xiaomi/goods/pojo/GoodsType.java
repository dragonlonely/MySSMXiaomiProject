package com.dragon.xiaomi.goods.pojo;

/**
 * Created by jackiechan on 10/16/18/7:23 PM
 *
 * @Author jackiechan
 */
public class GoodsType {
    private int id;
    private String name;
    private int level;
    private int parent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }
}
