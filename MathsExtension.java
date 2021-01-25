package xyz.nisarga.MathsExtension; 

// Only these imports are required to interact with MIT AI2
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.*;

@DesignerComponent(version = 1, // Update version here, You must do for each new release to upgrade your extension
                   description = "Maths Extension created by you",
                   category = ComponentCategory.EXTENSION,
                   nonVisible = true,
                   iconName = "images/extension.png") // Change your extension's icon from here; can be a direct url
@SimpleObject(external = true)
public class MathsExtension extends AndroidNonvisibleComponent {

    public MathsExtension(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Simple addition of two numbers")
    public int Add(int a, int b) {
        return a + b;
    }

    @SimpleFunction(description = "Simple subtraction of two numbers")
    public int Subtract(int a, int b) {
        return a - b;
    }

    @SimpleFunction(description = "Simple addition of three numbers")
    public int Add(int a, int b, int c) {
        return a + b + c;
    }
    
    @SimpleFunction(description = "Simple addition of four numbers")
    public int Add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    @SimpleFunction(description = "Simple addition of five numbers")
    public int Add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    
    @SimpleFunction(description = "Find Square")
    public double SquareOf(double number) {
        return number*number;
    }

    @SimpleFunction(description = "Find Cube")
    public double CubeOf(double number) {
        return number*number*number;
    }

    @SimpleFunction(description = "Number With Power")
    public double Numberwithpowerof(double exponent, double number) {
      return Math.pow(number, exponent);
    }
}