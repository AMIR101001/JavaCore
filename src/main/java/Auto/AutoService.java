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
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getBrand().equals("BMW")){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
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
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getPassengers() == 2){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
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
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getTransmission().equals("avto")){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
    }

    @Override
    public String toString() {
        return "AutoService{}";
    }

    public Auto[] getAutosByModel(Auto[] autos, String model) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(model)){
                count++;
            }
        }
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(model)){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
    }

    public Auto[] getAutosByModelMake(Auto[] autos, String model, String marc) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(model)){
                count++;
            }
        }
        Auto[] desireAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(model) && autos[i].getModel().equals(marc)){
                desireAuto[count] = autos[i];
                count++;
            }
        }
        return desireAuto;
    }

    public Auto[] getAutosByPassengers(Auto[] autos, int passengers) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getPassengers() == passengers){
                count++;
            }
        }
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getPassengers() == passengers){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
    }

    public Auto[] getAutosByTransmission(Auto[] autos, String Transmission) {
        int count = 0;
        for(Auto auto : autos){
            if(auto.getModel().equals(Transmission)){
                count++;
            }
        }
        Auto[] desiredAuto = new Auto[count];
        count = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].getModel().equals(Transmission)){
                desiredAuto[count] = autos[i];
                count++;
            }
        }
        return desiredAuto;
    }
}
