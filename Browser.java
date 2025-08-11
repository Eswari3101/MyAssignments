package week2.day1;

public class Browser {
	
	
	String browserName = "chrome";
	public String launchBrowser() {
	
		
        System.out.println(browserName+ " launched successfully" );
		return browserName;
    
	
	}
	
	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser bro = new Browser();
		bro.launchBrowser();
		bro.loadUrl();
		

	}

}
