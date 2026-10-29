package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class iw5 {
    /* JADX INFO: renamed from: a */
    public static String m6958a(Context context, String str) {
        y42.m12854a0(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = p96.m9440a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static yn5 m6959b(Context context, nr0 nr0Var) {
        boolean z = true;
        if (nr0Var != nr0.CRONET_SOURCE_PLATFORM && nr0Var != nr0.CRONET_SOURCE_PLAY_SERVICES) {
            z = false;
        }
        boolean z2 = qs5.m10095T(context).getBoolean("android.net.http.EnableTelemetry", z);
        ImplVersion.getCronetVersion();
        return zy5.m13868c0(context, false, z2);
    }

    /* JADX INFO: renamed from: c */
    public static String m6960c(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
