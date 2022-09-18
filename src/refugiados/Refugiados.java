package refugiados;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Refugiados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Introduce el Número de Refugiados: ");
     int refugiados = teclado.nextInt();
     int varones = refugiados/2;
     int hembras = refugiados/2;
     int menoresDeEdad = refugiados/3;
     int personasMayores = refugiados/3;
     int adultos = refugiados - (menoresDeEdad + personasMayores);
     int poblacionfemenina = refugiados / 14;
     int poblacionMasculina = refugiados / 14;
     int tiendasDeCampañaIndividuales = refugiados;
     int centroDeSalud = refugiados /100;
     int individual = refugiados * 25 /100;
     int familiar = refugiados * 75 /100;
     int letrinas = refugiados / 10;
     int comercio = refugiados /1000;
     int callesCampamento = 100 * 100; // 100 personas por 100 calles de cada complejo
     int complejos = refugiados / callesCampamento;
     
     System.out.println("DIAGNÓSTICO Y REGISTRO GENERAL: ANÁLISIS DE DATOS DE UN CAMPAMENTO.");
     System.out.println("---------------------------------------------------------------------------------------------------------------------");
     System.out.println("Diseño de Complejo de Acogida o Falansterio: comunidad de producción, consumo y residencia temporal");
     System.out.println("");
     System.out.println("El Total de Refugiados es: " + refugiados + " personas");
     System.out.println("Los varones Refugiados son: " + varones + " varones");
     System.out.println("Las hembras Refugiadas son: " + hembras + " hembras");
     System.out.println("Las Personas Mayores son: " + personasMayores + " personas Mayores de 65 años.");
     System.out.println("Los Menores de Edad son: " + menoresDeEdad + " Menores de 18 años. ");
     System.out.println("Los Adultos son: " + adultos +  " adultos entre 18 y 65 años.");
     System.out.println("");
     
     System.out.println("ANÁLISIS ESPECÍFICO DE DATOS DE LAS HEMBRAS.");
     System.out.println("---------------------------------------------------------------------------");
     
     System.out.println("Entre 0 y 7 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 7 y 14 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 14 y 21 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 21 y 28 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 28 y 35 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 35 y 42 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 42 y 49 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 49 y 56 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 56 y 63 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 63 y 70 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 70 y 77 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 77 y 84 años de edad son: " + poblacionfemenina);
     System.out.println("Entre 84 y 91 años de edad son: "+ poblacionfemenina);
     System.out.println("Mayores de 91 años son: "+ poblacionfemenina);
     System.out.println("");
     
     System.out.println("ANÁLISIS ESPECÍFICO DE DATOS DE LOS VARONES.");
     System.out.println("---------------------------------------------------------------------------");
     
     System.out.println("Entre 0 y 7 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 7 y 14 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 14 y 21 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 21 y 28 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 28 y 35 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 35 y 42 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 42 y 49 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 49 y 56 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 56 y 63 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 63 y 70 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 70 y 77 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 77 y 84 años de edad son: " + poblacionMasculina);
     System.out.println("Entre 84 y 91 años de edad son: "+ poblacionMasculina);
     System.out.println("Mayores de 91 años son: "+ poblacionMasculina);
     System.out.println("");
     
     System.out.println("EVALUACIÓN DE NECESIDADES BÁSICAS.");
     System.out.println("------------------------------------------------------------");
     System.out.println("");
     
     System.out.println("Área Administrativa: ");
     System.out.println("------------------------------------------------------------");
     System.out.println("1 .- Registro General o Padrón.");
     System.out.println("1.1 .- Individual: " + individual);
     System.out.println("1.2 .- Familiar: " + familiar);
     System.out.println("2 .- Departamento Gestión de Documentación.");
     System.out.println("2.1 .- Identidad Jurídica: " + refugiados);
     System.out.println("2.2 .- Expediente Médico: " + refugiados);
     System.out.println("2.3 .- Curriculum Vitae: "+ adultos);
     System.out.println("");
     
     System.out.println("Área Residencial o Alojamiento: ");
     System.out.println("------------------------------------------------------------");
     System.out.println("3 .- Ubicación y Parcelación.");
     System.out.println("3.1.- El número de Tiendas Necesarias es: " + tiendasDeCampañaIndividuales + " Tiendas de Campaña.");
     System.out.println("3.2 .- El número de calles son: " + callesCampamento);
     System.out.println("3.2 .- El número de complejos o falansterios son: " + complejos);
     System.out.println("3. 3. - Higiene Personal y Colectiva: Letrinas, Fuentes de Agua, ..." + letrinas);
     System.out.println("");
     
     System.out.println("Otras Áreas:");
     System.out.println("------------------------------------------------------------");
     System.out.println("2.1 .- Abastecimiento: ropa, calzado, agua, alimentos, medicamentos, ...");
     System.out.println("2.1. 1 .- El número de pares de calzado necesarios son: " + refugiados);
     System.out.println("2.1. 2 .- El volumen de vestimenta necesaria es: " + refugiados);
     System.out.println("2.1. 3 .- El número de mantas es: " + refugiados);
     System.out.println("2.1. 4 .- El número de camas es: " + refugiados);
     System.out.println("2.1. 5 .- El número de kids de cocina: " + refugiados);
     System.out.println("2.1. 5 .- El número de kids de higiene personal: " + refugiados);
     System.out.println("2.2 .- El número de áreas de Comercio es: " + comercio);
     System.out.println("2.3 .- El número de Tiendas Escuelas es: " + menoresDeEdad);
     System.out.println("2.4 .- El número de Tiendas de Atención Socio-Sanitaria es: " + centroDeSalud);
     
    }
    
}
