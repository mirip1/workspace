package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import refactoring.Alquiler;
import refactoring.Cliente;
import refactoring.Vehiculo;
import refactorizada.AlquilerRef;
import refactorizada.ClienteRef;
import refactorizada.VehiculoRef;

class ClienteTest {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @Test
  void testCliente() {
    Cliente cliente = new Cliente("Enrique Martinez");
    Vehiculo vehiculo1 = new Vehiculo("2345JHH", Vehiculo.FURGONETA);
    Vehiculo vehiculo2 = new Vehiculo("6754MLN", Vehiculo.TURISMO);
    Vehiculo vehiculo3 = new Vehiculo("8765KHY", Vehiculo.MOTOCICLETA);
    
    cliente.addAlquiler(new Alquiler(vehiculo1, 2));
    cliente.addAlquiler(new Alquiler(vehiculo2, 2));
    cliente.addAlquiler(new Alquiler(vehiculo3, 1));
    
    String expected = "Registro de alquiler para Enrique Martinez\n" +
        "\t2345JHH\t60.0\n" +
        "\t6754MLN\t20.0\n" +
        "\t8765KHY\t10.0\n" +
        "Importe total 90.0\n" +
        "Has ganado 3 puntos de fidelidad";
    assertEquals(expected, cliente.cuenta());
  }
  
  @Test
  void testClienteRef() {
      ClienteRef cliente = new ClienteRef("Enrique Martinez");
      VehiculoRef vehiculo1 = new VehiculoRef("2345JHH", Vehiculo.FURGONETA);
      VehiculoRef vehiculo2 = new VehiculoRef("6754MLN", Vehiculo.TURISMO);
      VehiculoRef vehiculo3 = new VehiculoRef("8765KHY", Vehiculo.MOTOCICLETA);

      AlquilerRef alquiler1 = new AlquilerRef(vehiculo1, 2);
      AlquilerRef alquiler2 = new AlquilerRef(vehiculo2, 2);
      AlquilerRef alquiler3 = new AlquilerRef(vehiculo3, 1);


      cliente.addAlquiler(alquiler1);
      cliente.addAlquiler(alquiler2);
      cliente.addAlquiler(alquiler3);

      String expected = "Registro de alquiler para Enrique Martinez\n" +
              "\t2345JHH\t60.0\n" +
              "\t6754MLN\t20.0\n" +
              "\t8765KHY\t10.0\n" +
              "Importe total 90.0\n" +
              "Has ganado 3 puntos de fidelidad";
      assertEquals(expected, cliente.cuenta());
  }

}
