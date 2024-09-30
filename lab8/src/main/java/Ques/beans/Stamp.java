package Ques.beans;

public class Stamp {
 
private int id;
 private String name;
 private String origin;
 
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
public String getOrigin() {
return origin;
}
public void setOrigin(String origin) {
this.origin = origin;
}
// Display method
 public void display()
 {
 System.out.println("Id : "+id);
 System.out.println("Name : "+name);
 System.out.println("Origin : "+origin);
 }
}