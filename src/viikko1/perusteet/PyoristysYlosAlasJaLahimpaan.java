package viikko1.perusteet;

public class PyoristysYlosAlasJaLahimpaan {

    public static void main(String[] args) {
        // Pyöristys aina alaspäin: 6.0
        double a = Math.floor(6.8);
        System.out.println(a);

        // Pyöristys aina ylöspäin: 7.0
        double b = Math.ceil(6.1);
        System.out.println(b);

        // Pyöristys aina lähimpään tasalukuun: 6.0
        double c = Math.round(5.6);
        System.out.println(c);
    }
}
