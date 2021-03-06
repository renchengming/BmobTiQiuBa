package cn.bmob.zuqiu.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * 数据库配置类
 * @ClassName: DBConfig
 * @Description: TODO
 * @author smile
 * @date 2014-5-30 上午11:08:05
 */
public class DBConfig {
	private Context mContext = null; // android上下文
	private String mDbName = "zuqiu.db"; // 默认的数据库名字，当用户登陆成功后，则会用当前用户的ObjectId作为数据库名
	private int dbVersion = 1; // 数据库版本
	private DbUpdateListener dbUpdateListener;

	public Context getContext() {
		return mContext;
	}

	public void setContext(Context context) {
		this.mContext = context;
	}

	public String getDbName() {
		return mDbName;
	}

	public void setDbName(String dbName) {
		this.mDbName = dbName;
	}

	public int getDbVersion() {
		return dbVersion;
	}

	public void setDbVersion(int dbVersion) {
		this.dbVersion = dbVersion;
	}

	public DbUpdateListener getDbUpdateListener() {
		return dbUpdateListener;
	}

	public void setDbUpdateListener(DbUpdateListener dbUpdateListener) {
		this.dbUpdateListener = dbUpdateListener;
	}

	public interface DbUpdateListener {
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);
	}
}
