package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no,String name){
        this.no=no;
        this.name=name;
    }
    public int getNo(){
        return no;
    }
    public String getName(){
        return name;
    }
    public int hashCode(){
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    public void setNo(int no){
        this.no = no;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student target){
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Student{no=" + no + ",name"+name+"}";
    }
}
