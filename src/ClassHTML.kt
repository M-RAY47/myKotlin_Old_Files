class HTML{
    fun body() = Unit
}
fun html(init: HTML.()-> Unit): HTML{
    val html = HTML()
    html.init()
    return html
}