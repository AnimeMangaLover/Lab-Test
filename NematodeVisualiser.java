package ie.test;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet{
    ArrayList<Nematode> nem = new ArrayList<Nematode>();

    public float border;

    public void loadNem()
    {
        Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode n = new Nematode(r);
            nem.add(n);
        }
    }

    public void settings()
    {
        size(800, 800);
    }

    Nematode first = null;
    Nematode second = null;
    Nematode third = null;
    Nematode fourth = null;
    
    public void draw()
    {
        background(0);
    }
}