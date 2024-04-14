package com.mycompany.mysql;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student implements java.io.Serializable {
 @Id
 @Column(name="S_id")
 private int S_id;
 @Column(name="F_Name")
 private String F_Name;
 @Column(name="L_Name")
 private String L_Name;
 public student() {
 }
 public student(String fname, String lname) {
 
 this.F_Name = fname;
 this.L_Name = lname;
 }
 
 public int getId() {
 return this.S_id;
 }
 
 public void setId(int id) {
 this.S_id = id;
 }
 public String getFirstName() {
 return F_Name;
 }
 public void setFirstName(String firstName) {
 this.F_Name = firstName;
 }
 public String getLastName() {
 return L_Name;
 }
 public void setLastName(String lastName) {
 this.L_Name = lastName;
 }

}