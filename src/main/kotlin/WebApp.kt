import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import x.Car
import kotlin.random.Random

fun main() {
    JavalinJte.init()
    Javalin
        .create { it.staticFiles.add("/public") }
        .get("/") {
            it.render(
                "hello.jte", mapOf(
                    "guess" to Random.nextInt(21),
                    "fruits" to listOf("banana", "orange", "apple"),
                    "car" to Car(id = "123", title = "Car ABC")
                )
            )
        }
        .get("/test") {
            it.render("test.jte")
        }
        .start()
}