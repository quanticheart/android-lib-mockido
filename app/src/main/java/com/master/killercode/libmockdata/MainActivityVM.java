package com.master.killercode.libmockdata;

import android.app.Activity;
import android.databinding.ObservableField;
import android.view.View;

import com.master.killercode.mockido.Mockido;

public class MainActivityVM {

    public ObservableField<String> rg = new ObservableField<>();
    public ObservableField<String> cpf = new ObservableField<>();
    public ObservableField<String> cnpj = new ObservableField<>();

    public ObservableField<String> cep = new ObservableField<>();
    public ObservableField<String> zipcode = new ObservableField<>();

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> fullname = new ObservableField<>();
    public ObservableField<String> login = new ObservableField<>();

    public ObservableField<String> cell = new ObservableField<>();
    public ObservableField<String> tell = new ObservableField<>();

    public ObservableField<String> fname = new ObservableField<>();
    public ObservableField<String> ffullname = new ObservableField<>();
    public ObservableField<String> email = new ObservableField<>();

    public ObservableField<String> url = new ObservableField<>();
    public ObservableField<String> urlbg = new ObservableField<>();
    public ObservableField<String> urlperfil = new ObservableField<>();

    public ObservableField<String> flogin = new ObservableField<>();

    public ObservableField<String> randomlogin = new ObservableField<>();
    public ObservableField<String> terms = new ObservableField<>();

    private Activity activity;

    MainActivityVM(Activity activity) {
        this.activity = activity;
    }

    void generateMocks() {

        Mockido mockido = new Mockido(activity);

        cep.set("CEP: " + mockido.getFormatedCEP());
        zipcode.set("ZipCode: " + mockido.getZipCode());

        rg.set("RG: " + mockido.getFormatedRG());
        cpf.set("CPF: " + mockido.getFormatedCPF());
        cnpj.set("CNPJ: " + mockido.getFormatedCNPJ());

        //==========================================================================================

        name.set(mockido.getMaleName());
        fullname.set(mockido.getFullMaleName());
        login.set(mockido.getLoginMaleName());
        email.set(mockido.getMaleEmail());

        //==========================================================================================

        url.set(mockido.getUrl("Mockido"));
        urlbg.set(mockido.getUrlImageBackground());
        urlperfil.set(mockido.getUrlFemaleImagePerfil());

        //==========================================================================================

        cell.set("Cellphone:" + mockido.getCellphoneBR());
        tell.set("Telephone:" + mockido.getTelephoneBR());

        //==========================================================================================

        fname.set(mockido.getFemaleName());
        ffullname.set(mockido.getFullFemaleName());
        flogin.set(mockido.getLoginFemaleName());

        //==========================================================================================

        randomlogin.set("Ramdom Login:" + mockido.getLoginMaleName());
//        terms.set(mockido.getTermsOfUser());
    }

    View.OnClickListener newValues = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            generateMocks();
        }
    };

}
