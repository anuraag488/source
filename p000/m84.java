package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m84 implements wi0, Iterable, cc2 {

    /* JADX INFO: renamed from: b */
    public int f24734b;

    /* JADX INFO: renamed from: d */
    public int f24736d;

    /* JADX INFO: renamed from: e */
    public int f24737e;

    /* JADX INFO: renamed from: g */
    public boolean f24739g;

    /* JADX INFO: renamed from: h */
    public int f24740h;

    /* JADX INFO: renamed from: j */
    public HashMap f24742j;

    /* JADX INFO: renamed from: k */
    public lv2 f24743k;

    /* JADX INFO: renamed from: a */
    public int[] f24733a = new int[0];

    /* JADX INFO: renamed from: c */
    public Object[] f24735c = new Object[0];

    /* JADX INFO: renamed from: f */
    public final Object f24738f = new Object();

    /* JADX INFO: renamed from: i */
    public ArrayList f24741i = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final void m8226d(p84 p84Var, int i) {
        while (p84Var.f27454v >= 0 && p84Var.f27453u <= i) {
            p84Var.m9403N();
            p84Var.m9420i();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8227a(cr1 cr1Var) {
        if (this.f24739g) {
            qi0.m9889a("Use active SlotWriter to determine anchor location instead");
        }
        if (!cr1Var.m4142a()) {
            kd3.m7502a("Anchor refers to a group that was removed");
        }
        return cr1Var.f16390a;
    }

    /* JADX INFO: renamed from: b */
    public final void m8228b() {
        this.f24742j = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public final lw2 m8229c(InterfaceC0618en interfaceC0618en, cw2 cw2Var) {
        int i;
        Object[] objArr = cw2Var.f16532a;
        int i2 = cw2Var.f16533b;
        byte b = 0;
        byte b2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < i2; i7++) {
            if (!m8232m(AbstractC1356y5.m12917k(((uu2) objArr[i7]).f32183e))) {
                cw2 cw2Var2 = new cw2();
                Object[] objArr2 = cw2Var.f16532a;
                int i8 = cw2Var.f16533b;
                for (int i9 = i3; i9 < i8; i9++) {
                    Object obj = objArr2[i9];
                    if (m8232m(AbstractC1356y5.m12917k(((uu2) obj).f32183e))) {
                        cw2Var2.m4200a(obj);
                    }
                }
                cw2Var = cw2Var2;
                break;
            }
        }
        o04 o04Var = new o04((byte) 7);
        o04Var.f26271b = this;
        VarHandle.storeStoreFence();
        int i10 = 1;
        int i11 = 1;
        boolean z2 = true;
        if (cw2Var.f16533b > 1) {
            Comparable comparable = (Comparable) o04Var.invoke(cw2Var.m4206g(i5));
            int i12 = cw2Var.f16533b;
            int i13 = i11;
            while (i13 < i12) {
                Comparable comparable2 = (Comparable) o04Var.invoke(cw2Var.m4206g(i13));
                if (comparable.compareTo(comparable2) > 0) {
                    cw2 cw2Var3 = new cw2(cw2Var.f16533b);
                    Object[] objArr3 = cw2Var.f16532a;
                    int i14 = cw2Var.f16533b;
                    for (int i15 = i4; i15 < i14; i15++) {
                        cw2Var3.m4200a(objArr3[i15]);
                    }
                    aw2 aw2Var = cw2Var3.f16534c;
                    if (aw2Var == null) {
                        aw2Var = new aw2(b2 == true ? 1 : 0);
                        aw2Var.f14915b = cw2Var3;
                        VarHandle.storeStoreFence();
                        cw2Var3.f16534c = aw2Var;
                    }
                    if (((cw2) aw2Var.f14915b).f16533b > i10) {
                        uc1 uc1Var = new uc1(b == true ? 1 : 0);
                        uc1Var.f31781b = o04Var;
                        VarHandle.storeStoreFence();
                        lb0.m7891z0(aw2Var, uc1Var);
                    }
                    cw2Var = cw2Var3;
                    break;
                }
                i13++;
                comparable = comparable2;
            }
        }
        if (cw2Var.m4208i()) {
            return tv3.f31473b;
        }
        long[] jArr = tv3.f31472a;
        lw2 lw2Var = new lw2();
        p84 p84VarM8231l = m8231l();
        try {
            Object[] objArr4 = cw2Var.f16532a;
            int i16 = cw2Var.f16533b;
            for (int i17 = i6; i17 < i16; i17++) {
                uu2 uu2Var = (uu2) objArr4[i17];
                int iM9415c = p84VarM8231l.m9415c(AbstractC1356y5.m12917k(uu2Var.f32183e));
                int iM9395F = p84VarM8231l.m9395F(p84VarM8231l.f27434b, iM9415c);
                m8226d(p84VarM8231l, iM9395F);
                m8226d(p84VarM8231l, iM9395F);
                while (true) {
                    i = p84VarM8231l.f27452t;
                    if (i == iM9395F || i == p84VarM8231l.f27453u) {
                        break;
                        break;
                    }
                    if (iM9395F < p84VarM8231l.m9431t(i) + i) {
                        p84VarM8231l.m9406Q();
                    } else {
                        p84VarM8231l.m9402M();
                    }
                }
                if (i != iM9395F) {
                    qi0.m9889a("Unexpected slot table structure");
                }
                p84VarM8231l.m9406Q();
                p84VarM8231l.m9413a(iM9415c - p84VarM8231l.f27452t);
                lw2Var.m8138m(uu2Var, qi0.m9891c(uu2Var.f32181c, uu2Var, p84VarM8231l, interfaceC0618en));
            }
            m8226d(p84VarM8231l, Integer.MAX_VALUE);
            return lw2Var;
        } finally {
            p84VarM8231l.m9417e(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final l84 m8230e() {
        if (this.f24739g) {
            C1077qn.m9989o("Cannot read while a writer is pending");
            return null;
        }
        this.f24737e++;
        l84 l84Var = new l84();
        l84Var.f23847a = this;
        l84Var.f23848b = this.f24733a;
        int i = this.f24734b;
        l84Var.f23849c = i;
        l84Var.f23850d = this.f24735c;
        l84Var.f23851e = this.f24736d;
        l84Var.f23854h = i;
        l84Var.f23855i = -1;
        l84Var.f23856j = new x52();
        VarHandle.storeStoreFence();
        return l84Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ku1(this, 0, this.f24734b);
    }

    /* JADX INFO: renamed from: l */
    public final p84 m8231l() {
        if (this.f24739g) {
            qi0.m9889a("Cannot start a writer when another writer is pending");
        }
        if (this.f24737e > 0) {
            qi0.m9889a("Cannot start a writer when a reader is pending");
        }
        this.f24739g = true;
        this.f24740h++;
        p84 p84Var = new p84();
        p84Var.f27433a = this;
        int[] iArr = this.f24733a;
        p84Var.f27434b = iArr;
        Object[] objArr = this.f24735c;
        p84Var.f27435c = objArr;
        p84Var.f27436d = this.f24741i;
        p84Var.f27437e = this.f24742j;
        p84Var.f27438f = this.f24743k;
        int i = this.f24734b;
        p84Var.f27439g = i;
        p84Var.f27440h = (iArr.length / 5) - i;
        int i2 = this.f24736d;
        p84Var.f27443k = i2;
        p84Var.f27444l = objArr.length - i2;
        p84Var.f27445m = i;
        p84Var.f27448p = new x52();
        p84Var.f27449q = new x52();
        p84Var.f27450r = new x52();
        p84Var.f27453u = i;
        p84Var.f27454v = -1;
        VarHandle.storeStoreFence();
        return p84Var;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8232m(cr1 cr1Var) {
        int iM8983d;
        return cr1Var.m4142a() && (iM8983d = o84.m8983d(this.f24741i, cr1Var.f16390a, this.f24734b)) >= 0 && z62.m13387o(this.f24741i.get(iM8983d), cr1Var);
    }

    /* JADX INFO: renamed from: q */
    public final kr1 m8233q(int i) {
        int i2;
        ArrayList arrayList;
        int iM8983d;
        HashMap map = this.f24742j;
        if (map != null) {
            if (this.f24739g) {
                qi0.m9889a("use active SlotWriter to crate an anchor for location instead");
            }
            cr1 cr1Var = (i < 0 || i >= (i2 = this.f24734b) || (iM8983d = o84.m8983d((arrayList = this.f24741i), i, i2)) < 0) ? null : (cr1) arrayList.get(iM8983d);
            if (cr1Var != null) {
                return (kr1) map.get(cr1Var);
            }
        }
        return null;
    }
}
