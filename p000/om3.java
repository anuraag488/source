package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class om3 {

    /* JADX INFO: renamed from: a */
    public Set f26880a;

    /* JADX INFO: renamed from: b */
    public xi0 f26881b;

    /* JADX INFO: renamed from: c */
    public final uw2 f26882c;

    /* JADX INFO: renamed from: d */
    public mw2 f26883d;

    /* JADX INFO: renamed from: e */
    public uw2 f26884e;

    /* JADX INFO: renamed from: f */
    public final uw2 f26885f;

    /* JADX INFO: renamed from: g */
    public final uw2 f26886g;

    /* JADX INFO: renamed from: h */
    public mw2 f26887h;

    /* JADX INFO: renamed from: i */
    public lw2 f26888i;

    /* JADX INFO: renamed from: j */
    public ArrayList f26889j;

    /* JADX INFO: renamed from: k */
    public mw2 f26890k;

    public om3() {
        uw2 uw2Var = new uw2(new mr1[16]);
        this.f26882c = uw2Var;
        mw2 mw2Var = uv3.f32207a;
        this.f26883d = new mw2();
        this.f26884e = uw2Var;
        this.f26885f = new uw2(new Object[16]);
        this.f26886g = new uw2(new wp1[16]);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m9183f(mr1 mr1Var, uw2 uw2Var) {
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            pm3 pm3Var = ((mr1) objArr[i2]).f25168a;
            if (pm3Var instanceof o93) {
                uw2 uw2Var2 = ((o93) pm3Var).f26493b;
                if (uw2Var2.m11671k(mr1Var) || m9183f(mr1Var, uw2Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m9184a() {
        this.f26880a = null;
        this.f26881b = null;
        uw2 uw2Var = this.f26882c;
        uw2Var.m11668g();
        this.f26883d.m8410b();
        this.f26884e = uw2Var;
        this.f26885f.m11668g();
        this.f26886g.m11668g();
        this.f26887h = null;
        this.f26888i = null;
        this.f26889j = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m9185b() {
        Set set = this.f26880a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                pm3 pm3Var = (pm3) it.next();
                it.remove();
                pm3Var.mo38d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0093 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9186c() {
        Set set = this.f26880a;
        if (set == null) {
            return;
        }
        this.f26890k = null;
        uw2 uw2Var = this.f26885f;
        if (uw2Var.f32213c != 0) {
            Trace.beginSection("Compose:onForgotten");
            mw2 mw2Var = this.f26887h;
            int i = uw2Var.f32213c;
            while (true) {
                i--;
                if (-1 >= i) {
                    break;
                }
                Object obj = uw2Var.f32211a[i];
                try {
                    if (obj instanceof mr1) {
                        pm3 pm3Var = ((mr1) obj).f25168a;
                        set.remove(pm3Var);
                        pm3Var.mo41h();
                    }
                    if (obj instanceof ph0) {
                        if (mw2Var == null || !mw2Var.m8411c(obj)) {
                            ((ph0) obj).mo3603d();
                        } else {
                            ((ph0) obj).mo3602c();
                        }
                    }
                } catch (Throwable th) {
                    xi0 xi0Var = this.f26881b;
                    if (xi0Var != null) {
                        xi0Var.m12697c(obj, th);
                    }
                    throw th;
                }
            }
            Trace.endSection();
        }
        uw2 uw2Var2 = this.f26882c;
        if (uw2Var2.f32213c != 0) {
            Trace.beginSection("Compose:onRemembered");
            Set set2 = this.f26880a;
            if (set2 != null) {
                Object[] objArr = uw2Var2.f32211a;
                int i2 = uw2Var2.f32213c;
                for (int i3 = 0; i3 < i2; i3++) {
                    mr1 mr1Var = (mr1) objArr[i3];
                    pm3 pm3Var2 = mr1Var.f25168a;
                    set2.remove(pm3Var2);
                    try {
                        pm3Var2.mo37c();
                    } catch (Throwable th2) {
                        xi0 xi0Var2 = this.f26881b;
                        if (xi0Var2 != null) {
                            xi0Var2.m12697c(mr1Var, th2);
                        }
                        throw th2;
                    }
                }
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9187d() {
        uw2 uw2Var = this.f26886g;
        if (uw2Var.f32213c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = uw2Var.f32211a;
                int i = uw2Var.f32213c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((wp1) objArr[i2]).invoke();
                }
                uw2Var.m11668g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9188e(mr1 mr1Var) {
        if (!this.f26883d.m8411c(mr1Var)) {
            mw2 mw2Var = this.f26890k;
            if (mw2Var == null || !mw2Var.m8411c(mr1Var)) {
                this.f26885f.m11663b(mr1Var);
                return;
            }
            return;
        }
        this.f26883d.m8420l(mr1Var);
        if (!this.f26884e.m11671k(mr1Var)) {
            uw2 uw2Var = this.f26882c;
            if (!uw2Var.m11671k(mr1Var)) {
                m9183f(mr1Var, uw2Var);
            }
        }
        Set set = this.f26880a;
        if (set == null) {
            return;
        }
        set.add(mr1Var.f25168a);
    }

    /* JADX INFO: renamed from: g */
    public final void m9189g(Set set, xi0 xi0Var) {
        m9184a();
        this.f26880a = set;
        this.f26881b = xi0Var;
    }
}
