package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, boolean estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision) {

        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
    }

    @Override
    public String toString() {
        return "Moto []";
    }

}
