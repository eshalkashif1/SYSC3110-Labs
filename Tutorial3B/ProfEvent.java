import java.util.Date;
import java.util.EventObject;

public class ProfEvent extends EventObject{
    private Date mtDate;

    public ProfEvent(Prof prof, Date mtDate) {
        super(prof);
        this.mtDate = mtDate;
    }

    public Date getMtDate() {
        return mtDate;
    }

    public Prof getProf(){
        return (Prof) this.getSource();
    }
}
