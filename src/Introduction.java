import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
	
	public static void main(String[] args){
		
		//Invoke ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimitar\\Documents\\chromedriver.exe");
		
		//Create a Driver object
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		
		if("Google".equals(title)){
			
			System.out.println("Title is correct!");
			
		}
		else{
			
			System.out.println("Wrong title");
			
		}
		
	}
	

}
