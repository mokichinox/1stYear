public class Student {
    private String name;
    private int age;
    
    
    public Student(){
        this("",0);
    }
    
    public Student (String name, int age){
        
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void printStudent(){
        System.out.print("Hi! My name is " + getName() + ", and I am " + getAge() + " years old.");
    }
}
