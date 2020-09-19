public class Main {
    public static void main(String[] args) {
        Orbital earth = new Planet("Planet", "Earth", "Sun", "5.972E24", 6371, 149600000);
        System.out.println(earth);
        Orbital moon = new Moon("Moon", "Moon", earth.getName(), "7.348E22", 1737, 384400);
        System.out.println(moon);
        Orbital mars = new Planet("Planet","Mars", "Sun", "6.39E23", 3390, 227940000);
        Orbital phobos = new Moon("Moon", "Phobos", "Mars", "10.60E15", 11, 6800);
        Orbital deimos = new Moon("Moon", "Deimos", "Mars", "1.48E15", 6, 20069);
    }

    public void moonsofplanets(){

    }
}
