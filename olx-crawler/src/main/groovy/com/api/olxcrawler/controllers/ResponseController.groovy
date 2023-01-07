package com.api.olxcrawler.controllers

import com.api.olxcrawler.models.RequestModel
import com.api.olxcrawler.services.ResponseService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/search")
class ResponseController {
    static ResponseService responseService = new ResponseService();

    @PostMapping
    def ResponseEntity<Object> searchItem(@RequestBody RequestModel requestModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(responseService.scrape(requestModel))
    }
}
