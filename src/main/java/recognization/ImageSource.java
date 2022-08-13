package recognization;

import java.util.LinkedHashMap;

public class ImageSource {

    //image names
     public static LinkedHashMap<String, String> getLocations() {
        LinkedHashMap<String, String> valueMap = new LinkedHashMap<>();
        valueMap.put("5f", "trainimages/rs5front.jpg");
        valueMap.put("5b", "trainimages/rs5back.jpg");
        valueMap.put("10f", "trainimages/rs10front.jpg");
        valueMap.put("10b", "trainimages/rs10back.jpg");
        valueMap.put("20f", "trainimages/rs20front.jpg");
        valueMap.put("20b", "trainimages/rs20back.jpg");
        valueMap.put("50f", "trainimages/rs50front.jpg");
        valueMap.put("50b", "trainimages/rs50back.jpg");
        valueMap.put("100f", "trainimages/rs100front.jpg");
        valueMap.put("100b", "trainimages/rs100back.jpg");
        valueMap.put("500f", "trainimages/rs500front.jpg");
        valueMap.put("500b", "trainimages/rs500back.jpg");
        valueMap.put("1000f", "trainimages/rs1000front.jpg");
        valueMap.put("1000b", "trainimages/rs1000back.jpg");
        return valueMap;
    }
    //image values
    public static LinkedHashMap<String, String> getValues() {
        LinkedHashMap<String, String> valueMap = new LinkedHashMap<>();
        valueMap.put("5f", "5 Rupees");
        valueMap.put("5b", "5 Rupees");
        valueMap.put("10f", "10 Rupees");
        valueMap.put("10b", "10 Rupees");
        valueMap.put("20f", "20 Rupees");
        valueMap.put("20b", "20 Rupees");
        valueMap.put("50f", "50 Rupees");
        valueMap.put("50b", "50 Rupees");
        valueMap.put("100f", "100 Rupees");
        valueMap.put("100b", "100 Rupees");
        valueMap.put("500f", "500 Rupees");
        valueMap.put("500b", "500 Rupees");
        valueMap.put("1000f", "1000 Rupees");
        valueMap.put("1000b", "1000 Rupees");
        return valueMap;
    }
}
