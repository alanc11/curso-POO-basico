import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Map;

public class UberXL extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    
    public UberXL(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public UberXL(String license, Account account){
        super(license, account);
        
    }

    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignas 4 pasajeros");
        }
    }
}
