package AcmeInc;

public class MainMenu extends Menu
{

    public MainMenu()
    {
        super("Main Menu", "Option 1", "Option 2", "Option 3");
    }


    /**
     * Invokes the correct action method depending on the selected
     * option.
     * @param option The selected option.
     */
    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                option1();
                break;

            case 2:
                option2();
                break;
                
            case 3:
                option3();
                break;
        }
    }

    /**
     * Action method for option 1
     */
    private void option1()
    {
        System.out.println("Option 1 selected");
        pause();
    }

    /**
     * Action method for option 2
     */
    private void option2()
    {
        System.out.println("Option 2 selected");
        pause();
    }

    /**
     * Action method for option 3.
     */
    private void option3()
    {
        System.out.println("Option 3 selected");
        pause();
    }
}