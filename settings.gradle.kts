rootProject.name = "koin-annotations"

includeBuild("compiler") {
    dependencySubstitution {
        substitute(module("io.insert-koin:koin-annotations")).using(project(":koin-annotations"))
        substitute(module("io.insert-koin:koin-ksp-compiler")).using(project(":koin-ksp-compiler"))
    }
}
includeBuild("sandbox")
