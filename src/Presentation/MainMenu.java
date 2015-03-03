/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author Niels
 */
public class MainMenu extends Menu{
    
    public MainMenu() {
        super("Main menu for acme inc", "Enter new diagnogsis", "Show diagnogses");
    }

    @Override
    protected void doAction(int option) {
        switch(option){
            case 1:
                enterDiagnogsis();
                break;
            case 2:
                showDiagnosticks();
                break;
        }
    }

    private void enterDiagnogsis() {
        new NewDiagnostickMenu().run();
    }

    private void showDiagnosticks() {
        new ShowDiagnosticksMenu().run();
    }
    
    
    
    
}
