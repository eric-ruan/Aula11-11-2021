public class Programa{
    public static void main(String[] args) {
        Lampada l = new Lampada();
        l.desligado();

        if(l.isSituacaoLampada()){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
        }
    }
}