@import gg.jte.Content

@param String title
@param Content content

<head>
    <script src="/webjars/htmx.org/1.9.4/dist/htmx.min.js"></script>
    <title>${title}</title>
</head>
<body>
<h1>${title}</h1>
${content}
</body>