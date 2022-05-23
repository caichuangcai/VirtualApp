package mirror.android.content.pm;

import android.content.pm.ApplicationInfo;
import mirror.RefClass;
import mirror.RefObject;


public class ApplicationInfoP {

    public static Class<?> TYPE = RefClass.load(ApplicationInfoP.class, ApplicationInfo.class);

    public static RefObject<String[]> splitNames;
    public static RefObject<String> sourceDir;

}