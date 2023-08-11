@template.layout(title = "page", content = @`
    <p>Welcome</p>
    <div hx-get="/messages">
        Read messages
    </div>
`)
