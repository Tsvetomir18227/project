package project;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestShop {

    public static void main(String args[]) {

        // детхмхпюле (язгдюбюле) опнхгбндхрекх
        Manufacturer bmw = new Manufacturer("BMW",
                "Germany", "Bavaria", "665544", "876666");

        Manufacturer audi = new Manufacturer("Audi", "Germany", "Berlin", "123123", "980765");



        // детхмхпюле (язгдюбюле) юбрнлнахкх
        Car bmw316i = new Car("BMW", "316i", "1994");
        Car ladaSamara = new Car("Lada", "Samara", "1987");
        Car mazdaMX5 = new Car("Mazda", "MX5", "2008");
        Car mercedesC500 = new Car("Mercedes", "C50", "1993");
        Car trabant = new Car("trabant", "600", "1962");
        Car opelAstra = new Car("Opel", "Astra", "1991");

        ArrayList<Car> supportedCars = null;
        
        // детхмхпюле (язгдюбюле) ебрхмю пегепбмю вюяр
        Part cheapPart = new Part("Tires 165/50/13", 302.36,
                345.58, audi, "T332", PartCategory.TIRES, supportedCars);

        // днаюбъле хмтнплюжхъ гю йнх йнкх е опхкнфхлю
        cheapPart.addSupportedCar(ladaSamara);
        cheapPart.addSupportedCar(trabant);
       



        // детхмхпюле (язгдюбюле) яйзою пегепбмю вюяр
        Part expensivePart = new Part("BMW Engine Oil",
                633.17, 670.0, bmw, "Oil431", PartCategory.ENGINE, supportedCars);

        // днаюбъле хмтнплюжхъ гю йнх йнкх е опхкнфхлю
        expensivePart.addSupportedCar(mazdaMX5);
        expensivePart.addSupportedCar(bmw316i);
        


// // // // // // // // // // // // // // // // // // // // //

        // язгдюбюле мнб люцюгхм
        Shop newShop = new Shop("Car parts");


        // днаюбъле вюярх б люцюгхмю
        newShop.addPart(cheapPart);
        newShop.addPart(expensivePart); // ебрхмю х яйзою вюяр
       


        // пюгоевюрбюле хмтнплюжхъ гю люцюгхмю
        System.out.println(newShop.toString());

        JFrame jframe = new JFrame();
        Rectangle bounds = new Rectangle(700, 340);
        jframe.setBounds(bounds);
        jframe.setVisible(true);
        
        JLabel jlabel = new JLabel();
        jlabel.setSize(100, 200);
        Color black = new Color(0, 0, 0);
        jlabel.setBackground(black);
        jlabel.setText("ceci e gei");
        
    }

} // END