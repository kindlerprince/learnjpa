package com.example.learnjpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "person")
@Data
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  String fullName;
  String jobTitle;
  String yearBorn;

  public Person() {}

  public Person(int id, String fullName, String jobTitle, String yearBorn) {
    this.id = id;
    this.fullName = fullName;
    this.jobTitle = jobTitle;
    this.yearBorn = yearBorn;
  }
}
