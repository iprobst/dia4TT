package MarteGroupSA;

public class InvitadoMeli extends Invitado {

    public InvitadoMeli(String nombreCompleto) {
        super(nombreCompleto);
    }

    @Override
    public void gritar(){
        System.out.println("Viva la Chiqui!!");
    }

    @Override
    public void comerTorta() {
        try {
            Thread.sleep( (long) (Math.random()*900));
            gritar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
