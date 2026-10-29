package p000;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k26 {
    /* JADX INFO: renamed from: a */
    public static int m7359a(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m7360b(Activity activity) {
        return m7359a(activity, activity.getResources().getConfiguration().screenHeightDp);
    }

    /* JADX INFO: renamed from: c */
    public static int m7361c(Activity activity) {
        return m7359a(activity, activity.getResources().getConfiguration().screenWidthDp);
    }

    /* JADX INFO: renamed from: d */
    public static void m7362d(int i, int i2) {
        String strM8933b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM8933b = o26.m8933b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qm5.m9913d(String.valueOf(i2).length() + 15, i2, "negative size: ");
                    return;
                }
                strM8933b = o26.m8933b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM8933b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7363e(int i, int i2, int i3) {
        String strM7364f;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM7364f = m7364f(i, "start index", i3);
            } else {
                strM7364f = (i2 < 0 || i2 > i3) ? m7364f(i2, "end index", i3) : o26.m8933b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM7364f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m7364f(int i, String str, int i2) {
        if (i < 0) {
            return o26.m8933b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o26.m8933b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qm5.m9913d(String.valueOf(i2).length() + 15, i2, "negative size: ");
        return null;
    }
}
