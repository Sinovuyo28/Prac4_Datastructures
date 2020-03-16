
import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class MapNames {

    public String heroNames(){

        /* Map interface , using HashMap class (class HashMap implements Map)
        HashMap uses a  KEY : VALUE, key name can't be duplicate it has to be unique at all times however the value can be duplicate

         */

        Map <Integer,String>mapName = new HashMap();
//HashMap in map interface works the same as in Set is prints values in no order

        mapName.put(120777, "Bantu Stephen Biko");
        mapName.put(254685,"Chris Hani");
        mapName.put(152398,"Lillian Ngoyi");
        mapName.put(233689,"Robert Sobukwe");
        mapName.put(160775,"Hector Peterson");

        //  This allows to print one value at a time
       // System.out.println(mapName.get(120777));

        //use the for each loop to print out the values
        System.out.println('\n');

        for (Map.Entry theStruggle : mapName.entrySet()){


            System.out.println(" " +theStruggle.getKey()+ " :"+ theStruggle.getValue());


        }

return (String) mapName.get(120777);

    }


}
