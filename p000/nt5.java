package p000;

import android.content.Context;
import org.chromium.net.ApiVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nt5 {
    /* JADX INFO: renamed from: a */
    public static yn5 m8845a(Context context) {
        boolean z = false;
        try {
            Class.forName("r16", false, qs5.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        boolean z2 = qs5.m10095T(context).getBoolean("android.net.http.EnableTelemetry", !z);
        ApiVersion.getCronetVersion();
        return zy5.m13868c0(context, true, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m8846b(int i, int i2) {
        String strM13238b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM13238b = yt5.m13238b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
                    return;
                }
                strM13238b = yt5.m13238b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM13238b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8847c(int i, int i2) {
        if (i < 0 || i > i2) {
            xy4.m12792u(m8849e(i, "index", i2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8848d(int i, int i2, int i3) {
        String strM8849e;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM8849e = m8849e(i, "start index", i3);
            } else {
                strM8849e = (i2 < 0 || i2 > i3) ? m8849e(i2, "end index", i3) : yt5.m13238b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM8849e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m8849e(int i, String str, int i2) {
        if (i < 0) {
            return yt5.m13238b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yt5.m13238b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
        return null;
    }
}
