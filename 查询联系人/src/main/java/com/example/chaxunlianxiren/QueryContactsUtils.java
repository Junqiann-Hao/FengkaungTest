package com.example.chaxunlianxiren;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

//��ѯ��ϵ�˵Ĺ�����
public class QueryContactsUtils {

	
	public static List<Contact> queryContacts(Context context){
		//[0]����һ������
		
		List<Contact>  contactLists = new ArrayList<Contact>();
		//[1]�Ȳ�ѯrow_contacts�� ��contact_id�� ���Ǿ�֪��һ���м�����ϵ�� 
		Uri uri = Uri.parse("content://com.android.contacts/raw_contacts");
		Uri dataUri = Uri.parse("content://com.android.contacts/data");
		Cursor cursor = context.getContentResolver().query(uri,new String[]{"contact_id"} , null, null, null);
		while(cursor.moveToNext()){
			String contact_id = cursor.getString(0);
			
			
			if (contact_id!=null) {
			//����javabean����
			Contact contact = new Contact();
			
			contact.setId(contact_id);
			
			System.out.println("contact_id:"+contact_id);
			//[2]����contact_idȥ��ѯdata��  ��ѯdata1�к�mimetype_id 
			
			//�� �� �� �� �������ڲ�ѯdata���ʱ�� ��ʵ��ѯ����view_data����ͼ
			
			Cursor dataCursor = context.getContentResolver().query(dataUri, new String[]{"data1","mimetype"}, "raw_contact_id=?", new String[]{contact_id}, null);
			while(dataCursor.moveToNext()){
				String data1 = dataCursor.getString(0);
				String mimetype = dataCursor.getString(1);
				//[3]����mimetype ����data1�е��������� 
				if ("vnd.android.cursor.item/name".equals(mimetype)) {
					contact.setName(data1);
				}else if ("vnd.android.cursor.item/phone_v2".equals(mimetype)) {
					contact.setPhone(data1);
				}else if ("vnd.android.cursor.item/email_v2".equals(mimetype)) {
					contact.setEmail(data1);
				}
				
				
			}
			
			//��javabean������뵽������
			contactLists.add(contact);
			}
			
		}
		
		return contactLists;
		
	}
	
}
