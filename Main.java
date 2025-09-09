public class Main {
  public static void main(String[] args) {
    Note n = new Note();
    System.out.println(n.get_name());
    System.out.println(n.get_letter());
    System.out.println(n.get_accidental());
    System.out.println(n.get_octave());
    System.out.println(n.get_pitch_class());
    System.out.println(n.get_midi_value());
  }
}
