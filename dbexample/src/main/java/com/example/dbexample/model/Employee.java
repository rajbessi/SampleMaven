package com.example.dbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
}

