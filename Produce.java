import java.util.Random;
/**
 * 作物を表す抽象クラス
 * 
 * @author T.Ogawa, Sadakane(Reviewer)
 */
public abstract class Produce {

    /**
     * 成長日数を表す。
     */
    protected int growingDays;

    /**
     * 作物名を応答する。
     * 
     * @return 作物名
     */
    protected abstract String getProduceName();
    
    /**
     * 収穫完了時のアスキーアートを応答する。
     * 
     * @return AA
     */
    protected abstract String getProducePicture();

    /**
     * 野菜を成長させる。
     */
    protected void grow() {
        Random random = new Random();
        int successGrow = random.nextInt(101); // 0から100までの範囲で乱数を生成

        int skill = Farmer.getFarmerskill();//Farmerの技術力を使えるようにする

        for(int i=0; i <= growingDays ; i++){
            if(i == growingDays){
                System.out.println("<"+ this.getProduceName() + "を収穫できた！！>");
                System.out.println(this.getProducePicture());
            }else if(successGrow < skill){
                System.out.println("<" + this.getProduceName() + "が成長した！>");
            }else{
                System.out.println(this.getProduceName() + "は枯れてしまった……");
                break;
            }
        }
    }
}