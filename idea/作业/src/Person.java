public class Person {

    private  String name;
    private  String userName;
    private  String password;
    private  String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public Person(String name, String userName, String password, String profession) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.profession = profession;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Person() {
    }

    public void show(){
        System.out.println("姓名:"+name + "\t职业:"+profession);
    }
}
