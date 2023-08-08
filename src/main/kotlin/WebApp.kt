import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte

fun main() {
    JavalinJte.init()
    Javalin.create()
        .get("/") { it.render("hello.jte") }
        .start()
}