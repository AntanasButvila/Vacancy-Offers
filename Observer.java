public interface Observer {

    boolean isInterested(VacancyType type);
    
    void receiveOffer(String nameCompany, int salary);

}