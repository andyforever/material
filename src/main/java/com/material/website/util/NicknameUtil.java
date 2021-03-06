/*
 * Copyright (c) 2015.
 * 北京云腾致用科技有限公司
 */
package com.material.website.util;

import java.util.Random;

/**  
 * @Description: 随机显示昵称
 * @author 张明虎 zhangminghu@yuntengzhiyong.com  
 * @date 2015年1月9日 下午3:06:59  
 */

public class NicknameUtil {
	public static final String PREFIX = "w";
	private static Random random = new Random();
	private static String[] names = {
		"幻影侠","美国队长","再生侠","恶灵骑士 ","火箭人","惩罚者 ","佐罗",
		"金刚狼 ","海皇子","灵怪博士 ","宇宙鬼魂 ","阴影侠 ","绿灯侠",
		"美国上尉","铁人","绿巨人","超人","蜘蛛侠","蝙蝠侠","米老鼠","唐老鸭",
		"黛丝","布鲁托","白雪公主","贝儿公主","小熊威尼","贝吉特 ","超级一星龙",
		"超级布欧","贝比","希斯得刚","孙悟饭","沙鲁","雅典娜","波赛冬","哈得斯",
		"阿波罗","冰河","紫龙","星矢","一辉","邪武","宇智波带土","宇智波斑","宇智波鼬",
		"波风水门","大蛇丸","宇智波止水","手打","自来也","我爱罗","漩涡鸣人","团藏","宇智波佐助",
		"葫芦娃","海尔兄弟","黑猫警长","孙悟空","猪八戒","哪吒","跳跳虎",
		"加菲猫","流氓兔","柯南","小新","樱木花道","卡卡西","绯村剑心","机器猫",
		"凌波丽","小熊维尼","寒羽良","杀生丸","樱桃小丸子","沙加","达也","佐助",
		"龙猫","麦兜","阿贵","一休","阿童木","丁丁","皮卡丘","阿拉蕾","史努比","皮诺曹","兔八哥", 
		"鬼冢英吉","桔梗","珊璞","小茜","良牙","卡卡西","景麒","小樱",
		"银次","鸣人","彩子","安西教练","流川枫","樱木花道","宫城良田","藤真", 
		"赵灵儿","林月如","阿奴","李逍遥","钢牙","大力水手","小鹿斑比", 
		"晴子","擎天柱","威震天","补天士","惊破天","星矢","紫龙",
		"一辉","穆先生","撒加","忍者神龟","芭比","高达","懒羊羊","暖羊羊","沸羊羊","喜羊羊","美羊羊",
		"灰太狼","小灰灰","光头强","熊二","熊大"
	};
	public static String getNickName() {
		return names[random.nextInt(names.length)];
	}
}
