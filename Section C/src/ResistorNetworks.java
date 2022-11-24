public class ResistorNetworks {
    public static void main(String[] args) {
        //Displaying the ohmages of the resistor connected in series by calling the 'series' method,
        // the parallel resistor is displayed by the relevant method called 'parallel' and lastly
        // both of the series and parallel calculation of the resistor are done by the method 'paraAndSeries'
        System.out.println("The ohmage of the resistors connected in series\n: "+series(2, 3, 6));
        System.out.println("The ohmage of the resistors connected in parallel\n: "+parallel(2, 3, 6));
        System.out.println("The ohmage of the resistors connected in parallel\n: "+paraAndSeries(2, 3, 6
                                                                                                    ,7,8, 10 ));
    }

    // The 'series' method calculates the sum of the total resistors connected to the series resistor
    public static float series(float restOne, float restTwo, float restThree){
        float ohmTotal = restOne + restTwo + restThree;
        return ohmTotal;

    }
    // The 'parallel' method calculates the sum of the total resistors connected to the parallel resistor
    // by dividing by 1 to get the individual resistance
    public static double parallel(float restParaOne, float restParaTwo, float restParaThree){
        float ohmParaTotal = 1 / restParaOne + 1 / restParaTwo + 1 / restParaThree;
        float paraTotal = 1 / ohmParaTotal;
        double roundOHM = Math.round(paraTotal * 10.0) / 10;
        return roundOHM;
    }

    // The method 'paraAndSeries' combines both the parallel and series resistors
    public static double paraAndSeries(float seriesOne, float seriesTwo, float seriesThree,
                                       float parallelOne, float parallelTwo, float parallelThree){
        float seriesTotal = seriesOne + seriesTwo + seriesThree;
        float parallelEquation = 1 / parallelOne + 1 / parallelTwo + 1 / parallelThree;
        float parallelTotal = 1 / parallelEquation;
        float totalSeriesPara = seriesTotal + parallelTotal;
        double roundOHM = Math.round(totalSeriesPara * 10.0) / 10;
        return roundOHM;

    }
}
