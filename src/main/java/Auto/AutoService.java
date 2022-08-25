package Auto;

public class AutoService {
    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public Auto[] getOnlyBmwCars(Auto[] autos) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getBrand().equals("BMW")){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getBrand().equals("BMW")){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getPassengers() == 2){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getPassengers() == 2){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getTransmission().equals("avto")){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getTransmission().equals("avto")){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    @Override
    public String toString() {
        return "AutoService{}";
    }
    /*-----------------------------------------------------------------------------------------------------
    _______________________________________________________________________________________________________*/

    public Auto[] get_all_model(Auto[] autos, String model) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(model)){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(model)){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    public Auto[] get_all_model_marc(Auto[] autos, String model, String marc) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(model)){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(model) && autos[i].getModel().equals(marc)){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    public Auto[] get_all_passengers(Auto[] autos, int passengers) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getPassengers() == passengers){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getPassengers() == passengers){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }

    public Auto[] get_all_Transmission(Auto[] autos, String Transmission) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(Transmission)){
                count++;
            }
        }
        Auto[] desired_auto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(Transmission)){
                desired_auto[count] = autos[i];
                count++;
            }
        }
        return desired_auto;
    }
}
