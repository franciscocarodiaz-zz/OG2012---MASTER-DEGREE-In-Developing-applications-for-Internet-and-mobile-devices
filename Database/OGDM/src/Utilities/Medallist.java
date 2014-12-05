package Utilities;

import java.util.HashSet;
import java.util.Set;

import sysman.OgMedalStanding;

public class Medallist {
    static private Set<OgMedalStanding> medallist;
    public Medallist() {
        medallist = new HashSet<OgMedalStanding>();
    }
    public boolean addMedal(OgMedalStanding m){
        boolean res = false;
        int longit = medallist.size();
        medallist.add(m);
        if(medallist.size()==longit+1)
            res = true;
        return res;
        }
    public boolean removeMedal(OgMedalStanding m){
        boolean res = false;
        if(medallist.contains(m)){
            medallist.remove(m);
            res = true;
        }
        return res;
    }
    public Set<OgMedalStanding> getMedallist(){
        return medallist;
        }
    public boolean setMedallist(Set<OgMedalStanding> ogms){
        medallist = ogms;
        boolean res = (medallist == ogms)?true:false;
        return res;
        }
    /*
    public void toString() {
        System.out.println("--> Medal Standing: \n");
        for (OgMedalStanding m : medallist) {
            System.out.println("---> NOC: " + m.getNationality() + "\n");
            System.out.println("---> Gold: " + m.getGold() + "\n");
            System.out.println("---> Silver: " + m.getSilver() + "\n");
            System.out.println("---> Bronze: " + m.getBronze() + "\n");
            }
        }
    */
}
