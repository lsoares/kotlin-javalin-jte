import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import kotlin.random.Random

fun main() {
    JavalinJte.init()
    Javalin
        .create { it.staticFiles.add("/public") }
        .get("/") {
            it.render(
                "hello.jte", mapOf(
                    "guess" to Random.nextInt(21),
                    "cars" to listOf("car1", "car2", "car3")
                )
            )
        }
        .get("/test") {
            it.render("test.jte")
        }
        .start()
}