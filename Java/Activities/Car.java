package Activities;

public class Car {
    String color="Black";
    String transmission="Manual";
    int make;
    int tyres;
    int doors;
    Car()
    {
        //Initialisation of variable in constructor
        tyres=4;
        doors=4;
    }
    public void dispCharacteristics(){
        System.out.println("The color of Car: "+color);
        System.out.println("The transmission of Car: "+transmission);
        System.out.println("The tyres of Car: "+tyres);
        System.out.println("The doors of Car: "+doors);

    }
    public void accelerate()
    {
        System.out.println(" Accelearte ");
    }
    public void brake()
    {
        System.out.println(" Brake ");
    }


}

