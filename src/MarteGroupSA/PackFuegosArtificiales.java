package MarteGroupSA;

import java.util.ArrayList;

public class PackFuegosArtificiales implements FuegoArtificial{

    private ArrayList<FuegoArtificial> packsFuegos;

    public PackFuegosArtificiales() {
        this.packsFuegos = new ArrayList();
    }



    public void agregarFuegos(FuegoArtificialIndividual fuego){
        this.packsFuegos.add(fuego);
    }

    public void agregarFuegos(PackFuegosArtificiales fuegos){
        this.packsFuegos.add(fuegos);
    }


        public void explotarPacks(PackFuegosArtificiales pack) {
            for (int i = 0; i < pack.packsFuegos.size(); i++) {
                FuegoArtificial fuegoActual = pack.packsFuegos.get(i);
                if(fuegoActual instanceof PackFuegosArtificiales){
                    explotarPacks((PackFuegosArtificiales) pack.packsFuegos.get(i));
                }else if (((FuegoArtificialIndividual) fuegoActual).isUsado() == false){
                    ((FuegoArtificialIndividual) fuegoActual).explotar();
                }
            }

        }
}
