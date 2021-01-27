package offineHours.practice_12_23;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private PO productOwner;
    private ScrumMaster scrumMaster;
    private BA businessAnalist;



    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);

    }

    public void addDeveloper(Developer developer){
       developers.add(developer) ;
    }

    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String ID){
        testers.removeIf(p->p.ID.equals(ID));
    }

    public void removeDeveloper(String ID){
        developers.removeIf(p->p.ID.equals(ID));
    }



    public ScrumTeam(PO productOwner, ScrumMaster scrumMaster, BA businessAnalist){
        setProductOwner(productOwner);
        setScrumMaster(scrumMaster);
        setBusinessAnalist(businessAnalist);
    }


    public PO getProductOwner(){
        return productOwner;
    }

    public void setProductOwner(PO productOwner){
        this.productOwner=productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BA getBusinessAnalist() {
        return businessAnalist;
    }

    public void setBusinessAnalist(BA businessAnalist) {
        this.businessAnalist = businessAnalist;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner=" + productOwner.name +
                ", scrumMaster=" + scrumMaster.name +
                ", businessAnalist=" + businessAnalist.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
