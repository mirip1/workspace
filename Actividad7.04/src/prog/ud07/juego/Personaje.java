package prog.ud07.juego;

/**
 * personaje del juego
 */
public abstract class Personaje {

  // Nombre del personaje
  private String nombre;

  // Vida inicial del personaje
  private int vidaInicial;

  // Vida actual del personaje
  private int vidaActual;

  // Booleano que comprueba si esta vivo el personaje
  private boolean estaVivo;

  /**
   * Constructor Si la vida del personaje no es mayor que 0 se lanza Exception
   * 
   * @param nombre      Nombre del personaje
   * @param vidaInicial Vida inicial del personaje
   * @throws IllegalArgumentException si algun dato esta mal
   */
  protected Personaje(String nombre, int vidaInicial) {
    super();

    if (comprobarVidaInicial(vidaInicial) && comprobarNombre(nombre)) {
      this.nombre = nombre;
      this.vidaInicial = vidaInicial;
      this.vidaActual = vidaInicial;
      this.estaVivo = true;

    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * Metodo que simula el ganar vida Solo si esta vivo
   * 
   * @param puntosGanados putos que se cura deben ser >0
   */
  public void ganaVida(int puntosGanados) {

    if (estaVivo && puntosGanados > 0) {

      vidaActual += puntosGanados;

      if (vidaActual > vidaInicial) {
        vidaActual = vidaInicial;
      }

    }

  }

  /**
   * Devuelve la letalidad
   * 
   * @param letalidad puntos de vida que quita
   * @return
   */
  public int ataca() {
    int letalidad = 0;
    return letalidad;
  }

  public int cura() {
    int potenciaCura = 0;
    return potenciaCura;
  }

  /**
   * Metodo que simula la perdida de vida de un personaje Solo si está vivo
   * 
   * @param puntosPerdidos puntos que pierde deben ser >0
   */
  public void pierdeVida(int puntosPerdidos) {

    if (estaVivo && puntosPerdidos > 0) {

      vidaActual -= puntosPerdidos;
      if (vidaActual <= 0) {
        vidaActual = 0;
        muere();
      }

    }

  }

  // Muerte del personaje
  protected void muere() {
    estaVivo = false;
  }

  // Metodo que comprueba que la vida de creacion es mayor que 0
  private boolean comprobarVidaInicial(int vidaInicial) {
    return vidaInicial > 0;
  }

  // Metodo que comprueba que el nombre no es vacio
  private boolean comprobarNombre(String nombre) {
    if (nombre == null) {
      return false;
    }
    return !nombre.isBlank() && !nombre.isEmpty();
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return the vidaInicial
   */
  public int getVidaInicial() {
    return vidaInicial;
  }

  /**
   * @return the vidaActual
   */
  public int getVidaActual() {
    return vidaActual;
  }

  /**
   * @return the estaVivo
   */
  public boolean isEstaVivo() {
    return estaVivo;
  }

  @Override
  public String toString() {
    return "Personaje [nombre=" + nombre + ", vidaInicial=" + vidaInicial + ", vidaActual=" + vidaActual + ", estaVivo="
        + estaVivo + "]";
  }

}
