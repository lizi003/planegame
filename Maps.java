public class Maps {
    /*初始化游戏数据（包括二维棋盘数组（存放字符信息，比如飞机、空地）、
    一维路径数组（存放从起点到终点按顺序排好的坐标），
    一维飞机代号数组（存放8架飞机对应在路径数组中的索引，该数组索引序号表示几号飞机）），
    建立一个变量flag，奇数表示1号玩家的回合，偶数表示2号玩家的回合*/

    /*生成23*23的二维地图数组，数组内元素为玩家能看到的图案*/
    public String Map[][] = new String[23][23];

    /*将两位玩家各自的飞机从起点到终点所要经过的地图坐标按顺序排好*/
    int[][] Road1 = {{8, 2}, {8, 3}, {8, 4}, {8, 5}, {8, 6}, {8, 7}, {8, 8},
            {7, 8}, {6, 8}, {5, 8}, {4, 8}, {3, 8}, {2, 8},
            {2, 9}, {2, 10}, {2, 11}, {2, 12}, {2, 13}, {2, 14},
            {3, 14}, {4, 14}, {5, 14}, {6, 14}, {7, 14}, {8, 14},
            {8, 15}, {8, 16}, {8, 17}, {8, 18}, {8, 19}, {8, 20},
            {9, 20}, {10, 20}, {11, 20}, {12, 20}, {13, 20}, {14, 20},
            {14, 19}, {14, 18}, {14, 17}, {14, 16}, {14, 15}, {14, 14},
            {15, 14}, {16, 14}, {17, 14}, {18, 14}, {19, 14}, {20, 14},
            {20, 13}, {20, 12}, {20, 11}, {20, 10}, {20, 9}, {20, 8},
            {19, 8}, {18, 8}, {17, 8}, {16, 8}, {15, 8}, {14, 8},
            {14, 7}, {14, 6}, {14, 5}, {14, 4}, {14, 3}, {14, 2},
            {13, 2}, {12, 2}, {11, 2},
            {11, 3}, {11, 4}, {11, 5}, {11, 6}, {11, 7}, {11, 8}, {11, 9}, {11, 10}, {11, 11}};
    int[][] Road2 = {{14, 20}, {14, 19}, {14, 18}, {14, 17}, {14, 16}, {14, 15}, {14, 14},
            {15, 14}, {16, 14}, {17, 14}, {18, 14}, {19, 14}, {20, 14},
            {20, 13}, {20, 12}, {20, 11}, {20, 10}, {20, 9}, {20, 8},
            {19, 8}, {18, 8}, {17, 8}, {16, 8}, {15, 8}, {14, 8},
            {14, 7}, {14, 6}, {14, 5}, {14, 4}, {14, 3}, {14, 2},
            {13, 2}, {12, 2}, {11, 2}, {10, 2}, {9, 2}, {8, 2},
            {8, 2}, {8, 3}, {8, 4}, {8, 5}, {8, 6}, {8, 7}, {8, 8},
            {7, 8}, {6, 8}, {5, 8}, {4, 8}, {3, 8}, {2, 8},
            {2, 9}, {2, 10}, {2, 11}, {2, 12}, {2, 13}, {2, 14},
            {3, 14}, {4, 14}, {5, 14}, {6, 14}, {7, 14}, {8, 14},
            {8, 15}, {8, 16}, {8, 17}, {8, 18}, {8, 19}, {8, 20},
            {9, 20}, {10, 20}, {11, 20},
            {11,19},{11,18},{11,17},{11,16},{11,15},{11,14},{11,13},{11,12},{11,11}};

    /*将所有8架飞机所在坐标对应在Road数组中的索引存入numPlane数组中，使用numPlane的索引来区分8架飞机*/
    public int[] numPlane = new int[8];

    /*flag来记录当前回合数*/
    public int flag = 1;

    /*desti用来记录到达终点的飞机数*/
    public int desti1 = 0;
    public int desti2 = 0;

    /*打印地图背景*/
     Maps() {
         for (int i = 0; i < Map.length; i++) {
             for (int j = 0; j < Map[i].length; j++) {
                 Map[i][j] = "⬛";
             }
         }

        /*把所有横着的棋盘创建好*/
        for (int i = 2; i <= 8; i++) {
            Map[8][i] = "⏩";
            Map[14][i] = "⏪";
        }
        for (int i = 8; i <= 14; i++) {
            Map[2][i] = "⏩";
            Map[20][i] = "⏪";
        }
        for (int i = 14; i <= 20; i++) {
            Map[8][i] = "⏩";
            Map[14][i] = "⏪";
        }
        for (int i = 2; i <= 20; i++) {
            Map[11][i] = "🚧";
        }

        /*在创建棋盘中竖着的棋路*/
        for (int i = 2; i < 8; i++) {
            Map[i][8] = "⏫";
            Map[i][14] = "⏬";
        }
        for (int i = 14; i < 20; i++) {
            Map[i][8] = "⏫";
            Map[i][14] = "⏬";
        }
         for (int i = 8; i < 14; i++) {
             Map[i][2] = "⏫";
             Map[i][20] = "⏬";
         }

         /*终点做额外标记*/
         Map[11][11] = "🚩";

        /*创建1号玩家机场上的飞机*/
        Map[3][3] = "🚀";
        Map[3][6] = "🛫";
        Map[6][3] = "🛬";
        Map[6][6] = "🚁";

        /*创建2号玩家机场上的飞机*/
        Map[16][16] = "🚈";
        Map[16][19] = "🚄";
        Map[19][16] = "🚞";
        Map[19][19] = "🚃";
    }
}


