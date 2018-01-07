public enum Platform {
    WINDOWS, MAC, LINUX, VIVE, RIFT, PS3, PS4, XBOX360, XBOXONE, SWITCH, WIIU, IOS, ANDROID;

    @Override
    public String toString() {
        switch (this) {
            case WINDOWS: return "Windows";
            case MAC: return "Mac OS";
            case LINUX: return "Linux";
            case VIVE: return "HTC Vive";
            case RIFT: return "Oculus Rift";
            case PS3: return "PlayStation 3";
            case PS4: return "PlayStation 4";
            case XBOX360: return "XBox 360";
            case XBOXONE: return "XBox One";
            case SWITCH: return "Nintendo Switch";
            case WIIU: return "Wii U";
            case IOS: return "iOS";
            case ANDROID: return "Android";
            default: return "Platform";
        }
    }
}
