package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w05 {

    /* JADX INFO: renamed from: b */
    public static final w05 f33011b;

    /* JADX INFO: renamed from: a */
    public t05 f33012a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f33011b = r05.f28936s;
        } else {
            f33011b = p05.f27265r;
        }
    }

    public w05(w05 w05Var) {
        if (w05Var == null) {
            this.f33012a = new t05(this);
            return;
        }
        t05 t05Var = w05Var.f33012a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (t05Var instanceof s05)) {
            this.f33012a = new s05(this, (s05) t05Var);
        } else if (i >= 34 && (t05Var instanceof r05)) {
            this.f33012a = new r05(this, (r05) t05Var);
        } else if (t05Var instanceof q05) {
            this.f33012a = new q05(this, (q05) t05Var);
        } else if (t05Var instanceof p05) {
            this.f33012a = new p05(this, (p05) t05Var);
        } else if (t05Var instanceof o05) {
            this.f33012a = new o05(this, (o05) t05Var);
        } else if (t05Var instanceof n05) {
            this.f33012a = new n05(this, (n05) t05Var);
        } else if (t05Var instanceof m05) {
            this.f33012a = new m05(this, (m05) t05Var);
        } else if (t05Var instanceof l05) {
            this.f33012a = new l05(this, (l05) t05Var);
        } else {
            this.f33012a = new t05(this);
        }
        t05Var.mo7774e(this);
    }

    /* JADX INFO: renamed from: a */
    public static g42 m12041a(g42 g42Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, g42Var.f19606a - i);
        int iMax2 = Math.max(0, g42Var.f19607b - i2);
        int iMax3 = Math.max(0, g42Var.f19608c - i3);
        int iMax4 = Math.max(0, g42Var.f19609d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? g42Var : g42.m5898a(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: c */
    public static w05 m12042c(View view, WindowInsets windowInsets) {
        t05 q05Var;
        windowInsets.getClass();
        w05 w05Var = new w05();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            q05Var = new s05(w05Var, windowInsets);
            w05Var.f33012a = q05Var;
        } else if (i >= 34) {
            q05Var = new r05(w05Var, windowInsets);
            w05Var.f33012a = q05Var;
        } else {
            q05Var = new q05(w05Var, windowInsets);
            w05Var.f33012a = q05Var;
        }
        VarHandle.storeStoreFence();
        if (view != null && view.isAttachedToWindow()) {
            int i2 = cy4.f16619a;
            q05Var.mo7788y(zx4.m13834a(view));
            View rootView = view.getRootView();
            q05Var.mo7773d(rootView);
            q05Var.mo7780p(rootView);
            q05Var.mo7781q();
            q05Var.mo7789z(view.getWindowSystemUiVisibility());
        }
        return w05Var;
    }

    /* JADX INFO: renamed from: b */
    public final WindowInsets m12043b() {
        t05 t05Var = this.f33012a;
        if (t05Var instanceof l05) {
            return ((l05) t05Var).f23671c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w05) {
            return Objects.equals(this.f33012a, ((w05) obj).f33012a);
        }
        return false;
    }

    public final int hashCode() {
        t05 t05Var = this.f33012a;
        if (t05Var == null) {
            return 0;
        }
        return t05Var.hashCode();
    }
}
