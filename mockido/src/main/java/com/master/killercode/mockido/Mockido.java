package com.master.killercode.mockido;

import android.app.Activity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static com.master.killercode.mockido.Mockido.StringNames.FEMALE;
import static com.master.killercode.mockido.Mockido.StringNames.MALE;

public class Mockido {

    private Activity activity;
    private boolean debugMode = BuildConfig.DEBUG;

    //=====================================================================================================
    //
    // Construtor
    //
    //=====================================================================================================

    public Mockido(Activity activity) {
        this.activity = activity;
        random = new Random();
        creditCard();
        rg();
        cpf();
        cnpj();
        getRawMaleName();
        getRawFemaleName();
//        words = readLines("lorem.txt");
    }

    //==============================================================================================
    //
    //  Credit Card
    //
    //==============================================================================================

    String[] cardsList = {
            "8800000000000000",
            "4026000000000000",
            "4175000000000000",
            "4405000000000000",
            "4508000000000000",
            "4844000000000000",
            "4913000000000000",
            "4917000000000000",
            "5019000000000000",
            "5018000000000000",
            "5020000000000000",
            "5038000000000000",
            "5612000000000000",
            "5893000000000000",
            "6304000000000000",
            "6759000000000000",
            "6761000000000000",
            "6762000000000000",
            "6763000000000000",
            "0604000000000000",
            "6390000000000000",
            "3528000000000000",
            "3589000000000000",
            "3529000000000000",
            "6360000000000000",
            "4916338506082832",
            "4556015886206505",
            "4539048040151731",
            "4024007198964305",
            "4716175187624512",
            "5280934283171080",
            "5456060454627409",
            "5331113404316994",
            "5259474113320034",
            "5442179619690834",
            "6011894492395579",
            "6011388644154687",
            "6011880085013612",
            "6011652795433988",
            "6011375973328347",
            "345936346788903",
            "377669501013152",
            "373083634595479",
            "370710819865268",
            "371095063560404"
    };

    public String getCreditCard() {
        return creditCard;
    }

    public String getCreditCardFormated() {
        return creditCardFormated;
    }

    private String creditCard;
    private String creditCardFormated;

    private void creditCard() {
        int n = 9;

        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        //
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        //
        int n9 = randomiza(n);
        int n10 = randomiza(n);
        int n11 = randomiza(n);
        int n12 = randomiza(n);
        //
        int n13 = randomiza(n);
        int n14 = randomiza(n);
        int n15 = randomiza(n);
        int n16 = randomiza(n);

        creditCardFormated = "" + n1 + n2 + n3 + n4 + " " + n5 + n6 + n7 + n8 + " " + n9 + n10 + n11 + n12 + " " + n13 + n14 + n15 + n16;
        creditCard = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16;

    }

    public String getCreditCardType(String type) {
        int n = 9;

        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        //
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        //
        int n9 = randomiza(n);
        int n10 = randomiza(n);
        int n11 = randomiza(n);
        int n12 = randomiza(n);
        //
        int n13 = randomiza(n);
        int n14 = randomiza(n);
        int n15 = randomiza(n);
        int n16 = randomiza(n);

        return "" + type + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16;
    }

    public String getCreditCardTypeFormated(String type) {
        int n = 9;

        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        //
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        //
        int n9 = randomiza(n);
        int n10 = randomiza(n);
        int n11 = randomiza(n);
        int n12 = randomiza(n);
        //
        int n13 = randomiza(n);
        int n14 = randomiza(n);
        int n15 = randomiza(n);
        int n16 = randomiza(n);

        return "" + type + n5 + n6 + n7 + n8 + " " + n9 + n10 + n11 + n12 + " " + n13 + n14 + n15 + n16;
    }

    public String getCreditCardSandBoxFormated() {
        return "4111 1111 1111 1111";
    }

    public String getCreditCardSandBox() {
        return "4111111111111111";
    }

//=====================================================================================================
//
// CPF
//
//=====================================================================================================

    private String rg;
    private String rgFormated;

    private String cpf;
    private String cpfFormated;

    private String cnpj;
    private String cnpjFormated;

