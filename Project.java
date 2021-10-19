public class Project {
    // Atribute
    private String name;
    private String description;

    // Constructor
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name){
        this.name = name;
    }

    public Project(){
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getDescrption(){
        return this.description;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // Elevator Pitch
    public void elevatorPitch(){
        System.out.println(this.name + ", " + this.description); 
    }
}
