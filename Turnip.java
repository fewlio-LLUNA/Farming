/**
 * カブを表す具象クラス
 */
public class Turnip extends Produce {

    //カブの成長日数を表す。
    protected static final int GROWING_DAYS = 5;

    //コンストラクタ
    public Turnip() {
        this.growingDays = GROWING_DAYS;
    }

    /**
     * 作物名を応答する。
     * @return 作物名
     */
    protected String getProduceName() {
        return "カブ";
    }
    
    /**
     * 収穫完了時のアスキーアートを応答する。
     * @return AA
     */
    protected String getProducePicture(){
        return "         ..gMMMMMMNg,.         .+NNMN\r\n" + //
                        "        MMMMMMMMMMMMMN,   ..gMMMMMMM;\r\n" + //
                        "       ,TMMMMMMMMMMMMMMN,jMMMMMMMMMM#\r\n" + //
                        "            ?WMMMMMMMMMMMe?MMMMMMMMMM.\r\n" + //
                        "              .WMMMMMMMMMM,JMMMMMMMM@    \r\n" + //
                        "       ?MNMN.,  .YMMMMMMMMN.MMMMMMM#\r\n" + //
                        "        dMNNNMNg,..MMMMMMMM.MMMMMMD          \r\n" + //
                        "         TNMMMMMMMe 4MMMMMF(MMMMD ..ggMMMMMMc\r\n" + //
                        "          ,MMMMMMMMMx?MMMMIMMM9(JMMMMMMMMMMMMMp\r\n" + //
                        "            JMMMMMMMMNdMMN-MMNMMMMMMMMMMMMMMMMM;\r\n" + //
                        "        .(#\"\"!!?YMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN.\r\n" + //
                        "      .d=         -  .\"9MMMMMMMMMMMMMMMMMMMMMMMM@\r\n" + //
                        "     .t      i     !.    ^?MMMMMMMMMM\"\"\"\"\"^\r\n" + //
                        "    .F        <.     !,     ?MMMMMMMMMMMNJ.\r\n" + //
                        "    d!         .<.     .<..   .TMMMMMMMMMMN.\r\n" + //
                        "    M.             ?            (MMMMMMMMMb\r\n" + //
                        "    N(.                      ?!  NMMMMMMMMM\r\n" + //
                        "    M.(,     >                    MM)?MMMMMM\r\n" + //
                        "    d]  i     !,                  JM!  TMMM#\r\n" + //
                        "    ,N   .i.    ?.               .MF    .7M#\r\n" + //
                        "     JR            ?-,      .MM=        3\r\n" + //
                        "      JNJ     ?           ....dB^\r\n" + //
                        "       ,MMa,            ...g\"^\r\n" + //
                        "         TMMMNa&.....(gMM#=\r\n" + //
                        "             ??~~??7\"\"\"!";
    }

}

