class Student {
    public String name;
    public String group;
    public int age;
    public double gpa;
    
    public Student(String name , String group , int age , double gpa){
        this.name = name;
        this.group = group;
        this.age = age;
        this.gpa = gpa;
    }
    public Student(String name){
        this.name = name;
        
    }

    public String getInfo(){
        return "Name: " + name + " Age: " + age + " Group: " + group + " GPA: " + gpa;
    }
}
