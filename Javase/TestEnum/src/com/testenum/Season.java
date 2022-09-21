package com.testenum;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 10:10
 * 创建枚举类： 季节
 */
public class Season {
    //创建两个季节的属性，名字和描述
    private final String seasonName;
    private final String seasonDesc;

    /**
     * @param seasonName  季节名字
     * @param seasonDesc 季节描述
     */
    private  Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //创建季节的四个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","烈日炎炎");
    public static final Season AUTUMN=new Season("秋天","硕果累累");
    public static final Season WINTER=new Season("冬天","冰天雪地");

    //get方法便于外界获取名字和描述
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
