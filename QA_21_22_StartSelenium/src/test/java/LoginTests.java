import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;

    @BeforeClass
    public void preCondition() {
        wd = new ChromeDriver();
        //open browser
        wd.get("https://telranedu.web.app/home");
        //opet site
    }

    @Test
    public void loginSuccess() {
        //open form (find element + click)
        //fill in email (find elememt+click+clear+type)
        //fill in password (find elememt+click+clear+type)
        //submit form (find element + click)
    }

    @Test
    public void loginWrongEmail() {
        //open form
        //fill in form
        //submit
    }

    @Test
    public void loginWrongPassword() {
        //open form
        //fill in form
        //submit
    }

    @AfterClass
    public void postConditions()

    {
        wd.close();//close browser
    }
}
