package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f12 {

    /* JADX INFO: renamed from: a */
    public final String f18649a;

    /* JADX INFO: renamed from: b */
    public final float f18650b;

    /* JADX INFO: renamed from: c */
    public final float f18651c;

    /* JADX INFO: renamed from: d */
    public final float f18652d;

    /* JADX INFO: renamed from: e */
    public final float f18653e;

    /* JADX INFO: renamed from: f */
    public final long f18654f;

    /* JADX INFO: renamed from: g */
    public final int f18655g;

    /* JADX INFO: renamed from: h */
    public final boolean f18656h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f18657i;

    /* JADX INFO: renamed from: j */
    public final e12 f18658j;

    /* JADX INFO: renamed from: k */
    public boolean f18659k;

    public f12(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? pb0.f27501h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.f18649a = str;
        this.f18650b = f;
        this.f18651c = f2;
        this.f18652d = f3;
        this.f18653e = f4;
        this.f18654f = j2;
        this.f18655g = i3;
        this.f18656h = z2;
        ArrayList arrayList = new ArrayList();
        this.f18657i = arrayList;
        e12 e12Var = new e12(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f18658j = e12Var;
        arrayList.add(e12Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m5445c(f12 f12Var, List list, ga4 ga4Var, float f, float f2, int i, float f3, int i2) {
        int i3;
        if ((i2 & 2) != 0) {
            int i4 = uw4.f32218a;
        }
        float f4 = (i2 & 16) != 0 ? 1.0f : f;
        float f5 = (i2 & 128) != 0 ? 0.0f : f2;
        if ((i2 & 256) != 0) {
            int i5 = uw4.f32218a;
        }
        if ((i2 & 512) != 0) {
            int i6 = uw4.f32218a;
            i3 = 0;
        } else {
            i3 = i;
        }
        f12Var.m5448b(list, 0, "", ga4Var, f4, null, 1.0f, f5, 0, i3, (i2 & 1024) != 0 ? 4.0f : f3, 0.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static tw4 m5446d(e12 e12Var) {
        String str = e12Var.f17585a;
        float f = e12Var.f17586b;
        float f2 = e12Var.f17587c;
        float f3 = e12Var.f17588d;
        float f4 = e12Var.f17589e;
        float f5 = e12Var.f17590f;
        float f6 = e12Var.f17591g;
        float f7 = e12Var.f17592h;
        List list = e12Var.f17593i;
        ArrayList arrayList = e12Var.f17594j;
        tw4 tw4Var = new tw4();
        tw4Var.f31492a = str;
        tw4Var.f31493b = f;
        tw4Var.f31494c = f2;
        tw4Var.f31495d = f3;
        tw4Var.f31496e = f4;
        tw4Var.f31497f = f5;
        tw4Var.f31498g = f6;
        tw4Var.f31499h = f7;
        tw4Var.f31500i = list;
        tw4Var.f31501j = arrayList;
        VarHandle.storeStoreFence();
        return tw4Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5447a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.f18659k) {
            q32.m9721c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.f18657i.add(new e12(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    /* JADX INFO: renamed from: b */
    public final void m5448b(List list, int i, String str, t30 t30Var, float f, t30 t30Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        if (this.f18659k) {
            q32.m9721c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.f18657i;
        ArrayList arrayList2 = ((e12) arrayList.get(arrayList.size() - 1)).f17594j;
        xw4 xw4Var = new xw4();
        xw4Var.f34672a = str;
        xw4Var.f34673b = list;
        xw4Var.f34674c = i;
        xw4Var.f34675d = t30Var;
        xw4Var.f34676e = f;
        xw4Var.f34677f = t30Var2;
        xw4Var.f34678g = f2;
        xw4Var.f34679h = f3;
        xw4Var.f34680i = i2;
        xw4Var.f34681j = i3;
        xw4Var.f34682k = f4;
        xw4Var.f34683l = f5;
        xw4Var.f34684m = f6;
        xw4Var.f34685n = f7;
        VarHandle.storeStoreFence();
        arrayList2.add(xw4Var);
    }

    /* JADX INFO: renamed from: e */
    public final g12 m5449e() {
        int i;
        if (this.f18659k) {
            q32.m9721c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.f18657i.size() > 1) {
            m5450f();
        }
        String str = this.f18649a;
        float f = this.f18650b;
        float f2 = this.f18651c;
        float f3 = this.f18652d;
        float f4 = this.f18653e;
        tw4 tw4VarM5446d = m5446d(this.f18658j);
        long j = this.f18654f;
        int i2 = this.f18655g;
        boolean z = this.f18656h;
        synchronized (g12.f19486l) {
            i = g12.f19485k;
            g12.f19485k = i + 1;
        }
        g12 g12Var = new g12();
        g12Var.f19487a = str;
        g12Var.f19488b = f;
        g12Var.f19489c = f2;
        g12Var.f19490d = f3;
        g12Var.f19491e = f4;
        g12Var.f19492f = tw4VarM5446d;
        g12Var.f19493g = j;
        g12Var.f19494h = i2;
        g12Var.f19495i = z;
        g12Var.f19496j = i;
        VarHandle.storeStoreFence();
        this.f18659k = true;
        return g12Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m5450f() {
        if (this.f18659k) {
            q32.m9721c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.f18657i;
        ((e12) arrayList.get(arrayList.size() - 1)).f17594j.add(m5446d((e12) arrayList.remove(arrayList.size() - 1)));
    }
}
