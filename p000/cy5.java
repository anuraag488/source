package p000;

import android.content.Context;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cy5 {
    /* JADX INFO: renamed from: a */
    public static a52 m4233a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        a52 a52Var = new a52();
        a52Var.f109a = strConcat;
        a52Var.f110b = str2;
        VarHandle.storeStoreFence();
        return a52Var;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4234b(byte b) {
        return b > -65;
    }
}
