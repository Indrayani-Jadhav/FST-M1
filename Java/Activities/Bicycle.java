package Activities;

interface BycycleParts
{
    public int gear=0;
    public int currentSpeed=0;
}
interface BycycleOperations
{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
/*public class Bicycle extends BycycleParts implements BycycleOperations {
    public int gear;
    public int currentSpeed;

    public Bicycle(int gear,int currentSpeed)
    {
        this.gear=gear;
        this.currentSpeed=currentSpeed;
    }

    public void bicycleDesc()
    {

    }
}*/
