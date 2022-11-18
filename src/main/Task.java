import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String pavadinimas;
    private String aprasas;
    private boolean uzduotiesStatusas;
    private int prioritetas;
    private Date data;
    /*
    Užduoties (task) turimos savybės:
    1. Pavadinimas
    2. Aprašas
    3. Užduoties statusas
    4. Prioritetas
    5. Data
     */

    public Task() {
        ivestiSavybesPagalNutylejima();
    }


    public Task(String pavadinimas) {
        this(pavadinimas, "");
    }

    public Task(String pavadinimas, String aprasas){
        this();
        this.pavadinimas = pavadinimas;
        this.aprasas = aprasas;
    }
    private void ivestiSavybesPagalNutylejima() {
        this.uzduotiesStatusas = false;
        this.prioritetas = 0;
        this.data = new Date();
    }

    @Override
    public String toString() {
        String statusasTekstoEilute = "aktyvi";
        if (uzduotiesStatusas) statusasTekstoEilute = "baigta";
        return String.format("Užduotis %s: %s. Statusas: %s, prioritetas: %d, užduotis sukurta: %s",
                pavadinimas, aprasas, statusasTekstoEilute, prioritetas,
                new SimpleDateFormat("yyyy-MM-dd").format(data));
    }
}
