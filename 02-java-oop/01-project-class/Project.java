public class Project {
    
    private String name;
    private String description;
    private Double intialCost;
    // Getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Double getInitalCost(){
        return intialCost;
    }
    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setInitalCost(Double newInitialCost){
        this.intialCost = newInitialCost;
    }


    //Pitch
    public String elevatorPitch(String name, Double intialCost, String description){
        return name +"("+ Double.toString(intialCost) +")"+ ":" + description;
    }
    // Constructor Methods
    public Project(){
        name = "A new Project";
        description = "A new Project";        
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, Double initalCost, String description){
        this.name = name;
        this.description = description;
        this.intialCost = initalCost;
    }
    
}

