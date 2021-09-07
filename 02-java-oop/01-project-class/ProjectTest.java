public class ProjectTest {
    public static void main(String[] args) {
        Project rpgGame = new Project("A New Horizon", 10000.00, "Man versus Machine");

        System.out.println(rpgGame.getName());
        System.out.println(rpgGame.getDescription());
        System.out.println(rpgGame.getInitalCost());
        System.out.println(rpgGame.elevatorPitch(rpgGame.getName(),rpgGame.getInitalCost(),rpgGame.getDescription()));
        rpgGame.setName("Horizon Zero Dawn");
        rpgGame.setDescription("Prehistoric Survival against futuristic machines");
        rpgGame.setInitalCost(25000.00);
        System.out.println(rpgGame.getName());
        System.out.println(rpgGame.getDescription());
        System.out.println(rpgGame.getInitalCost());
        System.out.println(rpgGame.elevatorPitch(rpgGame.getName(),rpgGame.getInitalCost(),rpgGame.getDescription()));



        // System.out.println(rgpGame.Project("Fallout 4"));
        // System.out.println(rgpGame.Project("Fallout 4", "Future Fallout Survival"));





    }
}
