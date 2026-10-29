package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 extends ui0 {

    /* JADX INFO: renamed from: a */
    public long f20076a;

    /* JADX INFO: renamed from: b */
    public boolean f20077b;

    /* JADX INFO: renamed from: c */
    public boolean f20078c;

    /* JADX INFO: renamed from: d */
    public HashSet f20079d;

    /* JADX INFO: renamed from: e */
    public mw2 f20080e;

    /* JADX INFO: renamed from: f */
    public d83 f20081f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ir1 f20082g;

    @Override // p000.ui0
    /* JADX INFO: renamed from: a */
    public final void mo5179a(zi0 zi0Var, mq1 mq1Var) {
        this.f20082g.f21686b.mo5179a(zi0Var, mq1Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: b */
    public final mw2 mo5180b(zi0 zi0Var, o64 o64Var, mq1 mq1Var) {
        return this.f20082g.f21686b.mo5180b(zi0Var, o64Var, mq1Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: c */
    public final void mo5181c(uu2 uu2Var) {
        this.f20082g.f21686b.mo5181c(uu2Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: d */
    public final void mo6108d() {
        this.f20082g.f21664A--;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: e */
    public final boolean mo6109e() {
        return this.f20082g.f21686b.mo6109e();
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: f */
    public final boolean mo6110f() {
        return this.f20077b;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: g */
    public final boolean mo6111g() {
        return this.f20078c;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: h */
    public final long mo6112h() {
        return this.f20076a;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: i */
    public final ti0 mo6113i() {
        return this.f20082g.f21692h;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: j */
    public final ga3 mo6114j() {
        return (ga3) this.f20081f.getValue();
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: k */
    public final ro0 mo5182k() {
        return this.f20082g.f21686b.mo5182k();
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: l */
    public final boolean mo6115l() {
        return this.f20082g.f21686b.mo6115l();
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: m */
    public final void mo5183m(uu2 uu2Var) {
        this.f20082g.f21686b.mo5183m(uu2Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: n */
    public final void mo5184n(zi0 zi0Var) {
        ir1 ir1Var = this.f20082g;
        ui0 ui0Var = ir1Var.f21686b;
        ui0Var.mo5184n(ir1Var.f21692h);
        ui0Var.mo5184n(zi0Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: o */
    public final void mo5185o(uu2 uu2Var, tu2 tu2Var, InterfaceC0618en interfaceC0618en) {
        this.f20082g.f21686b.mo5185o(uu2Var, tu2Var, interfaceC0618en);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: p */
    public final tu2 mo5186p(uu2 uu2Var) {
        return this.f20082g.f21686b.mo5186p(uu2Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: q */
    public final mw2 mo5187q(zi0 zi0Var, o64 o64Var, mw2 mw2Var) {
        return this.f20082g.f21686b.mo5187q(zi0Var, o64Var, mw2Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: r */
    public final void mo6116r(Set set) {
        HashSet hashSet = this.f20079d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f20079d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: s */
    public final void mo6117s(ir1 ir1Var) {
        this.f20080e.m8409a(ir1Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: t */
    public final void mo5188t(yk3 yk3Var) {
        this.f20082g.f21686b.mo5188t(yk3Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: u */
    public final void mo5189u(zi0 zi0Var) {
        this.f20082g.f21686b.mo5189u(zi0Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: v */
    public final d70 mo5190v(g32 g32Var) {
        return this.f20082g.f21686b.mo5190v(g32Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: w */
    public final void mo6118w() {
        this.f20082g.f21664A++;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: x */
    public final void mo6119x(ir1 ir1Var) {
        HashSet hashSet = this.f20079d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(ir1Var.m6920z());
            }
        }
        if (ir1Var != null) {
            this.f20080e.m8420l(ir1Var);
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: y */
    public final void mo5191y(zi0 zi0Var) {
        this.f20082g.f21686b.mo5191y(zi0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m6120z() {
        mw2 mw2Var = this.f20080e;
        if (mw2Var.m8416h()) {
            HashSet hashSet = this.f20079d;
            if (hashSet != null) {
                Object[] objArr = mw2Var.f25258b;
                long[] jArr = mw2Var.f25257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ir1 ir1Var = (ir1) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(ir1Var.m6920z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            mw2Var.m8410b();
        }
    }
}
