package com.springcore;

import com.springcore.entity.Imprimeur;
import com.springcore.entity.Menuisier;
import com.springcore.entity.Metallurgiste;
import com.springcore.interfaces.Artisan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----------------------------------");
        Artisan menuisier = context.getBean("menuisier", Menuisier.class);
        menuisier.artisanInfos();
        menuisier.getDevis();
        System.out.println(((Menuisier) menuisier).getDecouper());
        System.out.println("-----------------------------------");
        Artisan imprimeur = context.getBean("imprimeur", Imprimeur.class);
        imprimeur.artisanInfos();
        imprimeur.getDevis();
        System.out.println(((Imprimeur) imprimeur).getDecouper());
        System.out.println("-----------------------------------");
        Artisan metallurgiste = context.getBean("metallurgiste", Metallurgiste.class);
        metallurgiste.artisanInfos();
        metallurgiste.getDevis();
        System.out.println(((Metallurgiste) metallurgiste).getDecouper());
        System.out.println("-----------------------------------");
    }
}
