package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qi0 {

    /* JADX INFO: renamed from: a */
    public static final j43 f28498a = new j43("provider");

    /* JADX INFO: renamed from: b */
    public static final j43 f28499b = new j43("provider");

    /* JADX INFO: renamed from: c */
    public static final j43 f28500c = new j43("compositionLocalMap");

    /* JADX INFO: renamed from: d */
    public static final j43 f28501d = new j43("providers");

    /* JADX INFO: renamed from: e */
    public static final j43 f28502e = new j43("reference");

    /* JADX INFO: renamed from: a */
    public static final void m9889a(String str) {
        throw new uh0(zi4.m13621u("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: b */
    public static final Void m9890b(String str) {
        throw new uh0(zi4.m13621u("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [v71] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public static final tu2 m9891c(zi0 zi0Var, uu2 uu2Var, p84 p84Var, InterfaceC0618en interfaceC0618en) {
        i50 i50Var;
        m84 m84Var;
        ?? arrayList;
        cr1 cr1Var;
        long[] jArr;
        cr1 cr1Var2;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean zM8415g;
        long[] jArr2;
        int i4;
        long j;
        long[] jArr3;
        int i5;
        int i6;
        uu2 uu2Var2 = uu2Var;
        i50 i50Var2 = ki0.f23136a;
        m84 m84Var2 = new m84();
        if (p84Var.f27437e != null) {
            m84Var2.m8228b();
        }
        if (p84Var.f27438f != null) {
            m84Var2.f24743k = new lv2();
        }
        int i7 = p84Var.f27452t;
        if (interfaceC0618en != null && p84Var.m9394E(i7) > 0) {
            int iM9395F = p84Var.f27454v;
            while (iM9395F > 0 && !p84Var.m9435x(iM9395F)) {
                iM9395F = p84Var.m9395F(p84Var.f27434b, iM9395F);
            }
            if (iM9395F >= 0 && p84Var.m9435x(iM9395F)) {
                Object objM9393D = p84Var.m9393D(iM9395F);
                int i8 = iM9395F + 1;
                int iM9431t = p84Var.m9431t(iM9395F) + iM9395F;
                int iM9394E = 0;
                while (i8 < iM9431t) {
                    int iM9431t2 = p84Var.m9431t(i8) + i8;
                    if (iM9431t2 > i7) {
                        break;
                    }
                    iM9394E += p84Var.m9435x(i8) ? 1 : p84Var.m9394E(i8);
                    i8 = iM9431t2;
                }
                int iM9394E2 = p84Var.m9435x(i7) ? 1 : p84Var.m9394E(i7);
                interfaceC0618en.mo4827d(objM9393D);
                interfaceC0618en.mo4833o(iM9394E, iM9394E2);
                interfaceC0618en.mo4835u();
            }
        }
        cr1 cr1Var3 = uu2Var2.f32183e;
        if (cr1Var3.m4142a()) {
            if (zi0Var.f36124n.f24422e > 0) {
                arrayList = new ArrayList();
                lw2 lw2Var = zi0Var.f36124n;
                long[] jArr4 = lw2Var.f24418a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr4[i9];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j2 & 255) < 128) {
                                    int i13 = i10;
                                    int i14 = (i9 << 3) + i12;
                                    cr1Var2 = cr1Var3;
                                    Object obj = lw2Var.f24419b[i14];
                                    Object obj2 = lw2Var.f24420c[i14];
                                    if (obj2 instanceof mw2) {
                                        mw2 mw2Var = (mw2) obj2;
                                        Object[] objArr = mw2Var.f25258b;
                                        long[] jArr5 = mw2Var.f25257a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j3 = jArr5[i15];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j3 & 255) < 128) {
                                                            i4 = i17;
                                                            int i18 = (i15 << 3) + i4;
                                                            j = j3;
                                                            Object obj3 = objArr[i18];
                                                            yk3 yk3Var = (yk3) obj;
                                                            jArr3 = jArr5;
                                                            cr1 cr1Var4 = yk3Var.f35299c;
                                                            if (cr1Var4 != null) {
                                                                cr1 cr1VarM12917k = AbstractC1356y5.m12917k(cr1Var2);
                                                                i6 = i12;
                                                                cr1 cr1VarM12917k2 = AbstractC1356y5.m12917k(cr1Var4);
                                                                int iM9415c = p84Var.m9415c(cr1VarM12917k);
                                                                i5 = length;
                                                                int iM8981b = o84.m8981b(p84Var.f27434b, iM9415c) + iM9415c;
                                                                int i19 = cr1VarM12917k2.f16390a;
                                                                if (iM9415c <= i19 && i19 < iM8981b) {
                                                                    arrayList.add(new l73(yk3Var, obj3));
                                                                    mw2Var.m8421m(i18);
                                                                }
                                                            }
                                                            j3 = j >> i13;
                                                            i17 = i4 + 1;
                                                            jArr5 = jArr3;
                                                            length = i5;
                                                            i12 = i6;
                                                        } else {
                                                            i4 = i17;
                                                            j = j3;
                                                            jArr3 = jArr5;
                                                        }
                                                        i5 = length;
                                                        i6 = i12;
                                                        j3 = j >> i13;
                                                        i17 = i4 + 1;
                                                        jArr5 = jArr3;
                                                        length = i5;
                                                        i12 = i6;
                                                    }
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                    if (i16 != i13) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                jArr5 = jArr2;
                                                length = i;
                                                i12 = i2;
                                                i13 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i12;
                                        }
                                        zM8415g = mw2Var.m8415g();
                                    } else {
                                        i = length;
                                        i2 = i12;
                                        yk3 yk3Var2 = (yk3) obj;
                                        cr1 cr1Var5 = yk3Var2.f35299c;
                                        if (cr1Var5 != null) {
                                            cr1 cr1VarM12917k3 = AbstractC1356y5.m12917k(cr1Var2);
                                            cr1 cr1VarM12917k4 = AbstractC1356y5.m12917k(cr1Var5);
                                            int iM9415c2 = p84Var.m9415c(cr1VarM12917k3);
                                            int iM8981b2 = o84.m8981b(p84Var.f27434b, iM9415c2) + iM9415c2;
                                            int i20 = cr1VarM12917k4.f16390a;
                                            if (iM9415c2 > i20 || i20 >= iM8981b2) {
                                                z = false;
                                            } else {
                                                arrayList.add(new l73(yk3Var2, obj2));
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        zM8415g = z;
                                    }
                                    if (zM8415g) {
                                        lw2Var.m8137l(i14);
                                    }
                                    i3 = 8;
                                } else {
                                    cr1Var2 = cr1Var3;
                                    i50Var2 = i50Var2;
                                    m84Var2 = m84Var2;
                                    i = length;
                                    j2 = j2;
                                    i2 = i12;
                                    i3 = i10;
                                }
                                j2 >>= i3;
                                i12 = i2 + 1;
                                i10 = i3;
                                cr1Var3 = cr1Var2;
                                jArr4 = jArr4;
                                i50Var2 = i50Var2;
                                m84Var2 = m84Var2;
                                length = i;
                            }
                            cr1Var = cr1Var3;
                            i50Var = i50Var2;
                            m84Var = m84Var2;
                            jArr = jArr4;
                            int i21 = length;
                            if (i11 != i10) {
                                break;
                            }
                            length = i21;
                        } else {
                            cr1Var = cr1Var3;
                            i50Var = i50Var2;
                            m84Var = m84Var2;
                            jArr = jArr4;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        cr1Var3 = cr1Var;
                        jArr4 = jArr;
                        i50Var2 = i50Var;
                        m84Var2 = m84Var;
                    }
                } else {
                    i50Var = i50Var2;
                    m84Var = m84Var2;
                }
            } else {
                i50Var = i50Var2;
                m84Var = m84Var2;
                arrayList = v71.f32439a;
            }
            uu2Var2 = uu2Var;
            uu2Var2.f32184f = hb0.m6310V0(uu2Var2.f32184f, (Iterable) arrayList);
        } else {
            i50Var = i50Var2;
            m84Var = m84Var2;
        }
        p84 p84VarM8231l = m84Var.m8231l();
        try {
            p84VarM8231l.m9416d();
            i50 i50Var3 = i50Var;
            p84VarM8231l.m9407R(126665345, uu2Var2.f32179a, false, i50Var3);
            p84.m9389y(p84VarM8231l);
            p84VarM8231l.m9409T(uu2Var2.f32180b);
            List listM9392C = p84Var.m9392C(AbstractC1356y5.m12917k(uu2Var2.f32183e), p84VarM8231l);
            p84VarM8231l.m9402M();
            p84VarM8231l.m9420i();
            p84VarM8231l.m9421j();
            p84VarM8231l.m9417e(true);
            tu2 tu2Var = new tu2();
            m84 m84Var3 = m84Var;
            tu2Var.f31455a = m84Var3;
            VarHandle.storeStoreFence();
            List list = listM9392C;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i22 = 0; i22 < size; i22++) {
                    cr1 cr1Var6 = (cr1) listM9392C.get(i22);
                    if (m84Var3.m8232m(cr1Var6)) {
                        int iM8227a = m84Var3.m8227a(cr1Var6);
                        int iM8984e = o84.m8984e(m84Var3.f24733a, iM8227a);
                        int i23 = iM8227a + 1;
                        if (((i23 < m84Var3.f24734b ? m84Var3.f24733a[(i23 * 5) + 4] : m84Var3.f24735c.length) - iM8984e > 0 ? m84Var3.f24735c[iM8984e] : i50Var3) instanceof yk3) {
                            z32 z32Var = new z32((byte) 6);
                            z32Var.f35738b = zi0Var;
                            z32Var.f35739c = uu2Var2;
                            VarHandle.storeStoreFence();
                            p84 p84VarM8231l2 = m84Var3.m8231l();
                            try {
                                zc6.m13530o(p84VarM8231l2, listM9392C, z32Var);
                                boolean z2 = true;
                                return tu2Var;
                            } finally {
                                p84VarM8231l2.m9417e(false);
                            }
                        }
                    }
                }
            }
            return tu2Var;
        } catch (Throwable th) {
            p84VarM8231l.m9417e(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9892d(p84 p84Var, om3 om3Var) {
        int i = p84Var.f27452t;
        C1017p0 c1017p0 = new C1017p0((byte) 12);
        c1017p0.f27254b = om3Var;
        VarHandle.storeStoreFence();
        p84Var.m9424m(i, c1017p0);
        p84Var.m9398I();
    }
}
