fun Rebild(state: CharacterState) {
    when(state) {
        is CharacterState.None -> {
            println("Персонаж бездействует")
        }

        is CharacterState.Run -> {
            println("Персонаж бежит")
        }
        is CharacterState.Attack -> {
            println("Персонаж атакует с уроном ${state.state}")
        }
        is CharacterState.Death -> {
            println("Персонаж погиб: ${state.state}")
        }
    }

}

fun main(){


//    Person.characterState = CharacterState.None
//    println(Person.characterState)
//    Person.characterState = CharacterState.Run
//    println(Person.characterState)
//    Person.characterState = CharacterState.Attack(12)
//    println(Person.characterState)
//    Person.characterState=CharacterState.Death("Вы погибли! У вас закончились HP")
//    println(Person.characterState)


    Rebild(CharacterState.None)
    Rebild(CharacterState.Run)
    Rebild(CharacterState.Attack(10))
    Rebild(CharacterState.Death("У вас кончилось здоровье"))

}