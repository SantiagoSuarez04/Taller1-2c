public class Person {
    protected String Name="";
    protected String Phone_number="";
    protected String Email="";

    
    public Person(String name, String phone_number, String email) {
        Name = name;
        Phone_number = phone_number;
        Email = email;
    }
    public String getname(){
        return Name;
    }
    public String getphone_number(){
        return Phone_number;
    }
    public String getemail(){
        return Email;
    }
    public void setname(String Name){
        this.Name=Name;
    }
    public void setphone_number(String Phone_number){
        this.Phone_number=Phone_number;
    }
    public void setemail(String Email){
        this.Email=Email;
    }
    @Override
    public String toString() {
        return "Person [Name=" + Name + ", Phone_number=" + Phone_number + ", Email=" + Email + "]";
    }
    }


