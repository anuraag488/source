package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0487bd implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC0487bd f15211a = new ViewTranslationCallbackC0487bd();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        wp1 wp1Var;
        ViewOnAttachStateChangeListenerC0758id contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f21265f = EnumC0684gd.f19741a;
        m52 m52VarM6755d = contentCaptureManager$ui.m6755d();
        Object[] objArr = m52VarM6755d.f24667c;
        long[] jArr = m52VarM6755d.f24665a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        lw2 lw2Var = ((k14) objArr[(i << 3) + i3]).f22816a.f21012d.f17631a;
                        Object objM8132g = lw2Var.m8132g(m14.f24537D);
                        if (objM8132g == null) {
                            objM8132g = null;
                        }
                        if (objM8132g != null) {
                            Object objM8132g2 = lw2Var.m8132g(d14.f16717n);
                            C1353y2 c1353y2 = (C1353y2) (objM8132g2 != null ? objM8132g2 : null);
                            if (c1353y2 != null && (wp1Var = (wp1) c1353y2.f34818b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        yp1 yp1Var;
        ViewOnAttachStateChangeListenerC0758id contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f21265f = EnumC0684gd.f19741a;
        m52 m52VarM6755d = contentCaptureManager$ui.m6755d();
        Object[] objArr = m52VarM6755d.f24667c;
        long[] jArr = m52VarM6755d.f24665a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        lw2 lw2Var = ((k14) objArr[(i << 3) + i3]).f22816a.f21012d.f17631a;
                        Object objM8132g = lw2Var.m8132g(m14.f24537D);
                        if (objM8132g == null) {
                            objM8132g = null;
                        }
                        if (z62.m13387o(objM8132g, Boolean.TRUE)) {
                            Object objM8132g2 = lw2Var.m8132g(d14.f16716m);
                            C1353y2 c1353y2 = (C1353y2) (objM8132g2 != null ? objM8132g2 : null);
                            if (c1353y2 != null && (yp1Var = (yp1) c1353y2.f34818b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        yp1 yp1Var;
        ViewOnAttachStateChangeListenerC0758id contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f21265f = EnumC0684gd.f19742b;
        m52 m52VarM6755d = contentCaptureManager$ui.m6755d();
        Object[] objArr = m52VarM6755d.f24667c;
        long[] jArr = m52VarM6755d.f24665a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        lw2 lw2Var = ((k14) objArr[(i << 3) + i3]).f22816a.f21012d.f17631a;
                        Object objM8132g = lw2Var.m8132g(m14.f24537D);
                        if (objM8132g == null) {
                            objM8132g = null;
                        }
                        if (z62.m13387o(objM8132g, Boolean.FALSE)) {
                            Object objM8132g2 = lw2Var.m8132g(d14.f16716m);
                            C1353y2 c1353y2 = (C1353y2) (objM8132g2 != null ? objM8132g2 : null);
                            if (c1353y2 != null && (yp1Var = (yp1) c1353y2.f34818b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
