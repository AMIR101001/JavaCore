package service;

public class Service {
    private final String SPACE_DELIMITER = " ";
    private final String SEMICOLON = ";";

    private MemRepository memRepository;
    private DataBaseRepository dataBaseRepository;
    private String[] temporaryVariable;

    public Service(MemRepository memRepository) {
        this.memRepository = memRepository;
    }

    public Service(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public void getOnlyName() {
        if(memRepository != null){
        for (String string : memRepository.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
        }else{
            for(String string : dataBaseRepository.findAll()){
                System.out.println(string.split(SEMICOLON)[1].split(SPACE_DELIMITER)[0]);
            }
        }
    }
}
