/**
 * ナスを表す具象クラス
 */
public class Eggplant extends Produce {
      
    //ナスの生長期間
    protected static final int GROWING_DAYS = 7;

    //コンストラクタ
    public Eggplant() {
        this.growingDays = GROWING_DAYS;
    }

    /**
     * 作物名を応答する。
     * @return 作物名
     */
    protected String getProduceName() {
        return "ナス";
    }
    
    /**
     * 収穫完了時のアスキーアートを応答する。
     * @return AA
     */
    protected String getProducePicture(){
        return "                                        ..(,\r\n" + //
                "                                       JMM%\r\n" + //
                "                                 .....(MMN.\r\n" + //
                "                                .MMMMMMMMMMMp\r\n" + //
                "                              -MMMMMMMMMMMMM]  \r\n" + //
                "                           ...MMMMMMMMMMMMMMN\r\n" + //
                "                      ..gMMMMMMMMMMMMMMMMMM#\r\n" + //
                "                     _7\"\"\"7^,MMMMMMMMMMF\r\n" + //
                "                       ...MMMMMM#(MMMM3,WMM]\r\n" + //
                "             .....&gMMMMMMMMMMMMMMcMM#(MNbTMN\r\n" + //
                "         .JMMMMMMMMMMMMMMMMMMMMMMMN(=(MNM# ?Mb\r\n" + //
                "      .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM!\r\n" + //
                "     .MM@^  4MMMMMMMMMMMMMMMMMMMMMMMMMMM^\r\n" + //
                "    .MM]   .dMMMMMMMMMMMMMMMMMMMMMMMMMM^\r\n" + //
                "   .MMMMagMMMMMMMMMMMMMMMMMMMMMMMMMMMMF\r\n" + //
                "   .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM^        \r\n" + //
                "   (MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM=\r\n" + //
                "   .MMMMMMMMMMMMMMMMMMMMMMMMMMMM@'        \r\n" + //
                "    ?MMMMMMMMMMMMMMMMMMMMMMMM#=              \r\n" + //
                "     TMMMMMMMMMMMMMMMMMMMM\"!           \r\n" + //
                "      ?MMMMMMMMMMMMMMM#\"                      \r\n" + //
                "        TMMMMMMMMMM\"^\r\n" + //
                "                                         ";
    }
}
