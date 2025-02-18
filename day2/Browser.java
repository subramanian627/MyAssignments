package week1.day2;

public class Browser {
	
	   void launchBrowser() {
		   System.out.println("Browser launched successfully");
	   }
	   void loadUrl() {
		   System.out.println("Application URL loaded successfully");
	   }

	public static void main(String[] args) {
		
		Browser lm = new Browser();
		lm.launchBrowser();
		lm.loadUrl();
		
	}
}
