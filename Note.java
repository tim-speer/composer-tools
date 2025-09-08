public class Note {
  private String name;
  private String letter;
  private String accidental;
  private int octave;
  private int pitch_class;
  private int midi_value;

  public Note() {
    letter = "C";
    accidental = natural_sym();
    octave = 4;
    pitch_class = 0;
    midi_value = 60;
    set_name(letter, accidental, octave);
  }

  public static String flat_sym() {
    return Character.toString(0x266D);
  }

  public static String natural_sym() {
    return Character.toString(0x266E);
  }

  public static String sharp_sym() {
    return Character.toString(0x266F);
  }

  public String get_name() {
    return name;
  }

  private void set_name(String letter, String accidental, int octave) {
    if (accidental.equals(natural_sym())) {
      name = letter + octave;
    } else {
      name = letter + accidental + octave;
    }
  }

  public String  get_letter() {
    return letter;
  }

}
