package raptor.cool.replacement

import raptor.cool.characters.Character

interface Replacer {
    fun replace(characters: List<Character>): List<Character>
}