public class Note {
  private String name;
  private char letter;
  private char accidental;
  private int octave;
  private int num;
  private int midi_value;

  public static String flat_sym() {
    return Character.toString(0x266D);
  }

  public static String natural_sym() {
    return Character.toString(0x266E);
  }

  public static String sharp_sym() {
    return Character.toString(0x266F);
  }
}
