package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myapplication {
    public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();

     // Navigate to the login page
     driver.get("https://demo.dealsdray.com/");

     // Enter username
     WebElement usernameField = driver.findElement(By.id("mui-1"));
     usernameField.sendKeys("prexo.mis@dealsdray.com");

     // Enter password
     WebElement passwordField = driver.findElement(By.id("mui-2"));
     passwordField.sendKeys("prexo.mis@dealsdray.com");

     // Click the login button
     WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
     loginButton.click();
     WebElement orderDropdown = driver.findElement(By.xpath("//button[contains(text(),'Order')]"));
     orderDropdown.click();
    }
}