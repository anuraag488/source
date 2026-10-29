package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pj5 implements ov4, ut5, dr6, nj6, fu5 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ pj5 f27655b = new pj5(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pj5 f27656c = new pj5(3);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pj5 f27657d = new pj5(4);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ pj5 f27658e = new pj5(5);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ pj5 f27659f = new pj5(6);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ pj5 f27660g = new pj5(7);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ pj5 f27661h = new pj5(8);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ pj5 f27662i = new pj5(9);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ pj5 f27663j = new pj5(10);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ pj5 f27664k = new pj5(11);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ pj5 f27665l = new pj5(12);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ pj5 f27666m = new pj5(13);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ pj5 f27667n = new pj5(14);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ pj5 f27668o = new pj5(15);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ pj5 f27669p = new pj5(16);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ pj5 f27670q = new pj5(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ pj5 f27671r = new pj5(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ pj5 f27672s = new pj5(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ pj5 f27673t = new pj5(21);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ pj5 f27674u = new pj5(23);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ pj5 f27675v = new pj5(24);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ pj5 f27676w = new pj5(25);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ pj5 f27677x = new pj5(26);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27678a;

    public /* synthetic */ pj5(byte b) {
        this.f27678a = b;
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: b */
    public boolean mo6711b(Class cls) {
        return false;
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: c */
    public ek6 mo6712c(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // p000.ov4
    /* JADX INFO: renamed from: d */
    public void mo4677d(C0641f8 c0641f8) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(c0641f8.f18827b)));
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public Object mo3008f() {
        switch (this.f27678a) {
            case 3:
                return new Boolean(((Boolean) mn6.f25071a.m7959b()).booleanValue());
            case 4:
                List list = e56.f17769a;
                Boolean bool = (Boolean) so6.f30454a.m7959b();
                bool.getClass();
                return bool;
            case 5:
                List list2 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19936k0.m7959b()).longValue());
            case 6:
                List list3 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19901M.m7959b();
            case 7:
                List list4 = e56.f17769a;
                zl6.f36172b.get();
                Long l = (Long) gm6.f19898J.m7959b();
                l.getClass();
                return l;
            case 8:
                List list5 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19903O.m7959b()).longValue());
            case 9:
                List list6 = e56.f17769a;
                zl6.f36172b.get();
                Long l2 = (Long) gm6.f19925f.m7959b();
                l2.getClass();
                return l2;
            case 10:
                List list7 = e56.f17769a;
                zl6.f36172b.get();
                Long l3 = (Long) gm6.f19931i.m7959b();
                l3.getClass();
                return l3;
            case 11:
                List list8 = e56.f17769a;
                zl6.f36172b.get();
                Long l4 = (Long) gm6.f19928g0.m7959b();
                l4.getClass();
                return l4;
            case 12:
                List list9 = e56.f17769a;
                zl6.f36172b.get();
                Long l5 = (Long) gm6.f19939m.m7959b();
                l5.getClass();
                return l5;
            case 13:
                List list10 = e56.f17769a;
                eo6.f18344b.get();
                Boolean bool2 = (Boolean) go6.f19997a.m7959b();
                bool2.getClass();
                return bool2;
            case 14:
                List list11 = e56.f17769a;
                eo6.f18344b.get();
                return Integer.valueOf((int) ((Long) go6.f20000d.m7959b()).longValue());
            case 15:
                List list12 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19947q.m7959b()).longValue());
            case 16:
                List list13 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19961x.m7959b()).longValue());
            case 17:
            case 22:
            default:
                return new Boolean(((Boolean) xo6.f34513a.m7959b()).booleanValue());
            case 18:
                List list14 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19918b0.m7959b();
            case 19:
                List list15 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19959w.m7959b()).longValue());
            case 20:
                List list16 = e56.f17769a;
                Boolean bool3 = (Boolean) gn6.f19985b.m7959b();
                bool3.getClass();
                return bool3;
            case 21:
                List list17 = e56.f17769a;
                Boolean bool4 = (Boolean) op6.f26946a.m7959b();
                bool4.getClass();
                return bool4;
            case 23:
                List list18 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19940m0.m7959b()).longValue());
            case 24:
                List list19 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool5 = (Boolean) ko6.f23301e.m7959b();
                bool5.getClass();
                return bool5;
            case 25:
                List list20 = e56.f17769a;
                Boolean bool6 = (Boolean) no6.f25987a.m7959b();
                bool6.getClass();
                return bool6;
        }
    }

    @Override // p000.fu5
    /* JADX INFO: renamed from: g */
    public Object mo3009g(IBinder iBinder) {
        int i = i56.f21138j;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return iInterfaceQueryLocalInterface instanceof b86 ? (b86) iInterfaceQueryLocalInterface : new k36(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService", (byte) 4);
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        yq0 yq0Var = ky5.f23627b;
        g06.m5881a(yq0Var);
        c16 c16Var = new c16();
        c16Var.f15758a = yq0Var;
        VarHandle.storeStoreFence();
        return c16Var;
    }
}
