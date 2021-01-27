package MarteGroupSA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Invitado invitado1 = new InvitadoMeli("Juan");
        Invitado invitado2 = new InvitadoStandard("pablo");
        Invitado invitado3 = new InvitadoMeli("Maria");
        Invitado invitado4 = new InvitadoStandard("Roberto");

        Evento ev = new Evento();

        ev.agregarInvitado(invitado1);
        ev.agregarInvitado(invitado2);
        ev.agregarInvitado(invitado3);
        ev.agregarInvitado(invitado4);


        FuegoArtificialIndividual fI1 = new FuegoArtificialIndividual("Ca;a voladora", "Shhhhh..... Boom!");
        FuegoArtificialIndividual fI2 = new FuegoArtificialIndividual("Fosforito", "Bom!");
        FuegoArtificialIndividual fI3 = new FuegoArtificialIndividual("Rompe portones", "BOOOOOOMMM!");
        FuegoArtificialIndividual fI4 = new FuegoArtificialIndividual("Abejita", "Beeee Bom!");


        PackFuegosArtificiales pF1 = new PackFuegosArtificiales();

        pF1.agregarFuegos(fI1);
        pF1.agregarFuegos(fI2);
        pF1.agregarFuegos(fI3);

        PackFuegosArtificiales pF2 = new PackFuegosArtificiales();

        pF2.agregarFuegos(fI4);
        pF2.agregarFuegos(pF1);
        pF2.agregarFuegos(fI3);
        pF2.agregarFuegos(pF1);

        PackFuegosArtificiales pF3 = new PackFuegosArtificiales();
        pF3.agregarFuegos(fI2);
        pF3.agregarFuegos(pF2);
        pF3.agregarFuegos(pF1);
        pF3.agregarFuegos(fI1);

        ev.agregarFuegosArtificiales(fI1);
        ev.agregarFuegosArtificiales(fI3);
        ev.agregarFuegosArtificiales(pF1);
        ev.agregarFuegosArtificiales(fI4);
        ev.agregarFuegosArtificiales(pF2);
        ev.agregarFuegosArtificiales(fI2);
        ev.agregarFuegosArtificiales(pF1);
        ev.agregarFuegosArtificiales(pF3);

        ev.mostrarFuegos();
        ev.apagarVelas();

    }
}
