import io.javalin.Javalin

fun main() {
    Javalin.create()
        .get("/") { it.result("hi") }
        .start()
}