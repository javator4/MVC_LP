package pl.sda.mvc.controler;

import pl.sda.mvc.model.Fatique;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.view.GiantView;

public class GiantControler {

private GiantModel giant;
private GiantView view;

    public GiantControler(GiantModel giant, GiantView view) {
        this.giant = giant;
        this.view = view;
    }

    public void updateView(){
        this.view.displayGiant(this.giant);

    }
    public void setHealth(Health health){
        giant.setHealth(health);
    }
    public void setFatique(Fatique fatique){
        giant.setFatique(fatique);
    }

}
