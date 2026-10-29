package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m15 implements jk2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ um0 f24578a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1034ph f24579b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ el3 f24580c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ql3 f24581d;

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        boolean z;
        a70 a70VarM5165C = null;
        switch (l15.f23707a[ek2Var.ordinal()]) {
            case 1:
                lb5.m7910S(this.f24578a, null, cp0.f16328d, new C1031pe(this.f24581d, this.f24580c, lk2Var, this, (wm0) null, (byte) 23), 1);
                return;
            case 2:
                C1034ph c1034ph = this.f24579b;
                if (c1034ph != null) {
                    C1126rz c1126rz = (C1126rz) c1034ph.f27604c;
                    synchronized (c1126rz.f29738b) {
                        try {
                            synchronized (c1126rz.f29738b) {
                                z = c1126rz.f29737a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c1126rz.f29740d;
                                c1126rz.f29740d = (ArrayList) c1126rz.f29739c;
                                c1126rz.f29739c = arrayList;
                                c1126rz.f29737a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((wm0) arrayList.get(i)).resumeWith(ju4.f22634a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                el3 el3Var = this.f24580c;
                synchronized (el3Var.f18216c) {
                    if (el3Var.f18233t) {
                        el3Var.f18233t = false;
                        a70VarM5165C = el3Var.m5165C();
                    }
                    break;
                }
                if (a70VarM5165C != null) {
                    ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
                    return;
                }
                return;
            case 3:
                el3 el3Var2 = this.f24580c;
                synchronized (el3Var2.f18216c) {
                    el3Var2.f18233t = true;
                }
                return;
            case 4:
                this.f24580c.m5164A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C0670g.m5864c();
                return;
        }
    }
}
