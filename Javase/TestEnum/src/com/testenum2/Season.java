package com.testenum2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 10:32
 * jdk1.5后使用Enum创建枚举类
 */
public enum Season {
    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","硕果累累"),
    WINTER("冬天","冰天雪地");

    //创建两个季节的属性，名字和描述
    private final String seasonName;
    private final String seasonDesc;

    /**
     * @param seasonName  季节名字
     * @param seasonDesc 季节描述
     */
    private   Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //get方法便于外界获取名字和描述
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //重写toString方法
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
