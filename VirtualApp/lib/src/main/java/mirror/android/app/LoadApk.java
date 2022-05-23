package mirror.android.app;

import android.content.pm.ApplicationInfo;
import mirror.RefClass;
import mirror.RefObject;

public class LoadApk {

    public static Class<?> TYPE = RefClass.load(LoadApk.class, "android.app.LoadedApk");
    public static RefObject<ApplicationInfo> mApplicationInfo;

}