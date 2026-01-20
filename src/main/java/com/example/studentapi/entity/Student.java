package com.example.studentapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String Email;
    private int Age;

    // Constructors
    public Student() {}

    public Student(String name, String email, int age) {
        this.Name = Name;
        this.Email = Email;
        this.Age = Age;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = Name; }

    public String getEmail() { return Email; }
    public void setEmail(String email) { this.Email = Email; }

    public int getAge() { return Age; }
    public void setAge(int age) { this.Age = Age; }
}
