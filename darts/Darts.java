class Darts {

    int score;

    Darts(double x, double y) {

        if(x <= 1 && y <= 1 ){
            score = 10;
        } else if (x <= 5 && y <= 5){
            score = 5;
        } else if (x <= 10 && y <= 10){
            score = 1;
        } else{
            score = 0;
        }
    }

    int score() {

        return score;

    }

}
