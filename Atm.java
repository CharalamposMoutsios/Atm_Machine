import java.io.IOException;

public class Atm {

	
    
    public static void main(String[] args) throws IOException {

		Option_Menu optionMenu = new Option_Menu();
		introduction();
		optionMenu.mainMenu();
        
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}