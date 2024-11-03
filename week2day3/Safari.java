package learning.week2day3;

public class Safari extends Edge {
	
	public void readerMode() {
		System.out.println("Reading mode is activated---->safariSubClass");
	}
	
	public void fullScreenMode() {
		System.out.println("Full screen mode is enabled---->safariSubClass");
	}

	public static void main(String[] args) {
		
		Safari call3 = new Safari();
		System.out.println(call3.browserName = "safari");
		System.out.println(call3.browserVersion = 1.25f);
		call3.openURL();
		call3.navigateBack();
		call3.closeBrowser();
		call3.clearCache();
		call3.openIncognito();
		call3.takeSnap();
		call3.clearCookies();
		call3.readerMode();
		call3.fullScreenMode();
		

	}

}
