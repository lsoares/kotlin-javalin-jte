import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.openqa.selenium.chrome.ChromeOptions
import seleniumtestinglib.locators.ByText
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HelloTest {

    private val driver = WebDriverManager.chromedriver()
        .capabilities(ChromeOptions().addArguments("--headless"))
        .create()

    @Test
    fun `displays homepage`() {
        myApp().start(1234).use {
            driver.get("http://localhost:1234")
            assertNotNull(driver.findElement(ByText("orange")))
        }
    }

    @AfterAll
    fun cleanup() {
        driver.quit()
    }
}