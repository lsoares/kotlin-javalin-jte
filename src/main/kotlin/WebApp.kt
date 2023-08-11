import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import kotlin.random.Random

fun main() {
    JavalinJte.init()
    myApp().start()
}

fun myApp(): Javalin = Javalin
    .create {
        it.staticFiles.add("/public")
        it.staticFiles.enableWebjars()
    }
    .get("/") {
        it.render(
            "hello.jte", mapOf(
                "guess" to Random.nextInt(21),
                "fruits" to listOf("banana", "orange", "apple"),
                "car" to x.Car(id = "123", title = "Car ABC")
            )
        )
    }
    .get("/test") {
        it.render("test.jte")
    }
    .get("/messages") {
        it.html(
            """<ul>
            <li>hey</li>
            <li>follow-up email</li>
            <li>news update</li>
            </ul>"""
        )
    }