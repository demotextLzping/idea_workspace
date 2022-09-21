package com.testnum5;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 11:19
 */
public class Test02 {
    public static void main(String[] args) {
        Gender sex=Gender.male;
        switch (sex){
            case male:
                System.out.println("是男性");
                break;
            case female:
                System.out.println("是女性");
                break;
        }
    }
}
