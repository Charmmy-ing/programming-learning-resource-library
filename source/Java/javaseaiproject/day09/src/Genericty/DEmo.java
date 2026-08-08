package Genericty;

import java.util.ArrayList;
public class DEmo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("阿德");
        list.add("2");
        list.add("3.33");
        for (String ject : list) {
            //Integer 和 String 是同级兄弟，都继承自 Object，但彼此之间没有继承关系，所以无法直接强转。
            System.out.println(ject);
        }
        DefinitionGENERCITY<String> gelist = new DefinitionGENERCITY<>();
        gelist.add("阿德");
        gelist.add("2");
        gelist.add("3.33");
        for (String item : gelist) {
            System.out.println(item);
        }
    }
}
