package helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyHelper extends SQLiteOpenHelper {

    private static final String databaseName ="KitichenDB";
    private static  final int dbversion = 1;


    //tables
    private static  final String tblUser ="tblUSer";
    private static  final String tblFood ="tblFood";
    private static  final String tblOrder ="tblOrder";

    // metadata for tblUser
    private static  final String UserID ="UserID";
    private static final String UserName ="Username";
    private static final String Password ="Password";

    //metadata for tblFood
    private static final String FoodID ="FoodID";
    private static final String FoodName = "FoodName";
    private static final String FoodCategory ="FoodCategory";

    //metadata for tblOrder
    private static final String OrderID = "OrderID";
    private static final String OrderName ="OrderName";



    //Constructor
    public MyHelper(Context context) {
        super(context, databaseName, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //table create for table user
        String qryUser ="CREATE TABLE " + tblUser +  "(" + UserID
                + " INTEGER PRIMARY KEY AUTOICREMENT ,"
                + UserName + " TEXT," + Password + " TEXT" + ")";

        //table create for table food
        String qryFood = "CREATE TABLE " + tblFood +  "(" + FoodID
                + " INTEGER PRIMARY KEY AUTOICREMENT ,"
                + FoodName + " TEXT," + FoodCategory + " TEXT" + ")";

        //table create for table order
//        String qryOrder = "CREATE TABLE " + tblFood +  "(" + FoodID
//                + " INTEGER PRIMARY KEY AUTOICREMENT ,"
//                + FoodName + " TEXT," + FoodCategory + " TEXT" + ")";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
