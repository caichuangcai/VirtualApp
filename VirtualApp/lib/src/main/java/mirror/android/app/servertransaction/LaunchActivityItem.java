package mirror.android.app.servertransaction;

import android.content.Intent;
import mirror.RefClass;
import mirror.RefObject;

public class LaunchActivityItem {

    public static Class<?> TYPE = RefClass.load(LaunchActivityItem.class, "android.app.servertransaction.LaunchActivityItem");

    public static RefObject<Intent> mIntent;

    public static RefObject<Object> mInfo;

}
