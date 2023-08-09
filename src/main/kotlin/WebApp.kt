import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import kotlin.random.Random

fun main() {
    JavalinJte.init()
    Javalin.create()
        .get("/") {
            it.render(
                "hello.jte", mapOf("guess" to Random.nextInt(21))
            )
        }
        .start()
}