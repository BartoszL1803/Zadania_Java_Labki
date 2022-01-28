package creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species, Double weight) {
        super(species,weight);
    }

    public void beEaten(){
        if (this.weight > 0.0) {
            System.out.println("zjadłeś zwierze bestio, przejdż na weganizm!");
            this.weight =0.0;
        }else System.out.println("zwierze może być nie świeże");
    }
}