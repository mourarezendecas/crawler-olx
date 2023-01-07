package com.api.olxcrawler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class OlxCrawlerApplication {

	static void main(String[] args) {
		SpringApplication.run(OlxCrawlerApplication, args)
	}

	@GetMapping("/")
	def index(){
		return "<h1>Ola mundo<h1>"
	}
}
