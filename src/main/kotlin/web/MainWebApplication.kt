package web

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainWebApplication

fun main(args: Array<String>) {
	runApplication<MainWebApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}

}
