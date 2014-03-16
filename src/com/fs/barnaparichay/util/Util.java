package com.fs.barnaparichay.util;

import java.util.ArrayList;

import com.fs.barnaparichay.R;

public class Util {

	private static ArrayList<String> ttsList;

	public static ArrayList<Integer> getImageList() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(R.drawable.awe);
		list.add(R.drawable.aa);
		list.add(R.drawable.rassai);
		list.add(R.drawable.dirghi);
		list.add(R.drawable.rashu);
		list.add(R.drawable.dirghu);
		list.add(R.drawable.ri);
		list.add(R.drawable.a);
		list.add(R.drawable.oi);
		list.add(R.drawable.o);
		list.add(R.drawable.oou);

		creatTTSList();
		return list;
	}

	private static void creatTTSList() {
		ttsList = new ArrayList<String>();
		ttsList.add("awe");
		ttsList.add("aa");
		ttsList.add(" hroswo-ii");
		ttsList.add("dIirgho-ii");
		ttsList.add(" hroswo-u");
		ttsList.add("dIirgho-u");
		ttsList.add("rri");
		ttsList.add("aye");
		ttsList.add("oi");
		ttsList.add("o");
		ttsList.add("ou");

	}

	public static String getTTSText(int position) {
		return ttsList.get(position);
	}

}
