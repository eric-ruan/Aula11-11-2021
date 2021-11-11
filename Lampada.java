public class Lampada{
    private boolean situacaoLampada;

    public boolean isSituacaoLampada(){
        return situacaoLampada;
    }public void setSituacaoLampada(boolean situacaoLampada){
        this.situacaoLampada = situacaoLampada;
    }

    public void ligado(){
        situacaoLampada = true;
    }
    public void desligado(){
        situacaoLampada = false;
    }
}