package p000;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb2 {

    /* JADX INFO: renamed from: a */
    public static final ab2 f15914a = new ab2(0);

    /* JADX INFO: renamed from: a */
    public static boolean m3940a(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static ba2 m3941b(String str) throws IOException {
        try {
            kb2 kb2Var = new kb2(new StringReader(str));
            kb2Var.f23055o = 2;
            return f15914a.mo166b(kb2Var);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }
}
