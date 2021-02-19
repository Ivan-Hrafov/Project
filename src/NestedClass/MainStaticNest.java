package NestedClass;

public class MainStaticNest {
    public static void main(String[] args) {
        MotherBoard.USB usb = new MotherBoard.USB(1000, 2000);
//        MotherBoard mb = new MotherBoard();
//        System.out.println("Total Ports = " + mb.usb.getTotalPorts());
//        System.out.println("Wikipedia about USB: " + MotherBoard.USB.wikilink);
        System.out.println(usb.getTotalPorts());
    }
}
