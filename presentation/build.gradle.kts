import org.springframework.boot.gradle.tasks.bundling.BootJar

tasks.withType<BootJar>{
    this.archiveFileName.set("${archiveBaseName.get()}.${archiveExtension.get()}")
    this.enabled = true
}

dependencies {
    implementation(project(":application"))
    implementation(project(":infrastructure"))
    implementation(project(":common"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
}
