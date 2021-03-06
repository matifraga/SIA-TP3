package raptor.cool.characters

import raptor.cool.gear.Gear

class Archer(height: Double, gear: MutableMap<String, Gear>) : Character(height, gear) {

    override fun getHeir(height: Double, gear: MutableMap<String, Gear>): Character {
        return Archer(height, gear)
    }

    override fun getFitness(): Double {
        return .9 * attack + .1 * defence
    }

}