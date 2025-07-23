package enthuware.localization;

import java.util.Locale;

public class LocaleClass {

    public static void main(String[] args) {
        // TODO: Como inicializar Locale
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.Category.FORMAT, Locale.US);
    }

}
