enum class CharacterState {
    HIDDEN,
    DESCENDING,
    IDLE_HANGING,
    TRICK_BACKFLIP,
    TRICK_BUNGEE_JUMP,
    TRICK_SWING_WAVE,
    EDGE_WALKING,
    REACT_CHARGING_SURGE, // Triggered when USB-C / TurboPower charger is connected
    REACT_LOW_BATTERY,    // Triggered when battery drops below 15%
    CLIMBING_UP
}
