package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ib2 implements ha2, g81, si0 {

    /* JADX INFO: renamed from: a */
    public ArrayList f21244a;

    /* JADX INFO: renamed from: b */
    public final i92 f21245b;

    /* JADX INFO: renamed from: c */
    public final yp1 f21246c;

    /* JADX INFO: renamed from: d */
    public String f21247d;

    /* JADX INFO: renamed from: e */
    public String f21248e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ byte f21249f;

    /* JADX INFO: renamed from: g */
    public Object f21250g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ib2(i92 i92Var, yp1 yp1Var, byte b) {
        this(i92Var, yp1Var, 0);
        this.f21249f = b;
        switch (b) {
            case 1:
                this(i92Var, yp1Var, 0);
                this.f21250g = new LinkedHashMap();
                break;
            case 2:
                this(i92Var, yp1Var, 0);
                this.f21250g = new ArrayList();
                break;
            default:
                this.f21244a.add("primitive");
                break;
        }
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: A */
    public final void mo6718A(pf3 pf3Var, int i, float f) {
        m6720E(m6723H(pf3Var, i), f);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: B */
    public final void mo5916B(String str) {
        mo6725J((String) m6724I(), ca2.m3929b(str));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: C */
    public final void mo5917C(g24 g24Var, int i) {
        mo6725J((String) m6724I(), ca2.m3929b(g24Var.mo4433e(i)));
    }

    /* JADX INFO: renamed from: D */
    public final void m6719D(Object obj, double d) {
        String str = (String) obj;
        mo6725J(str, ca2.m3928a(Double.valueOf(d)));
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new y92(kx5.m7701c0(Double.valueOf(d), str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", null, 10);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m6720E(Object obj, float f) {
        String str = (String) obj;
        mo6725J(str, ca2.m3928a(Float.valueOf(f)));
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new y92(kx5.m7701c0(Float.valueOf(f), str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", null, 10);
        }
    }

    /* JADX INFO: renamed from: F */
    public final g81 m6721F(Object obj, g24 g24Var) {
        String str = (String) obj;
        if (yc4.m13088a(g24Var)) {
            C0967o1 c0967o1 = new C0967o1();
            c0967o1.f26278k = this;
            c0967o1.f26279l = str;
            VarHandle.storeStoreFence();
            return c0967o1;
        }
        if (!g24Var.mo5886f() || !g24Var.equals(ca2.f15904a)) {
            this.f21244a.add(str);
            return this;
        }
        C0930n1 c0930n1 = new C0930n1();
        c0930n1.f25372k = this;
        c0930n1.f25373l = str;
        c0930n1.f25374m = g24Var;
        VarHandle.storeStoreFence();
        return c0930n1;
    }

    /* JADX INFO: renamed from: G */
    public aa2 mo6722G() {
        switch (this.f21249f) {
            case 0:
                aa2 aa2Var = (aa2) this.f21250g;
                if (aa2Var != null) {
                    return aa2Var;
                }
                C1077qn.m9987m("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new va2((LinkedHashMap) this.f21250g);
            default:
                return new n92((ArrayList) this.f21250g);
        }
    }

    /* JADX INFO: renamed from: H */
    public final String m6723H(g24 g24Var, int i) {
        String strValueOf;
        switch (this.f21249f) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                qa2.m9807d(this.f21245b, g24Var);
                strValueOf = g24Var.mo4433e(i);
                break;
        }
        return strValueOf;
    }

    /* JADX INFO: renamed from: I */
    public final Object m6724I() {
        ArrayList arrayList = this.f21244a;
        if (arrayList.isEmpty()) {
            throw new o24("No tag in stack for requested element");
        }
        return arrayList.remove(kx5.m7689T(arrayList));
    }

    /* JADX INFO: renamed from: J */
    public void mo6725J(String str, aa2 aa2Var) {
        switch (this.f21249f) {
            case 0:
                if (str != "primitive") {
                    C1077qn.m9987m("This output can only consume primitives with 'primitive' tag");
                } else if (((aa2) this.f21250g) != null) {
                    C1077qn.m9987m("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.f21250g = aa2Var;
                    this.f21246c.invoke(aa2Var);
                }
                break;
            case 1:
                ((LinkedHashMap) this.f21250g).put(str, aa2Var);
                break;
            default:
                ((ArrayList) this.f21250g).add(Integer.parseInt(str), aa2Var);
                break;
        }
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: a */
    public final si0 mo5918a(g24 g24Var) {
        yp1 yp1Var;
        ib2 ib2Var;
        byte b = 2;
        if (hb0.m6307S0(this.f21244a) == null) {
            yp1Var = this.f21246c;
        } else {
            C1127s c1127s = new C1127s(b);
            c1127s.f29778b = this;
            VarHandle.storeStoreFence();
            yp1Var = c1127s;
        }
        zc6 zc6VarMo4431c = g24Var.mo4431c();
        boolean zM13387o = z62.m13387o(zc6VarMo4431c, rd4.f29189k);
        i92 i92Var = this.f21245b;
        if (zM13387o || (zc6VarMo4431c instanceof vc3)) {
            ib2Var = new ib2(i92Var, yp1Var, (byte) 2);
        } else if (z62.m13387o(zc6VarMo4431c, rd4.f29190l)) {
            g24 g24VarM4309j = d24.m4309j(g24Var.mo4436j(0));
            zc6 zc6VarMo4431c2 = g24VarM4309j.mo4431c();
            if (!(zc6VarMo4431c2 instanceof tf3) && !z62.m13387o(zc6VarMo4431c2, l24.f23749j)) {
                throw kx5.m7696a(g24VarM4309j);
            }
            pb2 pb2Var = new pb2(i92Var, yp1Var, (byte) 1);
            pb2Var.f27511i = true;
            ib2Var = pb2Var;
        } else {
            ib2Var = new ib2(i92Var, yp1Var, (byte) 1);
        }
        String str = this.f21247d;
        if (str != null) {
            if (ib2Var instanceof pb2) {
                pb2 pb2Var2 = (pb2) ib2Var;
                pb2Var2.mo6725J("key", ca2.m3929b(str));
                String strMo3641b = this.f21248e;
                if (strMo3641b == null) {
                    strMo3641b = g24Var.mo3641b();
                }
                pb2Var2.mo6725J("value", ca2.m3929b(strMo3641b));
            } else {
                String strMo3641b2 = this.f21248e;
                if (strMo3641b2 == null) {
                    strMo3641b2 = g24Var.mo3641b();
                }
                ib2Var.mo6725J(str, ca2.m3929b(strMo3641b2));
            }
            this.f21247d = null;
            this.f21248e = null;
        }
        return ib2Var;
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: b */
    public final void mo6726b(pf3 pf3Var, int i, double d) {
        m6719D(m6723H(pf3Var, i), d);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: c */
    public final void mo5919c() {
        String str = (String) hb0.m6307S0(this.f21244a);
        if (str == null) {
            this.f21246c.invoke(ra2.INSTANCE);
        } else {
            mo6725J(str, ra2.INSTANCE);
        }
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: d */
    public final void mo5920d(jc2 jc2Var, Object obj) {
        String strM4313n;
        try {
            try {
                Object objM6307S0 = hb0.m6307S0(this.f21244a);
                i92 i92Var = this.f21245b;
                if (objM6307S0 == null) {
                    g24 g24VarM4309j = d24.m4309j(jc2Var.mo15d());
                    if ((g24VarM4309j.mo4431c() instanceof tf3) || g24VarM4309j.mo4431c() == l24.f23749j) {
                        new ib2(i92Var, this.f21246c, (byte) 0).mo5920d(jc2Var, obj);
                        return;
                    }
                }
                s92 s92Var = i92Var.f21188a;
                boolean z = jc2Var instanceof AbstractC0512c2;
                if (z) {
                    strM4313n = ((q90) s92Var.f30012e) != q90.f28306a ? d24.m4313n(i92Var, jc2Var.mo15d()) : null;
                } else {
                    int iOrdinal = ((q90) s92Var.f30012e).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            zc6 zc6VarMo4431c = jc2Var.mo15d().mo4431c();
                            if (z62.m13387o(zc6VarMo4431c, rd4.f29188j) || z62.m13387o(zc6VarMo4431c, rd4.f29191m)) {
                            }
                        } else if (iOrdinal != 2) {
                            throw new gf0();
                        }
                    }
                }
                if (z) {
                    c75.m3884p(jc2Var);
                    if (obj != null) {
                        throw null;
                    }
                    c75.m3884p(jc2Var);
                    throw null;
                }
                if (strM4313n != null) {
                    d24.m4310k(i92Var, jc2Var, jc2Var, strM4313n);
                    d24.m4311l(jc2Var.mo15d().mo4431c());
                    String strMo3641b = jc2Var.mo15d().mo3641b();
                    this.f21247d = strM4313n;
                    this.f21248e = strMo3641b;
                }
                jc2Var.mo14c(this, obj);
            } catch (o24 e) {
                throw e;
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            String strMo3641b2 = jc2Var.mo15d().mo3641b();
            StringBuilder sb = new StringBuilder("Serialization ");
            sb.append(hd4.m6345k0(strMo3641b2) ? "" : zi4.m13621u("of '", strMo3641b2, "' "));
            sb.append("failed because of ");
            throw new y92(zi4.m13623w(sb, message == null ? "an exception" : zi4.m13621u("'", message, "' exception"), " in the encoder"), null, e2, 4);
        }
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: e */
    public final void mo6727e(pf3 pf3Var, int i, short s) {
        mo6725J(m6723H(pf3Var, i), ca2.m3928a(Short.valueOf(s)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: f */
    public final void mo6728f() {
        if (!this.f21244a.isEmpty()) {
            m6724I();
        }
        this.f21246c.invoke(mo6722G());
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: g */
    public final void mo5921g(double d) {
        m6719D(m6724I(), d);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: h */
    public final void mo5922h(short s) {
        mo6725J((String) m6724I(), ca2.m3928a(Short.valueOf(s)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: i */
    public final void mo6729i(pf3 pf3Var, int i, boolean z) {
        String strM6723H = m6723H(pf3Var, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        m32 m32Var = ca2.f15904a;
        mo6725J(strM6723H, new na2(boolValueOf, false, null));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: j */
    public final void mo5923j(byte b) {
        mo6725J((String) m6724I(), ca2.m3928a(Byte.valueOf(b)));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: k */
    public final void mo5924k(boolean z) {
        String str = (String) m6724I();
        Boolean boolValueOf = Boolean.valueOf(z);
        m32 m32Var = ca2.f15904a;
        mo6725J(str, new na2(boolValueOf, false, null));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: l */
    public final g81 mo5925l(g24 g24Var) {
        if (hb0.m6307S0(this.f21244a) == null) {
            return new ib2(this.f21245b, this.f21246c, (byte) 0).mo5925l(g24Var);
        }
        if (this.f21247d != null) {
            this.f21248e = g24Var.mo3641b();
        }
        return m6721F(m6724I(), g24Var);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: n */
    public final void mo6730n(g24 g24Var, int i, String str) {
        mo6725J(m6723H(g24Var, i), ca2.m3929b(str));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: o */
    public final void mo6731o(pf3 pf3Var, int i, char c) {
        mo6725J(m6723H(pf3Var, i), ca2.m3929b(String.valueOf(c)));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: p */
    public final void mo5927p(int i) {
        mo6725J((String) m6724I(), ca2.m3928a(Integer.valueOf(i)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: q */
    public final void mo6732q(pf3 pf3Var, int i, long j) {
        mo6725J(m6723H(pf3Var, i), ca2.m3928a(Long.valueOf(j)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: r */
    public final void mo6733r(pf3 pf3Var, int i, int i2) {
        mo6725J(m6723H(pf3Var, i), ca2.m3928a(Integer.valueOf(i2)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: s */
    public final void mo6734s(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        this.f21244a.add(m6723H(g24Var, i));
        mo5920d(jc2Var, obj);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: t */
    public final void mo5928t(float f) {
        m6720E(m6724I(), f);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: u */
    public void mo6735u(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        this.f21244a.add(m6723H(g24Var, i));
        m5926m(jc2Var, obj);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: v */
    public final void mo5929v(long j) {
        mo6725J((String) m6724I(), ca2.m3928a(Long.valueOf(j)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: w */
    public final void mo6736w(pf3 pf3Var, int i, byte b) {
        mo6725J(m6723H(pf3Var, i), ca2.m3928a(Byte.valueOf(b)));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: x */
    public final void mo5930x(char c) {
        mo6725J((String) m6724I(), ca2.m3929b(String.valueOf(c)));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: y */
    public final boolean mo6737y() {
        return false;
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: z */
    public final g81 mo6738z(pf3 pf3Var, int i) {
        return m6721F(m6723H(pf3Var, i), pf3Var.mo4436j(i));
    }

    public ib2(i92 i92Var, yp1 yp1Var, int i) {
        this.f21244a = new ArrayList();
        this.f21245b = i92Var;
        this.f21246c = yp1Var;
    }
}
