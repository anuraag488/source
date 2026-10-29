package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class si2 implements jy3 {

    /* JADX INFO: renamed from: x */
    public static final yg3 f30294x = AbstractC0647fd.m5645C(new en0(22), new el1(20));

    /* JADX INFO: renamed from: a */
    public final iw0 f30295a;

    /* JADX INFO: renamed from: b */
    public boolean f30296b;

    /* JADX INFO: renamed from: c */
    public mi2 f30297c;

    /* JADX INFO: renamed from: d */
    public boolean f30298d;

    /* JADX INFO: renamed from: e */
    public final g90 f30299e;

    /* JADX INFO: renamed from: f */
    public final d83 f30300f;

    /* JADX INFO: renamed from: g */
    public final nv2 f30301g;

    /* JADX INFO: renamed from: h */
    public float f30302h;

    /* JADX INFO: renamed from: i */
    public final sw0 f30303i;

    /* JADX INFO: renamed from: j */
    public final boolean f30304j;

    /* JADX INFO: renamed from: k */
    public wf2 f30305k;

    /* JADX INFO: renamed from: l */
    public final pi2 f30306l;

    /* JADX INFO: renamed from: m */
    public final C0960nv f30307m;

    /* JADX INFO: renamed from: n */
    public final jh2 f30308n;

    /* JADX INFO: renamed from: o */
    public final b30 f30309o;

    /* JADX INFO: renamed from: p */
    public final vh2 f30310p;

    /* JADX INFO: renamed from: q */
    public final w42 f30311q;

    /* JADX INFO: renamed from: r */
    public final sh2 f30312r;

    /* JADX INFO: renamed from: s */
    public final sw2 f30313s;

    /* JADX INFO: renamed from: t */
    public final d83 f30314t;

    /* JADX INFO: renamed from: u */
    public final d83 f30315u;

    /* JADX INFO: renamed from: v */
    public final sw2 f30316v;

    /* JADX INFO: renamed from: w */
    public final nh3 f30317w;

    public si2(int i, int i2) {
        iw0 iw0Var = new iw0();
        iw0Var.f21835a = -1;
        iw0Var.f21838d = -1;
        VarHandle.storeStoreFence();
        this.f30295a = iw0Var;
        g90 g90Var = new g90();
        g90Var.f19662b = new a83(i);
        g90Var.f19663c = new a83(i2);
        ph2 ph2Var = new ph2();
        int i3 = (i / 30) * 30;
        boolean z = false;
        ph2Var.f27605a = new d83(sc6.m10660c0(Math.max(i3 - 100, 0), i3 + 130), ia5.f21230u);
        ph2Var.f27606b = i;
        VarHandle.storeStoreFence();
        g90Var.f19665e = ph2Var;
        VarHandle.storeStoreFence();
        this.f30299e = g90Var;
        mi2 mi2Var = ui2.f31892a;
        o85 o85Var = o85.f26450j;
        this.f30300f = new d83(mi2Var, o85Var);
        this.f30301g = sj3.m10810f();
        b71 b71Var = new b71((byte) 14);
        b71Var.f15141b = this;
        VarHandle.storeStoreFence();
        this.f30303i = qq2.m10019c(b71Var);
        this.f30304j = true;
        pi2 pi2Var = new pi2();
        pi2Var.f27635a = this;
        VarHandle.storeStoreFence();
        this.f30306l = pi2Var;
        this.f30307m = new C0960nv();
        jh2 jh2Var = new jh2();
        long[] jArr = tv3.f31472a;
        jh2Var.f22272a = new lw2();
        mw2 mw2Var = uv3.f32207a;
        jh2Var.f22275d = new mw2();
        jh2Var.f22276e = new ArrayList();
        jh2Var.f22277f = new ArrayList();
        jh2Var.f22278g = new ArrayList();
        jh2Var.f22279h = new ArrayList();
        jh2Var.f22280i = new ArrayList();
        VarHandle.storeStoreFence();
        this.f30308n = jh2Var;
        b30 b30Var = new b30();
        b30Var.f15048a = new uw2(new yg2[16]);
        VarHandle.storeStoreFence();
        this.f30309o = b30Var;
        C0720hc c0720hc = new C0720hc((byte) 5);
        c0720hc.f20474b = i;
        VarHandle.storeStoreFence();
        vh2 vh2Var = new vh2();
        byte b = 3;
        tt2 tt2Var = new tt2(b, z);
        tt2Var.f31428b = new lw2();
        VarHandle.storeStoreFence();
        vh2Var.f32615b = tt2Var;
        vh2Var.f32617d = -1;
        vh2Var.f32618e = -1;
        vh2Var.f32614a = c0720hc;
        VarHandle.storeStoreFence();
        this.f30310p = vh2Var;
        w42 w42Var = new w42(b, z);
        w42Var.f33090b = this;
        VarHandle.storeStoreFence();
        this.f30311q = w42Var;
        w94 w94Var = new w94();
        sh2 sh2Var = new sh2();
        sh2Var.f30273a = w94Var;
        VarHandle.storeStoreFence();
        this.f30312r = sh2Var;
        ju4 ju4Var = ju4.f22634a;
        this.f30313s = new d83(ju4Var, o85Var);
        Boolean bool = Boolean.FALSE;
        this.f30314t = k43.m7398w(bool);
        this.f30315u = k43.m7398w(bool);
        this.f30316v = new d83(ju4Var, o85Var);
        nh3 nh3Var = new nh3((byte) 20, z);
        sq4 sq4Var = sw4.f30612a;
        Float fValueOf = Float.valueOf(0.0f);
        nh3Var.f25811c = new C0457ak(sq4Var, fValueOf, (AbstractC0654fk) sq4Var.f30508a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f30317w = nh3Var;
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: a */
    public final boolean mo6018a() {
        return ((Boolean) this.f30315u.getValue()).booleanValue();
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: b */
    public final boolean mo6019b() {
        return this.f30303i.mo6019b();
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: c */
    public final boolean mo6020c() {
        return ((Boolean) this.f30314t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.jy3
    /* JADX INFO: renamed from: d */
    public final Object mo6021d(xw2 xw2Var, mq1 mq1Var, ym0 ym0Var) {
        qi2 qi2Var;
        if (ym0Var instanceof qi2) {
            qi2Var = (qi2) ym0Var;
            int i = qi2Var.f28508x;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi2Var.f28508x = i - Integer.MIN_VALUE;
            } else {
                qi2Var = new qi2(this, ym0Var);
            }
        } else {
            qi2Var = new qi2(this, ym0Var);
        }
        Object obj = qi2Var.f28506v;
        Object obj2 = ap0.f14763a;
        int i2 = qi2Var.f28508x;
        Object obj3 = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (this.f30300f.getValue() == ui2.f31892a) {
                qi2Var.f28504t = xw2Var;
                qi2Var.f28505u = (of4) mq1Var;
                qi2Var.f28508x = 1;
                C0960nv c0960nv = this.f30307m;
                cf0 cf0Var = c0960nv.f26106b;
                if (cf0Var == null) {
                    cf0Var = new cf0();
                    c0960nv.f26106b = cf0Var;
                    C0923mv c0923mv = c0960nv.f26105a;
                    if (c0923mv != null && c0923mv.f25208n) {
                        C0960nv c0960nv2 = c0923mv.f25227p;
                        C0558d0 c0558d0 = new C0558d0((byte) 9);
                        c0558d0.f16655b = c0923mv;
                        c0558d0.f16656c = c0960nv2;
                        VarHandle.storeStoreFence();
                        c0923mv.f25226o = dt0.m4684M(c0923mv, c0558d0);
                    }
                }
                Object objM5007w = cf0Var.m5007w(qi2Var);
                if (objM5007w != obj2) {
                    objM5007w = obj3;
                }
                if (objM5007w != obj2) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(obj);
                return obj3;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mq1Var = (mq1) qi2Var.f28505u;
        xw2Var = qi2Var.f28504t;
        k43.m7376J(obj);
        qi2Var.f28504t = null;
        qi2Var.f28505u = null;
        qi2Var.f28508x = 2;
        return this.f30303i.mo6021d(xw2Var, mq1Var, qi2Var) == obj2 ? obj2 : obj3;
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: e */
    public final float mo6022e(float f) {
        return this.f30303i.mo6022e(f);
    }

    /* JADX INFO: renamed from: f */
    public final void m10787f(mi2 mi2Var, boolean z, boolean z2) {
        List list = mi2Var.f24951l;
        int i = mi2Var.f24954o;
        int i2 = mi2Var.f24941b;
        ni2 ni2Var = mi2Var.f24940a;
        this.f30310p.f32618e = list.size();
        nh3 nh3Var = this.f30317w;
        g90 g90Var = this.f30299e;
        wm0 wm0Var = null;
        if (!z && this.f30296b) {
            this.f30297c = mi2Var;
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                if (((Number) ((C0457ak) nh3Var.f25811c).f14572b.getValue()).floatValue() != 0.0f && ni2Var != null && ni2Var.f25846a == ((a83) g90Var.f19662b).m132h() && i2 == ((a83) g90Var.f19663c).m132h()) {
                    t82 t82Var = (t82) nh3Var.f25810b;
                    if (t82Var != null) {
                        t82Var.mo4993a(null);
                    }
                    nh3Var.f25811c = new C0457ak(sw4.f30612a, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            }
        }
        if (z) {
            this.f30296b = true;
        }
        this.f30315u.setValue(Boolean.valueOf(((ni2Var != null ? ni2Var.f25846a : 0) == 0 && i2 == 0) ? false : true));
        this.f30314t.setValue(Boolean.valueOf(mi2Var.f24942c));
        this.f30302h -= mi2Var.f24943d;
        this.f30300f.setValue(mi2Var);
        if (z2) {
            g90Var.getClass();
            if (i2 < 0.0f) {
                t32.m10970c("scrollOffset should be non-negative");
            }
            ((a83) g90Var.f19663c).m133i(i2);
        } else {
            ni2 ni2Var2 = (ni2) hb0.m6301M0(list);
            ni2 ni2Var3 = (ni2) hb0.m6307S0(list);
            Trace.setCounter("firstVisibleItem:index", ni2Var2 != null ? ni2Var2.f25846a : -1L);
            Trace.setCounter("lastVisibleItem:index", ni2Var3 != null ? ni2Var3.f25846a : -1L);
            g90Var.getClass();
            g90Var.f19664d = ni2Var != null ? ni2Var.f25855j : null;
            if (g90Var.f19661a || i > 0) {
                g90Var.f19661a = true;
                if (i2 < 0.0f) {
                    t32.m10970c("scrollOffset should be non-negative");
                }
                g90Var.m5942f(ni2Var != null ? ni2Var.f25846a : 0, i2);
            }
            if (this.f30304j) {
                iw0 iw0Var = this.f30295a;
                int i3 = iw0Var.f21835a;
                boolean z3 = iw0Var.f21837c;
                if (i3 != -1 && !list.isEmpty() && i3 != iw0.m6952a(mi2Var, z3)) {
                    iw0Var.f21835a = -1;
                    uh2 uh2Var = iw0Var.f21836b;
                    if (uh2Var != null) {
                        uh2Var.cancel();
                    }
                    iw0Var.f21836b = null;
                }
                int i4 = iw0Var.f21838d;
                if (i4 != -1 && iw0Var.f21839e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iM6952a = iw0.m6952a(mi2Var, iw0Var.f21839e < 0.0f);
                    if (iM6952a >= 0 && iM6952a < i) {
                        iw0Var.f21835a = iM6952a;
                        iw0Var.f21836b = w42.m12082v(this.f30311q, iM6952a);
                    }
                }
                iw0Var.f21838d = i;
            }
        }
        if (z) {
            float f = mi2Var.f24945f;
            ky0 ky0Var = mi2Var.f24948i;
            zo0 zo0Var = mi2Var.f24947h;
            nh3Var.getClass();
            if (f <= ky0Var.mo3575E(1.0f)) {
                return;
            }
            e94 e94VarM5353c1 = ev0.m5353c0();
            yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
            e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
            try {
                float fFloatValue = ((Number) ((C0457ak) nh3Var.f25811c).f14572b.getValue()).floatValue();
                t82 t82Var2 = (t82) nh3Var.f25810b;
                if (t82Var2 != null) {
                    t82Var2.mo4993a(null);
                }
                C0457ak c0457ak = (C0457ak) nh3Var.f25811c;
                if (c0457ak.f14576f) {
                    nh3Var.f25811c = k43.m7388m(c0457ak, fFloatValue - f, 0.0f, 30);
                } else {
                    nh3Var.f25811c = new C0457ak(sw4.f30612a, Float.valueOf(-f), null, 60);
                }
                nh3Var.f25810b = lb5.m7910S(zo0Var, null, null, new C0982og((Object) nh3Var, wm0Var, (byte) 12), 3);
            } finally {
                ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m10788g() {
        return ((a83) this.f30299e.f19662b).m132h();
    }

    /* JADX INFO: renamed from: h */
    public final mi2 m10789h() {
        return (mi2) this.f30300f.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m10790i(float f, mi2 mi2Var) {
        uh2 uh2Var;
        uh2 uh2Var2;
        if (this.f30304j) {
            boolean zIsEmpty = mi2Var.f24951l.isEmpty();
            iw0 iw0Var = this.f30295a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM6952a = iw0.m6952a(mi2Var, z);
                if (iM6952a >= 0 && iM6952a < mi2Var.f24954o) {
                    if (iM6952a != iw0Var.f21835a) {
                        if (iw0Var.f21837c != z) {
                            iw0Var.f21835a = -1;
                            uh2 uh2Var3 = iw0Var.f21836b;
                            if (uh2Var3 != null) {
                                uh2Var3.cancel();
                            }
                            iw0Var.f21836b = null;
                        }
                        iw0Var.f21837c = z;
                        iw0Var.f21835a = iM6952a;
                        iw0Var.f21836b = w42.m12082v(this.f30311q, iM6952a);
                    }
                    List list = mi2Var.f24951l;
                    if (z) {
                        ni2 ni2Var = (ni2) hb0.m6306R0(list);
                        if (((ni2Var.f25859n + ni2Var.f25860o) + mi2Var.f24957r) - mi2Var.f24953n < (-f) && (uh2Var2 = iw0Var.f21836b) != null) {
                            uh2Var2.mo6776d();
                        }
                    } else if (mi2Var.f24952m - ((ni2) hb0.m6299K0(list)).f25859n < f && (uh2Var = iw0Var.f21836b) != null) {
                        uh2Var.mo6776d();
                    }
                }
            }
            iw0Var.f21839e = f;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10791j(int i, int i2, boolean z) {
        g90 g90Var = this.f30299e;
        if (((a83) g90Var.f19662b).m132h() != i || ((a83) g90Var.f19663c).m132h() != i2) {
            jh2 jh2Var = this.f30308n;
            jh2Var.m7126d();
            jh2Var.f22273b = null;
            jh2Var.f22274c = -1;
        }
        g90Var.m5942f(i, i2);
        g90Var.f19664d = null;
        if (!z) {
            this.f30313s.setValue(ju4.f22634a);
            return;
        }
        wf2 wf2Var = this.f30305k;
        if (wf2Var != null) {
            wf2Var.m12285l();
        }
    }
}
