package MarteGroupSA;

import java.util.ArrayList;

public class Evento {

    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegosArtificialesEvento;

    public Evento() {
        this.invitados = new ArrayList<>();
        this.fuegosArtificialesEvento = new ArrayList<>();
    }

    public void agregarFuegosArtificiales(FuegoArtificial fuegos){
        this.fuegosArtificialesEvento.add(fuegos);
    }

    public void mostrarFuegos(){
        System.out.println(fuegosArtificialesEvento.size());
    }

    public void agregarInvitado(Invitado invitado){
        this.invitados.add(invitado);
    }

    public void apagarVelas(){
        System.out.println("Apagando velas");
        System.out.println("los invitados empezaron a comer la torta");
        comer();
        explotar();
    }

    public void  comer(){
        for(Invitado invitado: invitados){
            invitado.comerTorta();
        }
    }

    public void explotar(){
        for (int i = 0; i < fuegosArtificialesEvento.size(); i++) {
            if( fuegosArtificialesEvento.get(i) instanceof PackFuegosArtificiales){
                ((PackFuegosArtificiales) fuegosArtificialesEvento.get(i)).explotarPacks((PackFuegosArtificiales) fuegosArtificialesEvento.get(i));
            }else {
                ((FuegoArtificialIndividual) fuegosArtificialesEvento.get(i)).explotar();
            }
        }
    }




}
