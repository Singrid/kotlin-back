package controller

import model.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
@RequestMapping("json")
class ConsumeController {

    @GetMapping
    @ResponseBody
    fun list(): List<User>{
        return listOf(User("Leitura", "livrooxxxx"),
                User("pesquisa", "apenas teste"))
    }
}