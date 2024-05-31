/**
 * 農家を表すクラス。
 * 作物をを成長させるのに必要な農業スキルを取得するために農家は存在する。
 */
public class Farmer extends Object{
    /**
     * 農家の技術力を表す数値。
     * Farming0ではScannerにて任意の値を入力していたが、実装がよくわからなかったのでScannerはなかったことにする。
     * Farming3では0.99*nの確率で農作物の収穫を行うことができる。
     */
    protected static int farmerSkill = 99 ;

    /**
     * 農家の技術力を応答する。農家スキル値。
     * @return 農家スキル値
     */
    protected static int getFarmerskill() {
        return farmerSkill;
    }
}
