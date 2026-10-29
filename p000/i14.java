package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i14 {

    /* JADX INFO: renamed from: a */
    public final mt2 f21009a;

    /* JADX INFO: renamed from: b */
    public final boolean f21010b;

    /* JADX INFO: renamed from: c */
    public final wf2 f21011c;

    /* JADX INFO: renamed from: d */
    public final e14 f21012d;

    /* JADX INFO: renamed from: e */
    public i14 f21013e;

    /* JADX INFO: renamed from: f */
    public final int f21014f;

    public i14(mt2 mt2Var, boolean z, wf2 wf2Var, e14 e14Var) {
        this.f21009a = mt2Var;
        this.f21010b = z;
        this.f21011c = wf2Var;
        this.f21012d = e14Var;
        this.f21014f = wf2Var.f33312b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: a */
    public final jl3 m6540a(e13 e13Var) {
        ?? M10644P;
        i14 i14VarM6550l = m6550l();
        if (i14VarM6550l == null) {
            return jl3.f22395e;
        }
        mt2 mt2Var = (mt2) i14VarM6550l.f21011c.f33299G.f25610g;
        if ((mt2Var.f25198d & 8) == 0) {
            M10644P = 0;
            break;
        }
        loop0: while (true) {
            if (mt2Var != null) {
                if ((mt2Var.f25197c & 8) != 0) {
                    M10644P = mt2Var;
                    ?? uw2Var = 0;
                    while (M10644P != 0) {
                        if (M10644P instanceof g14) {
                            if (((g14) M10644P).mo5442k()) {
                                break loop0;
                            }
                        } else if ((M10644P.f25197c & 8) != 0 && (M10644P instanceof qx0)) {
                            mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                            int i = 0;
                            while (mt2Var2 != null) {
                                if ((mt2Var2.f25197c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                        uw2Var = uw2Var;
                                        M10644P = mt2Var2;
                                    } else {
                                        if (uw2Var == 0) {
                                            uw2Var = new uw2(new mt2[16]);
                                        }
                                        if (M10644P != 0) {
                                            uw2Var.m11663b(M10644P);
                                            M10644P = 0;
                                        }
                                        uw2Var.m11663b(mt2Var2);
                                    }
                                } else {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                                mt2Var2 = mt2Var2.f25200f;
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                            }
                            if (i == 1) {
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                            } else {
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                            }
                        }
                        M10644P = sc6.m10644P(uw2Var);
                    }
                }
                if ((mt2Var.f25198d & 8) != 0) {
                    mt2Var = mt2Var.f25200f;
                }
            }
            M10644P = 0;
            break;
        }
        g14 g14Var = (g14) M10644P;
        e13 e13VarM10650V = g14Var != null ? sc6.m10650V(g14Var, 8) : null;
        return e13VarM10650V == null ? i14VarM6550l.m6540a(e13Var) : e13VarM10650V.mo4003Q(e13Var, true);
    }

    /* JADX INFO: renamed from: b */
    public final i14 m6541b(lq3 lq3Var, yp1 yp1Var) {
        e14 e14Var = new e14();
        e14Var.f17633c = false;
        e14Var.f17634d = false;
        yp1Var.invoke(e14Var);
        i14 i14Var = new i14(new h14(yp1Var), false, new wf2(this.f21014f + (lq3Var != null ? 1000000000 : 2000000000), true), e14Var);
        i14Var.f21013e = this;
        return i14Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m6542c(wf2 wf2Var, ArrayList arrayList) {
        uw2 uw2VarM12299z = wf2Var.m12299z();
        Object[] objArr = uw2VarM12299z.f32211a;
        int i = uw2VarM12299z.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (wf2Var2.m12256J() && !wf2Var2.f33310R) {
                if (wf2Var2.f33299G.m8671i(8)) {
                    arrayList.add(ks5.m7605f(wf2Var2, this.f21010b));
                } else {
                    m6542c(wf2Var2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final e13 m6543d() {
        if (!m6552n()) {
            g14 g14VarM6545f = m6545f();
            return g14VarM6545f != null ? sc6.m10650V(g14VarM6545f, 8) : (w32) this.f21011c.f33299G.f25607d;
        }
        i14 i14VarM6550l = m6550l();
        if (i14VarM6550l != null) {
            return i14VarM6550l.m6543d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m6544e(ArrayList arrayList, ArrayList arrayList2) {
        m6555q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            i14 i14Var = (i14) arrayList.get(size2);
            if (i14Var.m6553o()) {
                arrayList2.add(i14Var);
            } else if (!i14Var.f21012d.f17634d) {
                i14Var.m6544e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [mt2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: f */
    public final g14 m6545f() {
        ?? M10644P;
        boolean z;
        ?? r0;
        boolean z2 = this.f21012d.f17633c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        wf2 wf2Var = this.f21011c;
        if (!z2) {
            mt2 mt2Var = (mt2) wf2Var.f33299G.f25610g;
            if ((mt2Var.f25198d & 8) != 0) {
                loop3: while (mt2Var != null) {
                    if ((mt2Var.f25197c & 8) != 0) {
                        M10644P = mt2Var;
                        ?? uw2Var = 0;
                        while (true) {
                            if (M10644P != 0) {
                                if (M10644P instanceof g14) {
                                    if (((g14) M10644P).mo5442k()) {
                                        r4 = M10644P;
                                    }
                                } else if ((M10644P.f25197c & 8) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                                    int i = 0;
                                    while (mt2Var2 != null) {
                                        if ((mt2Var2.f25197c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M10644P = M10644P;
                                                uw2Var = uw2Var;
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var2;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var2);
                                            }
                                        } else {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                        }
                                        mt2Var2 = mt2Var2.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i == 1) {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                    }
                    if ((mt2Var.f25198d & 8) == 0) {
                        break;
                    }
                    mt2Var = mt2Var.f25200f;
                }
            }
        } else {
            mt2 mt2Var3 = (mt2) wf2Var.f33299G.f25610g;
            if ((mt2Var3.f25198d & 8) != 0) {
                M10644P = 0;
                while (mt2Var3 != null) {
                    if ((mt2Var3.f25197c & 8) != 0) {
                        mt2 mt2VarM10644P = mt2Var3;
                        uw2 uw2Var2 = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof g14) {
                                g14 g14Var = (g14) mt2VarM10644P;
                                if (g14Var.mo5442k()) {
                                    if (g14Var.mo5883n0()) {
                                        r0 = M10644P;
                                        r0 = M10644P;
                                        return g14Var;
                                    }
                                    if (M10644P == 0) {
                                        r0 = g14Var;
                                    }
                                }
                                r0 = M10644P;
                                z = false;
                                M10644P = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                M10644P = M10644P;
                                if ((mt2VarM10644P.f25197c & 8) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i2 = 0;
                                    for (mt2 mt2Var4 = ((qx0) mt2VarM10644P).f28863p; mt2Var4 != null; mt2Var4 = mt2Var4.f25200f) {
                                        if ((mt2Var4.f25197c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                mt2VarM10644P = mt2Var4;
                                            } else {
                                                if (uw2Var2 == null) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var2.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var2.m11663b(mt2Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                M10644P = M10644P;
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var2);
                        }
                    }
                    if ((mt2Var3.f25198d & 8) == 0) {
                        break;
                    }
                    mt2Var3 = mt2Var3.f25200f;
                    M10644P = M10644P;
                }
                r4 = M10644P;
            }
        }
        return (g14) r4;
    }

    /* JADX INFO: renamed from: g */
    public final jl3 m6546g() {
        e13 e13VarM6543d = m6543d();
        if (e13VarM6543d != null) {
            if (!e13VarM6543d.mo4871Z0().f25208n) {
                e13VarM6543d = null;
            }
            if (e13VarM6543d != null) {
                return y42.m12861j0(e13VarM6543d).mo4003Q(e13VarM6543d, true);
            }
        }
        return jl3.f22395e;
    }

    /* JADX INFO: renamed from: h */
    public final jl3 m6547h() {
        e13 e13VarM6543d = m6543d();
        if (e13VarM6543d != null) {
            if (!e13VarM6543d.mo4871Z0().f25208n) {
                e13VarM6543d = null;
            }
            if (e13VarM6543d != null) {
                return y42.m12845Q(e13VarM6543d, true);
            }
        }
        return jl3.f22395e;
    }

    /* JADX INFO: renamed from: i */
    public final List m6548i(boolean z, boolean z2) {
        if (!z && this.f21012d.f17634d) {
            return v71.f32439a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m6553o()) {
            return m6555q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m6544e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final e14 m6549k() {
        boolean zM6553o = m6553o();
        e14 e14Var = this.f21012d;
        if (!zM6553o) {
            return e14Var;
        }
        e14 e14VarM4899b = e14Var.m4899b();
        m6554p(new ArrayList(), e14VarM4899b);
        return e14VarM4899b;
    }

    /* JADX INFO: renamed from: l */
    public final i14 m6550l() {
        wf2 wf2VarM12295v;
        i14 i14Var = this.f21013e;
        if (i14Var != null) {
            return i14Var;
        }
        wf2 wf2Var = this.f21011c;
        boolean z = this.f21010b;
        if (!z) {
            wf2VarM12295v = null;
            break;
        }
        wf2VarM12295v = wf2Var.m12295v();
        while (true) {
            if (wf2VarM12295v == null) {
                wf2VarM12295v = null;
                break;
            }
            e14 e14VarM12297x = wf2VarM12295v.m12297x();
            if (e14VarM12297x != null && e14VarM12297x.f17633c) {
                break;
            }
            wf2VarM12295v = wf2VarM12295v.m12295v();
        }
        if (wf2VarM12295v == null) {
            for (wf2 wf2VarM12295v2 = wf2Var.m12295v(); wf2VarM12295v2 != null; wf2VarM12295v2 = wf2VarM12295v2.m12295v()) {
                if (wf2VarM12295v2.f33299G.m8671i(8)) {
                    wf2VarM12295v = wf2VarM12295v2;
                }
            }
            wf2VarM12295v = null;
        }
        if (wf2VarM12295v == null) {
            return null;
        }
        return ks5.m7605f(wf2VarM12295v, z);
    }

    /* JADX INFO: renamed from: m */
    public final jl3 m6551m() {
        px0 px0VarM6545f = m6545f();
        if (px0VarM6545f == null) {
            return ((w32) this.f21011c.f33299G.f25607d).m4893w1();
        }
        mt2 mt2Var = ((mt2) px0VarM6545f).f25195a;
        Object objM8132g = this.f21012d.f17631a.m8132g(d14.f16705b);
        if (objM8132g == null) {
            objM8132g = null;
        }
        return y70.m13039s(mt2Var, objM8132g != null, true);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6552n() {
        return this.f21013e != null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6553o() {
        return this.f21010b && this.f21012d.f17633c;
    }

    /* JADX INFO: renamed from: p */
    public final void m6554p(ArrayList arrayList, e14 e14Var) {
        if (this.f21012d.f17634d) {
            return;
        }
        m6555q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            i14 i14Var = (i14) arrayList.get(size2);
            if (!i14Var.m6553o()) {
                e14Var.m4901d(i14Var.f21012d);
                i14Var.m6554p(arrayList, e14Var);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final List m6555q(ArrayList arrayList, boolean z) {
        if (m6552n()) {
            return v71.f32439a;
        }
        m6542c(this.f21011c, arrayList);
        if (z) {
            e14 e14Var = this.f21012d;
            lw2 lw2Var = e14Var.f17631a;
            Object objM8132g = lw2Var.m8132g(m14.f24576y);
            if (objM8132g == null) {
                objM8132g = null;
            }
            lq3 lq3Var = (lq3) objM8132g;
            if (lq3Var != null && e14Var.f17633c && !arrayList.isEmpty()) {
                o04 o04Var = new o04((byte) 1);
                o04Var.f26271b = lq3Var;
                VarHandle.storeStoreFence();
                arrayList.add(m6541b(lq3Var, o04Var));
            }
            p14 p14Var = m14.f24552a;
            if (lw2Var.m8128c(p14Var) && !arrayList.isEmpty() && e14Var.f17633c) {
                Object objM8132g2 = lw2Var.m8132g(p14Var);
                if (objM8132g2 == null) {
                    objM8132g2 = null;
                }
                List list = (List) objM8132g2;
                String str = list != null ? (String) hb0.m6301M0(list) : null;
                if (str != null) {
                    C1051py c1051py = new C1051py((byte) 5);
                    c1051py.f28076b = str;
                    VarHandle.storeStoreFence();
                    arrayList.add(0, m6541b(null, c1051py));
                }
            }
        }
        return arrayList;
    }
}
