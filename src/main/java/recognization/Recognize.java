package recognization;


import dev.brachtendorf.jimagehash.hashAlgorithms.HashingAlgorithm;
import dev.brachtendorf.jimagehash.hashAlgorithms.PerceptiveHash;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Recognize {
    public static String getResult() throws IOException {
        File img0 = new File("image.jpg");
        return recognizeImage(img0);
    }
    public static String recognizeImage(File file) throws IOException{
        Map<String, Double> results = new LinkedHashMap<>();
        HashingAlgorithm hashed = new PerceptiveHash(5000);
        long start = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : ImageSource.getLocations().entrySet()) {
            File img1 = new File(entry.getValue());
            if (!img1.exists()) {
                System.out.println("Image name is invalid");
            } else {
                results.put(entry.getKey(),Double.parseDouble(String.valueOf(hashed.hash(file).normalizedHammingDistanceFast(hashed.hash(img1)))));
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
        System.out.println(results);
        //find the value with the lowest hamming distance
        Double min = Double.MAX_VALUE;
        String result = "";
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                result = ImageSource.getValues().get(entry.getKey());
            }
        }
        return result;
    }
}
