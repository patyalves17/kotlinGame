package br.com.patyalves.games.repository

import br.com.patyalves.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : MongoRepository<Game, String>