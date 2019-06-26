public class Solution9 {

    private static HandshakesCalcuator handshakesCalcuator = new HandshakesCalcuator();

    public static void main(String[] args) {
        int peopleCount = Integer.valueOf(Integer.MAX_VALUE);
        long totalHandshakes = handshakesCalcuator.calculateFor(peopleCount);
        System.out.println(totalHandshakes);
    }
}
