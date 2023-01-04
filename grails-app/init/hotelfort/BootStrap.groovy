package hotelfort

class BootStrap {
    def init = { servletContext ->
        def countryNames = ["Россия", "Мальдивы", "Турция"].toArray()
        def capitalNames = ["Москва", "Мале", "Анкара"].toArray()
        def hotelNames = ["Four Seasons Hotel", "Radisson Blu Hotel", "Mirihi Island Resort", "Kandolhu Maldives", "Club Prive by Rixos Belek", "Villa Sonata Apart Hotel"].toArray()
        def links = ["https://thelegendofmoscow.com/", "https://www.radissonhotels.com/ru-ru/brand/radisson-blu", "https://mirihi.com/ru/", "https://www.kandolhu.com/", "https://www.rixos.com/ru/hotel-resort/club-prive-rixos-belek", "https://www.villasonata.com/"].toArray()
        for(short i = 0; i < countryNames.length; i++) {
            new Countries(name: countryNames[i], capital: capitalNames[i]).save()
        }
        while (Hotels.count() < hotelNames.length){
            Random rand = new Random()
            short val = 0
            short randomValCountry = rand.nextInt(1, Countries.count()+1)
            switch (randomValCountry){
                case 1:
                val = 0
                    break
                case 2:
                    val = 2
                    break
                case 3:
                    val = 4
                    break
            }
            short randomValHotel = rand.nextInt(val, val+2)
            new Hotels(name: hotelNames[randomValHotel], country: randomValCountry, rating: rand.nextInt(1,6), link: links[randomValHotel]).save()
        }
    }
    def destroy = {
    }
}
