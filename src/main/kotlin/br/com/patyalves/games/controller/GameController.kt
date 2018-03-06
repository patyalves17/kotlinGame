package br.com.patyalves.games.controller

import br.com.patyalves.games.model.Game
import br.com.patyalves.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value="/game")
class GameController {
    @Autowired
    lateinit var gameService: GameService

    @GetMapping
    fun buscarTodos(): List<Game>{
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)

    }

    @GetMapping(value="/titulo/{titulo}")
    fun buscarpor(@PathVariable (value="titulo") titulo:String):List<Game> {
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping("{id}")
    fun apagar(@PathVariable("id")id:String){
        gameService.apagar(id)
    }

}