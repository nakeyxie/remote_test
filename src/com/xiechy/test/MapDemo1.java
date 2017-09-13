package com.xiechy.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Map����������һ���������еı��
 * ��key-value�Ե���ʽ��������
 * @author Administrator
 *
 */
public class MapDemo1 {
	public static void main(String[] args){
		//java.util.Map
		Map<String,Integer> map
			= new HashMap<String,Integer>();
		
		map.put("����", 77);
		map.put("��ѧ", 85);
		map.put("����", 54);
		map.put("��ѧ", 74);
		//���Map�е�Ԫ�ظ���
		System.out.println(map.size());
		//���Map��toString
		System.out.println(map);
		/*
		 * ��Key��Map�в����ڣ��Ὣ������key��value
		 * ����Map,����ֵΪnull
		 * ����Ҫע�⣬��value��һ����װ�࣬��ô
		 * ���ǻ�ȡput����ֵʱӦ��ʹ�ð�װ��ȥ����
		 * ����Ӧ��ʹ�û������ͣ���Ϊ���漰����ʽ��
		 * �Զ����䣬�����������ָ���쳣��
		 */
		Integer num = map.put("��Ȼ", 88);
		System.out.println(map);
		System.out.println(num);//null
		/*
		 * ʹ��Map�����е�key�����value������
		 * �滻value������put�����Ὣ���滻��value
		 * ���� 
		 */
		num = map.put("����", 88);
		System.out.println(map);
		System.out.println(num);//54
		
		/*
		 * Map�л�ȡԪ�صķ�ʽ�Ǹ��ݸ�����key
		 * ��ȡ��Ӧ��value,��������key��map��
		 * �����ڣ��򷵻�ֵΪnull
		 * V get(K k)
		 */
		num = map.get("����");
		System.out.println("����:"+num);
		//�����ڵ�key����null
		num = map.get("����");
		System.out.println("����:"+num);
		
		/*
		 * ɾ��Ԫ��
		 * V remove(K k)
		 * ���ݸ�����keyɾ����ǰkey-value��
		 * ��key���ڣ�����ֵΪ��ǰkey��Ӧ��value
		 * ��key�����ڣ��򷵻�ֵΪnull.
		 */
		System.out.println(map);
		num = map.remove("����");
		System.out.println(num);
		System.out.println(map);
		
		/*
		 *  boolean containsKey(K k)
		 *  �鿴��ǰMap���Ƿ����������key
		 */
		boolean has = map.containsKey("�ֹ�");
		System.out.println("�Ƿ����ֹ�:"+has);
	}
}




