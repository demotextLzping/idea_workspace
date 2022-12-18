package com.lzp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author： LZPing
 * @date： 2022-11-04 21:40
 * @Description pojo/Person实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String username;
    private String password;
    private String gender;
    private String[] hobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    private List<Pet> pets;
    private Pet pet;
    private Map<String,Pet> petMap;
//
//    public Person() {
//    }
//
//    public Person(String username, String password, String gender, String[] hobby, String birthdate) {
//        this.username = username;
//        this.password = password;
//        this.gender = gender;
//        this.hobby = hobby;
//        this.birthdate = birthdate;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", gender='" + gender + '\'' +
//                ", hobby=" + Arrays.toString(hobby) +
//                ", birthdate='" + birthdate + '\'' +
//                '}';
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String[] getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String[] hobby) {
//        this.hobby = hobby;
//    }
//
//    public String getBirthdate() {
//        return birthdate;
//    }
//
//    public void setBirthdate(String birthdate) {
//        this.birthdate = birthdate;
//    }
}
