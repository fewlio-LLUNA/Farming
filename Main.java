/**
 * 簡易農業シミュレーティングを動作させるメインプログラム。
 */
public class Main extends Object {

    /**
     * エントリーポイント。
     * 用意されているカブとナスを育成しようとする。
     * @param args 実行時引数（特に使用しない）
     */
    public static void main(String[] args) {

        
        // カブを生成し、育成する。
        Turnip kabu = new Turnip();
        kabu.grow();

        // ナスを生成し、育成する。
        Eggplant nasu = new Eggplant();
        nasu.grow();
    }
}
