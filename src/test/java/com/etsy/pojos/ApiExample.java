package com.etsy.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(value = "id",allowSetters = true)
public class ApiExample {
        //getter setter
        //toString
        private int id;
        private String name;
        private String gender;
        private long phone;


}
