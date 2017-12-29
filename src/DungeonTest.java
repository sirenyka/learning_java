import java.io.*;


class DungeonGame implements Serializable {
    static final long serialVersionUID = 3489043407507410743L;
    public int x;
    transient long y;
//    private transient short z;

//    public DungeonGame(int x, long y, short z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    public DungeonGame(int x, long y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }
    long getY() {
        return y;
    }
//    short getZ() {
//        return z;
//    }
}

class DungeonTest {
    public static void main(String[] args) {

//        System.out.println(d.getX() + d.getY() + d.getZ());
        try {
//            FileOutputStream fos = new FileOutputStream("dg.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            DungeonGame d = new DungeonGame((byte) 3, 4L);
//            oos.writeObject(d);
//            oos.close();

            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DungeonGame d2 = (DungeonGame) ois.readObject();
            System.out.println(d2.getX() + d2.getY());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}