package learning.week2day3;

public class Edge extends Chrome {
	
	public void takeSnap() {
		System.out.println("Snap is taken---->edgeSubClass");
	}

	public void clearCookies() {
		System.out.println("Cookies are cleared---->edgeSubClass");
	}
	
	public static void main(String[] args) {
		
		Edge call2 = new Edge();
		call2.browserName = "Edge";
		System.out.println(call2.browserName);
		System.out.println(call2.browserVersion = 1.24f);
		call2.openURL();
		call2.navigateBack();
		call2.closeBrowser();
		call2.clearCache();
		call2.openIncognito();
		call2.clearCookies();
		call2.takeSnap();
		
		
	}

}
