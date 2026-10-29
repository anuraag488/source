package p000;

import ads_mobile_sdk.EnumC0218ld;
import android.graphics.drawable.Drawable;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gb5 implements qo0, gg0, he4, dq3, g20, ii1 {

    /* JADX INFO: renamed from: a */
    public static final C1077qn f19710a = new C1077qn(7);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ gb5 f19711b = new gb5();

    /* JADX INFO: renamed from: c */
    public static final gb5 f19712c = new gb5();

    /* JADX INFO: renamed from: d */
    public static final gb5 f19713d = new gb5();

    /* JADX INFO: renamed from: e */
    public static final gb5 f19714e = new gb5();

    /* JADX INFO: renamed from: f */
    public static final gb5 f19715f = new gb5();

    /* JADX INFO: renamed from: g */
    public static final gb5 f19716g = new gb5();

    /* JADX INFO: renamed from: h */
    public static final gb5 f19717h = new gb5();

    /* JADX INFO: renamed from: i */
    public static final gb5 f19718i = new gb5();

    /* JADX INFO: renamed from: j */
    public static final gb5 f19719j = new gb5();

    /* JADX INFO: renamed from: k */
    public static final gb5 f19720k = new gb5();

    /* JADX INFO: renamed from: l */
    public static final gb5 f19721l = new gb5();

    /* JADX INFO: renamed from: m */
    public static final gb5 f19722m = new gb5();

    /* JADX INFO: renamed from: n */
    public static final gb5 f19723n = new gb5();

    /* JADX INFO: renamed from: o */
    public static final gb5 f19724o = new gb5();

    /* JADX INFO: renamed from: p */
    public static final gb5 f19725p = new gb5();

    /* JADX INFO: renamed from: q */
    public static final gb5 f19726q = new gb5();

    /* JADX INFO: renamed from: r */
    public static final gb5 f19727r = new gb5();

    /* JADX INFO: renamed from: s */
    public static final gb5 f19728s = new gb5();

    /* JADX INFO: renamed from: t */
    public static final gb5 f19729t = new gb5();

    /* JADX INFO: renamed from: u */
    public static final gb5 f19730u = new gb5();

    /* JADX INFO: renamed from: v */
    public static final gb5 f19731v = new gb5();

    /* JADX INFO: renamed from: w */
    public static final gb5 f19732w = new gb5();

    /* JADX INFO: renamed from: x */
    public static final gb5 f19733x = new gb5();

    /* JADX INFO: renamed from: y */
    public static final gb5 f19734y = new gb5();

    /* JADX INFO: renamed from: h */
    public static EnumC0218ld m5955h(int i) throws Exception {
        EnumC0218ld enumC0218ld = (EnumC0218ld) EnumC0218ld.f6782c.get(Integer.valueOf(i));
        if (enumC0218ld != null) {
            return enumC0218ld;
        }
        throw new Exception("Invalid for value enum " + gb5.class.getName() + ": " + i);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m5956j(int i, xa0 xa0Var, Object obj) throws ss5 {
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        int i2 = xa0Var.f34092b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            xa0Var.m12633u0(0);
            ((ax5) obj).m3362b(i3 << 3, Long.valueOf(wa0Var.mo4129T()));
            return true;
        }
        if (i4 == 1) {
            xa0Var.m12633u0(1);
            ((ax5) obj).m3362b((i3 << 3) | 1, Long.valueOf(wa0Var.mo4128S()));
            return true;
        }
        if (i4 == 2) {
            ((ax5) obj).m3362b((i3 << 3) | 2, xa0Var.m12639y0());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                qm5.m9916g("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                qm5.m9910a();
                return false;
            }
            xa0Var.m12633u0(5);
            ((ax5) obj).m3362b(5 | (i3 << 3), Integer.valueOf(wa0Var.mo4122M()));
            return true;
        }
        ax5 ax5Var = new ax5(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            qm5.m9916g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (xa0Var.m12637x0() != Integer.MAX_VALUE && m5956j(i6, xa0Var, ax5Var)) {
        }
        if ((i5 | 4) != xa0Var.f34092b) {
            qm5.m9916g("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (ax5Var.f14937e) {
            ax5Var.f14937e = false;
        }
        ((ax5) obj).m3362b(i5 | 3, ax5Var);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static ax5 m5957k(Object obj) {
        ur1 ur1Var = (ur1) obj;
        ax5 ax5Var = ur1Var.unknownFields;
        if (ax5Var != ax5.f14932f) {
            return ax5Var;
        }
        ax5 ax5Var2 = new ax5(0, new int[8], new Object[8], true);
        ur1Var.unknownFields = ax5Var2;
        return ax5Var2;
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: a */
    public long mo5958a(float f) {
        return 0L;
    }

    @Override // p000.he4
    /* JADX INFO: renamed from: b */
    public void mo5959b(ge4 ge4Var) {
        ge4Var.clear();
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: c */
    public float mo5960c() {
        return 0.0f;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: d */
    public long mo5885d(xa0 xa0Var, int i) {
        String str = ((jl4) xa0Var.f34095e).f22400a.f21533a.f24092b;
        return sc6.m10657b(kx5.m7686Q(str, i), kx5.m7685P(str, i));
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        return qs5.m10119x((Executor) c0602e8.mo4023g(new ni3(vk2.class, Executor.class)));
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: f */
    public float mo5961f(float f, float f2) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m5962g(Drawable drawable, mi0 mi0Var, int i) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(257732500);
        int i2 = i | (ir1Var.m6894i(drawable) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            nt2 nt2VarM8579g = n74.m8579g(kt2.f23428a, qm0.f28566e);
            boolean zM6894i = ir1Var.m6894i(drawable);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                o04 o04Var = new o04((byte) 12);
                o04Var.f26271b = drawable;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(o04Var);
                obj = o04Var;
            }
            obj = objM6869O;
            q20.m9702a(C0638f5.m5542m(nt2VarM8579g, (yp1) obj), ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            er1 er1Var = new er1((byte) 19);
            er1Var.f18412b = this;
            er1Var.f18413c = drawable;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = er1Var;
        }
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: i */
    public float mo5963i(long j, float f) {
        return 0.0f;
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: l */
    public float mo5964l(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // p000.he4
    /* JADX INFO: renamed from: n */
    public boolean mo5965n(Object obj, Object obj2) {
        return false;
    }
}
