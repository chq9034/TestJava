package year16.month12;

import java.util.regex.Pattern;

/**
 * 身份证校验
 * @author: caihq 
 * @since: 2016年12月30日 下午2:02:52 
 * @history:
 */
public class Day30 {

    public static void main(String[] args) {
        String regex = "|([1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3})|([1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X|x))";

        Pattern pattern = Pattern.compile(regex);
        for (String[] strs : idNums) {
            if (!pattern.matcher(strs[strs.length - 1]).find()) {
                System.out.println(strs[0] + " " + strs[strs.length - 1]);
            }
        }
        System.out.println("all over");
    }

    public static String[][] idNums = { { "张志新", "370283790911703" },
            { "张志新", "" }, { "张忠荣", "210905197807210546" },
            { "张仲礼", "370205197405213513" }, { "张竹霞", "370284800121002" },
            { "张子贵", "370727791118517" }, { "张宗敏", "370284197901130819" },
            { "张作芹", "370284801127364" }, { "章莉", "370203800901162" },
            { "赵标", "372922198012224773" }, { "赵宾", "370722197812222517" },
            { "赵芳", "370282197806180866" }, { "赵锋", "230803197906010035" },
            { "赵福涛", "37078119790127719x" }, { "张纯华", "152123198510030631" },
            { "张泽利", "211322198401012055" }, { "张家超", "211224198410315338" },
            { "张雷", "152801198703025310" }, { "李磊", "120107198507020611" },
            { "杨少猛", "130133831013213" }, { "苏士超", "21031119850417003x" },
            { "尚福乐", "211322198509260317" }, { "岳朋", "211481198401154411" },
            { "赵晓强", "15042919840709121x" }, { "杨思剑", "522324197508045617" },
            { "柏朝林", "510921591208435" }, { "李家发", "52262619800410121X" },
            { "李科", "522324197309155216" }, { "钱齐高", "433026196612172414" },
            { "李关福", "522422610421281" }, { "段小平", "510226196602284031" },
            { "彭恩建", "522224701013047" }, { "张", "勇", "522624630816183" },
            { "罗伟忠", "520201197209083216" }, { "杨云峰", "520201750708163" },
            { "张芳", "520202750914123" }, { "李建平", "520201710121165" },
            { "杨杰辉", "520201661010163" }, { "夏勇", "520201710820161" },
            { "王伟", "42092219731015461X" }, { "韩建珍", "522125197912221315" },
            { "李德华", "522121790220561" }, { "李应全", "522101630705641" },
            { "王世林", "522121196904245616" }, { "王永康", "522121197603177634" },
            { "郭成友", "522121771112601" }, { "李应贵", "522101197403216410" },
            { "蒋信江", "522121700504563" }, { "李显红", "522121820410603" },
            { "刘远清", "522121640422567" }, { "黄明海", "522132197808265418" },
            { "穆仁忠", "510223661218771" }, { "剧亚东", "150422198207055113" },
            { "徐宁", "210304198504290847" }, { "袁俊美", "411422198412055424" },
            { "彭铮", "220303198605153610" }, { "赵海建", "370281781019634" },
            { "赵海鹏", "370212791005457" }, { "赵海云", "150429800509501" },
            { "王洪侠", "210124198508162281" }, { "付文文", "210502198412020944" },
            { "史莹", "210411198504282942" }, { "白瑞峰", "622723198602013412" },
            { "兴明明", "210304198504260488" }, { "刘颖", "210421198403162020" },
            { "孙雪", "210303198412082729" }, { "孙源龙", "210302198607160938" },
            { "朱振华", "211003198407230111" }, { "佟琳", "21031119851130004x" },
            { "吴春雨", "210303198508131214" }, { ">宋林良", "210111198503063012" },
            { "张帆", "210304198503040045" }, { "张纯华", "152123198510030631" },
            { "张泽利", "211322198401012055" }, { "张家超", "211224198410315338" },
            { "张雷", "152801198703025310" }, { "李磊", "120107198507020611" },
            { "杨少猛", "130133831013213" }, { "苏士超", "21031119850417003x" },
            { "尚福乐", "211322198509260317" }, { "岳朋", "211481198401154411" },
            { "赵晓强", "15042919840709121x" }, { "剧亚东", "150422198207055113" },
            { "徐宁", "210304198504290847" }, { "袁俊美", "411422198412055424" },
            { "彭铮", "220303198605153610" }, { "张雷", "152801198703025310" },
            { "张亚春：232102196903151919" }, { "李恒钓", "511428196305026357" },
            { "张志军", "37142819800508053x" }, { "张志新", "370283790911703" },
            { "张忠荣", "210905197807210546" }, { "张仲礼", "370205197405213513" },
            { "张竹霞", "370284800121002" }, { "张子贵", "370727791118517" },
            { "张宗敏", "370284197901130819" }, { "张作芹", "370284801127364" },
            { "章莉", "370203800901162" }, { "赵标", "372922198012224773" },
            { "赵宾", "370722197812222517" }, { "赵斌", "370281197811137612" },
            { "赵伯佳", "370281800711635" }, { "赵春风", "37010219680709292X" },
            { "赵丹", "370285791121473" }, { "张志新", "370283790911703" },
            { "张忠荣", "210905197807210546" }, { "张仲礼", "370205197405213513" },
            { "张竹霞", "370284800121002" }, { "张子贵", "370727791118517" },
            { "张宗敏", "370284197901130819" }, { "张作芹", "370284801127364" },
            { "章莉", "370203800901162" }, { "赵标", "372922198012224773" },
            { "赵宾", "370722197812222517" }, { "赵芳", "370282197806180866" },
            { "赵锋", "230803197906010035" }, { "赵福涛", "37078119790127719x" },
            { "赵海建", "370281781019634" }, { "赵海鹏", "370212791005457" },
            { "赵海云", "150429800509501" }, { "张雷", "152801198703025310" },
            { "张亚春：232102196903151919" }, { "李恒钓", "511428196305026357" },
            { "张志军", "37142819800508053x" }, { "赵斌", "370281197811137612" },
            { "赵伯佳", "370281800711635" }, { "赵春风", "37010219680709292X" },
            { "赵丹", "370285791121473" }, { "赵芳", "370282197806180866" },
            { "赵锋", "230803197906010035" }, { "赵福涛", "37078119790127719x" },
            { "王洪侠", "210124198508162281" }, { "付文文", "210502198412020944" },
            { "史莹", "210411198504282942" }, { "白瑞峰", "622723198602013412" },
            { "兴明明", "210304198504260488" }, { "刘颖", "210421198403162020" },
            { "孙雪", "210303198412082729" }, { "孙源龙", "210302198607160938" },
            { "朱振华", "211003198407230111" }, { "佟琳", "21031119851130004x" },
            { "吴春雨", "210303198508131214" }, { ">宋林良", "210111198503063012" },
            { "张帆", "210304198503040045" }, { "张纯华", "152123198510030631" },
            { "张泽利", "211322198401012055" }, { "张家超", "211224198410315338" },
            { "张雷", "152801198703025310" }, { "李磊", "120107198507020611" },
            { "杨少猛", "130133831013213" }, { "苏士超", "21031119850417003x" },
            { "尚福乐", "211322198509260317" }, { "岳朋", "211481198401154411" },
            { "赵晓强", "15042919840709121x" }, { "杨思剑", "522324197508045617" },
            { "柏朝林", "510921591208435" }, { "李家发", "52262619800410121X" },
            { "李科", "522324197309155216" }, { "钱齐高", "433026196612172414" },
            { "李关福", "522422610421281" }, { "段小平", "510226196602284031" },
            { "彭恩建", "522224701013047" }, { "张勇", "522624630816183" },
            { "罗伟忠", "520201197209083216" }, { "杨云峰", "520201750708163" },
            { "张芳", "520202750914123" }, { "李建平", "520201710121165" },
            { "杨杰辉", "520201661010163" }, { "夏勇", "520201710820161" },
            { "王伟", "42092219731015461X" }, { "韩建珍", "522125197912221315" },
            { "李德华", "522121790220561" }, { "李应全", "522101630705641" },
            { "王世林", "522121196904245616" }, { "王永康", "522121197603177634" },
            { "郭成友", "522121771112601" }, { "李应贵", "522101197403216410" },
            { "蒋信江", "522121700504563" }, { "李显红", "522121820410603" },
            { "刘远清", "522121640422567" }, { "黄明海", "522132197808265418" },
            { "穆仁忠", "510223661218771" }, { "剧亚东", "150422198207055113" },
            { "徐宁", "210304198504290847" }, { "袁俊美", "411422198412055424" },
            { "彭铮", "220303198605153610" }, { "赵海建", "370281781019634" },
            { "赵海鹏", "370212791005457" }, { "赵海云", "150429800509501" },
            { "王洪侠", "210124198508162281" }, { "付文文", "210502198412020944" },
            { "史莹", "210411198504282942" }, { "白瑞峰", "622723198602013412" },
            { "兴明明", "210304198504260488" }, { "刘颖", "210421198403162020" },
            { "孙雪", "210303198412082729" }, { "孙源龙", "210302198607160938" },
            { "朱振华", "211003198407230111" }, { "佟琳", "21031119851130004x" },
            { "吴春雨", "210303198508131214" }, { "宋林良", "210111198503063012" },
            { "张帆", "210304198503040045" }, { "张纯华", "152123198510030631" },
            { "张泽利", "211322198401012055" }, { "张家超", "211224198410315338" },
            { "张雷", "152801198703025310" }, { "李磊", "120107198507020611" },
            { "杨少猛", "130133831013213" }, { "苏士超", "21031119850417003x" },
            { "尚福乐", "211322198509260317" }, { "岳朋", "211481198401154411" },
            { "赵晓强", "15042919840709121x" }, { "剧亚东", "150422198207055113" },
            { "徐宁", "210304198504290847" }, { "袁俊美", "411422198412055424" },
            { "彭铮", "220303198605153610" }, { "张雷", "152801198703025310" },
            { "张亚春：232102196903151919" }, { "李恒钓", "511428196305026357" },
            { "张志军", "37142819800508053x" }, { "张志新", "370283790911703" },
            { "张忠荣", "210905197807210546" }, { "张仲礼", "370205197405213513" },
            { "张竹霞", "370284800121002" }, { "张子贵", "370727791118517" },
            { "张宗敏", "370284197901130819" }, { "张作芹", "370284801127364" },
            { "章莉", "370203800901162" }, { "赵标", "372922198012224773" },
            { "赵宾", "370722197812222517" }, { "赵斌", "370281197811137612" },
            { "赵伯佳", "370281800711635" }, { "赵春风", "37010219680709292X" },
            { "赵丹", "370285791121473" }, { "张志新", "370283790911703" },
            { "张忠荣", "210905197807210546" }, { "张仲礼", "370205197405213513" },
            { "张竹霞", "370284800121002" }, { "张子贵", "370727791118517" },
            { "张宗敏", "370284197901130819" }, { "张作芹", "370284801127364" },
            { "章莉", "370203800901162" }, { "赵标", "372922198012224773" },
            { "赵宾", "370722197812222517" }, { "赵芳", "370282197806180866" },
            { "赵锋", "230803197906010035" }, { "赵福涛", "37078119790127719x" },
            { "赵海建", "370281781019634" }, { "赵海鹏", "370212791005457" },
            { "赵海云", "150429800509501" }, { "张雷", "152801198703025310" },
            { "张亚春：232102196903151919" }, { "李恒钓", "511428196305026357" },
            { "张志军", "37142819800508053x" }, { "赵斌", "370281197811137612" },
            { "赵伯佳", "370281800711635" }, { "赵春风", "37010219680709292X" },
            { "赵丹", "370285791121473" }, { "赵芳", "370282197806180866" },
            { "赵锋", "230803197906010035" }, { "赵福涛", "37078119790127719x" },
            { "王洪侠", "210124198508162281" }, { "付文文", "210502198412020944" },
            { "史莹", "210411198504282942" }, { "白瑞峰", "622723198602013412" },
            { "兴明明", "210304198504260488" } };
}
