package ch12.sec03.exam01;

import lombok.Data;

@Data
public class Member {
    public String id;
    public String name;
    public int age;
    public Member(String id){
        this.id=id;
    }

    public boolean equals(Object obj){
        if(obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }

}
