package demo.io.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demo   {




    Long id;
   private String name;
   private String year;
   private String dayPackage;
   private String packageCount;


    public Demo(String name, String year, String packageCount, String dayPackage) {
    }
}
