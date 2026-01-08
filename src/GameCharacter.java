public class GameCharacter {

    // 1. Constructor (Viết đầu nhưng chạy CUỐI)
    public GameCharacter(String name) {
        System.out.println("Step 3: Constructor chạy -> Đặt tên nhân vật là " + name);
    }

    // 2. Static Block (Viết giữa nhưng chạy ĐẦU TIÊN)
    static {
        System.out.println("Step 1: Static Block chạy -> Load tài nguyên game (Texture, Sound)... Xong!");
    }

    // 3. Instance Block (Viết cuối nhưng chạy THỨ HAI)
    {
        System.out.println("Step 2: Instance Block chạy -> Tạo khung xương nhân vật, reset máu về 100.");
    }

    public static void main(String[] args) {
        System.out.println("--- Bắt đầu Main ---");

        System.out.println(">> Tạo nhân vật 1:");
        new GameCharacter("Bình");

        System.out.println("\n>> Tạo nhân vật 2:");
        new GameCharacter("Yasuo");
    }
}