// Printthesum,difference and product of two complex numbers by creating a 
// classnamed 'Complex' with separate methods for each operation whose 
// real and imaginary parts are entered by the user
class Complex {
    int real;
    int img;
    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex((a.real + b.real),(a.img + b.img));
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex((a.real - b.real),(a.img - b.img));
    }

     public static Complex mul(Complex a, Complex b) {
        return new Complex((a.real * b.real),(a.img * b.img));
    }

    public static Complex div(Complex a, Complex b) {
        return new Complex((a.real / b.real),(a.img / b.img));
    }

    public void show() {
        if(real == 0 && img != 0) {
            System.out.println(img + "i");
        }

        else if(img == 0 && real != 0) {
            System.out.println(real );
        }
        else {
            System.out.println(real + " " + img + "i");
        }
    }
}

public class ComplexExample {
    public static void main(String[] args) {
        Complex c = new Complex(4,5);
        Complex d = new Complex(9, 4);
        Complex e = Complex.sum(c, d);

        e.show();
    }
}
