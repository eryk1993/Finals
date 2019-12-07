package com.example.jegmemogame;

public class Questions {


    public String mQuestions[] = {

            "What sweet food made by bees using nectar from flowers??",
            "Name the school that Harry Potter attended?",
            "Which country is home to the kangaroo?",
            "What is the top colour in a rainbow?",
            "In the nursery rhyme, who sat on a wall before having a great fall?",
            "How many colours are in a rainbow?",
            "What is the name of the bear in The Jungle Book?",
            "What food do Giant Pandas normally eat?",
            "How many years are there in a millennium?",
            "What is the distance around a circle called?",
            "What is the name of the fairy in Peter Pan?",
            "Which planet in our Solar System is known for having a ring?",
            "How many days are there in June?",
            "What galaxy is Earth located in?",
            "What is the first element on the periodic table of elements?",
            "What is the capital of Hawaii?",
            "Who painted the Mona Lisa?",
            "Who invented the telephone?",
            "Which was the country that first made the use of paper money?",
            "Where did the Olympic Games originate?",
            "What did Joseph Priesley discover in 1774?",
            "Who said E=mc2",
            "Which planet is nearest the sun?",
            "Which is the largest ocean?",
            "What language has the most words?",
            "What’s the hardest rock?",
            "What is the first letter on a keyboard?",
            "What is the symbol for Silver?",
            "Where does sound travel faster",
            "What’s the common term for a cerebrovascular accident?",
            "What word describes a number system with a base of two?",
            "What’s short for “binary digit”?",



    };

    private String mChoices[][] ={

            {"Nectar", "Honey", "Sugar", "Liquid"},
            {"Hogwarts", "Castelobruxo", "Beauxbatons Academy", "Durmstrang Institute"},
            {"Philippines", "Hong Kong", "Europe", "Australia"},
            {"Orange", "Blue", "Green", "Red"},
            {"Eggy", "Mr. Lou", "Humpty Dumpty", "Humpy"},
            {"6", "3", "7", "2"},
            {"Baloo", "Mogle", "Jafar", "Simbad"},
            {"Trunks", "Bamboo", "Grass", "Leaves"},
            {"100","10", "500", "1000"},
            {"Square root","Angle", "Area", "Circumference"},
            {"Barbie", "Odette", "Tinker Bell","Cailey"},
            {"Uranus","Jupiter","Saturn","Pluto"},
            {"30", "40","60","80"},
            {"Univers", "Commit","Milky way","Outer space"},
            {"Oxygen","Carbon","Hydrogen","Sulfur"},
            {"Hawaii","Guam","Ausi","Honolulu"},
            {"Leonardo de Caprio","Miguel da Vinci","Michael Angelo","Leonardo da Vinci"},
            {"Graham Simon","Alexander Graham Bell","Thomas Edison","Einstein"},
            {"Brunie","Singapore","Philippines","China"},
            {"Itali", "Russia", "Rome", "Greece"},
            {"Hydrogen","Carbon","Oxygen","Copper"},
            {"Thomas Edison","Napoleon Bonaparte","Abraham Lincoln","Albert Einstein"},
            {"Mercury","Venus", "Earth","Mars"},
            {"West Philippines Sea", "Atlantic Ocean", "Mariana Trencg", "Pacific ocean"},
            {"Tagalog","English","Spanish","Cantonese"},
            {"Granite","Emerald","Topaz","Diamond"},
            {"W","E","Q","A"},
            {"Fe","Ag","H2O","N"},
            {"Air", "Fire","Earth","Water"},
            {"Alergies","Dizzy ", "Stroke","Death"},
            {"Bit","Byts","Binary","Giba"},
            {"Byts","Bites","Bits","Byths"}

    };

    private String mCorrectAnswers[] = {"Honey", "Hogwarts", "Australia", "Red", "Humpty Dumpty", "7",
            "Baloo", "Bamboo", "1000","Circumference","Tinker Bell","Saturn","30","Milky way",
    "Hydrogen","Honolulu","Leonardo da Vinci","Alexander Graham Bell", "China","Greece", "Oxygen",
    "Einstein","Mercury","Pacific ocean","English","Diamond","Q","Ag","Water","Stroke","Binary","Bit"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }


   public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
   }
}
