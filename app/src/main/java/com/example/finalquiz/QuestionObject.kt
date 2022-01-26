import com.example.finalquiz.Questions

object QuestionObject{


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "https://i.pinimg.com/736x/26/f4/b7/26f4b7e8e31c530a7c7f41c40ec2d7a7.jpg", //Nissan
            "Guess the brand: ",
            "Audi",
            "Nissan",
            "Lexus",
            "Volvo",
            2)
        questionsList.add(q1)

        val q2 = Questions(
            2,
            "https://i.pinimg.com/736x/2b/63/8c/2b638ca871bccae1a43ebd675c2bb759.jpg",//Subaru
            "Guess the brand: ",
            "Mazda",
            "Toyota",
            "Subaru",
            "Honda",
            3)
        questionsList.add(q2)

        val q3 = Questions(
            3,
            "https://i.pinimg.com/736x/f9/97/0d/f9970dd9535a68ed3db937f448a27db8.jpg",//BMW
            "Guess the brand: ",
            "Mercedes-Benz",
            "BMW",
            "Audi",
            "Mitsubishi",
            2)
        questionsList.add(q3)

        val q4 = Questions(
            4,
            "https://deadicatedfans.com/wp-content/uploads/2020/08/Toyota-Logo-Quiz.jpg",//Toyota
            "Guess the brand: ",
            "Toyota",
            "Ford",
            "Acura",
            "Nissan",
            1)
        questionsList.add(q4)

        val q5 = Questions(
            5,
            "https://i.pinimg.com/736x/c7/79/af/c779afbc8eb5891cf421072373b6db36.jpg",//Chevrolet
            "Guess the brand: ",
            "Dodge",
            "Ford",
            "Porsche",
            "Chevrolet",
            4)
        questionsList.add(q5)



        return questionsList
    }

    fun getQuestionsForNormal():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "https://a-static.besthdwallpaper.com/blue-nissan-skyline-gtr-r34-on-the-forest-road-wallpaper-1152x768-81889_36.jpg",
            "Guess the model: ",
            "Nissan Skyline R32",
            "Nissan Skyline R33",
            "Nissan Skyline R34",
            "Nissan Skyline R35",
            3)
        questionsList.add(q1)

        val q2 = Questions(
            2,
            "https://a-static.besthdwallpaper.com/white-toyota-supra-mk4-wallpaper-2560x1600-82200_7.jpg",
            "Guess the model: ",
            "Toyota GT86",
            "Toyota Supra MK4",
            "Toyota Chaser",
            "Toyota Corolla",
            2)
        questionsList.add(q2)

        val q3 = Questions(
            3,
            "https://img.wallpapersafari.com/desktop/1536/864/88/95/6Em5hZ.jpg",
            "Guess the model: ",
            "BMW E30 M3",
            "BMW E34 M5",
            "BMW E46 M3",
            "BMW E39 M5",
            3)
        questionsList.add(q3)

        val q4 = Questions(
            4,
            "https://wallpaperaccess.com/full/531986.jpg",
            "Guess the model: ",
            "Nissan 240sx",
            "Nissan Cefiro",
            "Nissan Skyline",
            "Nissan 350Z",
            4)
        questionsList.add(q4)

        val q5 = Questions(
            5,
            "https://external-preview.redd.it/mvYmJKJLqSjMYBfr27dsRSsPe0AfSpvGNpmv4-1aH_A.jpg?auto=webp&s=8e1438c3bd55b4be323e7c96811bed539cf478a9",
            "Guess the model: ",
            "Mazda RX-7",
            "Toyota Chaser",
            "Nissan Silvia S15",
            "Mazda RX-8",
            1)
        questionsList.add(q5)





        return questionsList
    }

    fun getQuestionsForHard():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "https://i.ytimg.com/vi/q5PPNZiu52w/maxresdefault.jpg",
            "The racer who tested the Acura NSX in 1990 was:",
            "Michael Schumacher",
            "Ayrton Senna",
            "Niki Lauda",
            "Lewis Hamilton",
            2)
        questionsList.add(q1)

        val q2 = Questions(
            2,
            "https://c4.wallpaperflare.com/wallpaper/458/712/876/car-vehicle-nissan-nissan-350z-wallpaper-preview.jpg",
            "What kind of engine does Nissan 350Z have:",
            "V6",
            "Inline 4",
            "V8",
            "Inline 6",
            1)
        questionsList.add(q2)

        val q3 = Questions(
            3,
            "https://i.pinimg.com/originals/35/53/ec/3553ec40bfa0302fad6d022b3d60a569.jpg",
            "How many HP does a stock 2JZ engine have?",
            "315HP",
            "280HP",
            "300HP",
            "240HP",
            2)
        questionsList.add(q3)

        val q4 = Questions(
            4,
            "https://car-images.bauersecure.com/pagefiles/96511/nissan-skyline.jpg",
            "Why Nissan Skyline GTR R34 is illegal in USA ?",
            "You can’t drive JDM cars in USA",
            "The Skyline was not built with the right safety features",
            "The GTR version is not exported for USA",
            "The Skyline is not illegal in USA",
            2)
        questionsList.add(q4)

        val q5 = Questions(
            5,
            "",
            "Which engine was used in Nissan Silvia series ?",
            "RB26-DETT",
            "W64",
            "RB25",
            "SR20-DETT",
            4)
        questionsList.add(q5)



        return questionsList
    }


}
