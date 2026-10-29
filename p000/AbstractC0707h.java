package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707h {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f20231a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config f20232b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c */
    public static final uv1 f20233c = new uv1((String[]) new ArrayList(20).toArray(new String[0]));

    /* JADX INFO: renamed from: a */
    public static final void m6198a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m6199b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || hd4.m6345k0(str)) {
            return null;
        }
        String strM6356v0 = hd4.m6356v0(hd4.m6356v0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(hd4.m6355u0('.', hd4.m6355u0('/', strM6356v0, strM6356v0), ""));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m6200c(Uri uri) {
        return z62.m13387o(uri.getScheme(), "file") && z62.m13387o((String) hb0.m6301M0(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: d */
    public static final int m6201d(qs5 qs5Var, qv3 qv3Var) {
        if (qs5Var instanceof oz0) {
            return ((oz0) qs5Var).f27241l;
        }
        int iOrdinal = qv3Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        C0670g.m5864c();
        return 0;
    }
}
