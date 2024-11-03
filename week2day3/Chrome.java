package learning.week2day3;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Incognito mode is on---->chromeSubClass");
	}
	
	public void clearCache() {
		System.out.println("Cache are cleared---->chromeSubClass");
	}

	public static void main(String[] args) {
		
		Chrome br = new Chrome();
		br.browserName="Chrome";
		System.out.println(br.browserName);
		br.browserVersion = 1.23f;
		System.out.println(br.browserVersion);
		br.openURL();
		br.navigateBack();
		br.closeBrowser();
		
		
		

}
}