    private int randomiza(int n) {
        return (int) (Math.random() * n);
    }

    private int mod(int dividendo) {
        return (int) Math.round(dividendo - (Math.floor(dividendo / 11) * 11));
    }

    private String removeCaracteresEspeciais(String doc) {
        if (doc.contains(".")) {
            doc = doc.replace(".", "");
        }
        if (doc.contains("-")) {
            doc = doc.replace("-", "");
        }
        if (doc.contains("/")) {
            doc = doc.replace("/", "");
        }
        return doc;
    }

    private void rg() {
        int n = 9;
        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        int n9 = randomiza(n);
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        d1 = 11 - (mod(d1));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        d2 = 11 - (mod(d2));


        if (d2 >= 10)
            d2 = 0;

        rgFormated = "" + n1 + n2 + '.' + n3 + n4 + n5 + '.' + n6 + n7 + n8 + '-' + n9;
        rg = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;

    }

    private void cpf() {
        int n = 9;
        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        int n9 = randomiza(n);
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        d1 = 11 - (mod(d1));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        d2 = 11 - (mod(d2));


        if (d2 >= 10)
            d2 = 0;

        cpfFormated = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
        cpf = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

    }

    private void cnpj() {
        int n = 9;
        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        int n9 = 0; //randomiza(n);
        int n10 = 0; //randomiza(n);
        int n11 = 0; //randomiza(n);
        int n12 = 1; //randomiza(n);
        int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;

        d1 = 11 - (mod(d1));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;

        d2 = 11 - (mod(d2));

        if (d2 >= 10)
            d2 = 0;

        cnpjFormated = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "/" + n9 + n10 + n11 + n12 + "-" + d1 + d2;
        cnpj = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;
    }

