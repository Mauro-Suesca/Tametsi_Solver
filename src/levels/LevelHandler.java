package levels;

public class LevelHandler{
    private static final int MAX_LEVEL = 160;
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