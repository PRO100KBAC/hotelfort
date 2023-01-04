package hotelfort

class HotelController {

    def index() {
        render(view: '/hotels', model: [hotels: Hotels.list(), countries: Countries.list()])
    }
    def create(){

        redirect(url: "/hotels")
    }
    def edit(){

        redirect(url: "/hotels")
    }
    def update(){

        redirect(url: "/hotels")
    }
    def delete(){

        redirect(url: "/hotels")
    }
    def search(){
//        redirect(url: "/hotels")
        render('По Вашему запросу ничего не найдено')
    }
}
