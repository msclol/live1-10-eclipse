package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Eff {

    public static void main(String[] args) {
        majorOrNotMajor();

    }

    // somme de deux valeurs
    public static void sumTwoValues(int valueOne, int valueTwo) {
        int somme = valueOne + valueTwo;
        System.out.println(somme);

    } // Achevé !!!!

    // l'utilisateur , saisie deux valeurs et on affiche la somme
    // nous pouvons varier cela avec une soustraction ou encore multiplication
    public static void userWriteSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre");
        int saisie = sc.nextInt();
        System.out.println("Entrez le second nombre");
        int saisie2 = sc.nextInt();
        sumTwoValues(saisie, saisie2);

    }

    public static void showMaxValue(int value_one, int value_two) {
        // affichage de la valeur la plus elevée
        if (value_one > value_two) {
            System.out.println("Le plus grand nombre est: " + value_one);
        } else if (value_two > value_one) {
            System.out.println("Le plus grand nombre est: " + value_two);
        } else {
            System.out.println("Les deux valeurs sont identiques");
        }
    }

    // l'utilisateur saisi son age, dans un nombre entier et on lui affiche un texte
    // selon son age
    // si son age est à 18 ou plus : "Vous êtes majeur" , sinon, "vous êtes mineur
    // !"
    public static void majorOrNotMajor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre age: ");
        float age = scan.nextFloat();
        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else if (age < 18 & age >= 0) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println(age + " Impossible");
        }

    }

    // José va bientot passer son bac, il effectue en ce moment une anti-seche en
    // Java qui lui permet de lui donner
    // la longueur de l'hypothenuse
    // vous devez utiliser le théorème de Pythagore et afficher la longueur de
    // l'hypothenuse
    public static void pythagore(float coteUn, float coteDeux) {

    }

    // José, désire un programme qui permet de lui donner la mention en fonction de
    // la note
    // Vous devrez concevoir un algorithme qui demandera une note à l'utilisateur et
    // affichera un texte selon le bareme
    // en dessous de 8 : refusé
    // entre 8 inclus et 10 exclus : rattrapage
    // entre 10 inclus et 12 exlus : pas de mention
    // entre 12 inclus et 14 exclus : mention assez bien
    // entre 14 inclus et 16 exclus : mention bien
    // au dela de 16 inclus : très bien
    public static void mentionBac(int note) {

    }

    // José, après avoir eu son bac, a fait une grosse fete
    // il culpabilise car il a trop mangé et souhaite connaitre son IMC.
    // demander les le poid ainsi que la taille à l'utilisateur et affichez son IMC
    // L'imc est le poid (en kg) divisé ar la taille (en m) au carré.
    public static void imc() {

    }

    // l'utilisateur doit saisir un nombre entier: on lui affiche s'il est pair ou
    // impair
    // pair si quand il est divisé par deux, le reste est de 0
    public static void pairOrImpair() {

    }

    // on demande à l'utilisateur un nombre entier, on lui affiche s'il est premier
    // ou non
    // regle : un nombre est premier seulement s'il est divisible par 1 et lui-même
    // , 1 exclu
    public static void premierOrNotPremier() {

    }

    // division, attention au 0
    // Pour rappel, une division par 0 est interdite
    public static void divisionTwoValues(int numerator, int denumerator) {

    }

    // José est revenu pour nous tester un peu !
    // Il a constaté que vous avez fait pas mal d'exercice en Java.
    // Ainsi, il vous demande de lui donner la clef de controle de sa carte de
    // sécurité sociale
    // la clef de controle = 97 - (numero de sécurité sociale modulo 97) (le numero
    // de securité sociale est de 13 chiffres)
    // exemple : pour le code sécurité sociale 1921071123456 la clef est de 15.
    public static void keyControlHealth(int securiteSocialNum) {

    }

}
