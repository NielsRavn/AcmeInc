
package Presentation;

import java.util.Scanner;

/**
 * Abstract class implementing the basic functionality of a console based
 * menu class. A menu can be created by sub-classing this class and implement
 * the abstract method doAction(option).
 *
 * The constructor of the sub-class must invoke the super-class constructor by
 * the instruction
 *
 *          super(header, "menuoption1", "menuoption2");
 * 
 * Note, that this instruction must be the first instruction of the sub-class
 * constructor.
 *
 */
public abstract class Menu
{
	// value used to exit the menu.
	// the value can be changed by the sub-class constructor.

	protected int EXIT_OPTION = 0;
	// The menu header text
	private String header;
	// The list of menu options texts.
	private String[] menuItems;

        Scanner sc;
        
	/**
	 * Abstract method stating what should be done, when a
	 * menu option is selected.
	 * The method must be overridden by the sub-class.
	 * @param option the menu option that has been selected.
	 */
	protected abstract void doAction(int option);

	/**
	 * Creates an instance of the class with the given header text and
	 * menu options.
	 * @param header    The header text of the menu.
	 * @param menuItems The list of menu items texts.
	 */
	public Menu(String header, String... menuItems)
	{
		this.header = header;
		this.menuItems = menuItems;
                sc = new Scanner(System.in);
	}

	/**
	 * Executes the menu until the EXIT_OPTION has been selected.
	 */
	public void run()
	{
            int option = EXIT_OPTION;
		do
		{
			showMenu();
			option = getOption();
                        doAction(option);
          
		} while (option != EXIT_OPTION);

	}

	/**
	 * Returns a valid menu-option input from the keyboard.
	 * The method continues prompting for an option value, until
	 * a valid option has been input.
	 * @return  A valid menu option.
	 */
	private int getOption()
	{
		int option = EXIT_OPTION;

		boolean done = false;
		while (!done)
		{
			System.out.println("\nSelect option: ");
			try
			{
				option = new Scanner(System.in).nextInt();
				if ((option >= 1 && option <= menuItems.length) || option == EXIT_OPTION)
				{
					done = true;
				}
				else
				{
					System.out.println("Please enter a valid option.");
				}
			}
			catch (Exception e)
			{
				System.out.println("Please enter a number.");
			}
		}

		return option;
	}

	/**
	 * Prints out a console menu with a header text and a list
	 * of menu options. The menu options will be assigned the numbers
	 * from 1 to the number of options in the menu.
	 */
	private void showMenu()
	{
		System.out.println();
		System.out.println(header.toUpperCase());
		for (int i = 0; i < menuItems.length; i++)
		{
			System.out.println(String.format("" + (i + 1) + ": " + menuItems[i]));
		}
		System.out.println(String.format("%d: %s", EXIT_OPTION, "Return"));
	}

	/**
	 * Waits until the 'enter' key is pressed.
	 */
	protected void pause()
	{
		System.out.print("Press <enter> to continue...");
		new Scanner(System.in).nextLine();
	}
        
        /**
         * keeps asking the user for an int until a valid one is given
         * @param message the message to be shown
         * @return a valid user inputed int
         */
        protected int getInt(String message){
            System.out.println(message);
            while(true){
                try {
                    String input = sc.nextLine();
                    int i = Integer.parseInt(input);
                    return i;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Input is not a number, please input valid number");
                }
            }
        }
        
        /**
         * gets a string from the user
         * @param message the mesage to be shown
         * @return the inputed string
         */
        protected String getString(String message){
            System.out.println(message);
            return sc.nextLine();
        }

        /**
         * asks the user for a double until it gets a valid one
         * @param message the message to be shown
         * @return a valid double
         */
        protected double getDouble(String message){
            System.out.println(message);
            while(true){
                try {
                    String input = sc.nextLine();
                    double d = Double.parseDouble(input);
                    return d;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Input is not a number, please input valid number. the decimal devider should be a dot");
                }
            }
        }
        
        /**
         * keeps asking the user for a valid int input unless nothing is given, then it returns -1 for an empty response
         * @param message the message to be shown.
         * @return aa user inputed int.
         */
        protected int getIntEmptyOkay(String message){
            System.out.println(message);
            while(true){
                try {
                    String input = sc.nextLine();
                    if(input.equals("")){
                        return -1;
                    }
                    int i = Integer.parseInt(input);
                    return i;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Input is not a number, please input valid number");
                }
            }
        }
}
