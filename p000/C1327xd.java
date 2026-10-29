package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1327xd {

    /* JADX INFO: renamed from: a */
    public Context f34162a;

    /* JADX INFO: renamed from: b */
    public ky0 f34163b;

    /* JADX INFO: renamed from: c */
    public long f34164c;

    /* JADX INFO: renamed from: d */
    public g73 f34165d;

    /* JADX INFO: renamed from: a */
    public final C1289wd m12663a() {
        Context context = this.f34162a;
        ky0 ky0Var = this.f34163b;
        long j = this.f34164c;
        C1289wd c1289wd = new C1289wd();
        c1289wd.f33244a = ky0Var;
        c1289wd.f33245b = 9205357640488583168L;
        int iM13858V = zy5.m13858V(j);
        r61 r61Var = new r61();
        r61Var.f29045a = context;
        r61Var.f29046b = iM13858V;
        r61Var.f29047c = 0L;
        VarHandle.storeStoreFence();
        c1289wd.f33246c = r61Var;
        c1289wd.f33247d = new d83(ju4.f22634a, o85.f26450j);
        c1289wd.f33248e = true;
        c1289wd.f33250g = 0L;
        c1289wd.f33251h = -1L;
        C1252vd c1252vd = new C1252vd((byte) 0);
        c1252vd.f32529b = c1289wd;
        VarHandle.storeStoreFence();
        ec3 ec3Var = rf4.f29227a;
        vf4 vf4Var = new vf4(null, null, c1252vd);
        bd4 bd4Var = new bd4();
        bd4Var.f15218q = c1289wd;
        bd4Var.f15219r = r61Var;
        bd4Var.m10154O0(vf4Var);
        VarHandle.storeStoreFence();
        c1289wd.f33252i = bd4Var;
        VarHandle.storeStoreFence();
        return c1289wd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1327xd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C1327xd c1327xd = (C1327xd) obj;
        if (!z62.m13387o(this.f34162a, c1327xd.f34162a) || !z62.m13387o(this.f34163b, c1327xd.f34163b)) {
            return false;
        }
        long j = this.f34164c;
        long j2 = c1327xd.f34164c;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && this.f34165d.equals(c1327xd.f34165d);
    }

    public final int hashCode() {
        int iHashCode = (this.f34163b.hashCode() + (this.f34162a.hashCode() * 31)) * 31;
        long j = this.f34164c;
        int i = pb0.f27502i;
        return this.f34165d.hashCode() + zi4.m13612l(iHashCode, j, 31);
    }
}
