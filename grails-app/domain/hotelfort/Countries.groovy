package hotelfort

class Countries {
    String name
    String capital
    static constraints = {
        name nullable: false
        name unique: true
        name maxSize: 50
        capital unique: true
        capital maxSize: 128
        capital nullable: false
    }
    String toString() {
        name
    }
}
