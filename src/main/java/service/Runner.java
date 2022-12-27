package service;

public class Runner {
    public static void main(String[] args) {
        Service serviceMem = new Service(new MemRepository());
        serviceMem.getOnlyName();
        System.out.println();
        // Раскоментировать и исправить код, чтобы он работал. Верхний код должен оставаться нетронутым.
        Service serviceDataBase = new Service(new DataBaseRepository());
        serviceDataBase.getOnlyName();
    }
}
