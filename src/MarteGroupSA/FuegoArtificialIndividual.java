package MarteGroupSA;

public class FuegoArtificialIndividual implements FuegoArtificial{

    private String nombre;
    private boolean usado;
    private String ruido;

    public FuegoArtificialIndividual(String nombre,  String ruido) {
        this.nombre = nombre;
        this.usado = false;
        this.ruido = ruido;
    }

    public void explotar(){
        try {
            Thread.sleep( (long) (Math.random()*900));
            System.out.println(this.ruido);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }


    @Override
    public String toString() {
        return "FuegoArtificialIndividual{" +
                "nombre='" + nombre + '\'' +
               ", fue usado=" + usado +
                ", ruido='" + ruido + '\'' +
                '}';
    }

    private void explotarIndividual(FuegoArtificialIndividual individual) {
        individual.explotar();
        individual.setUsado(true);
    }
}
