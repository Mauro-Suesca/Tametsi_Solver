package levels;

public class LevelHandler{
    private static final int MAX_LEVEL = 161;
    private Level[] levels;

    public LevelHandler(){
        this.levels = new Level[MAX_LEVEL];
        initializeLevels();
    }

    private void initializeLevels(){
        levels[6] = new Level6();
        levels[9] = new Level9();
        levels[12] = new Level12();
        levels[13] = new Level13();
        levels[18] = new Level18();
        levels[20] = new Level20();
        levels[21] = new Level21();
        levels[23] = new Level23();
        levels[25] = new Level25();
        levels[27] = new Level27();
        levels[28] = new Level28();
        levels[30] = new Level30();
        levels[32] = new Level32();
        levels[34] = new Level34();
        levels[36] = new Level36();
        levels[37] = new Level37();
        levels[38] = new Level38();
        levels[42] = new Level42();
        levels[43] = new Level43();
        levels[44] = new Level44();
        levels[46] = new Level46();
        levels[47] = new Level47();
        levels[48] = new Level48();
        levels[50] = new Level50();
        levels[52] = new Level52();
        levels[53] = new Level53();
        levels[54] = new Level54();
        levels[55] = new Level55();
        levels[56] = new Level56();
        levels[57] = new Level57();
        levels[59] = new Level59();
        levels[60] = new Level60();
        levels[61] = new Level61();
        levels[63] = new Level63();
        levels[64] = new Level64();
        levels[65] = new Level65();
        levels[67] = new Level67();
        levels[69] = new Level69();
        levels[70] = new Level70();
        levels[71] = new Level71();
    }

    public void showAvailableLevels(){
        System.out.print("The currently available levels are: ");
        for(int i=0; i<MAX_LEVEL; i++){
            if(levels[i] != null){
                System.out.print(levels[i] + " ");
            }
        }
        System.out.println();
    }

    public void runLevel(String levelId){
        if(levelId.equals("test")){
            for(int i=0; i<MAX_LEVEL; i++){
                if(levels[i] != null){
                    levels[i].test();
                }
            }
        }else{
            int levelIndex = Integer.parseInt(levelId);

            if(levels[levelIndex] != null){
                levels[levelIndex].start();
            }else{
                throw new IndexOutOfBoundsException();
            }
        }
    }
}