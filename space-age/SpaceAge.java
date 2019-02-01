
class SpaceAge {
    
    private double seconds;

    final double EARTHSEC = 31557600;
    final double MERCURYSEC = EARTHSEC * 0.2408467;
    final double VENUSSEC = EARTHSEC * 0.61519726;
    final double MARSSEC = EARTHSEC * 1.8808158;
    final double JUPITERSEC = EARTHSEC * 11.862615;
    final double SATURNSEC = EARTHSEC * 29.447498;
    final double URANUSSEC = EARTHSEC * 84.016846;
    final double NEPTUNESEC = EARTHSEC * 164.79132;
    



    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds / EARTHSEC;
    }

    double onMercury() {
        return this.seconds / MERCURYSEC;
    }

    double onVenus() {
        return this.seconds / VENUSSEC;
    }

    double onMars() {
        return this.seconds / MARSSEC;
    }

    double onJupiter() {
        return this.seconds / JUPITERSEC;
    }

    double onSaturn() {
        return this.seconds / SATURNSEC;
    }

    double onUranus() {
        return this.seconds / URANUSSEC;
    }

    double onNeptune() {
        return this.seconds / NEPTUNESEC;
    }

}
