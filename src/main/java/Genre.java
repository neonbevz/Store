public enum Genre {
    FPS, TPS, TOPDOWN, RPG, MMO, RTS, TBS, MULTIPLAYER, PVP, PVE, SINGLEPLAYER, OPENWORLD, RACING, SANDBOX, COOP,
    ACTION, SIMULATION, SPORTS, PUZZLE, VR, PLATFORMER, SURVIVAL, VISUALNOVEL, HORROR, CARD;

    @Override
    public String toString() {
        switch (this) {
            case FPS: return "FPS";
            case TPS: return "TPS";
            case TOPDOWN: return "Top-down";
            case RPG: return "RPG";
            case MMO: return "MMO";
            case RTS: return "RTS";
            case TBS: return "TBS";
            case MULTIPLAYER: return "Multiplayer";
            case PVP: return "PvP";
            case PVE: return "PvE";
            case SINGLEPLAYER: return "Singleplayer";
            case OPENWORLD: return "Open world";
            case RACING: return "Racing";
            case SANDBOX: return "Sandbox";
            case COOP: return "Co-op";
            case ACTION: return "Action";
            case SIMULATION: return "Simulation";
            case SPORTS: return "Sports";
            case PUZZLE: return "Puzzle";
            case VR: return "VR";
            case PLATFORMER: return "Platformer";
            case SURVIVAL: return "Survival";
            case VISUALNOVEL: return "Visual novel";
            case HORROR: return "Horror";
            case CARD: return "Card game";
            default: return "Genre";
        }
    }
}
