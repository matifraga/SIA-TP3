package raptor.cool.cutconditions

import raptor.cool.simulation.GeneticAlgorithmSimulation
import raptor.cool.simulation.Simulation

class MaxGenerations(val maxGenerations: Int) : CutCondition() {

    override fun shouldStop(simulation: Simulation): Boolean {
        val s = simulation as GeneticAlgorithmSimulation
        if (s.generations > maxGenerations) {
            return true
        }
        return false
    }

}