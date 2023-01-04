package hotelfort

class CountryController {

    def index() {
        render(view: '/countries', model: [countries: Countries.list()])
    }
    def create(){

        redirect(url: "/countries")
    }
    def edit(){

        redirect(url: "/countries")
    }
    def update(){

        redirect(url: "/countries")
    }
    def delete(){

        redirect(url: "/countries")
    }
}
