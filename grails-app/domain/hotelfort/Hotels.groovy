package hotelfort

class Hotels {
    String name
    Countries country
    int rating
    String link
    static constraints = {
        name maxSize: 255
        name unique: true
        name nullable: false
        country nullable: false
        rating min: 1
        rating nullable: false
        rating max: 5
        link nullable: true
        link maxSize: 255
    }
}
