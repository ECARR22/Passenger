package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private int ID;
    private int phone;
    private int age;

    public Passenger(String title, String name, int ID, int phone, int age) {
        try{
            setTitle(title);
            setName(name);
            setID(ID);
            setPhone(phone);
            setAge(age);

        } catch(Exception e){
            throw new IllegalArgumentException("Error must enter details");
        }

    }

   /* public Passenger() {
        name = "";
        title = "";
        ID = 0;
        phone = 0;
        age = 0;
    }*/


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null ) {
            throw new IllegalArgumentException("Enter Title!!\n");

        }
        else{
            this.title = title;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null ) {
            throw new IllegalArgumentException("Enter name!!\n");
        }
        else{
            this.name = name;
        }

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID <= 0 ) {
            throw new IllegalArgumentException("Enter ID!!\n");
        }
        else{
            this.ID = ID;
        }

    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if(ID <= 0 ) {
            throw new IllegalArgumentException("Enter Phone number!!\n");
        }
        else{
            this.phone = phone;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 ) {
            throw new IllegalArgumentException("Enter age!!\n");
        }
        else {
            this.age = age;
        }
    }
}
