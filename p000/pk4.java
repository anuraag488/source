package p000;

import android.content.ClipDescription;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pk4 {

    /* JADX INFO: renamed from: A */
    public boolean f27692A;

    /* JADX INFO: renamed from: a */
    public au4 f27693a;

    /* JADX INFO: renamed from: b */
    public vi3 f27694b;

    /* JADX INFO: renamed from: c */
    public yp1 f27695c;

    /* JADX INFO: renamed from: d */
    public uj2 f27696d;

    /* JADX INFO: renamed from: e */
    public d83 f27697e;

    /* JADX INFO: renamed from: f */
    public wp1 f27698f;

    /* JADX INFO: renamed from: g */
    public ha0 f27699g;

    /* JADX INFO: renamed from: h */
    public zo0 f27700h;

    /* JADX INFO: renamed from: i */
    public tb3 f27701i;

    /* JADX INFO: renamed from: j */
    public fv1 f27702j;

    /* JADX INFO: renamed from: k */
    public jl1 f27703k;

    /* JADX INFO: renamed from: l */
    public d83 f27704l;

    /* JADX INFO: renamed from: m */
    public d83 f27705m;

    /* JADX INFO: renamed from: n */
    public long f27706n;

    /* JADX INFO: renamed from: o */
    public ql4 f27707o;

    /* JADX INFO: renamed from: p */
    public long f27708p;

    /* JADX INFO: renamed from: q */
    public d83 f27709q;

    /* JADX INFO: renamed from: r */
    public d83 f27710r;

    /* JADX INFO: renamed from: s */
    public int f27711s;

    /* JADX INFO: renamed from: t */
    public xk4 f27712t;

    /* JADX INFO: renamed from: u */
    public rd6 f27713u;

    /* JADX INFO: renamed from: v */
    public ql4 f27714v;

    /* JADX INFO: renamed from: w */
    public d83 f27715w;

    /* JADX INFO: renamed from: x */
    public yg3 f27716x;

    /* JADX INFO: renamed from: y */
    public nk4 f27717y;

    /* JADX INFO: renamed from: z */
    public rd6 f27718z;

    /* JADX INFO: renamed from: b */
    public static xk4 m9539b(C0875lk c0875lk, long j) {
        return new xk4(c0875lk, j, (ql4) null);
    }

    /* JADX INFO: renamed from: a */
    public final t82 m9540a(boolean z) {
        zo0 zo0Var = this.f27700h;
        wm0 wm0Var = null;
        if (zo0Var != null) {
            return lb5.m7910S(zo0Var, null, cp0.f16328d, new kk4(this, z, wm0Var, (byte) 0), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9541c() {
        zo0 zo0Var = this.f27700h;
        if (zo0Var != null) {
            lb5.m7910S(zo0Var, null, cp0.f16328d, new C0982og((Object) this, (wm0) null, (byte) 27), 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9542d(b33 b33Var) {
        int iM9902f;
        if (!ql4.m9900d(m9550l().f34342b)) {
            uj2 uj2Var = this.f27696d;
            kl4 kl4VarM11577d = uj2Var != null ? uj2Var.m11577d() : null;
            if (b33Var == null || kl4VarM11577d == null) {
                iM9902f = ql4.m9902f(m9550l().f34342b);
            } else {
                vi3 vi3Var = this.f27694b;
                iM9902f = kl4VarM11577d.m7544b(b33Var.f15059a, true);
                vi3Var.m11899b(iM9902f);
            }
            xk4 xk4VarM12702a = xk4.m12702a(m9550l(), null, sc6.m10657b(iM9902f, iM9902f), 5);
            this.f27695c.invoke(xk4VarM12702a);
            this.f27714v = ql4.m9897a(xk4VarM12702a.f34342b);
        }
        m9556r((b33Var == null || m9550l().f34341a.f24092b.length() <= 0) ? wu1.f33741a : wu1.f33743c);
        m9559u(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m9543e(boolean z) {
        jl1 jl1Var;
        uj2 uj2Var = this.f27696d;
        if (uj2Var != null && !uj2Var.m11575b() && (jl1Var = this.f27703k) != null) {
            jl1.m7164a(jl1Var);
        }
        this.f27712t = m9550l();
        m9559u(z);
        m9556r(wu1.f33742b);
    }

    /* JADX INFO: renamed from: f */
    public final l73 m9544f() {
        String str;
        ql4 ql4Var;
        C0875lk c0875lkM9549k = m9549k();
        if (c0875lkM9549k == null || (str = c0875lkM9549k.f24092b) == null || (ql4Var = this.f27714v) == null) {
            return null;
        }
        long j = ql4Var.f28558a;
        int i = (int) (j >> 32);
        this.f27694b.m11898a(i);
        int i2 = (int) (j & 4294967295L);
        this.f27694b.m11898a(i2);
        return new l73(str, ql4.m9897a(sc6.m10657b(i, i2)));
    }

    /* JADX INFO: renamed from: g */
    public final b33 m9545g() {
        return (b33) this.f27710r.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9546h() {
        return ((Boolean) this.f27704l.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9547i() {
        return ((Boolean) this.f27705m.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final long m9548j(boolean z) {
        kl4 kl4VarM11577d;
        long j;
        uj2 uj2Var = this.f27696d;
        if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
            return 9205357640488583168L;
        }
        jl4 jl4Var = kl4VarM11577d.f23216a;
        yu2 yu2Var = jl4Var.f22401b;
        C0875lk c0875lkM9549k = m9549k();
        if (c0875lkM9549k == null) {
            return 9205357640488583168L;
        }
        if (!z62.m13387o(c0875lkM9549k.f24092b, jl4Var.f22400a.f21533a.f24092b)) {
            return 9205357640488583168L;
        }
        xk4 xk4VarM9550l = m9550l();
        if (z) {
            long j2 = xk4VarM9550l.f34342b;
            int i = ql4.f28557c;
            j = j2 >> 32;
        } else {
            long j3 = xk4VarM9550l.f34342b;
            int i2 = ql4.f28557c;
            j = j3 & 4294967295L;
        }
        int i3 = (int) j;
        this.f27694b.m11898a(i3);
        boolean zM9904h = ql4.m9904h(m9550l().f34342b);
        long j4 = jl4Var.f22402c;
        int iM13245d = yu2Var.m13245d(i3);
        if (iM13245d >= yu2Var.f35537f) {
            return 9205357640488583168L;
        }
        boolean z2 = jl4Var.m7175a(((!z || zM9904h) && (z || !zM9904h)) ? Math.max(i3 + (-1), 0) : i3) == jl4Var.m7181g(i3);
        yu2Var.m13251k(i3);
        int length = ((C0875lk) yu2Var.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(i3 == length ? kx5.m7689T(arrayList) : ks5.m7613n(arrayList, i3));
        C1328xe c1328xe = n73Var.f25497a;
        int iM8572d = n73Var.m8572d(i3);
        hl4 hl4Var = c1328xe.f34185c;
        return (((long) Float.floatToRawIntBits(sc6.m10674o(yu2Var.m13243b(iM13245d), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(sc6.m10674o(z2 ? hl4Var.m6437j(iM8572d, false) : hl4Var.m6438k(iM8572d, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    /* JADX INFO: renamed from: k */
    public final C0875lk m9549k() {
        uj2 uj2Var = this.f27696d;
        if (uj2Var != null) {
            return uj2Var.f31912a.f33431a;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final xk4 m9550l() {
        return (xk4) this.f27697e.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m9551m() {
        t82 t82Var;
        tj4 tj4Var = (tj4) this.f27716x.f35215b;
        if (tj4Var == null || (t82Var = tj4Var.f31201u) == null) {
            return;
        }
        t82Var.mo4993a(null);
        tj4Var.f31201u = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m9552n(ql4 ql4Var) {
        C0875lk c0875lkM9549k;
        String str;
        zo0 zo0Var;
        if (ql4Var == null) {
            return;
        }
        long j = ql4Var.f28558a;
        tb3 tb3Var = this.f27701i;
        if (tb3Var == null || (c0875lkM9549k = m9549k()) == null || (str = c0875lkM9549k.f24092b) == null) {
            return;
        }
        vi3 vi3Var = this.f27694b;
        int i = (int) (j >> 32);
        vi3Var.m11898a(i);
        int i2 = (int) (j & 4294967295L);
        vi3Var.m11898a(i2);
        long jM10657b = sc6.m10657b(i, i2);
        if (str.length() <= 0 || ql4.m9900d(jM10657b) || (zo0Var = this.f27700h) == null) {
            return;
        }
        lb5.m7910S(zo0Var, null, null, new dm0(tb3Var, str, jM10657b, ql4Var, this, vi3Var, null), 3);
    }

    /* JADX INFO: renamed from: o */
    public final void m9553o() {
        zo0 zo0Var = this.f27700h;
        if (zo0Var != null) {
            lb5.m7910S(zo0Var, null, cp0.f16328d, new C0784j3(this, null, (byte) 6), 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9554p(b33 b33Var) {
        this.f27710r.setValue(b33Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m9555q(uu1 uu1Var) {
        this.f27709q.setValue(uu1Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m9556r(wu1 wu1Var) {
        uj2 uj2Var = this.f27696d;
        if (uj2Var != null) {
            if (uj2Var.m11574a() == wu1Var) {
                uj2Var = null;
            }
            if (uj2Var != null) {
                uj2Var.f31922k.setValue(wu1Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9557s() {
        uj2 uj2Var;
        mj4 mj4Var;
        e94 e94VarM5353c0 = ev0.m5353c0();
        wm0 wm0Var = null;
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            if (!m9547i() || ((uj2Var = this.f27696d) != null && !((Boolean) uj2Var.f31928q.getValue()).booleanValue())) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                return;
            }
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            yg3 yg3Var = this.f27716x;
            if (((un4) yg3Var.f35216c) == un4.f32015a) {
                t32.m10970c("ToolbarRequester is not initialized.");
            }
            tj4 tj4Var = (tj4) yg3Var.f35215b;
            if (tj4Var == null || !tj4Var.f25208n) {
                return;
            }
            t82 t82Var = tj4Var.f31201u;
            if ((t82Var == null || !t82Var.mo4995b()) && (mj4Var = (mj4) sj3.m10825u(tj4Var, nj4.f25891b)) != null) {
                tj4Var.f31201u = lb5.m7910S(tj4Var.m8391C0(), null, cp0.f16328d, new C1199ty((Object) tj4Var, (Object) mj4Var, wm0Var, (byte) 10), 1);
            }
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m9558t(ym0 ym0Var) {
        ok4 ok4Var;
        if (ym0Var instanceof ok4) {
            ok4Var = (ok4) ym0Var;
            int i = ok4Var.f26822w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok4Var.f26822w = i - Integer.MIN_VALUE;
            } else {
                ok4Var = new ok4(this, ym0Var);
            }
        } else {
            ok4Var = new ok4(this, ym0Var);
        }
        Object objValueOf = ok4Var.f26820u;
        Object obj = ap0.f14763a;
        int i2 = ok4Var.f26822w;
        if (i2 == 0) {
            k43.m7376J(objValueOf);
            ha0 ha0Var = this.f27699g;
            if (ha0Var != null) {
                ok4Var.f26819t = this;
                ok4Var.f26822w = 1;
                if (!(ha0Var instanceof C0486bc)) {
                    C1077qn.m9988n(zi4.m13620t("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", rl3.m10361a(ha0Var.getClass()).m10248a()));
                    return null;
                }
                ClipDescription primaryClipDescription = ((C0486bc) ha0Var).f15199a.m13305A().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = ok4Var.f26819t;
        k43.m7376J(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.f27715w.setValue(bool);
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: u */
    public final void m9559u(boolean z) {
        uj2 uj2Var = this.f27696d;
        if (uj2Var != null) {
            uj2Var.f31923l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            m9557s();
        } else {
            m9551m();
        }
    }

    /* JADX INFO: renamed from: v */
    public final long m9560v(xk4 xk4Var, long j, boolean z, boolean z2, ds3 ds3Var, boolean z3, gv1 gv1Var) {
        kl4 kl4VarM11577d;
        long j2;
        int i;
        long j3;
        l04 l04Var;
        l04 l04Var2;
        boolean z4;
        boolean z5;
        fv1 fv1Var;
        k04 k04VarM6608G;
        k04 k04Var;
        k04 k04Var2;
        uj2 uj2Var = this.f27696d;
        if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
            return ql4.f28556b;
        }
        vi3 vi3Var = this.f27694b;
        long j4 = xk4Var.f34342b;
        C0875lk c0875lk = xk4Var.f34341a;
        int i2 = ql4.f28557c;
        int i3 = (int) (j4 >> 32);
        vi3Var.m11898a(i3);
        int i4 = (int) (j4 & 4294967295L);
        this.f27694b.m11898a(i4);
        long jM10657b = sc6.m10657b(i3, i4);
        int iM7544b = kl4VarM11577d.m7544b(j, false);
        int i5 = (z2 || z) ? iM7544b : (int) (jM10657b >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iM7544b;
        } else {
            j2 = 4294967295L;
            i = (int) (jM10657b & 4294967295L);
        }
        rd6 rd6Var = this.f27713u;
        int i6 = -1;
        if (z || rd6Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i7 = this.f27711s;
            if (i7 != -1) {
                i6 = i7;
            }
        }
        jl4 jl4Var = kl4VarM11577d.f23216a;
        if (z) {
            l04Var = null;
        } else {
            int i8 = (int) (jM10657b >> 32);
            int i9 = (int) (jM10657b & j3);
            l04Var = new l04(new k04(C0638f5.m5553x(jl4Var, i8), i8, 1L), new k04(C0638f5.m5553x(jl4Var, i9), i9, 1L), ql4.m9904h(jM10657b));
        }
        xa0 xa0Var = new xa0((byte) 4);
        xa0Var.f34092b = i5;
        xa0Var.f34093c = i;
        xa0Var.f34094d = i6;
        xa0Var.f34095e = jl4Var;
        VarHandle.storeStoreFence();
        rd6 rd6Var2 = new rd6((byte) 3);
        rd6Var2.f29196b = z2;
        rd6Var2.f29197c = l04Var;
        rd6Var2.f29198d = xa0Var;
        VarHandle.storeStoreFence();
        if (l04Var != null && rd6Var != null && z2 == rd6Var.f29196b) {
            xa0 xa0Var2 = (xa0) rd6Var.f29198d;
            if (i5 == xa0Var2.f34092b && i == xa0Var2.f34093c) {
                return j4;
            }
        }
        this.f27713u = rd6Var2;
        this.f27711s = iM7544b;
        switch (ds3Var.f17332a) {
            case 14:
                xa0 xa0Var3 = (xa0) rd6Var2.f29198d;
                l04Var2 = new l04(xa0Var3.m12595a(xa0Var3.f34092b), xa0Var3.m12595a(xa0Var3.f34093c), rd6Var2.m10303b() == vr0.f32805a);
                break;
            case 15:
                l04Var2 = i25.m6613e(rd6Var2, ig1.f21364C);
                break;
            case 16:
                l04Var2 = i25.m6613e(rd6Var2, gb5.f19722m);
                break;
            default:
                l04Var2 = (l04) rd6Var2.f29197c;
                xa0 xa0Var4 = (xa0) rd6Var2.f29198d;
                if (l04Var2 != null) {
                    k04 k04Var3 = l04Var2.f23669b;
                    k04 k04Var4 = l04Var2.f23668a;
                    if (rd6Var2.f29196b) {
                        k04VarM6608G = i25.m6608G(rd6Var2, xa0Var4, k04Var4);
                        k04Var2 = k04Var3;
                        k04Var3 = k04Var4;
                        k04Var = k04VarM6608G;
                    } else {
                        k04VarM6608G = i25.m6608G(rd6Var2, xa0Var4, k04Var3);
                        k04Var = k04Var4;
                        k04Var2 = k04VarM6608G;
                    }
                    if (!z62.m13387o(k04VarM6608G, k04Var3)) {
                        l04Var2 = i25.m6625t(new l04(k04Var, k04Var2, rd6Var2.m10303b() == vr0.f32805a || (rd6Var2.m10303b() == vr0.f32807c && k04Var.f22800b > k04Var2.f22800b)), rd6Var2);
                    }
                } else {
                    l04Var2 = i25.m6613e(rd6Var2, ig1.f21364C);
                }
                break;
        }
        vi3 vi3Var2 = this.f27694b;
        int i10 = l04Var2.f23668a.f22800b;
        vi3Var2.m11899b(i10);
        vi3 vi3Var3 = this.f27694b;
        int i11 = l04Var2.f23669b.f22800b;
        vi3Var3.m11899b(i11);
        long jM10657b2 = sc6.m10657b(i10, i11);
        if (ql4.m9899c(jM10657b2, j4)) {
            return j4;
        }
        boolean z6 = ql4.m9904h(jM10657b2) != ql4.m9904h(j4) && ql4.m9899c(sc6.m10657b((int) (jM10657b2 & j3), (int) (jM10657b2 >> 32)), j4);
        boolean z7 = ql4.m9900d(jM10657b2) && ql4.m9900d(j4);
        if (z3 && c0875lk.f24092b.length() > 0 && !z6 && !z7 && gv1Var != null && (fv1Var = this.f27702j) != null) {
            fv1Var.mo5818a(gv1Var.f20146a);
        }
        this.f27695c.invoke(m9539b(c0875lk, jM10657b2));
        this.f27714v = ql4.m9897a(jM10657b2);
        if (!z3) {
            m9559u(!ql4.m9900d(jM10657b2));
        }
        uj2 uj2Var2 = this.f27696d;
        if (uj2Var2 != null) {
            uj2Var2.f31928q.setValue(Boolean.valueOf(z3));
        }
        uj2 uj2Var3 = this.f27696d;
        if (uj2Var3 != null) {
            uj2Var3.f31924m.setValue(Boolean.valueOf(!ql4.m9900d(jM10657b2) && y70.m13009J(this, true)));
        }
        uj2 uj2Var4 = this.f27696d;
        if (uj2Var4 != null) {
            if (ql4.m9900d(jM10657b2)) {
                z4 = false;
            } else {
                z4 = false;
                if (y70.m13009J(this, false)) {
                    z5 = true;
                }
                uj2Var4.f31925n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            uj2Var4.f31925n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        uj2 uj2Var5 = this.f27696d;
        if (uj2Var5 != null) {
            if (ql4.m9900d(jM10657b2) && y70.m13009J(this, true)) {
                z4 = true;
            }
            uj2Var5.f31926o.setValue(Boolean.valueOf(z4));
        }
        return jM10657b2;
    }
}
