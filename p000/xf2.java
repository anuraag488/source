package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0718ha f34225a;

    /* JADX INFO: renamed from: c */
    public boolean f34227c;

    /* JADX INFO: renamed from: d */
    public boolean f34228d;

    /* JADX INFO: renamed from: e */
    public boolean f34229e;

    /* JADX INFO: renamed from: f */
    public boolean f34230f;

    /* JADX INFO: renamed from: g */
    public boolean f34231g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0718ha f34232h;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ byte f34234j;

    /* JADX INFO: renamed from: b */
    public boolean f34226b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f34233i = new HashMap();

    public xf2(InterfaceC0718ha interfaceC0718ha, byte b) {
        this.f34234j = b;
        this.f34225a = interfaceC0718ha;
    }

    /* JADX INFO: renamed from: a */
    public final void m12686a(AbstractC0568da abstractC0568da, int i, e13 e13Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM12819A0 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.f34234j) {
                    case 0:
                        q63 q63Var = e13Var.f17623V;
                        if (q63Var != null) {
                            du1 du1Var = (du1) q63Var;
                            float[] fArrM4734b = du1Var.m4734b();
                            if (!du1Var.f17408s) {
                                jM12819A0 = rq2.m10393c(jM12819A0, fArrM4734b);
                            }
                        }
                        jM12819A0 = y42.m12819A0(jM12819A0, e13Var.f17609H);
                        break;
                    default:
                        long j = e13Var.mo4869X0().f32027v;
                        jM12819A0 = b33.m3430h((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM12819A0);
                        break;
                }
                e13Var = e13Var.f17629y;
                if (e13Var.equals(this.f34225a.mo6286u())) {
                    int iRound = Math.round(abstractC0568da instanceof dx1 ? Float.intBitsToFloat((int) (jM12819A0 & 4294967295L)) : Float.intBitsToFloat((int) (jM12819A0 >> 32)));
                    HashMap map = this.f34233i;
                    if (map.containsKey(abstractC0568da)) {
                        int iIntValue = ((Number) eq2.m5273L(abstractC0568da, map)).intValue();
                        dx1 dx1Var = AbstractC0681ga.f19681a;
                        iRound = ((Number) abstractC0568da.f16879a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(abstractC0568da, Integer.valueOf(iRound));
                    return;
                }
            } while (!m12687b(e13Var).containsKey(abstractC0568da));
            float fM12688c = m12688c(e13Var, abstractC0568da);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM12688c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM12688c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m12687b(e13 e13Var) {
        switch (this.f34234j) {
            case 0:
                return e13Var.mo4855F0().mo4502a();
            default:
                return e13Var.mo4869X0().mo4855F0().mo4502a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m12688c(e13 e13Var, AbstractC0568da abstractC0568da) {
        switch (this.f34234j) {
            case 0:
                return e13Var.mo4419e0(abstractC0568da);
            default:
                return e13Var.mo4869X0().mo4419e0(abstractC0568da);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12689d() {
        return this.f34227c || this.f34229e || this.f34230f || this.f34231g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12690e() {
        m12693h();
        return this.f34232h != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m12691f() {
        this.f34226b = true;
        InterfaceC0718ha interfaceC0718ha = this.f34225a;
        InterfaceC0718ha interfaceC0718haMo6288y = interfaceC0718ha.mo6288y();
        if (interfaceC0718haMo6288y == null) {
            return;
        }
        if (this.f34227c) {
            interfaceC0718haMo6288y.mo6284Y();
        } else if (this.f34229e || this.f34228d) {
            interfaceC0718haMo6288y.requestLayout();
        }
        if (this.f34230f) {
            interfaceC0718ha.mo6284Y();
        }
        if (this.f34231g) {
            interfaceC0718ha.requestLayout();
        }
        interfaceC0718haMo6288y.mo6285a().m12691f();
    }

    /* JADX INFO: renamed from: g */
    public final void m12692g() {
        HashMap map = this.f34233i;
        map.clear();
        C1127s c1127s = new C1127s((byte) 5);
        c1127s.f29778b = this;
        VarHandle.storeStoreFence();
        InterfaceC0718ha interfaceC0718ha = this.f34225a;
        interfaceC0718ha.mo6287w(c1127s);
        map.putAll(m12687b(interfaceC0718ha.mo6286u()));
        this.f34226b = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m12693h() {
        xf2 xf2VarMo6285a;
        xf2 xf2VarMo6285a2;
        boolean zM12689d = m12689d();
        InterfaceC0718ha interfaceC0718ha = this.f34225a;
        if (!zM12689d) {
            InterfaceC0718ha interfaceC0718haMo6288y = interfaceC0718ha.mo6288y();
            if (interfaceC0718haMo6288y == null) {
                return;
            }
            interfaceC0718ha = interfaceC0718haMo6288y.mo6285a().f34232h;
            if (interfaceC0718ha == null || !interfaceC0718ha.mo6285a().m12689d()) {
                InterfaceC0718ha interfaceC0718ha2 = this.f34232h;
                if (interfaceC0718ha2 == null || interfaceC0718ha2.mo6285a().m12689d()) {
                    return;
                }
                InterfaceC0718ha interfaceC0718haMo6288y2 = interfaceC0718ha2.mo6288y();
                if (interfaceC0718haMo6288y2 != null && (xf2VarMo6285a2 = interfaceC0718haMo6288y2.mo6285a()) != null) {
                    xf2VarMo6285a2.m12693h();
                }
                InterfaceC0718ha interfaceC0718haMo6288y3 = interfaceC0718ha2.mo6288y();
                interfaceC0718ha = (interfaceC0718haMo6288y3 == null || (xf2VarMo6285a = interfaceC0718haMo6288y3.mo6285a()) == null) ? null : xf2VarMo6285a.f34232h;
            }
        }
        this.f34232h = interfaceC0718ha;
    }
}
