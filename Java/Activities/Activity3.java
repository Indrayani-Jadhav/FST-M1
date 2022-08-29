package Activities;

public class Activity3
{

        public static void main(String args[]) {
            double sec = 1000000000;

            double EarthSec = 31557600;
            double MercurySec = 0.2408467;
            double VenusSec = 0.61519726;
            double MarsSec = 1.8808158;
            double JupiterSec = 11.862615;
            double SaturnSec = 29.447498;
            double UranusSec = 84.016846;
            double NeptuneSec = 164.79132;

            System.out.println("Age on planet Mercury: " + sec / EarthSec/ MercurySec);
            System.out.println("Age planet on Venus: " + sec / EarthSec / VenusSec);
            System.out.println("Age planet on Earth: " + sec / EarthSec);
            System.out.println("Age planet on Mars: " + sec / EarthSec / MarsSec);
            System.out.println("Age on planet Jupiter: " + sec / EarthSec / JupiterSec);
            System.out.println("Age on planet Saturn: " + sec / EarthSec / SaturnSec);
            System.out.println("Age on planet Uranus: " + sec / EarthSec / UranusSec);
            System.out.println("Age on planet Neptune: " + sec / EarthSec / NeptuneSec);
        }
    }

