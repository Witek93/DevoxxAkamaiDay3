public class Solution9 {

    private static HandshakesCalcuator handshakesCalcuator = new HandshakesCalcuator();

    public static void main(String[] args) {
        int peopleCount = Integer.valueOf(args[0]);
        int totalHandshakes = handshakesCalcuator.calculateFor(peopleCount);
        System.out.println(totalHandshakes);
    }
}
