
import dev.failsafe.internal.util.Assert;
import org.example.SignUpPage;
import org.example.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Date;
import java.util.UUID;

public class SignUpTest {
    private WebDriver driver;
    private SignUpPage signUpPage;

    @BeforeMethod
    public void setUp()
    {
        driver = WebDriverFactory.getDriver();
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void testSignUp() {
        String name = "User" + UUID.randomUUID().toString().substring(0, 8); // Generate a unique username
        String email = "user" + UUID.randomUUID().toString().substring(0, 8) + "@example.com"; // Generate a unique email
        String password = "Abc@1234"; // Use a fixed password for simplicity, or generate dynamically
        String firstName = "John";
        String lastName = "Doe";
        String company = "CompanyX";
        String address = "123 Main St";

        signUpPage.signUp(name, email, password, firstName, lastName, company, address);

    }
    }