    public boolean isCPF(String CPF) {

        CPF = removeCaracteresEspeciais(CPF);

        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999") || (CPF.length() != 11))
            return (false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else
                dig11 = (char) (r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            return (dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10));
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public boolean isCNPJ(String CNPJ) {

        CNPJ = removeCaracteresEspeciais(CNPJ);

        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") || (CNPJ.length() != 14))
            return (false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                // converte o i-ésimo caractere do CNPJ em um número:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posição de '0' na tabela ASCII)
                num = CNPJ.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig13 = '0';
            else
                dig13 = (char) ((11 - r) + 48);

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = CNPJ.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig14 = '0';
            else
                dig14 = (char) ((11 - r) + 48);

            // Verifica se os dígitos calculados conferem com os dígitos informados.
            return (dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13));
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    //=====================================================================================================
    public String getRG() {
        return rg;
    }

    public String getFormatedRG() {
        return rgFormated;
    }

    public String getCPF() {
        return cpf;
    }

    public String getFormatedCPF() {
        return cpfFormated;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public String getFormatedCNPJ() {
        return cnpjFormated;
    }


//=====================================================================================================
//
// Names
//
//=====================================================================================================

    private String name = "";
    private String fullName = "";
    private String loginName = "";

    private String fe_name = "";
    private String fe_fullName = "";
    private String fe_loginName = "";

    protected enum StringNames {
        MALE, FEMALE
    }

    private void getRawFemaleName() {
        String[] femaleNames = activity.getResources().getStringArray(R.array.female_names);
        generateStrings(femaleNames, FEMALE);
    }

    private void getRawMaleName() {
        String[] maleNames = activity.getResources().getStringArray(R.array.male_names);
        generateStrings(maleNames, MALE);
    }

    private void generateStrings(String[] array, StringNames typeString) {
        int n = getIndice(array.length);

        String rawName;
        String fullRawName;
        String login;

        rawName = array[n];

        StringBuilder builder = new StringBuilder();

        n = getIndice(4);
        if (n == 0) {
            n = n + 1;
        }

        for (int i = 0; i < n; i++) {
            int n2 = getIndice(getIndice(array.length));
            builder.append(" ").append(array[n2]);
        }

        fullRawName = rawName + " " + builder.toString().trim();
        login = rawName + String.valueOf(getIndice(255));

        switch (typeString) {
            case MALE:
                name = rawName;
                fullName = fullRawName;
                loginName = login;
                break;
            case FEMALE:
                fe_name = rawName;
                fe_fullName = fullRawName;
                fe_loginName = login;
                break;
        }
    }

    private int getIndice(int size) {
        int next = size;
        if (size <= 0) {
            next++;
        }
        Random rand = new Random();
        return rand.nextInt(next);
    }

    private String generateRamdomLogin() {
        int n = getIndice(2);
        String[] array;
        if (n == 1) {
            array = activity.getResources().getStringArray(R.array.male_names);
        } else {
            array = activity.getResources().getStringArray(R.array.female_names);
        }
        return array[getIndice(array.length)] + getIndice(255);
    }

    //=====================================================================================================

    public String getMaleName() {
        return name;
    }

    public String getFullMaleName() {
        return fullName;
    }

    public String getLoginMaleName() {
        return loginName.toLowerCase();
    }

    public String getFemaleName() {
        return fe_name;
    }

    public String getFullFemaleName() {
        return fe_fullName;
    }

    public String getLoginFemaleName() {
        return fe_loginName.toLowerCase();
    }

    public String getRamdomLogin() {
        return generateRamdomLogin().toLowerCase();
    }

    //==============================================================================================
    //
    // Cep
    //
    //==============================================================================================

    public String getFormatedCEP() {
        String[] cepArray = activity.getResources().getStringArray(R.array.cep);
        int size = getIndice(cepArray.length);
        return cepArray[size];
    }

    public String getCEP() {
        String[] cepArray = activity.getResources().getStringArray(R.array.cep);
        int size = getIndice(cepArray.length);
        return cepArray[size].replace("-", "");
    }

    public boolean cepIsValide(String cep) {
        String padrao = "^\\d{5}[-]\\d{3}$";

        if (cep.matches(padrao)) {
            return true;
        } else {
            return false;
        }
    }

    //==============================================================================================
    //
    // Email
    //
    //==============================================================================================

    public String getMaleEmail() {
        StringBuilder sb = new StringBuilder();

        sb.append(fullName.replace(" ", ".").toLowerCase());
        sb.append("@example.com");

        return sb.toString().replace(' ', '.');
    }

    public String getMaleEmail(String providerEmail) {
        StringBuilder sb = new StringBuilder();

        sb.append(fullName.replace(" ", ".").toLowerCase());
        sb.append("@" + providerEmail + ".com");

        return sb.toString().replace(' ', '.');
    }

    public String getFemaleEmail() {
        StringBuilder sb = new StringBuilder();

        sb.append(fe_fullName.replace(" ", ".").toLowerCase());
        sb.append("@example.com");

        return sb.toString().replace(' ', '.');
    }

    public String getFemaleEmail(String providerEmail) {
        StringBuilder sb = new StringBuilder();

        sb.append(fe_fullName.replace(" ", ".").toLowerCase());
        sb.append("@" + providerEmail + ".com");

        return sb.toString().replace(' ', '.');
    }

    //==============================================================================================
    //
    // Terms and Policy privacity
    //
    //==============================================================================================

    public String getTermsOfUser() {
        return "Terms \n\n\n\n" + activity.getResources().getString(R.string.ipsum);
    }

    public String getPrivacityPolicy() {
        return "Privacity \n\n\n\n" + activity.getResources().getString(R.string.ipsum);
    }

    //==============================================================================================
    //
    // Telephone and Cell
    //
    //==============================================================================================

    public String getCellphoneUS() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 2; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");

        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 2; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getTelephoneUS() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 2; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");

        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 2; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getCellphoneBR() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 1; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");
        sb.append("9");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getTelephoneBR() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 1; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");

        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getFullCellphoneBR() {
        StringBuilder sb = new StringBuilder();

        sb.append("+55 ");
        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 1; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");
        sb.append("9");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getFullTelephoneBR() {
        StringBuilder sb = new StringBuilder();

        sb.append("+55 ");
        sb.append("(");
        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 1; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append(") ");

        sb.append(random.nextInt(9) + 1);
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        sb.append("-");

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    //==============================================================================================
    //
    // Urls
    //
    //==============================================================================================

    private String[] URL_HOSTS = new String[]{"https://www.google.com/#q=%s",
            "http://www.bing.com/search?q=%s",
            "https://search.yahoo.com/search?p=%s",
            "https://duckduckgo.com/?q=%s"};

    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        int hostId = random.nextInt(URL_HOSTS.length);
        String host = String.format(URL_HOSTS[hostId], "teste");
        sb.append(host);
        return sb.toString();
    }

    public String getUrl(String textSearch) {
        StringBuilder sb = new StringBuilder();
        int hostId = random.nextInt(URL_HOSTS.length);
        String host = String.format(URL_HOSTS[hostId], textSearch);
        sb.append(host);
        return sb.toString();
    }

    //==============================================================================================
    //
    // Background imagens Urls
    //
    //==============================================================================================

    private String[] URL_HOSTS_IMG = new String[]{"http://bdfjade.com/data/out/145/6478021-abstract-background.jpg",
            "http://bdfjade.com/data/out/145/6478051-abstract-background.jpg",
            "http://bdfjade.com/data/out/54/5613786-background-design.jpg",
            "http://bdfjade.com/data/out/145/6478395-abstract-background.jpg",
            "http://bdfjade.com/data/out/145/6478126-abstract-background.jpg"};

    public String getUrlImageBackground() {
        StringBuilder sb = new StringBuilder();
        int hostId = random.nextInt(URL_HOSTS_IMG.length);
        return URL_HOSTS_IMG[hostId];
    }


    //==============================================================================================
    //
    // Perfils imagens Urls
    //
    //==============================================================================================

    private String[] URL_HOSTS_Perfil = new String[]{
            "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/697509/pexels-photo-697509.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1040881/pexels-photo-1040881.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1040881/pexels-photo-1040881.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1087118/pexels-photo-1087118.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/842567/pexels-photo-842567.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/736716/pexels-photo-736716.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1510526/pexels-photo-1510526.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"};

    public String getUrlMaleImagePerfil() {
        StringBuilder sb = new StringBuilder();
        int hostId = random.nextInt(URL_HOSTS_Perfil.length);
        return URL_HOSTS_Perfil[hostId];
    }

    private String[] URL_HOSTS_fPerfil = new String[]{
            "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/638700/pexels-photo-638700.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/638700/pexels-photo-638700.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/50998/profile-girl-rose-young-girl-50998.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/681637/pexels-photo-681637.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1435612/pexels-photo-1435612.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1492156/pexels-photo-1492156.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1497856/pexels-photo-1497856.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1497258/pexels-photo-1497258.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/1460427/pexels-photo-1460427.jpeg?auto=compress&cs=tinysrgb&h=650&w=940",
            "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"};

    public String getUrlFemaleImagePerfil() {
        StringBuilder sb = new StringBuilder();
        int hostId = random.nextInt(URL_HOSTS_fPerfil.length);
        return URL_HOSTS_fPerfil[hostId];
    }


    //==============================================================================================
    //
    // ZipCode
    //
    //==============================================================================================

    public String getZipCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    //==============================================================================================
    //
    // Numbers
    //
    //==============================================================================================

    public String getNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append(random.nextInt(10000000) + 1);
        return sb.toString();
    }

    public String getNumber(int max) {
        StringBuilder sb = new StringBuilder();
        sb.append(random.nextInt(max));
        return sb.toString();
    }

    public String getNumber(int min, int max) {
        StringBuilder sb = new StringBuilder();
        sb.append(randBetween(min, max));
        return sb.toString();
    }

    //==============================================================================================
    //
    //  Dates
    //
    //==============================================================================================

    public String getRamdomTime(int minYear, int maxYear, boolean brazil) {
        SimpleDateFormat dfDateTime = getFormate(brazil);

        int year = randBetween(minYear, maxYear);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }

    public String getRamdomTime() {
        SimpleDateFormat dfDateTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
        int year = randBetween(1900, 2000);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }

    public String getRamdomTime(boolean brazil) {
        SimpleDateFormat dfDateTime = getFormate(brazil);
        int year = randBetween(1900, 2000);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }

    public String getRamdomBirthday() {
        SimpleDateFormat dfDateTime = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        int year = randBetween(1900, 2000);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }

    public String getRamdomBirthday(boolean brazil) {
        SimpleDateFormat dfDateTime = getFormateBrifday(brazil);
        int year = randBetween(1900, 2000);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }


    public String getRamdomHour() {
        SimpleDateFormat dfDateTime = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
        int year = randBetween(1900, 2000);// Here you can set Range of years you need
        int month = randBetween(0, 11);
        int hour = randBetween(9, 22); //Hours will be displayed in between 9 to 22
        int min = randBetween(0, 59);
        int sec = randBetween(0, 59);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = randBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day, hour, min, sec);

        return dfDateTime.format(gc.getTime());
    }

    private SimpleDateFormat getFormate(boolean type) {
        SimpleDateFormat dfDateTime;
        if (type) {
            return dfDateTime = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.getDefault());
        } else {
            return dfDateTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
        }
    }

    private SimpleDateFormat getFormateBrifday(boolean type) {
        SimpleDateFormat dfDateTime;
        if (type) {
            return dfDateTime = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        } else {
            return dfDateTime = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        }
    }

    private int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public String getDateToDayUSA() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getDateToDayBR() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getTimeStampToDay() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getDay() {
        DateFormat dateFormat = new SimpleDateFormat("dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getMonth() {
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getYear() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getHourToDay() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getHourToDayWithoutTheSeconds() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


    //==============================================================================================
    //
    //
    //
    //==============================================================================================


    private List<String> words = new ArrayList<String>();
    private Random random = null;


//    private List<String> readLines(String file) {
//        List<String> ret = new ArrayList<String>();
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new InputStreamReader(activity.getClass().getResourceAsStream(file), "UTF-8"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                ret.add(line.trim());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return ret;
//    }
//
//
//    public String getTitle(int count) {
//        return getWords(count, count, true);
//    }
//
//
//    public String getTitle(int min, int max) {
//        return getWords(min, max, true);
//    }
//
//    private int getCount(int min, int max) {
//        if (min < 0)
//            min = 0;
//        if (max < min)
//            max = min;
//        int count = max != min ? random.nextInt(max - min) + min : min;
//        return count;
//    }
//
//    public String getHtmlParagraphs(int min, int max) {
//        int count = getCount(min, max);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            sb.append("<p>");
//            sb.append(getParagraphs(1, 1));
//            sb.append("</p>");
//        }
//        return sb.toString().trim();
//    }
//
//    public String getParagraphs(int min, int max) {
//        int count = getCount(min, max);
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < count; j++) {
//            int sentences = random.nextInt(5) + 2; // 2 to 6
//            for (int i = 0; i < sentences; i++) {
//                String first = getWords(1, 1, false);
//                first = first.substring(0, 1).toUpperCase()
//                        + first.substring(1);
//                sb.append(first);
//
//                sb.append(getWords(2, 20, false));
//                sb.append(".  ");
//            }
//            sb.append("\n");
//        }
//        return sb.toString().trim();
//    }
//
//    private String getWords(int min, int max, boolean title) {
//        int count = getCount(min, max);
//        return getWords(count, title);
//    }
//
//
//    public String getWords(int count) {
//        return getWords(count, count, false);
//    }
//
//    public String getWords(int min, int max) {
//        return getWords(min, max, false);
//    }
//
//    private String getWords(int count, boolean title) {
//
//        int finalCount = count;
//        if (count <= 0) {
//            finalCount++;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        int size = words.size();
//        int wordCount = 0;
//        while (wordCount < finalCount) {
//            String word = words.get(random.nextInt(size));
//            if (title) {
//                if (wordCount == 0 || word.length() > 3) {
//                    word = word.substring(0, 1).toUpperCase()
//                            + word.substring(1);
//                }
//            }
//            sb.append(word);
//            sb.append(" ");
//            wordCount++;
//        }
//        return sb.toString().trim();
//    }
//
//    private String getRandom(List<String> list) {
//        int size = list.size();
//        return list.get(random.nextInt(size));
//    }


}
