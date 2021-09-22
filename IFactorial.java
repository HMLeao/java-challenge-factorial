public interface IFactorial {

  /**
   * Dado o método findFactorial(int), que recebe um dado numérico inteiro como parâmetro,
   * retorne seu fatorial. Por exemplo, se a entrada for 5, o método deve retornar
   * (5*4*3*2*1) = 120. Obs.: Lembre-se que o 0! = 1
   *
   * <p>
   *   Exemplo 1:<br>
   *   - entrada: 4<br>
   *   - saída: 24
   * </p>
   * <p>
   *   Exemplo 2:<br>
   *   - entrada: 8<br>
   *   - saída: 40320
   * </p>
   * @param input entrada.
   * @return fatorial resultante
   */
  public int findFactorial(int input);
}