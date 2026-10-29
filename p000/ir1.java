package p000;

import ads_mobile_sdk.C0313rh;
import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 implements mi0 {

    /* JADX INFO: renamed from: A */
    public int f21664A;

    /* JADX INFO: renamed from: B */
    public int f21665B;

    /* JADX INFO: renamed from: C */
    public boolean f21666C;

    /* JADX INFO: renamed from: D */
    public hr1 f21667D;

    /* JADX INFO: renamed from: E */
    public ArrayList f21668E;

    /* JADX INFO: renamed from: F */
    public boolean f21669F;

    /* JADX INFO: renamed from: G */
    public l84 f21670G;

    /* JADX INFO: renamed from: H */
    public m84 f21671H;

    /* JADX INFO: renamed from: I */
    public p84 f21672I;

    /* JADX INFO: renamed from: J */
    public boolean f21673J;

    /* JADX INFO: renamed from: K */
    public ga3 f21674K;

    /* JADX INFO: renamed from: L */
    public y70 f21675L;

    /* JADX INFO: renamed from: M */
    public ni0 f21676M;

    /* JADX INFO: renamed from: N */
    public cr1 f21677N;

    /* JADX INFO: renamed from: O */
    public rh1 f21678O;

    /* JADX INFO: renamed from: P */
    public o64 f21679P;

    /* JADX INFO: renamed from: Q */
    public xi0 f21680Q;

    /* JADX INFO: renamed from: R */
    public ro0 f21681R;

    /* JADX INFO: renamed from: S */
    public boolean f21682S;

    /* JADX INFO: renamed from: T */
    public long f21683T;

    /* JADX INFO: renamed from: U */
    public jr1 f21684U;

    /* JADX INFO: renamed from: a */
    public InterfaceC0618en f21685a;

    /* JADX INFO: renamed from: b */
    public ui0 f21686b;

    /* JADX INFO: renamed from: c */
    public m84 f21687c;

    /* JADX INFO: renamed from: d */
    public pw2 f21688d;

    /* JADX INFO: renamed from: e */
    public y70 f21689e;

    /* JADX INFO: renamed from: f */
    public y70 f21690f;

    /* JADX INFO: renamed from: g */
    public ar3 f21691g;

    /* JADX INFO: renamed from: h */
    public zi0 f21692h;

    /* JADX INFO: renamed from: i */
    public ArrayList f21693i;

    /* JADX INFO: renamed from: j */
    public lr1 f21694j;

    /* JADX INFO: renamed from: k */
    public int f21695k;

    /* JADX INFO: renamed from: l */
    public int f21696l;

    /* JADX INFO: renamed from: m */
    public int f21697m;

    /* JADX INFO: renamed from: n */
    public x52 f21698n;

    /* JADX INFO: renamed from: o */
    public int[] f21699o;

    /* JADX INFO: renamed from: p */
    public jv2 f21700p;

    /* JADX INFO: renamed from: q */
    public boolean f21701q;

    /* JADX INFO: renamed from: r */
    public boolean f21702r;

    /* JADX INFO: renamed from: s */
    public ArrayList f21703s;

    /* JADX INFO: renamed from: t */
    public x52 f21704t;

    /* JADX INFO: renamed from: u */
    public ga3 f21705u;

    /* JADX INFO: renamed from: v */
    public lv2 f21706v;

    /* JADX INFO: renamed from: w */
    public boolean f21707w;

    /* JADX INFO: renamed from: x */
    public x52 f21708x;

    /* JADX INFO: renamed from: y */
    public boolean f21709y;

    /* JADX INFO: renamed from: z */
    public int f21710z;

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: Q */
    public static final uu2 m6852Q(ir1 ir1Var, int i) {
        ArrayList arrayList;
        int iM7853i = ir1Var.f21670G.m7853i(i);
        l84 l84Var = ir1Var.f21670G;
        Object objM7860p = l84Var.m7860p(l84Var.f23848b, i);
        if (iM7853i != 126665345 || !(objM7860p instanceof su2)) {
            return null;
        }
        if (ir1Var.f21670G.m7848d(i)) {
            ArrayList arrayList2 = new ArrayList();
            m6853R(ir1Var, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        l84 l84Var2 = ir1Var.f21670G;
        su2 su2Var = (su2) l84Var2.m7860p(l84Var2.f23848b, i);
        Object objM7852h = ir1Var.f21670G.m7852h(i, 0);
        cr1 cr1VarM7845a = ir1Var.f21670G.m7845a(i);
        int iM8981b = o84.m8981b(ir1Var.f21670G.f23848b, i) + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = ir1Var.f21703s;
        int iM6095t = gq6.m6095t(arrayList4, i);
        if (iM6095t < 0) {
            iM6095t = -(iM6095t + 1);
        }
        while (iM6095t < arrayList4.size()) {
            l72 l72Var = (l72) arrayList4.get(iM6095t);
            if (l72Var.f23831b >= iM8981b) {
                break;
            }
            arrayList3.add(new l73(l72Var.f23830a, l72Var.f23832c));
            iM6095t++;
        }
        return new uu2(su2Var, objM7852h, ir1Var.f21692h, ir1Var.f21687c, cr1VarM7845a, arrayList3, ir1Var.m6904n(i), arrayList);
    }

    /* JADX INFO: renamed from: R */
    public static final void m6853R(ir1 ir1Var, ArrayList arrayList, int i) {
        int iM8981b = o84.m8981b(ir1Var.f21670G.f23848b, i) + i;
        int iM8981b2 = i + 1;
        while (iM8981b2 < iM8981b) {
            if (ir1Var.f21670G.m7854j(iM8981b2)) {
                uu2 uu2VarM6852Q = m6852Q(ir1Var, iM8981b2);
                if (uu2VarM6852Q != null) {
                    arrayList.add(uu2VarM6852Q);
                }
            } else if (ir1Var.f21670G.m7848d(iM8981b2)) {
                m6853R(ir1Var, arrayList, iM8981b2);
            }
            iM8981b2 += o84.m8981b(ir1Var.f21670G.f23848b, iM8981b2);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final int m6854S(ir1 ir1Var, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        l84 l84Var = ir1Var.f21670G;
        int i7 = 0;
        if (l84Var.m7854j(i2)) {
            int iM7853i = l84Var.m7853i(i2);
            Object objM7860p = l84Var.m7860p(l84Var.f23848b, i2);
            if (iM7853i == 126665345 && (objM7860p instanceof su2)) {
                uu2 uu2VarM6852Q = m6852Q(ir1Var, i2);
                if (uu2VarM6852Q != null) {
                    ir1Var.f21686b.mo5181c(uu2VarM6852Q);
                    ir1Var.f21676M.m8772e();
                    ni0 ni0Var = ir1Var.f21676M;
                    zi0 zi0Var = ir1Var.f21692h;
                    ui0 ui0Var = ir1Var.f21686b;
                    x53 x53Var = ni0Var.f25831b.f34991a;
                    x53Var.m12494X(f53.f18771c);
                    sj3.m10797F(x53Var, zi0Var, ui0Var, uu2VarM6852Q);
                }
                if (!z || i2 == i) {
                    return l84Var.m7859o(i2);
                }
                ni0 ni0Var2 = ir1Var.f21676M;
                ni0Var2.m8770c();
                ni0Var2.m8769b();
                ir1 ir1Var2 = ni0Var2.f25830a;
                int iM7859o = ir1Var2.f21670G.m7856l(i2) ? 1 : ir1Var2.f21670G.m7859o(i2);
                if (iM7859o > 0) {
                    ni0Var2.m8773f(i3, iM7859o);
                }
                return 0;
            }
            if (iM7853i == 206 && z62.m13387o(objM7860p, qi0.f28502e)) {
                Object objM7852h = l84Var.m7852h(i2, 0);
                mr1 mr1Var = objM7852h instanceof mr1 ? (mr1) objM7852h : null;
                pm3 pm3Var = mr1Var != null ? mr1Var.f25168a : null;
                fr1 fr1Var = pm3Var instanceof fr1 ? (fr1) pm3Var : null;
                if (fr1Var != null) {
                    mw2 mw2Var = fr1Var.f19234a.f20080e;
                    Object[] objArr3 = mw2Var.f25258b;
                    long[] jArr2 = mw2Var.f25257a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        ir1 ir1Var3 = (ir1) objArr3[(i8 << 3) + i11];
                                        m84 m84Var = ir1Var3.f21687c;
                                        if (m84Var.f24734b <= 0 || (m84Var.f24733a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i6 = i7;
                                        } else {
                                            zi0 zi0Var2 = ir1Var3.f21692h;
                                            synchronized (zi0Var2.f36114d) {
                                                zi0Var2.m13588s();
                                                lw2 lw2Var = zi0Var2.f36124n;
                                                zi0Var2.f36124n = dt0.m4723y();
                                                try {
                                                    zi0Var2.f36132v.m6899k0(lw2Var);
                                                } catch (Throwable th) {
                                                    zi0Var2.f36124n = lw2Var;
                                                    throw th;
                                                }
                                            }
                                            y70 y70Var = new y70();
                                            ir1Var3.f21675L = y70Var;
                                            l84 l84VarM8230e = ir1Var3.f21687c.m8230e();
                                            try {
                                                ir1Var3.f21670G = l84VarM8230e;
                                                ni0 ni0Var3 = ir1Var3.f21676M;
                                                y70 y70Var2 = ni0Var3.f25831b;
                                                try {
                                                    ni0Var3.f25831b = y70Var;
                                                    ir1Var3.m6870P(0);
                                                    ni0 ni0Var4 = ir1Var3.f21676M;
                                                    ni0Var4.m8769b();
                                                    if (ni0Var4.f25832c) {
                                                        objArr2 = objArr3;
                                                        ni0Var4.f25831b.f34991a.m12494X(m53.f24670c);
                                                        if (ni0Var4.f25832c) {
                                                            ni0Var4.m8771d(false);
                                                            ni0Var4.m8771d(false);
                                                            ni0Var4.f25831b.f34991a.m12494X(v43.f32393c);
                                                            i6 = 0;
                                                            ni0Var4.f25832c = false;
                                                        }
                                                        ni0Var3.f25831b = y70Var2;
                                                        l84VarM8230e.m7847c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                    ni0Var3.f25831b = y70Var2;
                                                    l84VarM8230e.m7847c();
                                                } catch (Throwable th2) {
                                                    ni0Var3.f25831b = y70Var2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                l84VarM8230e.m7847c();
                                                throw th3;
                                            }
                                        }
                                        ir1Var.f21686b.mo5189u(ir1Var3.f21692h);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i6 = i7;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            objArr3 = objArr;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return l84Var.m7859o(i2);
            }
            i4 = 1;
            if (!l84Var.m7856l(i2)) {
                return l84Var.m7859o(i2);
            }
        } else {
            i4 = 1;
            if (l84Var.m7848d(i2)) {
                int iM8981b = o84.m8981b(l84Var.f23848b, i2) + i2;
                int iM6854S = 0;
                for (int iM8981b2 = i2 + 1; iM8981b2 < iM8981b; iM8981b2 += o84.m8981b(l84Var.f23848b, iM8981b2)) {
                    boolean zM7856l = l84Var.m7856l(iM8981b2);
                    if (zM7856l) {
                        ir1Var.f21676M.m8770c();
                        ni0 ni0Var5 = ir1Var.f21676M;
                        Object objM7858n = l84Var.m7858n(iM8981b2);
                        ni0Var5.m8770c();
                        ni0Var5.f25837h.add(objM7858n);
                    }
                    iM6854S += m6854S(ir1Var, i, iM8981b2, zM7856l || z, zM7856l ? 0 : i3 + iM6854S);
                    if (zM7856l) {
                        ir1Var.f21676M.m8770c();
                        ir1Var.f21676M.m8768a();
                    }
                }
                if (!l84Var.m7856l(i2)) {
                    return iM6854S;
                }
            } else if (!l84Var.m7856l(i2)) {
                return l84Var.m7859o(i2);
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: A */
    public final yk3 m6855A() {
        ArrayList arrayList = this.f21668E;
        if (this.f21664A != 0 || arrayList.isEmpty()) {
            return null;
        }
        return (yk3) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6856B() {
        if (!m6858D() || this.f21707w) {
            return true;
        }
        yk3 yk3VarM6855A = m6855A();
        return (yk3VarM6855A == null || (yk3VarM6855A.f35298b & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final xi0 m6857C() {
        if (this.f21686b.mo6115l()) {
            return this.f21680Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6858D() {
        yk3 yk3VarM6855A;
        return (this.f21682S || this.f21709y || this.f21707w || (yk3VarM6855A = m6855A()) == null || (yk3VarM6855A.f35298b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0132 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0052, B:14:0x0065, B:18:0x00a8, B:76:0x0213, B:22:0x00b7, B:23:0x00ba, B:10:0x0057, B:12:0x005d, B:13:0x0062, B:24:0x00bb, B:26:0x00c1, B:29:0x00cb, B:32:0x00d5, B:34:0x00d9, B:35:0x00de, B:39:0x00e8, B:41:0x00f5, B:47:0x0115, B:49:0x0129, B:51:0x0132, B:53:0x013d, B:55:0x014e, B:60:0x0166, B:75:0x0210, B:100:0x024c, B:101:0x024f, B:58:0x0153, B:103:0x0251, B:104:0x0254, B:46:0x0113, B:42:0x0103, B:38:0x00e3, B:105:0x0255, B:48:0x0122, B:61:0x0192, B:74:0x020a, B:98:0x0245, B:99:0x024b, B:15:0x0069, B:17:0x009d), top: B:114:0x000a, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013d A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0052, B:14:0x0065, B:18:0x00a8, B:76:0x0213, B:22:0x00b7, B:23:0x00ba, B:10:0x0057, B:12:0x005d, B:13:0x0062, B:24:0x00bb, B:26:0x00c1, B:29:0x00cb, B:32:0x00d5, B:34:0x00d9, B:35:0x00de, B:39:0x00e8, B:41:0x00f5, B:47:0x0115, B:49:0x0129, B:51:0x0132, B:53:0x013d, B:55:0x014e, B:60:0x0166, B:75:0x0210, B:100:0x024c, B:101:0x024f, B:58:0x0153, B:103:0x0251, B:104:0x0254, B:46:0x0113, B:42:0x0103, B:38:0x00e3, B:105:0x0255, B:48:0x0122, B:61:0x0192, B:74:0x020a, B:98:0x0245, B:99:0x024b, B:15:0x0069, B:17:0x009d), top: B:114:0x000a, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0052, B:14:0x0065, B:18:0x00a8, B:76:0x0213, B:22:0x00b7, B:23:0x00ba, B:10:0x0057, B:12:0x005d, B:13:0x0062, B:24:0x00bb, B:26:0x00c1, B:29:0x00cb, B:32:0x00d5, B:34:0x00d9, B:35:0x00de, B:39:0x00e8, B:41:0x00f5, B:47:0x0115, B:49:0x0129, B:51:0x0132, B:53:0x013d, B:55:0x014e, B:60:0x0166, B:75:0x0210, B:100:0x024c, B:101:0x024f, B:58:0x0153, B:103:0x0251, B:104:0x0254, B:46:0x0113, B:42:0x0103, B:38:0x00e3, B:105:0x0255, B:48:0x0122, B:61:0x0192, B:74:0x020a, B:98:0x0245, B:99:0x024b, B:15:0x0069, B:17:0x009d), top: B:114:0x000a, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fe A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #6 {all -> 0x0227, blocks: (B:71:0x01f1, B:73:0x01fe, B:94:0x023f, B:95:0x0241), top: B:121:0x01f1 }] */
    /* JADX INFO: renamed from: E */
    public final void m6859E(ArrayList arrayList) {
        ui0 ui0Var;
        cr1 cr1Var;
        cr1 cr1VarM12917k;
        ArrayList arrayList2;
        l84 l84VarM8230e;
        l84 l84VarM8230e2;
        l84 l84Var;
        int[] iArr;
        lv2 lv2Var;
        int[] iArr2;
        lv2 lv2Var2;
        y70 y70Var;
        y70 y70Var2;
        boolean z;
        boolean z2;
        y70 y70Var3;
        m84 m84Var;
        ui0 ui0Var2 = this.f21686b;
        ni0 ni0Var = this.f21676M;
        y70 y70Var4 = this.f21690f;
        y70 y70Var5 = ni0Var.f25831b;
        try {
            ni0Var.f25831b = y70Var4;
            y70Var4.f34991a.m12494X(k53.f22903c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                l73 l73Var = (l73) arrayList.get(i2);
                uu2 uu2Var = (uu2) l73Var.f23833a;
                uu2 uu2Var2 = (uu2) l73Var.f23834b;
                cr1 cr1VarM12917k2 = AbstractC1356y5.m12917k(uu2Var.f32183e);
                m84 m84VarM8980a = o84.m8980a(uu2Var.f32182d);
                int iM8227a = m84VarM8980a.m8227a(cr1VarM12917k2);
                t52 t52Var = new t52();
                ni0Var.m8769b();
                x53 x53Var = ni0Var.f25831b.f34991a;
                x53Var.m12494X(s43.f29899c);
                sj3.m10796E(x53Var, i, t52Var, 1, cr1VarM12917k2);
                if (uu2Var2 == null) {
                    if (m84VarM8980a == this.f21671H) {
                        if (!this.f21672I.f27455w) {
                            qi0.m9889a("Check failed");
                        }
                        m6919y();
                    }
                    l84 l84VarM8230e3 = m84VarM8980a.m8230e();
                    try {
                        l84VarM8230e3.m7862r(iM8227a);
                        ni0Var.f25835f = iM8227a;
                        y70 y70Var6 = new y70();
                        C0590dx c0590dx = new C0590dx((byte) 3);
                        c0590dx.f17475e = this;
                        c0590dx.f17472b = y70Var6;
                        c0590dx.f17473c = l84VarM8230e3;
                        c0590dx.f17474d = uu2Var;
                        VarHandle.storeStoreFence();
                        m6864J(null, null, null, v71.f32439a, c0590dx);
                        y70 y70Var7 = ni0Var.f25831b;
                        y70Var7.getClass();
                        if (!y70Var6.f34991a.m12493W()) {
                            x53 x53Var2 = y70Var7.f34991a;
                            x53Var2.m12494X(o43.f26333c);
                            sj3.m10796E(x53Var2, 0, y70Var6, 1, t52Var);
                        }
                        l84VarM8230e3.m7847c();
                        ui0Var = ui0Var2;
                    } catch (Throwable th) {
                        l84VarM8230e3.m7847c();
                        throw th;
                    }
                } else {
                    tu2 tu2VarMo5186p = ui0Var2.mo5186p(uu2Var2);
                    m84 m84VarM8980a2 = tu2VarMo5186p != null ? o84.m8980a(tu2VarMo5186p.f31455a) : null;
                    m84 m84VarM8980a3 = m84VarM8980a2 == null ? o84.m8980a(uu2Var2.f32182d) : m84VarM8980a2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (m84VarM8980a2 != null) {
                                                            if (m84VarM8980a2.f24739g) {
                                                                qi0.m9889a("use active SlotWriter to create an anchor location instead");
                                                            }
                                                            if (m84VarM8980a2.f24734b <= 0) {
                                                                kd3.m7502a("Parameter index is out of range");
                                                            }
                                                            ArrayList arrayList3 = m84VarM8980a2.f24741i;
                                                            ui0Var = ui0Var2;
                                                            int iM8983d = o84.m8983d(arrayList3, 0, m84VarM8980a2.f24734b);
                                                            if (iM8983d < 0) {
                                                                cr1Var = new cr1(0);
                                                                arrayList3.add(-(iM8983d + 1), cr1Var);
                                                            } else {
                                                                cr1Var = (cr1) arrayList3.get(iM8983d);
                                                            }
                                                            if (cr1Var != null) {
                                                            }
                                                            cr1VarM12917k = AbstractC1356y5.m12917k(cr1Var);
                                                            arrayList2 = new ArrayList();
                                                            l84VarM8230e = m84VarM8980a3.m8230e();
                                                            gq6.m6090o(l84VarM8230e, arrayList2, m84VarM8980a3.m8227a(cr1VarM12917k));
                                                            l84VarM8230e.m7847c();
                                                            if (arrayList2.isEmpty()) {
                                                                cr1VarM12917k = cr1VarM12917k;
                                                            } else {
                                                                y70Var3 = ni0Var.f25831b;
                                                                y70Var3.getClass();
                                                                if (!arrayList2.isEmpty()) {
                                                                    x53 x53Var3 = y70Var3.f34991a;
                                                                    x53Var3.m12494X(p43.f27376c);
                                                                    sj3.m10796E(x53Var3, 1, arrayList2, 0, t52Var);
                                                                }
                                                                m84Var = this.f21687c;
                                                                if (m84VarM8980a != m84Var) {
                                                                    int iM8227a2 = m84Var.m8227a(cr1VarM12917k2);
                                                                    m6901l0(iM8227a2, m6909p0(iM8227a2) + arrayList2.size());
                                                                }
                                                            }
                                                            x53 x53Var4 = ni0Var.f25831b.f34991a;
                                                            x53Var4.m12494X(q43.f28208c);
                                                            int i3 = x53Var4.f34020k - x53Var4.f34015f[x53Var4.f34016g - 1].f32422b;
                                                            Object[] objArr = x53Var4.f34019j;
                                                            objArr[i3] = tu2VarMo5186p;
                                                            objArr[i3 + 1] = ui0Var;
                                                            objArr[i3 + 3] = uu2Var;
                                                            objArr[i3 + 2] = uu2Var2;
                                                            l84VarM8230e2 = m84VarM8980a3.m8230e();
                                                            l84Var = this.f21670G;
                                                            iArr = this.f21699o;
                                                            lv2Var = this.f21706v;
                                                            this.f21699o = null;
                                                            this.f21706v = null;
                                                            this.f21670G = l84VarM8230e2;
                                                            int iM8227a3 = m84VarM8980a3.m8227a(AbstractC1356y5.m12917k(cr1VarM12917k));
                                                            l84VarM8230e2.m7862r(iM8227a3);
                                                            ni0Var.f25835f = iM8227a3;
                                                            y70Var = new y70();
                                                            y70Var2 = ni0Var.f25831b;
                                                            ni0Var.f25831b = y70Var;
                                                            z = ni0Var.f25834e;
                                                            ni0Var.f25834e = false;
                                                            zi0 zi0Var = uu2Var2.f32181c;
                                                            zi0 zi0Var2 = uu2Var.f32181c;
                                                            Integer numValueOf = Integer.valueOf(l84VarM8230e2.f23853g);
                                                            List list = uu2Var2.f32184f;
                                                            jp1 jp1Var = new jp1((byte) 1);
                                                            jp1Var.f22485b = this;
                                                            jp1Var.f22486c = uu2Var;
                                                            VarHandle.storeStoreFence();
                                                            iArr2 = iArr;
                                                            z2 = z;
                                                            lv2Var2 = lv2Var;
                                                            m6864J(zi0Var, zi0Var2, numValueOf, list, jp1Var);
                                                            ni0Var.f25834e = z2;
                                                            ni0Var.f25831b = y70Var2;
                                                            y70Var2.getClass();
                                                            if (!y70Var.f34991a.m12493W()) {
                                                                x53 x53Var5 = y70Var2.f34991a;
                                                                x53Var5.m12494X(o43.f26333c);
                                                                sj3.m10796E(x53Var5, 0, y70Var, 1, t52Var);
                                                            }
                                                            this.f21670G = l84Var;
                                                            this.f21699o = iArr2;
                                                            this.f21706v = lv2Var2;
                                                            l84VarM8230e2.m7847c();
                                                        } else {
                                                            ui0Var = ui0Var2;
                                                            tu2VarMo5186p = tu2VarMo5186p;
                                                        }
                                                        ni0Var.f25831b = y70Var2;
                                                        y70Var2.getClass();
                                                        if (!y70Var.f34991a.m12493W()) {
                                                            x53 x53Var6 = y70Var2.f34991a;
                                                            x53Var6.m12494X(o43.f26333c);
                                                            sj3.m10796E(x53Var6, 0, y70Var, 1, t52Var);
                                                        }
                                                        this.f21670G = l84Var;
                                                        this.f21699o = iArr2;
                                                        this.f21706v = lv2Var2;
                                                        l84VarM8230e2.m7847c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        this.f21670G = l84Var;
                                                        this.f21699o = iArr2;
                                                        this.f21706v = lv2Var2;
                                                        throw th;
                                                    }
                                                    ni0Var.f25834e = z2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    ni0Var.f25831b = y70Var2;
                                                    throw th;
                                                }
                                                m6864J(zi0Var, zi0Var2, numValueOf, list, jp1Var);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ni0Var.f25834e = z2;
                                                throw th;
                                            }
                                            jp1 jp1Var2 = new jp1((byte) 1);
                                            jp1Var2.f22485b = this;
                                            jp1Var2.f22486c = uu2Var;
                                            VarHandle.storeStoreFence();
                                            iArr2 = iArr;
                                            z2 = z;
                                            lv2Var2 = lv2Var;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            lv2Var2 = lv2Var;
                                            iArr2 = iArr;
                                            z2 = z;
                                        }
                                        ni0Var.f25834e = false;
                                        zi0 zi0Var3 = uu2Var2.f32181c;
                                        zi0 zi0Var4 = uu2Var.f32181c;
                                        Integer numValueOf2 = Integer.valueOf(l84VarM8230e2.f23853g);
                                        List list2 = uu2Var2.f32184f;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        lv2Var2 = lv2Var;
                                        z2 = z;
                                        iArr2 = iArr;
                                    }
                                    ni0Var.f25831b = y70Var;
                                    z = ni0Var.f25834e;
                                } catch (Throwable th7) {
                                    th = th7;
                                    iArr2 = iArr;
                                    lv2Var2 = lv2Var;
                                }
                                this.f21670G = l84VarM8230e2;
                                int iM8227a4 = m84VarM8980a3.m8227a(AbstractC1356y5.m12917k(cr1VarM12917k));
                                l84VarM8230e2.m7862r(iM8227a4);
                                ni0Var.f25835f = iM8227a4;
                                y70Var = new y70();
                                y70Var2 = ni0Var.f25831b;
                            } catch (Throwable th8) {
                                th = th8;
                                iArr2 = iArr;
                                lv2Var2 = lv2Var;
                            }
                            l84Var = this.f21670G;
                            iArr = this.f21699o;
                            lv2Var = this.f21706v;
                            this.f21699o = null;
                            this.f21706v = null;
                        } catch (Throwable th9) {
                            l84VarM8230e2.m7847c();
                            throw th9;
                        }
                        gq6.m6090o(l84VarM8230e, arrayList2, m84VarM8980a3.m8227a(cr1VarM12917k));
                        l84VarM8230e.m7847c();
                        if (arrayList2.isEmpty()) {
                            y70Var3 = ni0Var.f25831b;
                            y70Var3.getClass();
                            if (!arrayList2.isEmpty()) {
                                x53 x53Var7 = y70Var3.f34991a;
                                x53Var7.m12494X(p43.f27376c);
                                sj3.m10796E(x53Var7, 1, arrayList2, 0, t52Var);
                            }
                            m84Var = this.f21687c;
                            if (m84VarM8980a != m84Var) {
                                int iM8227a5 = m84Var.m8227a(cr1VarM12917k2);
                                m6901l0(iM8227a5, m6909p0(iM8227a5) + arrayList2.size());
                            }
                        } else {
                            cr1VarM12917k = cr1VarM12917k;
                        }
                        x53 x53Var8 = ni0Var.f25831b.f34991a;
                        x53Var8.m12494X(q43.f28208c);
                        int i4 = x53Var8.f34020k - x53Var8.f34015f[x53Var8.f34016g - 1].f32422b;
                        Object[] objArr2 = x53Var8.f34019j;
                        objArr2[i4] = tu2VarMo5186p;
                        objArr2[i4 + 1] = ui0Var;
                        objArr2[i4 + 3] = uu2Var;
                        objArr2[i4 + 2] = uu2Var2;
                        l84VarM8230e2 = m84VarM8980a3.m8230e();
                    } catch (Throwable th10) {
                        l84VarM8230e.m7847c();
                        throw th10;
                    }
                    cr1Var = uu2Var2.f32183e;
                    cr1VarM12917k = AbstractC1356y5.m12917k(cr1Var);
                    arrayList2 = new ArrayList();
                    l84VarM8230e = m84VarM8980a3.m8230e();
                }
                ni0Var.f25831b.f34991a.m12494X(m53.f24670c);
                i2++;
                ui0Var2 = ui0Var;
                size = size;
                i = 0;
            }
            ni0Var.m8769b();
            ni0Var.f25831b.f34991a.m12494X(w43.f33091c);
            ni0Var.f25835f = 0;
            ni0Var.f25831b = y70Var5;
        } catch (Throwable th11) {
            ni0Var.f25831b = y70Var5;
            throw th11;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m6860F(su2 su2Var, ga3 ga3Var, Object obj, boolean z) {
        m6879a0(126665345, su2Var);
        m6861G();
        m6907o0(obj);
        long j = this.f21683T;
        byte b = 0;
        try {
            this.f21683T = 126665345L;
            if (this.f21682S) {
                p84.m9389y(this.f21672I);
            }
            boolean z2 = (this.f21682S || z62.m13387o(this.f21670G.m7850f(), ga3Var)) ? false : true;
            if (z2) {
                m6867M(ga3Var);
            }
            m6875X(202, 0, qi0.f28500c, ga3Var);
            this.f21674K = null;
            if (!this.f21682S || z) {
                boolean z3 = this.f21707w;
                this.f21707w = z2;
                er1 er1Var = new er1(b);
                er1Var.f18412b = su2Var;
                er1Var.f18413c = obj;
                VarHandle.storeStoreFence();
                pg0 pg0Var = new pg0(-59194059, true, er1Var);
                as4.m3259r(2, pg0Var);
                pg0Var.invoke(this, 1);
                this.f21707w = z3;
            } else {
                this.f21673J = true;
                p84 p84Var = this.f21672I;
                this.f21686b.mo5183m(new uu2(su2Var, obj, this.f21692h, this.f21671H, p84Var.m9414b(p84Var.m9395F(p84Var.f27434b, p84Var.f27454v)), v71.f32439a, m6902m(), null));
            }
            m6912r(false);
            this.f21674K = null;
            this.f21683T = j;
            m6912r(false);
        } catch (Throwable th) {
            try {
                dr1 dr1Var = new dr1((byte) 1);
                dr1Var.f17300b = this;
                VarHandle.storeStoreFence();
                y42.m12837K0(th, dr1Var);
                throw th;
            } catch (Throwable th2) {
                m6912r(false);
                this.f21674K = null;
                this.f21683T = j;
                m6912r(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object m6861G() {
        boolean z = this.f21682S;
        i50 i50Var = ki0.f23136a;
        if (!z) {
            Object objM7857m = this.f21670G.m7857m();
            if (!this.f21709y || (objM7857m instanceof ip3)) {
                return objM7857m;
            }
        } else if (this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected");
            return i50Var;
        }
        return i50Var;
    }

    /* JADX INFO: renamed from: H */
    public final List m6862H() {
        ui0 ui0Var = this.f21686b;
        ti0 ti0VarMo6113i = ui0Var.mo6113i();
        zi0 zi0Var = ti0VarMo6113i != null ? (zi0) ti0VarMo6113i : null;
        if (zi0Var != null) {
            m84 m84Var = zi0Var.f36116f;
            l84 l84VarM8230e = o84.m8980a(m84Var).m8230e();
            try {
                Integer numM5349Y = ev0.m5349Y(l84VarM8230e, ui0Var, 0, l84VarM8230e.f23849c);
                l84VarM8230e.m7847c();
                if (numM5349Y != null) {
                    l84 l84VarM8230e2 = o84.m8980a(m84Var).m8230e();
                    try {
                        return hb0.m6310V0(ev0.m5374x0(l84VarM8230e2, numM5349Y.intValue(), 0), zi0Var.f36132v.m6862H());
                    } finally {
                        l84VarM8230e2.m7847c();
                    }
                }
            } catch (Throwable th) {
                l84VarM8230e.m7847c();
                throw th;
            }
        }
        return v71.f32439a;
    }

    /* JADX INFO: renamed from: I */
    public final int m6863I(int i) {
        int iM7861q = this.f21670G.m7861q(i) + 1;
        int i2 = 0;
        while (iM7861q < i) {
            if (!this.f21670G.m7855k(iM7861q)) {
                i2++;
            }
            iM7861q += o84.m8981b(this.f21670G.f23848b, iM7861q);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:20:0x003f, B:22:0x0047, B:24:0x004d, B:25:0x0051, B:26:0x0052, B:28:0x0058, B:21:0x0043), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: J */
    public final Object m6864J(zi0 zi0Var, zi0 zi0Var2, Integer num, List list, wp1 wp1Var) {
        Object objInvoke;
        boolean z = this.f21669F;
        int i = this.f21695k;
        try {
            this.f21669F = true;
            this.f21695k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l73 l73Var = (l73) list.get(i2);
                yk3 yk3Var = (yk3) l73Var.f23833a;
                Object obj = l73Var.f23834b;
                if (obj != null) {
                    m6897j0(yk3Var, obj);
                } else {
                    m6897j0(yk3Var, null);
                }
            }
            if (zi0Var == null) {
                objInvoke = wp1Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (zi0Var2 == null || zi0Var2 == zi0Var || iIntValue < 0) {
                    objInvoke = wp1Var.invoke();
                } else {
                    zi0Var.f36128r = zi0Var2;
                    zi0Var.f36129s = iIntValue;
                    try {
                        objInvoke = wp1Var.invoke();
                        zi0Var.f36128r = null;
                        zi0Var.f36129s = 0;
                    } catch (Throwable th) {
                        zi0Var.f36128r = null;
                        zi0Var.f36129s = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = wp1Var.invoke();
                }
            }
            this.f21669F = z;
            this.f21695k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.f21669F = z;
            this.f21695k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:172:0x034d  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:75:0x018e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: K */
    public final void m6865K() {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ir1.m6865K():void");
    }

    /* JADX INFO: renamed from: L */
    public final void m6866L() {
        m6870P(this.f21670G.f23853g);
        ni0 ni0Var = this.f21676M;
        ni0Var.m8771d(false);
        ni0Var.m8772e();
        ni0Var.f25831b.f34991a.m12494X(i53.f21133c);
        int i = ni0Var.f25835f;
        l84 l84Var = ni0Var.f25830a.f21670G;
        ni0Var.f25835f = o84.m8981b(l84Var.f23848b, l84Var.f23853g) + i;
    }

    /* JADX INFO: renamed from: M */
    public final void m6867M(ga3 ga3Var) {
        lv2 lv2Var = this.f21706v;
        if (lv2Var == null) {
            lv2Var = new lv2();
            this.f21706v = lv2Var;
        }
        lv2Var.m8121h(this.f21670G.f23853g, ga3Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX INFO: renamed from: N */
    public final void m6868N(int i, int i2, int i3) {
        l84 l84Var = this.f21670G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (l84Var.m7861q(i) == i2) {
                i3 = i2;
            } else if (l84Var.m7861q(i2) == i) {
                i3 = i;
            } else if (l84Var.m7861q(i) == l84Var.m7861q(i2)) {
                i3 = l84Var.m7861q(i);
            } else {
                int iM7861q = i;
                int i4 = 0;
                while (iM7861q > 0 && iM7861q != i3) {
                    iM7861q = l84Var.m7861q(iM7861q);
                    i4++;
                }
                int iM7861q2 = i2;
                int i5 = 0;
                while (iM7861q2 > 0 && iM7861q2 != i3) {
                    iM7861q2 = l84Var.m7861q(iM7861q2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iM7861q3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iM7861q3 = l84Var.m7861q(iM7861q3);
                }
                int i8 = i5 - i4;
                int iM7861q4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iM7861q4 = l84Var.m7861q(iM7861q4);
                }
                i3 = iM7861q3;
                for (int iM7861q5 = iM7861q4; i3 != iM7861q5; iM7861q5 = l84Var.m7861q(iM7861q5)) {
                    i3 = l84Var.m7861q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (l84Var.m7856l(i)) {
                this.f21676M.m8768a();
            }
            i = l84Var.m7861q(i);
        }
        m6910q(i2, i3);
    }

    /* JADX INFO: renamed from: O */
    public final Object m6869O() {
        boolean z = this.f21682S;
        i50 i50Var = ki0.f23136a;
        if (!z) {
            Object objM7857m = this.f21670G.m7857m();
            if (!this.f21709y || (objM7857m instanceof ip3)) {
                return objM7857m instanceof mr1 ? ((mr1) objM7857m).f25168a : objM7857m;
            }
        } else if (this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected");
            return i50Var;
        }
        return i50Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m6870P(int i) {
        ni0 ni0Var = this.f21676M;
        boolean zM7856l = this.f21670G.m7856l(i);
        if (zM7856l) {
            ni0Var.m8770c();
            Object objM7858n = this.f21670G.m7858n(i);
            ni0Var.m8770c();
            ni0Var.f25837h.add(objM7858n);
        }
        m6854S(this, i, i, zM7856l, 0);
        ni0Var.m8770c();
        if (zM7856l) {
            ni0Var.m8768a();
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m6871T(int i, boolean z) {
        yk3 yk3VarM6855A;
        if ((i & 1) == 0 && (this.f21682S || this.f21709y)) {
            o64 o64Var = this.f21679P;
            if (o64Var != null && (yk3VarM6855A = m6855A()) != null && o64Var.mo8969g()) {
                int i2 = yk3VarM6855A.f35298b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                yk3VarM6855A.f35298b = i3;
                yk3VarM6855A.f35298b = (this.f21709y ? i2 | 129 : i3 & (-129)) | 256;
                x53 x53Var = this.f21676M.f25831b.f34991a;
                x53Var.m12494X(h53.f20400c);
                sj3.m10795D(x53Var, 0, yk3VarM6855A);
                this.f21686b.mo5188t(yk3VarM6855A);
                return false;
            }
        } else if (!z && m6858D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX INFO: renamed from: U */
    public final void m6872U() {
        long jRotateLeft;
        if (this.f21703s.isEmpty()) {
            this.f21696l = this.f21670G.m7863s() + this.f21696l;
            return;
        }
        l84 l84Var = this.f21670G;
        int iM7851g = l84Var.m7851g();
        int[] iArr = l84Var.f23848b;
        int i = l84Var.f23853g;
        Object objM7860p = i < l84Var.f23854h ? l84Var.m7860p(iArr, i) : null;
        Object objM7850f = l84Var.m7850f();
        int i2 = this.f21697m;
        i50 i50Var = ki0.f23136a;
        if (objM7860p == null) {
            if (objM7850f == null || iM7851g != 207 || objM7850f.equals(i50Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) iM7851g), 3) ^ ((long) i2);
            } else {
                this.f21683T = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) objM7850f.hashCode()), 3) ^ ((long) i2);
            }
            m6883c0(null, (iArr[(l84Var.f23853g * 5) + 1] & 1073741824) != 0);
            m6865K();
            l84Var.m7849e();
            if (objM7860p != null) {
                if (objM7860p instanceof Enum) {
                    this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T, 3) ^ ((long) ((Enum) objM7860p).ordinal()), 3);
                } else {
                    this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T, 3) ^ ((long) objM7860p.hashCode()), 3);
                }
            }
            if (objM7850f == null && iM7851g == 207 && !objM7850f.equals(i50Var)) {
                this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T ^ ((long) i2), 3) ^ ((long) objM7850f.hashCode()), 3);
                return;
            } else {
                this.f21683T = Long.rotateRight(((long) iM7851g) ^ Long.rotateRight(this.f21683T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) (objM7860p instanceof Enum ? ((Enum) objM7860p).ordinal() : objM7860p.hashCode())), 3);
        this.f21683T = jRotateLeft;
        m6883c0(null, (iArr[(l84Var.f23853g * 5) + 1] & 1073741824) != 0);
        m6865K();
        l84Var.m7849e();
        if (objM7860p != null) {
            if (objM7850f == null) {
            }
            this.f21683T = Long.rotateRight(((long) iM7851g) ^ Long.rotateRight(this.f21683T ^ ((long) i2), 3), 3);
        } else if (objM7860p instanceof Enum) {
            this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T, 3) ^ ((long) ((Enum) objM7860p).ordinal()), 3);
        } else {
            this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T, 3) ^ ((long) objM7860p.hashCode()), 3);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m6873V() {
        l84 l84Var = this.f21670G;
        int i = l84Var.f23855i;
        this.f21696l = i >= 0 ? l84Var.f23848b[(i * 5) + 1] & 67108863 : 0;
        l84Var.m7864t();
    }

    /* JADX INFO: renamed from: W */
    public final void m6874W() {
        if (this.f21696l != 0) {
            qi0.m9889a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f21682S) {
            return;
        }
        yk3 yk3VarM6855A = m6855A();
        if (yk3VarM6855A != null) {
            int i = yk3VarM6855A.f35298b;
            if ((i & 128) == 0) {
                yk3VarM6855A.f35298b = i | 16;
            }
        }
        if (this.f21703s.isEmpty()) {
            m6873V();
        } else {
            m6865K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:166:0x030c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0327  */
    /* JADX WARN: Code duplicated, block: B:170:0x032d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0333  */
    /* JADX WARN: Code duplicated, block: B:175:0x033a  */
    /* JADX WARN: Code duplicated, block: B:177:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x033f  */
    /* JADX WARN: Code duplicated, block: B:182:0x036b  */
    /* JADX WARN: Code duplicated, block: B:183:0x036d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x018b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX INFO: renamed from: X */
    public final void m6875X(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        lr1 lr1Var;
        lr1 lr1Var2;
        ArrayList arrayList;
        lv2 lv2Var;
        int i3;
        Object objValueOf;
        lw2 lw2Var;
        Object objM8132g;
        cw2 cw2Var;
        p84 p84Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        int i7;
        Object[] objArr2;
        int i8;
        int i9;
        int i10;
        l84 l84Var;
        int[] iArr;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        l84 l84Var2;
        int i14;
        Object objM7860p;
        p84 p84Var2;
        int i15;
        lr1 lr1Var3;
        Object obj4 = obj;
        ni0 ni0Var = this.f21676M;
        if (this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i16 = this.f21697m;
        Object obj5 = ki0.f23136a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) i), 3) ^ ((long) i16);
            } else {
                this.f21683T = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i16);
            }
            if (obj4 == null) {
                this.f21697m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f21682S) {
                this.f21670G.f23857k++;
                p84Var2 = this.f21672I;
                i15 = p84Var2.f27452t;
                if (z) {
                    p84Var2.m9407R(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    p84Var2.m9407R(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    p84Var2.m9407R(i, obj4, false, obj5);
                }
                lr1Var3 = this.f21694j;
                if (lr1Var3 != null) {
                    int i17 = (-2) - i15;
                    uc2 uc2Var = new uc2(i, -1, i17, -1);
                    lr1Var3.f24310e.m8121h(i17, new ju1(-1, this.f21695k - lr1Var3.f24307b, 0));
                    lr1Var3.f24309d.add(uc2Var);
                }
                m6918x(z, null);
                return;
            }
            if (i2 != 1 && this.f21709y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f21694j == null) {
                int iM7851g = this.f21670G.m7851g();
                if (!z2 && iM7851g == i) {
                    l84Var2 = this.f21670G;
                    i14 = l84Var2.f23853g;
                    if (i14 < l84Var2.f23854h) {
                        objM7860p = l84Var2.m7860p(l84Var2.f23848b, i14);
                    } else {
                        objM7860p = null;
                    }
                    if (z62.m13387o(obj4, objM7860p)) {
                        m6883c0(obj2, z);
                        z3 = z2;
                    }
                }
                l84Var = this.f21670G;
                iArr = l84Var.f23848b;
                arrayList2 = new ArrayList();
                if (l84Var.f23857k <= 0) {
                    i11 = l84Var.f23853g;
                    while (i11 < l84Var.f23854h) {
                        int i18 = i11 * 5;
                        int i19 = iArr[i18];
                        boolean z4 = z2;
                        Object objM7860p2 = l84Var.m7860p(iArr, i11);
                        i12 = iArr[i18 + 1];
                        if ((i12 & 1073741824) != 0) {
                            i13 = 1;
                        } else {
                            i13 = i12 & 67108863;
                        }
                        arrayList2.add(new uc2(i19, objM7860p2, i11, i13));
                        i11 += iArr[i18 + 3];
                        z2 = z4;
                        l84Var = l84Var;
                    }
                }
                z3 = z2;
                this.f21694j = new lr1(arrayList2, this.f21695k);
            } else {
                z3 = z2;
            }
            lr1Var = this.f21694j;
            if (lr1Var != null) {
                arrayList = lr1Var.f24309d;
                lv2Var = lr1Var.f24310e;
                i3 = lr1Var.f24307b;
                if (obj4 != null) {
                    objValueOf = new g92(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                lw2Var = ((ev2) lr1Var.f24311f.getValue()).f18514a;
                objM8132g = lw2Var.m8132g(objValueOf);
                if (objM8132g == null) {
                    objM8132g = null;
                } else if (objM8132g instanceof cw2) {
                    cw2Var = (cw2) objM8132g;
                    Object objM4211l = cw2Var.m4211l(0);
                    if (cw2Var.m4208i()) {
                        lw2Var.m8136k(objValueOf);
                    }
                    if (cw2Var.f16533b == 1) {
                        lw2Var.m8138m(objValueOf, cw2Var.m4205f());
                    }
                    objM8132g = objM4211l;
                } else {
                    lw2Var.m8136k(objValueOf);
                }
                uc2 uc2Var2 = (uc2) objM8132g;
                if (!z3 || uc2Var2 == null) {
                    this.f21670G.f23857k++;
                    this.f21682S = true;
                    this.f21674K = null;
                    if (this.f21672I.f27455w) {
                        p84 p84VarM8231l = this.f21671H.m8231l();
                        this.f21672I = p84VarM8231l;
                        p84VarM8231l.m9403N();
                        this.f21673J = false;
                        this.f21674K = null;
                    }
                    this.f21672I.m9416d();
                    p84Var = this.f21672I;
                    int i20 = p84Var.f27452t;
                    if (z) {
                        p84Var.m9407R(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        p84Var.m9407R(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        p84Var.m9407R(i, obj3, false, obj5);
                    }
                    this.f21677N = this.f21672I.m9414b(i20);
                    int i21 = (-2) - i20;
                    uc2 uc2Var3 = new uc2(i, -1, i21, -1);
                    lv2Var.m8121h(i21, new ju1(-1, this.f21695k - i3, i4));
                    arrayList.add(uc2Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.f21695k;
                    }
                    lr1Var2 = new lr1(arrayList3, i5);
                } else {
                    int i22 = uc2Var2.f31784c;
                    arrayList.add(uc2Var2);
                    ju1 ju1Var = (ju1) lv2Var.m8197b(i22);
                    this.f21695k = (ju1Var != null ? ju1Var.f22625b : -1) + i3;
                    ju1 ju1Var2 = (ju1) lv2Var.m8197b(i22);
                    int i23 = ju1Var2 != null ? ju1Var2.f22624a : -1;
                    int i24 = lr1Var.f24308c;
                    int i25 = i23 - i24;
                    if (i23 <= i24) {
                        i6 = i25;
                        if (i24 > i23) {
                            Object[] objArr3 = lv2Var.f24667c;
                            long[] jArr = lv2Var.f24665a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) < 128) {
                                                ju1 ju1Var3 = (ju1) objArr3[(i26 << 3) + i28];
                                                objArr2 = objArr3;
                                                int i29 = ju1Var3.f22624a;
                                                if (i29 == i23) {
                                                    ju1Var3.f22624a = i24;
                                                } else {
                                                    i8 = i23;
                                                    if (i8 + 1 <= i29 && i29 < i24) {
                                                        ju1Var3.f22624a = i29 - 1;
                                                    }
                                                }
                                                j >>= 8;
                                                i28++;
                                                objArr3 = objArr2;
                                                i23 = i8;
                                            } else {
                                                objArr2 = objArr3;
                                            }
                                            i8 = i23;
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                            i23 = i8;
                                        }
                                        objArr = objArr3;
                                        i7 = i23;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                        i7 = i23;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                    i23 = i7;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = lv2Var.f24667c;
                        long[] jArr2 = lv2Var.f24665a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                long[] jArr3 = jArr2;
                                int i31 = 8;
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i32 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        if ((j2 & 255) < 128) {
                                            i10 = i31;
                                            ju1 ju1Var4 = (ju1) objArr4[(i30 << 3) + i33];
                                            i9 = i25;
                                            int i34 = ju1Var4.f22624a;
                                            if (i34 == i23) {
                                                ju1Var4.f22624a = i24;
                                            } else if (i24 <= i34 && i34 < i23) {
                                                ju1Var4.f22624a = i34 + 1;
                                            }
                                        } else {
                                            i9 = i25;
                                            i10 = i31;
                                        }
                                        j2 >>= i10;
                                        i33++;
                                        i25 = i9;
                                        i31 = i10;
                                    }
                                    i6 = i25;
                                    if (i32 != i31) {
                                        break;
                                    }
                                } else {
                                    i6 = i25;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                jArr2 = jArr3;
                                i25 = i6;
                            }
                        } else {
                            i6 = i25;
                        }
                    }
                    ni0Var.f25835f = (i22 - ni0Var.f25830a.f21670G.f23853g) + ni0Var.f25835f;
                    this.f21670G.m7862r(i22);
                    if (i6 > 0) {
                        ni0Var.m8771d(false);
                        ni0Var.m8772e();
                        x53 x53Var = ni0Var.f25831b.f34991a;
                        x53Var.m12494X(d53.f16788c);
                        x53Var.f34017h[x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a] = i6;
                    }
                    m6883c0(obj2, z);
                    lr1Var2 = null;
                }
            } else {
                lr1Var2 = null;
            }
            m6918x(z, lr1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.f21683T = jRotateLeft;
        if (obj4 == null) {
            this.f21697m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f21682S) {
            this.f21670G.f23857k++;
            p84Var2 = this.f21672I;
            i15 = p84Var2.f27452t;
            if (z) {
                p84Var2.m9407R(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                p84Var2.m9407R(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                p84Var2.m9407R(i, obj4, false, obj5);
            }
            lr1Var3 = this.f21694j;
            if (lr1Var3 != null) {
                int i110 = (-2) - i15;
                uc2 uc2Var4 = new uc2(i, -1, i110, -1);
                lr1Var3.f24310e.m8121h(i110, new ju1(-1, this.f21695k - lr1Var3.f24307b, 0));
                lr1Var3.f24309d.add(uc2Var4);
            }
            m6918x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f21694j == null) {
            int iM7851g2 = this.f21670G.m7851g();
            if (!z2) {
                l84Var2 = this.f21670G;
                i14 = l84Var2.f23853g;
                if (i14 < l84Var2.f23854h) {
                    objM7860p = l84Var2.m7860p(l84Var2.f23848b, i14);
                } else {
                    objM7860p = null;
                }
                if (z62.m13387o(obj4, objM7860p)) {
                    m6883c0(obj2, z);
                    z3 = z2;
                }
            }
            l84Var = this.f21670G;
            iArr = l84Var.f23848b;
            arrayList2 = new ArrayList();
            if (l84Var.f23857k <= 0) {
                i11 = l84Var.f23853g;
                while (i11 < l84Var.f23854h) {
                    int i111 = i11 * 5;
                    int i112 = iArr[i111];
                    boolean z5 = z2;
                    Object objM7860p3 = l84Var.m7860p(iArr, i11);
                    i12 = iArr[i111 + 1];
                    if ((i12 & 1073741824) != 0) {
                        i13 = 1;
                    } else {
                        i13 = i12 & 67108863;
                    }
                    arrayList2.add(new uc2(i112, objM7860p3, i11, i13));
                    i11 += iArr[i111 + 3];
                    z2 = z5;
                    l84Var = l84Var;
                }
            }
            z3 = z2;
            this.f21694j = new lr1(arrayList2, this.f21695k);
        } else {
            z3 = z2;
        }
        lr1Var = this.f21694j;
        if (lr1Var != null) {
            arrayList = lr1Var.f24309d;
            lv2Var = lr1Var.f24310e;
            i3 = lr1Var.f24307b;
            if (obj4 != null) {
                objValueOf = new g92(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            lw2Var = ((ev2) lr1Var.f24311f.getValue()).f18514a;
            objM8132g = lw2Var.m8132g(objValueOf);
            if (objM8132g == null) {
                objM8132g = null;
            } else if (objM8132g instanceof cw2) {
                cw2Var = (cw2) objM8132g;
                Object objM4211l2 = cw2Var.m4211l(0);
                if (cw2Var.m4208i()) {
                    lw2Var.m8136k(objValueOf);
                }
                if (cw2Var.f16533b == 1) {
                    lw2Var.m8138m(objValueOf, cw2Var.m4205f());
                }
                objM8132g = objM4211l2;
            } else {
                lw2Var.m8136k(objValueOf);
            }
            uc2 uc2Var5 = (uc2) objM8132g;
            if (z3) {
            }
            this.f21670G.f23857k++;
            this.f21682S = true;
            this.f21674K = null;
            if (this.f21672I.f27455w) {
                p84 p84VarM8231l2 = this.f21671H.m8231l();
                this.f21672I = p84VarM8231l2;
                p84VarM8231l2.m9403N();
                this.f21673J = false;
                this.f21674K = null;
            }
            this.f21672I.m9416d();
            p84Var = this.f21672I;
            int i210 = p84Var.f27452t;
            if (z) {
                p84Var.m9407R(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                p84Var.m9407R(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                p84Var.m9407R(i, obj3, false, obj5);
            }
            this.f21677N = this.f21672I.m9414b(i210);
            int i211 = (-2) - i210;
            uc2 uc2Var6 = new uc2(i, -1, i211, -1);
            lv2Var.m8121h(i211, new ju1(-1, this.f21695k - i3, i4));
            arrayList.add(uc2Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.f21695k;
            }
            lr1Var2 = new lr1(arrayList4, i5);
        } else {
            lr1Var2 = null;
        }
        m6918x(z, lr1Var2);
    }

    /* JADX INFO: renamed from: Y */
    public final void m6876Y() {
        m6875X(NetError.ERR_PROXY_AUTH_REQUESTED, 0, null, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m6877Z(int i, j43 j43Var) {
        m6875X(i, 0, j43Var, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6878a() {
        m6896j();
        this.f21693i.clear();
        this.f21698n.f34014b = 0;
        this.f21704t.f34014b = 0;
        this.f21708x.f34014b = 0;
        this.f21706v = null;
        rh1 rh1Var = this.f21678O;
        rh1Var.f29284g.m12491U();
        rh1Var.f29283f.m12491U();
        this.f21683T = 0L;
        this.f21664A = 0;
        this.f21702r = false;
        this.f21682S = false;
        this.f21709y = false;
        this.f21669F = false;
        this.f21710z = -1;
        l84 l84Var = this.f21670G;
        if (!l84Var.f23852f) {
            l84Var.m7847c();
        }
        if (this.f21672I.f27455w) {
            return;
        }
        m6919y();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m6879a0(int i, Object obj) {
        m6875X(i, 0, obj, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m6880b(mq1 mq1Var, Object obj) {
        if (this.f21682S) {
            x53 x53Var = this.f21678O.f29283f;
            x53Var.m12494X(s53.f29920c);
            sj3.m10795D(x53Var, 0, obj);
            as4.m3259r(2, mq1Var);
            sj3.m10795D(x53Var, 1, mq1Var);
            return;
        }
        ni0 ni0Var = this.f21676M;
        ni0Var.m8769b();
        x53 x53Var2 = ni0Var.f25831b.f34991a;
        x53Var2.m12494X(s53.f29920c);
        as4.m3259r(2, mq1Var);
        sj3.m10796E(x53Var2, 0, obj, 1, mq1Var);
    }

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
    /* JADX INFO: renamed from: b0 */
    public final void m6881b0(zh3 zh3Var) {
        ga3 ga3VarM6902m = m6902m();
        m6877Z(C0313rh.f10778d1, qi0.f28499b);
        Object objM6869O = m6869O();
        nw4 nw4Var = z62.m13387o(objM6869O, ki0.f23136a) ? null : (nw4) objM6869O;
        xh3 xh3Var = zh3Var.f36091a;
        nw4 nw4VarM12696d = xh3Var.m12696d(zh3Var, nw4Var);
        boolean zEquals = nw4VarM12696d.equals(nw4Var);
        if (!zEquals) {
            m6905n0(nw4VarM12696d);
        }
        boolean z = true;
        if (!this.f21682S) {
            l84 l84Var = this.f21670G;
            ga3 ga3Var = (ga3) l84Var.m7846b(l84Var.f23848b, l84Var.f23853g);
            if (!(m6858D() && zEquals) && (zh3Var.f36098h || !ga3VarM6902m.containsKey(xh3Var))) {
                ga3VarM6902m = ga3VarM6902m.m5947e(xh3Var, nw4VarM12696d);
            } else if ((zEquals && !this.f21707w) || !this.f21707w) {
                ga3VarM6902m = ga3Var;
            }
            if (!this.f21709y && ga3Var == ga3VarM6902m) {
            }
            if (z && !this.f21682S) {
                m6867M(ga3VarM6902m);
            }
            this.f21708x.m12486c(this.f21707w ? 1 : 0);
            this.f21707w = z;
            this.f21674K = ga3VarM6902m;
            m6875X(202, 0, qi0.f28500c, ga3VarM6902m);
        }
        if (zh3Var.f36098h || !ga3VarM6902m.containsKey(xh3Var)) {
            ga3VarM6902m = ga3VarM6902m.m5947e(xh3Var, nw4VarM12696d);
        }
        this.f21673J = true;
        z = false;
        if (z) {
            m6867M(ga3VarM6902m);
        }
        this.f21708x.m12486c(this.f21707w ? 1 : 0);
        this.f21707w = z;
        this.f21674K = ga3VarM6902m;
        m6875X(202, 0, qi0.f28500c, ga3VarM6902m);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6882c(double d) {
        Object objM6861G = m6861G();
        if ((objM6861G instanceof Double) && d == ((Number) objM6861G).doubleValue()) {
            return false;
        }
        m6907o0(Double.valueOf(d));
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m6883c0(Object obj, boolean z) {
        if (z) {
            l84 l84Var = this.f21670G;
            if (l84Var.f23857k <= 0) {
                if ((l84Var.f23848b[(l84Var.f23853g * 5) + 1] & 1073741824) == 0) {
                    kd3.m7502a("Expected a node group");
                }
                l84Var.m7865u();
                return;
            }
            return;
        }
        if (obj != null && this.f21670G.m7850f() != obj) {
            ni0 ni0Var = this.f21676M;
            ni0Var.getClass();
            ni0Var.m8771d(false);
            x53 x53Var = ni0Var.f25831b.f34991a;
            x53Var.m12494X(r53.f29027c);
            sj3.m10795D(x53Var, 0, obj);
        }
        this.f21670G.m7865u();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6884d(float f) {
        Object objM6861G = m6861G();
        if ((objM6861G instanceof Float) && f == ((Number) objM6861G).floatValue()) {
            return false;
        }
        m6907o0(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6885d0(int i) {
        int i2;
        int i3;
        if (this.f21694j != null) {
            m6875X(i, 0, null, null);
            return;
        }
        if (this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f21683T = Long.rotateLeft(Long.rotateLeft(this.f21683T, 3) ^ ((long) i), 3) ^ ((long) this.f21697m);
        this.f21697m++;
        l84 l84Var = this.f21670G;
        boolean z = this.f21682S;
        i50 i50Var = ki0.f23136a;
        if (z) {
            l84Var.f23857k++;
            this.f21672I.m9407R(i, i50Var, false, i50Var);
            m6918x(false, null);
            return;
        }
        if (l84Var.m7851g() == i && ((i3 = l84Var.f23853g) >= l84Var.f23854h || (l84Var.f23848b[(i3 * 5) + 1] & 536870912) == 0)) {
            l84Var.m7865u();
            m6918x(false, null);
            return;
        }
        if (l84Var.f23857k <= 0 && (i2 = l84Var.f23853g) != l84Var.f23854h) {
            int i4 = this.f21695k;
            m6866L();
            this.f21676M.m8773f(i4, l84Var.m7863s());
            gq6.m6068F(this.f21703s, i2, l84Var.f23853g);
        }
        l84Var.f23857k++;
        this.f21682S = true;
        this.f21674K = null;
        if (this.f21672I.f27455w) {
            p84 p84VarM8231l = this.f21671H.m8231l();
            this.f21672I = p84VarM8231l;
            p84VarM8231l.m9403N();
            this.f21673J = false;
            this.f21674K = null;
        }
        p84 p84Var = this.f21672I;
        p84Var.m9416d();
        int i5 = p84Var.f27452t;
        p84Var.m9407R(i, i50Var, false, i50Var);
        this.f21677N = p84Var.m9414b(i5);
        m6918x(false, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6886e(int i) {
        Object objM6861G = m6861G();
        if ((objM6861G instanceof Integer) && i == ((Number) objM6861G).intValue()) {
            return false;
        }
        m6907o0(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6887e0(int i) {
        m6875X(i, 0, null, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6888f(long j) {
        Object objM6861G = m6861G();
        if ((objM6861G instanceof Long) && j == ((Number) objM6861G).longValue()) {
            return false;
        }
        m6907o0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX INFO: renamed from: f0 */
    public final ir1 m6889f0(int i) {
        yk3 yk3Var;
        boolean z;
        ar3 ar3Var = this.f21691g;
        m6885d0(i);
        ArrayList arrayList = this.f21668E;
        zi0 zi0Var = this.f21692h;
        if (this.f21682S) {
            yk3 yk3Var2 = new yk3(zi0Var);
            arrayList.add(yk3Var2);
            m6907o0(yk3Var2);
            yk3Var2.f35301e = this.f21665B;
            yk3Var2.f35298b &= -17;
            ar3Var.m3145m();
            return this;
        }
        ArrayList arrayList2 = this.f21703s;
        int iM6095t = gq6.m6095t(arrayList2, this.f21670G.f23855i);
        l72 l72Var = iM6095t >= 0 ? (l72) arrayList2.remove(iM6095t) : null;
        Object objM7857m = this.f21670G.m7857m();
        if (z62.m13387o(objM7857m, ki0.f23136a)) {
            yk3Var = new yk3(zi0Var);
            m6907o0(yk3Var);
        } else {
            yk3Var = (yk3) objM7857m;
        }
        if (l72Var == null) {
            int i2 = yk3Var.f35298b;
            boolean z2 = (i2 & 64) != 0;
            if (z2) {
                yk3Var.f35298b = i2 & (-65);
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i3 = yk3Var.f35298b;
        yk3Var.f35298b = z ? i3 | 8 : i3 & (-9);
        arrayList.add(yk3Var);
        yk3Var.f35301e = this.f21665B;
        yk3Var.f35298b &= -17;
        ar3Var.m3145m();
        int i4 = yk3Var.f35298b;
        if ((i4 & 256) != 0) {
            yk3Var.f35298b = (i4 & (-257)) | 512;
            x53 x53Var = this.f21676M.f25831b.f34991a;
            x53Var.m12494X(n53.f25470c);
            sj3.m10795D(x53Var, 0, yk3Var);
            if (!this.f21709y) {
                int i5 = yk3Var.f35298b;
                if ((i5 & 128) != 0) {
                    this.f21709y = true;
                    this.f21710z = this.f21670G.f23855i;
                    yk3Var.f35298b = i5 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6890g(Object obj) {
        if (z62.m13387o(m6861G(), obj)) {
            return false;
        }
        m6907o0(obj);
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m6891g0(Object obj) {
        if (!this.f21682S && this.f21670G.m7851g() == 207 && !z62.m13387o(this.f21670G.m7850f(), obj) && this.f21710z < 0) {
            this.f21710z = this.f21670G.f23853g;
            this.f21709y = true;
        }
        m6875X(207, 0, null, obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6892h(boolean z) {
        Object objM6861G = m6861G();
        if ((objM6861G instanceof Boolean) && z == ((Boolean) objM6861G).booleanValue()) {
            return false;
        }
        m6907o0(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6893h0() {
        m6875X(125, 2, null, null);
        this.f21702r = true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6894i(Object obj) {
        if (m6861G() == obj) {
            return false;
        }
        m6907o0(obj);
        return true;
    }

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
    /* JADX INFO: renamed from: i0 */
    public final void m6895i0() {
        this.f21697m = 0;
        this.f21670G = this.f21687c.m8230e();
        m6875X(100, 0, null, null);
        ui0 ui0Var = this.f21686b;
        ui0Var.mo6118w();
        ga3 ga3VarMo6114j = ui0Var.mo6114j();
        this.f21708x.m12486c(this.f21707w ? 1 : 0);
        this.f21707w = m6890g(ga3VarMo6114j);
        this.f21674K = null;
        if (!this.f21701q) {
            this.f21701q = ui0Var.mo6110f();
        }
        boolean zMo6111g = this.f21666C;
        if (!zMo6111g) {
            zMo6111g = ui0Var.mo6111g();
            this.f21666C = zMo6111g;
        }
        if (zMo6111g) {
            ga3VarMo6114j = ga3VarMo6114j.m5947e(yi0.f35234a, new oc4(m6857C()));
        }
        this.f21705u = ga3VarMo6114j;
        Set set = (Set) i25.m6603B(ga3VarMo6114j, r42.f28997a);
        if (set != null) {
            set.add(m6920z());
            ui0Var.mo6116r(set);
        }
        m6875X(Long.hashCode(ui0Var.mo6112h()), 0, null, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m6896j() {
        this.f21694j = null;
        this.f21695k = 0;
        this.f21696l = 0;
        this.f21683T = 0L;
        this.f21702r = false;
        ni0 ni0Var = this.f21676M;
        ni0Var.f25832c = false;
        ni0Var.f25833d.f34014b = 0;
        ni0Var.f25835f = 0;
        ni0Var.f25834e = true;
        ni0Var.f25836g = 0;
        ni0Var.f25837h.clear();
        ni0Var.f25838i = -1;
        ni0Var.f25839j = -1;
        ni0Var.f25840k = -1;
        ni0Var.f25841l = 0;
        this.f21668E.clear();
        this.f21699o = null;
        this.f21700p = null;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m6897j0(yk3 yk3Var, Object obj) {
        cr1 cr1Var = yk3Var.f35299c;
        if (cr1Var == null) {
            return false;
        }
        int iM8227a = this.f21670G.f23847a.m8227a(AbstractC1356y5.m12917k(cr1Var));
        if (!this.f21669F || iM8227a < this.f21670G.f23853g) {
            return false;
        }
        ArrayList arrayList = this.f21703s;
        int iM6095t = gq6.m6095t(arrayList, iM8227a);
        if (iM6095t < 0) {
            int i = -(iM6095t + 1);
            if (!(obj instanceof wy0)) {
                obj = null;
            }
            arrayList.add(i, new l72(yk3Var, iM8227a, obj));
            return true;
        }
        l72 l72Var = (l72) arrayList.get(iM6095t);
        if (!(obj instanceof wy0)) {
            l72Var.f23832c = null;
            return true;
        }
        Object obj2 = l72Var.f23832c;
        if (obj2 == null) {
            l72Var.f23832c = obj;
            return true;
        }
        if (obj2 instanceof mw2) {
            ((mw2) obj2).m8409a(obj);
            return true;
        }
        mw2 mw2Var = uv3.f32207a;
        mw2 mw2Var2 = new mw2(2);
        mw2Var2.m8419k(obj2);
        mw2Var2.m8419k(obj);
        l72Var.f23832c = mw2Var2;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m6898k(xh3 xh3Var) {
        return i25.m6603B(m6902m(), xh3Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[LOOP:1: B:20:0x0043->B:35:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:36:0x0093 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0090], SYNTHETIC] */
    /* JADX INFO: renamed from: k0 */
    public final void m6899k0(lw2 lw2Var) {
        ArrayList arrayList = this.f21703s;
        for (int iM7689T = kx5.m7689T(arrayList); -1 < iM7689T; iM7689T--) {
            l72 l72Var = (l72) arrayList.get(iM7689T);
            cr1 cr1Var = l72Var.f23830a.f35299c;
            cr1 cr1VarM12917k = cr1Var != null ? AbstractC1356y5.m12917k(cr1Var) : null;
            if (cr1VarM12917k == null || !cr1VarM12917k.m4142a()) {
                arrayList.remove(iM7689T);
            } else {
                int i = l72Var.f23831b;
                int i2 = cr1VarM12917k.f16390a;
                if (i != i2) {
                    l72Var.f23831b = i2;
                }
            }
        }
        Object[] objArr = lw2Var.f24419b;
        Object[] objArr2 = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            yk3 yk3Var = (yk3) obj;
                            cr1 cr1Var2 = yk3Var.f35299c;
                            if (cr1Var2 != null) {
                                int i7 = AbstractC1356y5.m12917k(cr1Var2).f16390a;
                                if (obj2 == ia5.f21229t) {
                                    obj2 = null;
                                }
                                arrayList.add(new l72(yk3Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        lb0.m7891z0(arrayList, gq6.f20046k);
    }

    /* JADX INFO: renamed from: l */
    public final void m6900l(wp1 wp1Var) {
        if (!this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f21702r = false;
        if (!this.f21682S) {
            qi0.m9889a("createNode() can only be called when inserting");
        }
        x52 x52Var = this.f21698n;
        int i = x52Var.f34013a[x52Var.f34014b - 1];
        p84 p84Var = this.f21672I;
        cr1 cr1VarM9414b = p84Var.m9414b(p84Var.f27454v);
        this.f21696l++;
        rh1 rh1Var = this.f21678O;
        x53 x53Var = rh1Var.f29283f;
        x53Var.m12494X(a53.f111d);
        sj3.m10795D(x53Var, 0, wp1Var);
        x53Var.f34017h[x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a] = i;
        sj3.m10795D(x53Var, 1, cr1VarM9414b);
        x53 x53Var2 = rh1Var.f29284g;
        x53Var2.m12494X(a53.f112e);
        x53Var2.f34017h[x53Var2.f34018i - x53Var2.f34015f[x53Var2.f34016g - 1].f32421a] = i;
        sj3.m10795D(x53Var2, 0, cr1VarM9414b);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6901l0(int i, int i2) {
        if (m6909p0(i) != i2) {
            if (i < 0) {
                jv2 jv2Var = this.f21700p;
                if (jv2Var == null) {
                    jv2Var = new jv2();
                    this.f21700p = jv2Var;
                }
                jv2Var.m7295f(i, i2);
                return;
            }
            int[] iArr = this.f21699o;
            if (iArr == null) {
                iArr = new int[this.f21670G.f23849c];
                AbstractC0990oo.m9207b0(iArr, -1);
                this.f21699o = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final ga3 m6902m() {
        ga3 ga3Var = this.f21674K;
        return ga3Var != null ? ga3Var : m6904n(this.f21670G.f23855i);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6903m0(int i, int i2) {
        ArrayList arrayList = this.f21693i;
        int iM6909p0 = m6909p0(i);
        if (iM6909p0 != i2) {
            int i3 = i2 - iM6909p0;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM6909p1 = m6909p0(i) + i3;
                m6901l0(i, iM6909p1);
                for (int i4 = size; -1 < i4; i4--) {
                    lr1 lr1Var = (lr1) arrayList.get(i4);
                    if (lr1Var != null && lr1Var.m8099a(i, iM6909p1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                l84 l84Var = this.f21670G;
                if (i < 0) {
                    i = l84Var.f23855i;
                } else if (l84Var.m7856l(i)) {
                    return;
                } else {
                    i = this.f21670G.m7861q(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final ga3 m6904n(int i) {
        ga3 ga3Var;
        boolean z = this.f21682S;
        j43 j43Var = qi0.f28500c;
        if (z && this.f21673J) {
            int iM9395F = this.f21672I.f27454v;
            while (iM9395F > 0) {
                if (this.f21672I.m9429r(iM9395F) == 202 && z62.m13387o(this.f21672I.m9430s(iM9395F), j43Var)) {
                    ga3 ga3Var2 = (ga3) this.f21672I.m9427p(iM9395F);
                    this.f21674K = ga3Var2;
                    return ga3Var2;
                }
                p84 p84Var = this.f21672I;
                iM9395F = p84Var.m9395F(p84Var.f27434b, iM9395F);
            }
        }
        if (this.f21670G.f23849c > 0) {
            while (i > 0) {
                if (this.f21670G.m7853i(i) == 202) {
                    l84 l84Var = this.f21670G;
                    if (z62.m13387o(l84Var.m7860p(l84Var.f23848b, i), j43Var)) {
                        lv2 lv2Var = this.f21706v;
                        if (lv2Var == null || (ga3Var = (ga3) lv2Var.m8197b(i)) == null) {
                            l84 l84Var2 = this.f21670G;
                            ga3Var = (ga3) l84Var2.m7846b(l84Var2.f23848b, i);
                        }
                        this.f21674K = ga3Var;
                        return ga3Var;
                    }
                }
                i = this.f21670G.m7861q(i);
            }
        }
        ga3 ga3Var3 = this.f21705u;
        this.f21674K = ga3Var3;
        return ga3Var3;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6905n0(Object obj) {
        if (obj instanceof pm3) {
            mr1 mr1Var = new mr1((pm3) obj, this.f21697m - 1);
            if (this.f21682S) {
                x53 x53Var = this.f21676M.f25831b.f34991a;
                x53Var.m12494X(g53.f19619c);
                sj3.m10795D(x53Var, 0, mr1Var);
            }
            this.f21688d.add(obj);
            obj = mr1Var;
        }
        m6907o0(obj);
    }

    /* JADX INFO: renamed from: o */
    public final yh0 m6906o() {
        Collection collection;
        if (!this.f21686b.mo6115l()) {
            return null;
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        p84 p84Var = this.f21672I;
        sl2VarM7680G.addAll(ev0.m5341P(p84Var, null, p84Var.f27452t, null));
        l84 l84Var = this.f21670G;
        boolean z = l84Var.f23852f;
        int[] iArr = l84Var.f23848b;
        if (z || l84Var.f23849c == 0) {
            collection = v71.f32439a;
        } else {
            uj3 uj3Var = new uj3(l84Var);
            int iM7861q = l84Var.f23855i;
            Object objValueOf = Integer.valueOf(l84Var.f23858l - o84.m8984e(iArr, iM7861q));
            while (iM7861q >= 0) {
                uj3Var.m13557n(l84Var.m7853i(iM7861q), l84Var.m7855k(iM7861q) ? l84Var.m7860p(iArr, iM7861q) : ki0.f23136a, l84Var.f23847a.m8233q(iM7861q), objValueOf);
                objValueOf = l84Var.m7845a(iM7861q);
                iM7861q = l84Var.m7861q(iM7861q);
            }
            collection = (ArrayList) uj3Var.f36084a;
        }
        sl2VarM7680G.addAll(collection);
        sl2VarM7680G.addAll(m6862H());
        return new yh0(kx5.m7740w(sl2VarM7680G), this.f21666C);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m6907o0(Object obj) {
        ni0 ni0Var = this.f21676M;
        if (this.f21682S) {
            this.f21672I.m9409T(obj);
            return;
        }
        l84 l84Var = this.f21670G;
        if (!l84Var.f23860n) {
            cr1 cr1VarM7845a = l84Var.m7845a(l84Var.f23855i);
            x53 x53Var = ni0Var.f25831b.f34991a;
            x53Var.m12494X(n43.f25443c);
            sj3.m10796E(x53Var, 0, cr1VarM7845a, 1, obj);
            return;
        }
        int iM8984e = (l84Var.f23858l - o84.m8984e(l84Var.f23848b, l84Var.f23855i)) - 1;
        if (ni0Var.f25830a.f21670G.f23855i - ni0Var.f25835f >= 0) {
            ni0Var.m8771d(true);
            x53 x53Var2 = ni0Var.f25831b.f34991a;
            x53Var2.m12494X(a53.f114g);
            sj3.m10795D(x53Var2, 0, obj);
            x53Var2.f34017h[x53Var2.f34018i - x53Var2.f34015f[x53Var2.f34016g - 1].f32421a] = iM8984e;
            return;
        }
        l84 l84Var2 = this.f21670G;
        cr1 cr1VarM7845a2 = l84Var2.m7845a(l84Var2.f23855i);
        x53 x53Var3 = ni0Var.f25831b.f34991a;
        x53Var3.m12494X(a53.f113f);
        sj3.m10796E(x53Var3, 0, obj, 1, cr1VarM7845a2);
        x53Var3.f34017h[x53Var3.f34018i - x53Var3.f34015f[x53Var3.f34016g - 1].f32421a] = iM8984e;
    }

    /* JADX INFO: renamed from: p */
    public final void m6908p(lw2 lw2Var, mq1 mq1Var) {
        ArrayList arrayList = this.f21703s;
        if (this.f21669F) {
            qi0.m9889a("Reentrant composition is not supported");
        }
        this.f21691g.m3145m();
        Trace.beginSection("Compose:recompose");
        try {
            this.f21665B = Long.hashCode(k94.m7451h().mo5015g());
            this.f21706v = null;
            m6899k0(lw2Var);
            this.f21695k = 0;
            this.f21669F = true;
            try {
                m6895i0();
                Object objM6861G = m6861G();
                if (objM6861G != mq1Var && mq1Var != null) {
                    m6907o0(mq1Var);
                }
                hr1 hr1Var = this.f21667D;
                uw2 uw2VarM10565a = s94.m10565a();
                try {
                    uw2VarM10565a.m11663b(hr1Var);
                    j43 j43Var = qi0.f28498a;
                    if (mq1Var != null) {
                        m6877Z(200, j43Var);
                        as4.m3259r(2, mq1Var);
                        mq1Var.invoke(this, 1);
                        m6912r(false);
                    } else if (!this.f21707w || objM6861G == null || objM6861G.equals(ki0.f23136a)) {
                        m6872U();
                    } else {
                        m6877Z(200, j43Var);
                        as4.m3259r(2, objM6861G);
                        mq1 mq1Var2 = (mq1) objM6861G;
                        as4.m3259r(2, mq1Var2);
                        mq1Var2.invoke(this, 1);
                        m6912r(false);
                    }
                    uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                    m6917w();
                    this.f21669F = false;
                    arrayList.clear();
                    if (!this.f21672I.f27455w) {
                        qi0.m9889a("Check failed");
                    }
                    m6919y();
                    Trace.endSection();
                } catch (Throwable th) {
                    uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    dr1 dr1Var = new dr1((byte) 0);
                    dr1Var.f17300b = this;
                    VarHandle.storeStoreFence();
                    y42.m12837K0(th2, dr1Var);
                    throw th2;
                } catch (Throwable th3) {
                    this.f21669F = false;
                    arrayList.clear();
                    m6878a();
                    if (!this.f21672I.f27455w) {
                        qi0.m9889a("Check failed");
                    }
                    m6919y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final int m6909p0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f21699o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f21670G.m7859o(i) : i2;
        }
        jv2 jv2Var = this.f21700p;
        if (jv2Var == null || jv2Var.m7292c(i) < 0) {
            return 0;
        }
        int iM7292c = jv2Var.m7292c(i);
        if (iM7292c >= 0) {
            return jv2Var.f22658c[iM7292c];
        }
        kx5.m7737u0("Cannot find value for key " + i);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public final void m6910q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m6910q(this.f21670G.m7861q(i), i2);
        if (this.f21670G.m7856l(i)) {
            ni0 ni0Var = this.f21676M;
            Object objM7858n = this.f21670G.m7858n(i);
            ni0Var.m8770c();
            ni0Var.f25837h.add(objM7858n);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6911q0() {
        ni0 ni0Var = this.f21676M;
        if (!this.f21702r) {
            qi0.m9889a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f21702r = false;
        if (this.f21682S) {
            qi0.m9889a("useNode() called while inserting");
        }
        l84 l84Var = this.f21670G;
        Object objM7858n = l84Var.m7858n(l84Var.f23855i);
        ni0Var.m8770c();
        ni0Var.f25837h.add(objM7858n);
        if (this.f21709y && (objM7858n instanceof ph0)) {
            ni0Var.m8769b();
            ni0Var.f25831b.f34991a.m12494X(u53.f31659c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x036c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
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
    /* JADX INFO: renamed from: r */
    public final void m6912r(boolean z) {
        long jRotateRight;
        x52 x52Var;
        int i;
        int i2;
        ?? r5;
        int i3;
        x52 x52Var2;
        int i4;
        mw2 mw2Var;
        int i5;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashSet hashSet;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        long[] jArr;
        long j2;
        long[] jArr2;
        long jRotateRight2;
        ArrayList arrayList3 = this.f21703s;
        ni0 ni0Var = this.f21676M;
        x52 x52Var3 = this.f21698n;
        int i10 = x52Var3.f34013a[x52Var3.f34014b - 2] - 1;
        boolean z2 = this.f21682S;
        i50 i50Var = ki0.f23136a;
        if (z2) {
            p84 p84Var = this.f21672I;
            int i11 = p84Var.f27454v;
            int iM9429r = p84Var.m9429r(i11);
            Object objM9430s = this.f21672I.m9430s(i11);
            Object objM9427p = this.f21672I.m9427p(i11);
            if (objM9430s != null) {
                jRotateRight2 = Long.rotateRight(this.f21683T, 3) ^ ((long) (objM9430s instanceof Enum ? ((Enum) objM9430s).ordinal() : objM9430s.hashCode()));
            } else if (objM9427p == null || iM9429r != 207 || objM9427p.equals(i50Var)) {
                jRotateRight2 = Long.rotateRight(this.f21683T ^ ((long) i10), 3) ^ ((long) iM9429r);
            } else {
                this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T ^ ((long) i10), 3) ^ ((long) objM9427p.hashCode()), 3);
            }
            this.f21683T = Long.rotateRight(jRotateRight2, 3);
        } else {
            l84 l84Var = this.f21670G;
            int i12 = l84Var.f23855i;
            int iM7853i = l84Var.m7853i(i12);
            l84 l84Var2 = this.f21670G;
            Object objM7860p = l84Var2.m7860p(l84Var2.f23848b, i12);
            l84 l84Var3 = this.f21670G;
            Object objM7846b = l84Var3.m7846b(l84Var3.f23848b, i12);
            if (objM7860p != null) {
                jRotateRight = Long.rotateRight(this.f21683T, 3) ^ ((long) (objM7860p instanceof Enum ? ((Enum) objM7860p).ordinal() : objM7860p.hashCode()));
            } else if (objM7846b == null || iM7853i != 207 || objM7846b.equals(i50Var)) {
                jRotateRight = Long.rotateRight(this.f21683T ^ ((long) i10), 3) ^ ((long) iM7853i);
            } else {
                this.f21683T = Long.rotateRight(Long.rotateRight(this.f21683T ^ ((long) i10), 3) ^ ((long) objM7846b.hashCode()), 3);
            }
            this.f21683T = Long.rotateRight(jRotateRight, 3);
        }
        int i13 = this.f21696l;
        lr1 lr1Var = this.f21694j;
        if (lr1Var != null) {
            lv2 lv2Var = lr1Var.f24310e;
            int i14 = lr1Var.f24307b;
            ArrayList arrayList4 = lr1Var.f24306a;
            if (arrayList4.size() > 0) {
                ArrayList arrayList5 = lr1Var.f24309d;
                HashSet hashSet2 = new HashSet(arrayList5.size());
                int size = arrayList5.size();
                for (int i15 = 0; i15 < size; i15++) {
                    hashSet2.add(arrayList5.get(i15));
                }
                i2 = -1;
                mw2 mw2Var2 = uv3.f32207a;
                mw2 mw2Var3 = new mw2();
                int size2 = arrayList5.size();
                int size3 = arrayList4.size();
                i = 1;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (i16 < size3) {
                    uc2 uc2Var = (uc2) arrayList4.get(i16);
                    if (hashSet2.contains(uc2Var)) {
                        x52Var2 = x52Var3;
                        i4 = i16;
                        if (!mw2Var3.m8411c(uc2Var)) {
                            int i19 = i17;
                            if (i19 < size2) {
                                uc2 uc2Var2 = (uc2) arrayList5.get(i19);
                                if (uc2Var2 != uc2Var) {
                                    ju1 ju1Var = (ju1) lv2Var.m8197b(uc2Var2.f31784c);
                                    int i20 = ju1Var != null ? ju1Var.f22625b : -1;
                                    mw2Var3.m8409a(uc2Var2);
                                    i7 = i18;
                                    if (i20 != i7) {
                                        ju1 ju1Var2 = (ju1) lv2Var.m8197b(uc2Var2.f31784c);
                                        int i21 = ju1Var2 != null ? ju1Var2.f22626c : uc2Var2.f31785d;
                                        mw2Var = mw2Var3;
                                        int i22 = i20 + i14;
                                        i5 = i14;
                                        int i23 = i7 + i5;
                                        if (i21 > 0) {
                                            arrayList = arrayList4;
                                            int i24 = ni0Var.f25841l;
                                            if (i24 > 0) {
                                                arrayList2 = arrayList5;
                                                if (ni0Var.f25839j == i22 - i24 && ni0Var.f25840k == i23 - i24) {
                                                    ni0Var.f25841l = i24 + i21;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            ni0Var.m8770c();
                                            ni0Var.f25839j = i22;
                                            ni0Var.f25840k = i23;
                                            ni0Var.f25841l = i21;
                                        } else {
                                            arrayList = arrayList4;
                                            arrayList2 = arrayList5;
                                            ni0Var.getClass();
                                        }
                                        if (i20 <= i7) {
                                            int i25 = i21;
                                            hashSet = hashSet2;
                                            i6 = size2;
                                            if (i7 > i20) {
                                                Object[] objArr = lv2Var.f24667c;
                                                long[] jArr3 = lv2Var.f24665a;
                                                int length = jArr3.length - 2;
                                                if (length >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        long j3 = jArr3[i26];
                                                        Object[] objArr2 = objArr;
                                                        long[] jArr4 = jArr3;
                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i27 = 8 - ((~(i26 - length)) >>> 31);
                                                            for (int i28 = 0; i28 < i27; i28 = i9 + 1) {
                                                                if ((j3 & 255) < 128) {
                                                                    i9 = i28;
                                                                    ju1 ju1Var3 = (ju1) objArr2[(i26 << 3) + i28];
                                                                    j = j3;
                                                                    int i29 = ju1Var3.f22625b;
                                                                    if (i20 <= i29 && i29 < i20 + i25) {
                                                                        ju1Var3.f22625b = (i29 - i20) + i7;
                                                                    } else if (i20 + 1 <= i29 && i29 < i7) {
                                                                        ju1Var3.f22625b = i29 - i25;
                                                                    }
                                                                } else {
                                                                    i9 = i28;
                                                                    j = j3;
                                                                }
                                                                j3 = j >> 8;
                                                            }
                                                            if (i27 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i26 == length) {
                                                            break;
                                                        }
                                                        i26++;
                                                        objArr = objArr2;
                                                        jArr3 = jArr4;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr3 = lv2Var.f24667c;
                                            long[] jArr5 = lv2Var.f24665a;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                int i30 = i21;
                                                int i31 = 0;
                                                while (true) {
                                                    long j4 = jArr5[i31];
                                                    hashSet = hashSet2;
                                                    i6 = size2;
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                                        int i33 = 0;
                                                        while (i33 < i32) {
                                                            if ((j4 & 255) < 128) {
                                                                j2 = j4;
                                                                ju1 ju1Var4 = (ju1) objArr3[(i31 << 3) + i33];
                                                                int i34 = ju1Var4.f22625b;
                                                                jArr2 = jArr5;
                                                                if (i20 <= i34 && i34 < i20 + i30) {
                                                                    ju1Var4.f22625b = (i34 - i20) + i7;
                                                                } else if (i7 <= i34 && i34 < i20) {
                                                                    ju1Var4.f22625b = i34 + i30;
                                                                }
                                                            } else {
                                                                j2 = j4;
                                                                jArr2 = jArr5;
                                                            }
                                                            j4 = j2 >> 8;
                                                            i33++;
                                                            jArr5 = jArr2;
                                                        }
                                                        jArr = jArr5;
                                                        if (i32 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr = jArr5;
                                                    }
                                                    if (i31 == length2) {
                                                        break;
                                                    }
                                                    i31++;
                                                    hashSet2 = hashSet;
                                                    size2 = i6;
                                                    jArr5 = jArr;
                                                }
                                            }
                                        }
                                        i8 = i4;
                                    } else {
                                        mw2Var = mw2Var3;
                                        i5 = i14;
                                        arrayList = arrayList4;
                                        arrayList2 = arrayList5;
                                    }
                                    hashSet = hashSet2;
                                    i6 = size2;
                                    i8 = i4;
                                } else {
                                    mw2Var = mw2Var3;
                                    i5 = i14;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    hashSet = hashSet2;
                                    i6 = size2;
                                    i7 = i18;
                                    i8 = i4 + 1;
                                }
                                i17 = i19 + 1;
                                ju1 ju1Var5 = (ju1) lv2Var.m8197b(uc2Var2.f31784c);
                                int i35 = i7 + (ju1Var5 != null ? ju1Var5.f22626c : uc2Var2.f31785d);
                                i16 = i8;
                                lr1Var = lr1Var;
                                mw2Var3 = mw2Var;
                                i14 = i5;
                                arrayList4 = arrayList;
                                arrayList5 = arrayList2;
                                hashSet2 = hashSet;
                                size2 = i6;
                                i18 = i35;
                                x52Var3 = x52Var2;
                            } else {
                                i17 = i19;
                                x52Var3 = x52Var2;
                                i16 = i4;
                            }
                        }
                    } else {
                        x52Var2 = x52Var3;
                        ju1 ju1Var6 = (ju1) lv2Var.m8197b(uc2Var.f31784c);
                        int i36 = ju1Var6 != null ? ju1Var6.f22625b : -1;
                        int i37 = uc2Var.f31784c;
                        i4 = i16;
                        ni0Var.m8773f(i36 + i14, uc2Var.f31785d);
                        lr1Var.m8099a(i37, 0);
                        ni0Var.f25835f = (i37 - ni0Var.f25830a.f21670G.f23853g) + ni0Var.f25835f;
                        this.f21670G.m7862r(i37);
                        m6866L();
                        this.f21670G.m7863s();
                        gq6.m6068F(arrayList3, i37, o84.m8981b(this.f21670G.f23848b, i37) + i37);
                    }
                    i16 = i4 + 1;
                    x52Var3 = x52Var2;
                }
                x52Var = x52Var3;
                ni0Var.m8770c();
                if (arrayList4.size() > 0) {
                    l84 l84Var4 = this.f21670G;
                    ni0Var.f25835f = (l84Var4.f23854h - ni0Var.f25830a.f21670G.f23853g) + ni0Var.f25835f;
                    l84Var4.m7864t();
                }
            } else {
                x52Var = x52Var3;
                i = 1;
                i2 = -1;
            }
        } else {
            x52Var = x52Var3;
            i = 1;
            i2 = -1;
        }
        boolean z3 = this.f21682S;
        if (!z3) {
            l84 l84Var5 = this.f21670G;
            int i38 = l84Var5.f23859m - l84Var5.f23858l;
            if (i38 > 0) {
                if (i38 > 0) {
                    ni0Var.m8771d(false);
                    ni0Var.m8772e();
                    x53 x53Var = ni0Var.f25831b.f34991a;
                    x53Var.m12494X(q53.f28227c);
                    x53Var.f34017h[x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a] = i38;
                } else {
                    ni0Var.getClass();
                }
            }
        }
        int i39 = this.f21695k;
        while (true) {
            l84 l84Var6 = this.f21670G;
            if (l84Var6.f23857k > 0 || (i3 = l84Var6.f23853g) == l84Var6.f23854h) {
                break;
            }
            m6866L();
            ni0Var.m8773f(i39, this.f21670G.m7863s());
            gq6.m6068F(arrayList3, i3, this.f21670G.f23853g);
        }
        if (z3) {
            if (z) {
                rh1 rh1Var = this.f21678O;
                x53 x53Var2 = rh1Var.f29284g;
                if (x53Var2.f34016g == 0) {
                    qi0.m9889a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                x53 x53Var3 = rh1Var.f29283f;
                v53[] v53VarArr = x53Var2.f34015f;
                int i40 = x53Var2.f34016g - 1;
                x53Var2.f34016g = i40;
                v53 v53Var = v53VarArr[i40];
                v53VarArr[i40] = null;
                x53Var3.m12494X(v53Var);
                Object[] objArr4 = x53Var2.f34019j;
                Object[] objArr5 = x53Var3.f34019j;
                int i41 = x53Var3.f34020k;
                int i42 = v53Var.f32422b;
                int i43 = x53Var2.f34020k;
                int i44 = i43 - i42;
                System.arraycopy(objArr4, i44, objArr5, i41 - i42, i43 - i44);
                Object[] objArr6 = x53Var2.f34019j;
                int i45 = x53Var2.f34020k;
                Arrays.fill(objArr6, i45 - i42, i45, (Object) null);
                int[] iArr = x53Var2.f34017h;
                int[] iArr2 = x53Var3.f34017h;
                int i46 = x53Var3.f34018i;
                int i47 = v53Var.f32421a;
                int i48 = x53Var2.f34018i;
                AbstractC0990oo.m9199T(iArr, iArr2, i46 - i47, i48 - i47, i48);
                x53Var2.f34020k -= i42;
                x53Var2.f34018i -= i47;
                i13 = i;
            }
            l84 l84Var7 = this.f21670G;
            if (l84Var7.f23857k <= 0) {
                kd3.m7502a("Unbalanced begin/end empty");
            }
            l84Var7.f23857k--;
            p84 p84Var2 = this.f21672I;
            int i49 = p84Var2.f27454v;
            p84Var2.m9420i();
            if (this.f21670G.f23857k <= 0) {
                int i50 = (-2) - i49;
                this.f21672I.m9421j();
                this.f21672I.m9417e(i);
                cr1 cr1Var = this.f21677N;
                boolean zM12493W = this.f21678O.f29283f.m12493W();
                m84 m84Var = this.f21671H;
                if (zM12493W) {
                    ni0Var.m8769b();
                    ni0Var.m8771d(false);
                    ni0Var.m8772e();
                    ni0Var.m8770c();
                    x53 x53Var4 = ni0Var.f25831b.f34991a;
                    x53Var4.m12494X(b53.f15088c);
                    sj3.m10796E(x53Var4, 0, cr1Var, 1, m84Var);
                    r5 = 0;
                } else {
                    rh1 rh1Var2 = this.f21678O;
                    ni0Var.m8769b();
                    ni0Var.m8771d(false);
                    ni0Var.m8772e();
                    ni0Var.m8770c();
                    x53 x53Var5 = ni0Var.f25831b.f34991a;
                    x53Var5.m12494X(c53.f15811c);
                    sj3.m10797F(x53Var5, cr1Var, m84Var, rh1Var2);
                    this.f21678O = new rh1();
                    r5 = 0;
                }
                this.f21682S = r5;
                if (this.f21687c.f24734b != 0) {
                    m6901l0(i50, r5);
                    m6903m0(i50, i13);
                }
            }
        } else {
            if (z) {
                ni0Var.m8768a();
            }
            int i51 = ni0Var.f25830a.f21670G.f23855i;
            x52 x52Var4 = ni0Var.f25833d;
            int i52 = i2;
            if (x52Var4.m12484a(i52) > i51) {
                qi0.m9889a("Missed recording an endGroup");
            }
            if (x52Var4.m12484a(i52) == i51) {
                ni0Var.m8771d(false);
                x52Var4.m12485b();
                ni0Var.f25831b.f34991a.m12494X(v43.f32393c);
            }
            int i53 = this.f21670G.f23855i;
            if (i13 != m6909p0(i53)) {
                m6903m0(i53, i13);
            }
            if (z) {
                i13 = 1;
            }
            this.f21670G.m7849e();
            ni0Var.m8770c();
        }
        ArrayList arrayList6 = this.f21693i;
        lr1 lr1Var2 = (lr1) arrayList6.remove(arrayList6.size() - 1);
        if (lr1Var2 != null && !z3) {
            lr1Var2.f24308c++;
        }
        this.f21694j = lr1Var2;
        this.f21695k = x52Var.m12485b() + i13;
        this.f21697m = x52Var.m12485b();
        this.f21696l = x52Var.m12485b() + i13;
    }

    /* JADX INFO: renamed from: s */
    public final void m6913s() {
        m6912r(false);
        yk3 yk3VarM6855A = m6855A();
        if (yk3VarM6855A != null) {
            int i = yk3VarM6855A.f35298b;
            if ((i & 1) != 0) {
                yk3VarM6855A.f35298b = i | 2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6914t() {
        m6912r(false);
        m6912r(false);
        this.f21707w = this.f21708x.m12485b() != 0;
        this.f21674K = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m6915u() {
        m6912r(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[LOOP:0: B:15:0x0040->B:27:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[EDGE_INSN: B:28:0x008f->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0040->B:27:0x008b]] */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x008f A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final yk3 m6916v() {
        yk3 yk3Var;
        cr1 cr1VarM7845a;
        C0005a4 c0005a4;
        ni0 ni0Var = this.f21676M;
        ArrayList arrayList = this.f21668E;
        yk3 yk3Var2 = !arrayList.isEmpty() ? (yk3) arrayList.remove(arrayList.size() - 1) : null;
        if (yk3Var2 != null) {
            yk3Var2.f35298b &= -9;
            this.f21691g.m3145m();
            int i = this.f21665B;
            yv2 yv2Var = yk3Var2.f35302f;
            if (yv2Var == null || (yk3Var2.f35298b & 16) != 0) {
                c0005a4 = null;
                break;
            }
            Object[] objArr = yv2Var.f35548b;
            int[] iArr = yv2Var.f35549c;
            long[] jArr = yv2Var.f35547a;
            int length = jArr.length - 2;
            if (length < 0) {
                c0005a4 = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                c0005a4 = new C0005a4((byte) 1);
                                c0005a4.f88c = yk3Var2;
                                c0005a4.f87b = i;
                                c0005a4.f89d = yv2Var;
                                VarHandle.storeStoreFence();
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    c0005a4 = null;
                    break;
                }
                if (i2 == length) {
                    c0005a4 = null;
                    break;
                }
                i2++;
            }
            if (c0005a4 != null) {
                zi0 zi0Var = this.f21692h;
                x53 x53Var = ni0Var.f25831b.f34991a;
                x53Var.m12494X(u43.f31651c);
                sj3.m10796E(x53Var, 0, c0005a4, 1, zi0Var);
            }
            int i6 = yk3Var2.f35298b;
            if ((i6 & 512) != 0) {
                yk3Var2.f35298b = i6 & (-513);
                x53 x53Var2 = ni0Var.f25831b.f34991a;
                x53Var2.m12494X(x43.f33981c);
                sj3.m10795D(x53Var2, 0, yk3Var2);
                int i7 = yk3Var2.f35298b;
                yk3Var2.f35298b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    yk3Var2.f35298b = i7 & (-1153);
                    if (this.f21710z == this.f21670G.f23855i) {
                        this.f21709y = false;
                        this.f21710z = -1;
                    }
                }
            }
        }
        if (yk3Var2 != null) {
            int i8 = yk3Var2.f35298b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.f21701q)) {
                if (yk3Var2.f35299c == null) {
                    if (this.f21682S) {
                        p84 p84Var = this.f21672I;
                        cr1VarM7845a = p84Var.m9414b(p84Var.f27454v);
                    } else {
                        l84 l84Var = this.f21670G;
                        cr1VarM7845a = l84Var.m7845a(l84Var.f23855i);
                    }
                    yk3Var2.f35299c = cr1VarM7845a;
                }
                yk3Var2.f35298b &= -5;
                yk3Var = yk3Var2;
            } else {
                yk3Var = null;
            }
        } else {
            yk3Var = null;
        }
        m6912r(false);
        return yk3Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m6917w() {
        m6912r(false);
        this.f21686b.mo6108d();
        m6912r(false);
        ni0 ni0Var = this.f21676M;
        if (ni0Var.f25832c) {
            ni0Var.m8771d(false);
            ni0Var.m8771d(false);
            ni0Var.f25831b.f34991a.m12494X(v43.f32393c);
            ni0Var.f25832c = false;
        }
        ni0Var.m8769b();
        if (ni0Var.f25833d.f34014b != 0) {
            qi0.m9889a("Missed recording an endGroup()");
        }
        if (!this.f21693i.isEmpty()) {
            qi0.m9889a("Start/end imbalance");
        }
        m6896j();
        this.f21670G.m7847c();
        this.f21707w = this.f21708x.m12485b() != 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m6918x(boolean z, lr1 lr1Var) {
        this.f21693i.add(this.f21694j);
        this.f21694j = lr1Var;
        x52 x52Var = this.f21698n;
        x52Var.m12486c(this.f21696l);
        x52Var.m12486c(this.f21697m);
        x52Var.m12486c(this.f21695k);
        if (z) {
            this.f21695k = 0;
        }
        this.f21696l = 0;
        this.f21697m = 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m6919y() {
        m84 m84Var = new m84();
        if (this.f21666C) {
            m84Var.m8228b();
        }
        if (this.f21686b.mo6109e()) {
            m84Var.f24743k = new lv2();
        }
        this.f21671H = m84Var;
        p84 p84VarM8231l = m84Var.m8231l();
        p84VarM8231l.m9417e(true);
        this.f21672I = p84VarM8231l;
    }

    /* JADX INFO: renamed from: z */
    public final wi0 m6920z() {
        jr1 jr1Var = this.f21684U;
        if (jr1Var != null) {
            return jr1Var;
        }
        zi0 zi0Var = this.f21692h;
        jr1 jr1Var2 = new jr1();
        jr1Var2.f22539a = zi0Var;
        VarHandle.storeStoreFence();
        this.f21684U = jr1Var2;
        return jr1Var2;
    }
}
