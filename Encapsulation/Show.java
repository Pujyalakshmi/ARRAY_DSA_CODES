package Encapsulation;

class Artist {
    private String name;

    //getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class Show {
    public static void main(String[] args) {
        //create instance of the encapsulated class
        Artist obj = new Artist();
        //set name
        obj.setName("RACER");
        //get name
        System.out.println(obj.getName());
    }

}
