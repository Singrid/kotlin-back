package br.com.cantinho.hackaton.FirstKotlinServer

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL


@RestController
@RequestMapping("recipe")
class RecipeController {

    @GetMapping
    fun list(): List<Recipe> {

        val mapper = jacksonObjectMapper()
        val recipe = mapper.readValue<List<Recipe>>(URL("https://github.com/Singrid/kotlin-back/blob/master/MOCK_DATA.json")).toList()
        return recipe;
    }
}