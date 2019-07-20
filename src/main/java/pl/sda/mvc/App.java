package pl.sda.mvc;

import pl.sda.mvc.controler.GiantControler;
import pl.sda.mvc.model.Fatique;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GiantModel giantModel = new GiantModel(Health.HEALTHY,
                Fatique.NOTTIRED, Nourishment.NOTHUNGRY);
        GiantView giantView = new GiantView();

        GiantControler controler = new GiantControler(giantModel, giantView);
        controler.updateView();
        controler.setHealth(Health.DEAD);
        controler.updateView();
        controler.setFatique(Fatique.TIRED);
        controler.updateView();


    }
}
