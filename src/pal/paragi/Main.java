package pal.paragi;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions); // itt a dimensions a fentebbi sorból szippantja be az adatokat


        Monitor monitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "ASus", 4, 6, "v.244");

        PC pc = new PC(theCase, monitor ,motherboard); // a fenti 3 objectet szippantja be

        //hogy legyen valami látszata is, néhány példa adatok kiírására:
        pc.getMonitor().drawPixelAt(1500,1200, "red");
        pc.getTheCase().pressPowerButton();
        pc.getMotherboard().loadProgram("super calculator");
        System.out.println("manufacturer: " + monitor.getManufacturer() + " and model: " + monitor.getModel());
        System.out.println("manufacturer: " + pc.getTheCase().getManufacturer() + ", dimensions: " + pc.getTheCase().getDimensions().getWidth() + " " + pc.getTheCase().getDimensions().getHeight() + " " + pc.getTheCase().getDimensions().getDepth());
        System.out.println("bios version: " + pc.getMotherboard().getBios() + ", ram slots: " + pc.getMotherboard().getRamSlots());

    }

}
