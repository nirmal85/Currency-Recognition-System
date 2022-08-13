package recognization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.python.util.PythonInterpreter;

/**
 *
 * @author kaitey
 */
public class test1 {

    public static void main(String a[]) {
       // initializeJython();
       // PythonInterpreter pi = new PythonInterpreter();
       // pi.exec("python cropper.py");
    }
    private static void initializeJython() {
        Properties props = new Properties();
        props.put("python.console.encoding", "UTF-8");
        props.put("python.import.site", "false"); //Jython doesn't work for me without setting this property to false.

        PythonInterpreter.initialize(System.getProperties(), props, new String[0]);
    }
}
