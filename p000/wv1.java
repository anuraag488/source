package p000;

import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wv1 implements qa0, qo0, uh2, gg0, hj3, hq3, up6, zl1, InterfaceC1188tn, InterfaceC1299wn {

    /* JADX INFO: renamed from: c */
    public static int f33760c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33784a;

    /* JADX INFO: renamed from: b */
    public static final wv1 f33759b = new wv1(1);

    /* JADX INFO: renamed from: d */
    public static final wv1 f33761d = new wv1(2);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wv1 f33762e = new wv1(3);

    /* JADX INFO: renamed from: f */
    public static final wv1 f33763f = new wv1(4);

    /* JADX INFO: renamed from: g */
    public static final wv1 f33764g = new wv1(5);

    /* JADX INFO: renamed from: h */
    public static final wv1 f33765h = new wv1(6);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ wv1 f33766i = new wv1(7);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ wv1 f33767j = new wv1(8);

    /* JADX INFO: renamed from: k */
    public static final wv1 f33768k = new wv1(9);

    /* JADX INFO: renamed from: l */
    public static final p53 f33769l = new p53(1);

    /* JADX INFO: renamed from: m */
    public static final p53 f33770m = new p53(0);

    /* JADX INFO: renamed from: n */
    public static final wv1 f33771n = new wv1(12);

    /* JADX INFO: renamed from: o */
    public static final wv1 f33772o = new wv1(13);

    /* JADX INFO: renamed from: p */
    public static final ds3 f33773p = new ds3(14);

    /* JADX INFO: renamed from: q */
    public static final ds3 f33774q = new ds3(15);

    /* JADX INFO: renamed from: r */
    public static final ds3 f33775r = new ds3(16);

    /* JADX INFO: renamed from: s */
    public static final ds3 f33776s = new ds3(17);

    /* JADX INFO: renamed from: t */
    public static final ds3 f33777t = new ds3(20);

    /* JADX INFO: renamed from: u */
    public static final ds3 f33778u = new ds3(21);

    /* JADX INFO: renamed from: v */
    public static final xy4 f33779v = new xy4(0);

    /* JADX INFO: renamed from: w */
    public static final wv1 f33780w = new wv1(17);

    /* JADX INFO: renamed from: x */
    public static final wv1 f33781x = new wv1(18);

    /* JADX INFO: renamed from: y */
    public static final wv1 f33782y = new wv1(19);

    /* JADX INFO: renamed from: z */
    public static final wv1 f33783z = new wv1(20);

    /* JADX INFO: renamed from: A */
    public static final wv1 f33752A = new wv1(21);

    /* JADX INFO: renamed from: B */
    public static final wv1 f33753B = new wv1(22);

    /* JADX INFO: renamed from: C */
    public static final wv1 f33754C = new wv1(23);

    /* JADX INFO: renamed from: D */
    public static final wv1 f33755D = new wv1(24);

    /* JADX INFO: renamed from: E */
    public static final wv1 f33756E = new wv1(25);

    /* JADX INFO: renamed from: F */
    public static final wv1 f33757F = new wv1(26);

    /* JADX INFO: renamed from: G */
    public static final wv1 f33758G = new wv1(27);

    public /* synthetic */ wv1(byte b) {
        this.f33784a = b;
    }

    /* JADX INFO: renamed from: l */
    public static ud3 m12422l(t31 t31Var, List list, zo0 zo0Var, wp1 wp1Var) {
        o85 o85Var = o85.f26453m;
        n10 n10Var = new n10((byte) 4);
        n10Var.f25376b = wp1Var;
        VarHandle.storeStoreFence();
        C1283w7 c1283w7 = new C1283w7(new cf1(o85Var, n10Var), zo0Var.mo6367f().get(o85.f26448h) == null ? zo0Var.mo6367f().plus(y70.m13021a()) : zo0Var.mo6367f());
        if (t31Var != null) {
            c1283w7.f33129e = t31Var;
        }
        c1283w7.f33126b = hb0.m6310V0(v71.f32439a, list);
        return new ud3(new ud3(c1283w7.m12143o()));
    }

    /* JADX INFO: renamed from: m */
    public static ud3 m12423m(t31 t31Var, zo0 zo0Var, wp1 wp1Var, int i) {
        if ((i & 1) != 0) {
            t31Var = null;
        }
        if ((i & 4) != 0) {
            pw0 pw0Var = l01.f23664a;
            zo0Var = zp0.m13670b(qs5.m10089N(gw0.f20149b, AbstractC0647fd.m5675m()));
        }
        return m12422l(t31Var, v71.f32439a, zo0Var, wp1Var);
    }

    @Override // p000.InterfaceC1188tn, p000.InterfaceC1299wn
    /* JADX INFO: renamed from: a */
    public float mo11068a() {
        return 0.0f;
    }

    @Override // p000.up6
    /* JADX INFO: renamed from: b */
    public bq6 mo10415b(Class cls) {
        if (!jo6.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (bq6) jo6.m7195i(cls.asSubclass(jo6.class)).mo205g(3);
        } catch (Exception e) {
            xy4.m12785n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p000.up6
    /* JADX INFO: renamed from: c */
    public boolean mo10416c(Class cls) {
        return jo6.class.isAssignableFrom(cls);
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        return qs5.m10119x((Executor) c0602e8.mo4023g(new ni3(tt4.class, Executor.class)));
    }

    @Override // p000.qa0
    /* JADX INFO: renamed from: f */
    public void mo7273f(Closeable closeable, Throwable th, Throwable th2) {
        la0.f23887a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
    }

    @Override // p000.InterfaceC1188tn
    /* JADX INFO: renamed from: g */
    public void mo10373g(ky0 ky0Var, int i, int[] iArr, df2 df2Var, int[] iArr2) {
        if (df2Var == df2.f17011a) {
            AbstractC1337xn.m12715a(i, iArr, iArr2, false);
        } else {
            AbstractC1337xn.m12715a(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC1299wn
    /* JADX INFO: renamed from: h */
    public void mo10874h(ky0 ky0Var, int i, int[] iArr, int[] iArr2) {
        AbstractC1337xn.m12715a(i, iArr, iArr2, false);
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public float mo6008i(float f) {
        double d = f;
        return (float) (d < 0.031248d ? d / 16.0d : as4.m3234M(d, 1.8d));
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public float mo6009j(float f) {
        double d = f;
        return (float) (d < 0.001953d ? d * 16.0d : as4.m3234M(d, 0.5555555555555556d));
    }

    /* JADX INFO: renamed from: k */
    public void m12424k(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1366160289);
        int i2 = i & 1;
        if (ir1Var.m6871T(i2, i2 != 0)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new C0460an();
                f33760c++;
                ir1Var.m6905n0(objM6869O);
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1017p0 c1017p0 = new C1017p0((byte) 4);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1017p0;
        }
    }

    public String toString() {
        switch (this.f33784a) {
            case 29:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // p000.uh2
    public void cancel() {
    }

    @Override // p000.uh2
    /* JADX INFO: renamed from: d */
    public void mo6776d() {
    }
}
