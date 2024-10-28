package Spring_API.rest_api.bean;

public class Teacher {
    public int id;
    public String firstname;
    public String lastname;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname= firstname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public Teacher(int id, String firstname, String lastname){
        this.id= id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
