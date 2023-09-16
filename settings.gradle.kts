rootProject.name = "Modalytics"

sequenceOf("gateway").forEach {
    val project = ":modalytics-$it"
    include(project)
    project(project).projectDir = file(it)
}