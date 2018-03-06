package br.com.patyalves.games.service

import br.com.patyalves.games.model.Game
import br.com.patyalves.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameService{

    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos() : List<Game>{
        return gameRepository.findAll()
    }

    fun salvar(game: Game){
        gameRepository.save(game)
    }
}