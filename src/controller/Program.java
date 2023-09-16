package controller;

import common.*;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class Program extends Menu<String> {

    static String[] mChoice = {"Binary", "Decimal", "Hexadecimal", "Exit"};
    Change change;
    Validate validate;
    
    public Program() {
        super("NUMBER SYSTEM", mChoice);
        change = new Change();
        validate = new Validate();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                String bin = validate.inputBin();
                String[] bChoice = {"Conver to Decimal", "Convert to Hexadecimal", "Exit"};
                Menu m = new Menu("CONVERT BINARY", bChoice) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1:
                                System.out.println(change.binToDec(bin));
                                break;
                            case 2:
                                System.out.println(change.binToHex(bin));
                                break;                          
                            default:
                                System.out.println("Return!");
                                break;
                        }
                    }
                };
                m.run();
                break;
            case 2:
                String dec = validate.inputDec();
                String[] dChoice = {"Conver to Binary", "Convert to Hexadecimal", "Exit"};
                m = new Menu("CONVERT DECIMAL", dChoice) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1:
                                System.out.println(change.decToBin(dec));
                                break;
                            case 2:
                                System.out.println(change.decToHex(dec));
                                break;
                            default:
                                System.out.println("Return!");
                                break;                            
                        }
                    }
                };
                m.run();
                break;
            case 3:
                String hex = validate.inputHex();
                String[] hChoice = {"Conver to Binary", "Convert to Decimal", "Exit"};
                m = new Menu("CONVERT HEXADEMICAL", hChoice) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1:
                                System.out.println(change.hexToBin(hex));
                                break;
                            case 2:
                                System.out.println(change.hexToDec(hex));
                                break;
                            default:
                                System.out.println("Return!");
                                break;                            

                        }
                    }
                };
                m.run();
                break;
            default:
                System.out.println("Exit!");
                System.exit(0);
        }
        
    }
}
