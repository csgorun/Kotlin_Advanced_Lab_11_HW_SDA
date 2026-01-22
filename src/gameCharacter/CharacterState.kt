sealed class CharacterState{
    object None: CharacterState()
    object Run: CharacterState()
    data class Attack(val state: Int): CharacterState()
    data class Death(val state: String): CharacterState()
}